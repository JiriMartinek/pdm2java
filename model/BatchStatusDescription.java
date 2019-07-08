package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * BatchStatusDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BATCHS_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchStatusDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("BATCH_STATUS")
    private String BatchStatus;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("BATCH_STATUS_DESC")
    private String BatchStatusDescription;

    /**
     * @return the JsonProperty("BATCH_STATUS")
     */
    @JsonGetter("BATCH_STATUS")
    public String getBatchStatus() {
        return BatchStatus;
    }

    /**
     * @param BatchStatus the parameter to set - JsonProperty("BATCH_STATUS")
     */
    @JsonSetter("BATCH_STATUS")
    public void setBatchStatus(String BatchStatus) {
        this.BatchStatus = BatchStatus;
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
     * @return the JsonProperty("BATCH_STATUS_DESC")
     */
    @JsonGetter("BATCH_STATUS_DESC")
    public String getBatchStatusDescription() {
        return BatchStatusDescription;
    }

    /**
     * @param BatchStatusDescription the parameter to set - JsonProperty("BATCH_STATUS_DESC")
     */
    @JsonSetter("BATCH_STATUS_DESC")
    public void setBatchStatusDescription(String BatchStatusDescription) {
        this.BatchStatusDescription = BatchStatusDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("BatchStatusDescription [" +
            ", BatchStatus=" + BatchStatus +
            ", Language=" + Language +
            ", BatchStatusDescription=" + BatchStatusDescription +
            "]");
    }
}

