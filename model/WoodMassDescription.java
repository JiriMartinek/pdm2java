package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * WoodMassDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODM_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodMassDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOODMASS_ID")
    private long WoodMassId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("WOODMASS_DESC")
    private String WoodMassDescription;

    /**
     * @return the JsonProperty("WOODMASS_ID")
     */
    @JsonGetter("WOODMASS_ID")
    public long getWoodMassId() {
        return WoodMassId;
    }

    /**
     * @param WoodMassId the parameter to set - JsonProperty("WOODMASS_ID")
     */
    @JsonSetter("WOODMASS_ID")
    public void setWoodMassId(long WoodMassId) {
        this.WoodMassId = WoodMassId;
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
     * @return the JsonProperty("WOODMASS_DESC")
     */
    @JsonGetter("WOODMASS_DESC")
    public String getWoodMassDescription() {
        return WoodMassDescription;
    }

    /**
     * @param WoodMassDescription the parameter to set - JsonProperty("WOODMASS_DESC")
     */
    @JsonSetter("WOODMASS_DESC")
    public void setWoodMassDescription(String WoodMassDescription) {
        this.WoodMassDescription = WoodMassDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodMassDescription [" +
            ", WoodMassId=" + WoodMassId +
            ", Language=" + Language +
            ", WoodMassDescription=" + WoodMassDescription +
            "]");
    }
}

