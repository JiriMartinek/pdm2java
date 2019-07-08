package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * WoodDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOOD_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOOD_ID")
    private long WoodId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("WOOD_DESC")
    private String WoodDescription;

    /**
     * @return the JsonProperty("WOOD_ID")
     */
    @JsonGetter("WOOD_ID")
    public long getWoodId() {
        return WoodId;
    }

    /**
     * @param WoodId the parameter to set - JsonProperty("WOOD_ID")
     */
    @JsonSetter("WOOD_ID")
    public void setWoodId(long WoodId) {
        this.WoodId = WoodId;
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
     * @return the JsonProperty("WOOD_DESC")
     */
    @JsonGetter("WOOD_DESC")
    public String getWoodDescription() {
        return WoodDescription;
    }

    /**
     * @param WoodDescription the parameter to set - JsonProperty("WOOD_DESC")
     */
    @JsonSetter("WOOD_DESC")
    public void setWoodDescription(String WoodDescription) {
        this.WoodDescription = WoodDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodDescription [" +
            ", WoodId=" + WoodId +
            ", Language=" + Language +
            ", WoodDescription=" + WoodDescription +
            "]");
    }
}

