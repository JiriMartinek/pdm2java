package zlbpwa.javatest.view;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * BatchView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BATCH_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchView {

    @JsonProperty("BATCH_ID")
    private long BatchId;

    @JsonProperty("EQUNR")
    private String Owen;

    @JsonProperty("BATCH_STATUS")
    private String BatchStatus;

    @JsonProperty("CREATED_BY")
    private String CreatedBy;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CREATED")
    private Timestamp Created;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("STARTED")
    private Timestamp Started;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FINISHED")
    private Timestamp Finished;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("BATCH_STATUS_DESC")
    private String BatchStatusDescription;

    /**
     * @return the JsonProperty("BATCH_ID")
     */
    @JsonGetter("BATCH_ID")
    public long getBatchId() {
        return BatchId;
    }

    /**
     * @param BatchId the parameter to set - JsonProperty("BATCH_ID")
     */
    @JsonSetter("BATCH_ID")
    public void setBatchId(long BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * @return the JsonProperty("EQUNR")
     */
    @JsonGetter("EQUNR")
    public String getOwen() {
        return Owen;
    }

    /**
     * @param Owen the parameter to set - JsonProperty("EQUNR")
     */
    @JsonSetter("EQUNR")
    public void setOwen(String Owen) {
        this.Owen = Owen;
    }

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
     * @return the JsonProperty("CREATED_BY")
     */
    @JsonGetter("CREATED_BY")
    public String getCreatedBy() {
        return CreatedBy;
    }

    /**
     * @param CreatedBy the parameter to set - JsonProperty("CREATED_BY")
     */
    @JsonSetter("CREATED_BY")
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * @return the JsonProperty("CREATED")
     */
    @JsonGetter("CREATED")
    public Timestamp getCreated() {
        return Created;
    }

    /**
     * @param Created the parameter to set - JsonProperty("CREATED")
     */
    @JsonSetter("CREATED")
    public void setCreated(Timestamp Created) {
        this.Created = Created;
    }

    /**
     * @return the JsonProperty("STARTED")
     */
    @JsonGetter("STARTED")
    public Timestamp getStarted() {
        return Started;
    }

    /**
     * @param Started the parameter to set - JsonProperty("STARTED")
     */
    @JsonSetter("STARTED")
    public void setStarted(Timestamp Started) {
        this.Started = Started;
    }

    /**
     * @return the JsonProperty("FINISHED")
     */
    @JsonGetter("FINISHED")
    public Timestamp getFinished() {
        return Finished;
    }

    /**
     * @param Finished the parameter to set - JsonProperty("FINISHED")
     */
    @JsonSetter("FINISHED")
    public void setFinished(Timestamp Finished) {
        this.Finished = Finished;
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
        return ("BatchView [" +
            ", BatchId=" + BatchId +
            ", Owen=" + Owen +
            ", BatchStatus=" + BatchStatus +
            ", CreatedBy=" + CreatedBy +
            ", Created=" + Created +
            ", Started=" + Started +
            ", Finished=" + Finished +
            ", Language=" + Language +
            ", BatchStatusDescription=" + BatchStatusDescription +
            "]");
    }
}

