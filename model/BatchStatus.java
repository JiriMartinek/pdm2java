package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * BatchStatus mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BATCHS_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchStatus {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("BATCH_STATUS")
    private String BatchStatus;

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

    @Override
//    @JsonValue
    public String toString() {
        return ("BatchStatus [" +
            ", BatchStatus=" + BatchStatus +
            "]");
    }
}

