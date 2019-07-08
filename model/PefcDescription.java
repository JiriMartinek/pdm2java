package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * PefcDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_PEFC_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PefcDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("PEFC_ID")
    private long PefcId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("PEFC_DESC")
    private String PefcDescription;

    /**
     * @return the JsonProperty("PEFC_ID")
     */
    @JsonGetter("PEFC_ID")
    public long getPefcId() {
        return PefcId;
    }

    /**
     * @param PefcId the parameter to set - JsonProperty("PEFC_ID")
     */
    @JsonSetter("PEFC_ID")
    public void setPefcId(long PefcId) {
        this.PefcId = PefcId;
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
     * @return the JsonProperty("PEFC_DESC")
     */
    @JsonGetter("PEFC_DESC")
    public String getPefcDescription() {
        return PefcDescription;
    }

    /**
     * @param PefcDescription the parameter to set - JsonProperty("PEFC_DESC")
     */
    @JsonSetter("PEFC_DESC")
    public void setPefcDescription(String PefcDescription) {
        this.PefcDescription = PefcDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("PefcDescription [" +
            ", PefcId=" + PefcId +
            ", Language=" + Language +
            ", PefcDescription=" + PefcDescription +
            "]");
    }
}

