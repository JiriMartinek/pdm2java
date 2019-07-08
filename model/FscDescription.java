package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * FscDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FSC_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FscDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("FSC_ID")
    private long FscId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("FSC_DESC")
    private String FscDescription;

    /**
     * @return the JsonProperty("FSC_ID")
     */
    @JsonGetter("FSC_ID")
    public long getFscId() {
        return FscId;
    }

    /**
     * @param FscId the parameter to set - JsonProperty("FSC_ID")
     */
    @JsonSetter("FSC_ID")
    public void setFscId(long FscId) {
        this.FscId = FscId;
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
     * @return the JsonProperty("FSC_DESC")
     */
    @JsonGetter("FSC_DESC")
    public String getFscDescription() {
        return FscDescription;
    }

    /**
     * @param FscDescription the parameter to set - JsonProperty("FSC_DESC")
     */
    @JsonSetter("FSC_DESC")
    public void setFscDescription(String FscDescription) {
        this.FscDescription = FscDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("FscDescription [" +
            ", FscId=" + FscId +
            ", Language=" + Language +
            ", FscDescription=" + FscDescription +
            "]");
    }
}

