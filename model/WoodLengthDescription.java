package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * WoodLengthDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODLE_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodLengthDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOODLEN_ID")
    private long WoodLengthId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("WOODLEN_DESC")
    private String WoodLengthDescription;

    /**
     * @return the JsonProperty("WOODLEN_ID")
     */
    @JsonGetter("WOODLEN_ID")
    public long getWoodLengthId() {
        return WoodLengthId;
    }

    /**
     * @param WoodLengthId the parameter to set - JsonProperty("WOODLEN_ID")
     */
    @JsonSetter("WOODLEN_ID")
    public void setWoodLengthId(long WoodLengthId) {
        this.WoodLengthId = WoodLengthId;
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
     * @return the JsonProperty("WOODLEN_DESC")
     */
    @JsonGetter("WOODLEN_DESC")
    public String getWoodLengthDescription() {
        return WoodLengthDescription;
    }

    /**
     * @param WoodLengthDescription the parameter to set - JsonProperty("WOODLEN_DESC")
     */
    @JsonSetter("WOODLEN_DESC")
    public void setWoodLengthDescription(String WoodLengthDescription) {
        this.WoodLengthDescription = WoodLengthDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodLengthDescription [" +
            ", WoodLengthId=" + WoodLengthId +
            ", Language=" + Language +
            ", WoodLengthDescription=" + WoodLengthDescription +
            "]");
    }
}

