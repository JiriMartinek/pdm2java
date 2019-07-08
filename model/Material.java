package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Material mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_MAT_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Material {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("MATNR")
    private String MaterialNumber;

    @JsonProperty("MTART")
    private String MaterialType;

    @JsonProperty("MATKL")
    private String MaterialGroup;

    @JsonProperty("MEINS")
    private String BaseUnitOfMeasure;

    /**
     * @return the JsonProperty("MATNR")
     */
    @JsonGetter("MATNR")
    public String getMaterialNumber() {
        return MaterialNumber;
    }

    /**
     * @param MaterialNumber the parameter to set - JsonProperty("MATNR")
     */
    @JsonSetter("MATNR")
    public void setMaterialNumber(String MaterialNumber) {
        this.MaterialNumber = MaterialNumber;
    }

    /**
     * @return the JsonProperty("MTART")
     */
    @JsonGetter("MTART")
    public String getMaterialType() {
        return MaterialType;
    }

    /**
     * @param MaterialType the parameter to set - JsonProperty("MTART")
     */
    @JsonSetter("MTART")
    public void setMaterialType(String MaterialType) {
        this.MaterialType = MaterialType;
    }

    /**
     * @return the JsonProperty("MATKL")
     */
    @JsonGetter("MATKL")
    public String getMaterialGroup() {
        return MaterialGroup;
    }

    /**
     * @param MaterialGroup the parameter to set - JsonProperty("MATKL")
     */
    @JsonSetter("MATKL")
    public void setMaterialGroup(String MaterialGroup) {
        this.MaterialGroup = MaterialGroup;
    }

    /**
     * @return the JsonProperty("MEINS")
     */
    @JsonGetter("MEINS")
    public String getBaseUnitOfMeasure() {
        return BaseUnitOfMeasure;
    }

    /**
     * @param BaseUnitOfMeasure the parameter to set - JsonProperty("MEINS")
     */
    @JsonSetter("MEINS")
    public void setBaseUnitOfMeasure(String BaseUnitOfMeasure) {
        this.BaseUnitOfMeasure = BaseUnitOfMeasure;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Material [" +
            ", MaterialNumber=" + MaterialNumber +
            ", MaterialType=" + MaterialType +
            ", MaterialGroup=" + MaterialGroup +
            ", BaseUnitOfMeasure=" + BaseUnitOfMeasure +
            "]");
    }
}

