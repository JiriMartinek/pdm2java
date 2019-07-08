package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import zlbpwa.javatest.util.BooleanDeserializer;

/**
 * MaterialPlantData mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_MATP_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaterialPlantData {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("MATNR")
    private String Material;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("WEIGHINGREL")
    private boolean RelevantForWeighing;

    @JsonProperty("WOODMASS")
    private String WoodMass;

    @JsonProperty("WOOD")
    private String Wood;

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
     * @return the JsonProperty("WERKS")
     */
    @JsonGetter("WERKS")
    public String getPlant() {
        return Plant;
    }

    /**
     * @param Plant the parameter to set - JsonProperty("WERKS")
     */
    @JsonSetter("WERKS")
    public void setPlant(String Plant) {
        this.Plant = Plant;
    }

    /**
     * @return the JsonProperty("WEIGHINGREL")
     */
    @JsonGetter("WEIGHINGREL")
    public boolean getRelevantForWeighing() {
        return RelevantForWeighing;
    }

    /**
     * @param RelevantForWeighing the parameter to set - JsonProperty("WEIGHINGREL")
     */
    @JsonSetter("WEIGHINGREL")
    public void setRelevantForWeighing(boolean RelevantForWeighing) {
        this.RelevantForWeighing = RelevantForWeighing;
    }

    /**
     * @return the JsonProperty("WOODMASS")
     */
    @JsonGetter("WOODMASS")
    public String getWoodMass() {
        return WoodMass;
    }

    /**
     * @param WoodMass the parameter to set - JsonProperty("WOODMASS")
     */
    @JsonSetter("WOODMASS")
    public void setWoodMass(String WoodMass) {
        this.WoodMass = WoodMass;
    }

    /**
     * @return the JsonProperty("WOOD")
     */
    @JsonGetter("WOOD")
    public String getWood() {
        return Wood;
    }

    /**
     * @param Wood the parameter to set - JsonProperty("WOOD")
     */
    @JsonSetter("WOOD")
    public void setWood(String Wood) {
        this.Wood = Wood;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("MaterialPlantData [" +
            ", Material=" + Material +
            ", Plant=" + Plant +
            ", RelevantForWeighing=" + RelevantForWeighing +
            ", WoodMass=" + WoodMass +
            ", Wood=" + Wood +
            "]");
    }
}

