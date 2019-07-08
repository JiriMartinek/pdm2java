package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * MaterialDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_MAT_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("MATNR")
    private String Material;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("MAKTX")
    private String MaterialDescription;

    /**
     * @return the JsonProperty("MATNR")
     */
    @JsonGetter("MATNR")
    public String getMaterial() {
        return Material;
    }

    /**
     * @param Material the parameter to set - JsonProperty("MATNR")
     */
    @JsonSetter("MATNR")
    public void setMaterial(String Material) {
        this.Material = Material;
    }

    /**
     * @return the JsonProperty("SPRAS")
     */
    @JsonGetter("SPRAS")
    public String getLanguage() {
        return Language;
    }

    /**
     * @param Language the parameter to set - JsonProperty("SPRAS")
     */
    @JsonSetter("SPRAS")
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * @return the JsonProperty("MAKTX")
     */
    @JsonGetter("MAKTX")
    public String getMaterialDescription() {
        return MaterialDescription;
    }

    /**
     * @param MaterialDescription the parameter to set - JsonProperty("MAKTX")
     */
    @JsonSetter("MAKTX")
    public void setMaterialDescription(String MaterialDescription) {
        this.MaterialDescription = MaterialDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("MaterialDescription [" +
            ", Material=" + Material +
            ", Language=" + Language +
            ", MaterialDescription=" + MaterialDescription +
            "]");
    }
}

