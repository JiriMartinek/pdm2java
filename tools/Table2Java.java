package zlbpwa.tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Vector;

public class Table2Java {

    private static String ClassName = ""; // <! filled by parser routine - class name
    private static String ClassSapCode = ""; // <! filled by parser routine - class SAP code
    private static String packageName = "model"; //the last part of package name (model, view)

    private static HashMap<String, String> mapSapJavaTypes = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;// some id to prevent warning
        {
            put("datetime", "Timestamp");
            put("timestamp", "Timestamp");
            put("DATS", "Timestamp");
            put("TIMS", "Timestamp");
            put("decimal", "double");
            put("numeric", "long");
            put("char", "char");
            put("varchar", "String");
            put("int", "int");
            put("tinyint", "int");
            put("bit", "boolean");
        }
    };

    /** The main method
     * @param args[0] - input TXT file (filtered part of PDM)
     * @param args[1] - output package name
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String filename = args[0];
        packageName = args[1];
        String path = (new File(filename)).getParent() + File.separator + packageName + File.separator;

        Vector<Vector<String>> variablesVector = new Vector<Vector<String>>();
        Vector<String> mandatoryKeys = new Vector<String>();

        parseFile(filename, variablesVector, mandatoryKeys);
        CreateJavaFile(path, variablesVector, mandatoryKeys);
    }

    /**
     * decode name from the given string
     *
     * @param inputStr input string
     * @return decoded name
     */
    private static String getName(String inputStr) {
        String str1 = inputStr.replace("\"<a:Name>", ""); // remove prefix
        String str2 = str1.replace("</a:Name>\"", ""); // remove postfix
        String str3 = str2.replaceAll("[^a-zA-Z0-9\\s]", ""); // remove all non alnum

        // modify first char to Upper case and remaining to lower case
        String[] parts = str3.split(" ");
        String str4 = "";
        for (String part : parts) {
            if (part.trim().length() > 0) {
                str4 = str4 + part.substring(0, 1).toUpperCase();
            }
            if (part.trim().length() > 1) {
                str4 = str4 + part.substring(1).toLowerCase();
            }
        }

        String str5 = str4.replaceAll(" ", ""); // remove spaces

        return str5;
    }

    /**
     * decode code from the given string
     *
     * @param inputStr input string
     * @return decoded code
     */
    private static String getCode(String inputStr) {
        String str1 = inputStr.replace("\"<a:Code>", ""); // remove prefix
        String str2 = str1.replace("</a:Code>\"", ""); // remove postfix
        return str2;
    }

    /**
     * decode columnId or columnRef from the given string
     *
     * @param inputStr input string
     * @return decoded code
     */
    private static String getColumn(String inputStr) {
        String str1 = inputStr.replace("\"<o:Column Id=\"", ""); // remove prefix of Id
        String str2 = str1.replace("\"<o:Column Ref=\"", ""); // remove prefix of Ref
        String str3 = str2.replace("\">\"", ""); // remove postfix of Id
        String str4 = str3.replace("\"/>\"", ""); // remove postfix of Ref
        return str4;
    }

    /**
     * decode dataType from the given string
     *
     * @param inputStr input string
     * @return decoded dataType
     */
    private static String getDataType(String inputStr) {
        String str1 = inputStr.replace("\"<a:DataType>", ""); // remove prefix
        String str2 = str1.replace("</a:DataType>\"", ""); // remove postfix
        return str2;
    }

    /**
     * create JAVA file
     *
     * @param path            location of the result
     * @param variablesVector vector of triplets <name, code, datatype>
     * @param mandatoryKeys   output vector with all variables marked as primary (mandatory) key
     */
    private static void CreateJavaFile(String path, Vector<Vector<String>> variablesVector, Vector<String> mandatoryKeys) {
        try {
            String outputPackage = "package zlbpwa.javatest." + packageName + ";\n" + "\n";
            String outputImportsTimestamps = "import java.sql.Timestamp;\n\n";
            String outputImportsAnnotation = "import com.fasterxml.jackson.annotation.JsonGetter;\n"
                    + "import com.fasterxml.jackson.annotation.JsonIgnoreProperties;\n"
                    + "import com.fasterxml.jackson.annotation.JsonProperty;\n"
                    + (packageName.equals("model") ? "import com.fasterxml.jackson.annotation.JsonPropertyDescription;\n" :"") //no primary key identification in view
                    + "import com.fasterxml.jackson.annotation.JsonRootName;\n"
                    + "import com.fasterxml.jackson.annotation.JsonSetter;\n";
            String outputImportJsonDeserialize = "import com.fasterxml.jackson.databind.annotation.JsonDeserialize;\n";
            String outputImportJsonSerialize = "import com.fasterxml.jackson.databind.annotation.JsonSerialize;\n";
            String outputImportDeserializeBoolean = "import zlbpwa.javatest.util.BooleanDeserializer;\n";
            String outputImportSerializeBoolean = "import zlbpwa.javatest.util.BooleanSerializer;\n";
            String outputImportDeserializeTimestamp = "import zlbpwa.javatest.util.TimestampDeserializer;\n";
            String outputImportSerializeTimestamp = "import zlbpwa.javatest.util.TimestampSerializer;\n";
            String outputHeader = "\n/**\n"
                    + " * " + ClassName + " mapping class\n"
                    + " *\n"
                    + " * @author itelligence\n"
                    + " */\n"
                    + "@JsonRootName(value = \"" + ClassSapCode + "\")\n"
                    + "@JsonIgnoreProperties(ignoreUnknown = true)\n"
                    + "public class " + ClassName + " {\n\n";

            String outputVariables = "";
            String outputMethods = "";
            String outputToString = "    @Override\n//    @JsonValue\n    public String toString() {\n        return (\"" + ClassName + " [\"";
            String plusStr = " +\n            \", ";
            
            boolean usedTimestampsDeserializer = false;
            boolean usedTimestampsSerializer = false;
            boolean usedBooleanDeserializer = false;
            boolean usedBooleanSerializer = false;

            for (Vector<String> variable : variablesVector) {
                String columnId = variable.get(0);
                String name = variable.get(1);
                String code = variable.get(2);
                String dataType = variable.get(3);
                String javaType = javaType(dataType);


                if (mandatoryKeys.contains(columnId)) {
                    outputVariables += "    @JsonPropertyDescription(\"KEYFIELD\")\n";
                }

                if(javaType.equals("boolean")) {
                    outputVariables += "    @JsonDeserialize(using = BooleanDeserializer.class)\n";
                    usedBooleanDeserializer = true;
                }

                if(javaType.equals("Timestamp")) {
                    outputVariables += "    @JsonDeserialize(using = TimestampDeserializer.class)\n";
                    outputVariables += "    @JsonSerialize(using = TimestampSerializer.class)\n";
                    usedTimestampsDeserializer = true;
                    usedTimestampsSerializer = true;
                }

                outputVariables += "    @JsonProperty(\"" + code + "\")\n"
                       + "    private " + javaType + " " + name + ";\n\n";
                outputMethods += "    /**\n"
                       + "     * @return the JsonProperty(\"" + code + "\")\n" + "     */\n"
                       + "    @JsonGetter(\"" + code + "\")\n"
                       + "    public " + javaType + " get" + name + "() {\n"
                       + "        return " + name + ";\n"
                       + "    }\n" + "\n"
                       + "    /**\n"
                       + "     * @param " + name + " the parameter to set - JsonProperty(\"" +  code + "\")\n" + "     */\n"
                       + "    @JsonSetter(\"" + code + "\")\n"
                       + "    public void set" + name + "(" + javaType + " " + name + ") {\n"
                       + "        this." + name + " = " + name + ";\n"
                       + "    }\n\n";
                outputToString += plusStr + name + "=\" + " + name;

            }
            outputToString += " +\n            \"]\");\n    }\n";

            // write all to the file
            FileWriter fw = new FileWriter(path + ClassName + ".java");
            // write package
            fw.write(outputPackage);
            // write imports
            fw.write((usedTimestampsDeserializer || usedTimestampsSerializer) ? outputImportsTimestamps : "");
            fw.write(outputImportsAnnotation);
            fw.write((usedTimestampsDeserializer || usedBooleanDeserializer) ? outputImportJsonDeserialize : "");
            fw.write((usedTimestampsSerializer || usedBooleanSerializer) ? outputImportJsonSerialize : "");
            fw.write((usedTimestampsDeserializer || usedBooleanDeserializer || usedTimestampsSerializer || usedBooleanSerializer) ? "\n" : "");

            fw.write(usedBooleanDeserializer ? outputImportDeserializeBoolean : "");
            fw.write(usedBooleanSerializer ? outputImportSerializeBoolean : "");
            fw.write(usedTimestampsDeserializer ? outputImportDeserializeTimestamp : "");
            fw.write(usedTimestampsSerializer ? outputImportSerializeTimestamp : "");

            // write header
            fw.write(outputHeader);
            // write variables
            fw.write(outputVariables);
            // write getters and setter
            fw.write(outputMethods);
            // write toString method
            fw.write(outputToString);
            // write footer
            fw.write("}\n\n");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * convert dataType to java type
     *
     * @param dataType input dataType from PDM
     * @return java like data type
     */
    private static String javaType(String dataType) {
        String type = dataType;
        if (dataType.startsWith("numeric")) {
            type = "numeric";
        }
        if (dataType.startsWith("decimal")) {
            type = "decimal";
        }
        if (dataType.startsWith("char") || dataType.startsWith("varchar") || dataType.startsWith("nvarchar") || dataType.startsWith("NUMC")) {
            type = "varchar";
        }
        String javaType = mapSapJavaTypes.getOrDefault(type, "UNKNOWN");
        if (javaType.equals("UNKNOWN")) {
            javaType = "UNKNOWN_" + dataType;
        }

        return javaType;
    }

    /**
     * @param filename input file name
     * @param variablesVector output vector with all variables
     * @param mandatoryKeys output vector with all variables marked as primary (mandatory) key
     */
    private static void parseFile(String filename, Vector<Vector<String>> variablesVector, Vector<String> mandatoryKeys) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean header = true;
            String columnId = "unset";
            String name = "";
            String code = "";
            String dataType = "";
            while ((line = br.readLine()) != null) {
                if (line.contains("<o:Column Id")) {
                    columnId = getColumn(line);
                } else if (line.contains("<a:Name>")) {
                    name = getName(line);
                } else if (line.contains("<a:Code>")) {
                    code = getCode(line);
                } else if (line.contains("<a:DataType>")) {
                    dataType = getDataType(line);
                } else if (line.contains("<o:Column Ref")) {
                    mandatoryKeys.add(getColumn(line)); //primary keys are marked as mandatory keys
                }

                // decode future class name
                if (header && !name.isEmpty() && !code.isEmpty()) {
                    ClassName = name;
                    ClassSapCode = code;
                    name = "";
                    code = "";
                    header = false;
                }

                // decode future variable name ad parameters
                if (!header && !columnId.isEmpty() && !name.isEmpty() && !code.isEmpty() && !dataType.isEmpty()) {
                    Vector<String> variable = new Vector<String>(4);
                    variable.add(columnId);
                    variable.add(name);
                    variable.add(code);
                    variable.add(dataType);
                    variablesVector.add(variable);
                    columnId = "unset";
                    name = "";
                    code = "";
                    dataType = "";
                }

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
