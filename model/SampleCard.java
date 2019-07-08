package zlbpwa.javatest.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * SampleCard mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_SCARD_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SampleCard {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SAMPLECARD_ID")
    private long SampleCardId;

    @JsonProperty("DELNOTE")
    private long DeliveryNote;

    @JsonProperty("COUNTER")
    private int Counter;

    @JsonProperty("CREATEDBY")
    private String CreatedBy;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CREATED")
    private Timestamp Created;

    /**
     * @return the JsonProperty("SAMPLECARD_ID")
     */
    @JsonGetter("SAMPLECARD_ID")
    public long getSampleCardId() {
        return SampleCardId;
    }

    /**
     * @param SampleCardId the parameter to set - JsonProperty("SAMPLECARD_ID")
     */
    @JsonSetter("SAMPLECARD_ID")
    public void setSampleCardId(long SampleCardId) {
        this.SampleCardId = SampleCardId;
    }

    /**
     * @return the JsonProperty("DELNOTE")
     */
    @JsonGetter("DELNOTE")
    public long getDeliveryNote() {
        return DeliveryNote;
    }

    /**
     * @param DeliveryNote the parameter to set - JsonProperty("DELNOTE")
     */
    @JsonSetter("DELNOTE")
    public void setDeliveryNote(long DeliveryNote) {
        this.DeliveryNote = DeliveryNote;
    }

    /**
     * @return the JsonProperty("COUNTER")
     */
    @JsonGetter("COUNTER")
    public int getCounter() {
        return Counter;
    }

    /**
     * @param Counter the parameter to set - JsonProperty("COUNTER")
     */
    @JsonSetter("COUNTER")
    public void setCounter(int Counter) {
        this.Counter = Counter;
    }

    /**
     * @return the JsonProperty("CREATEDBY")
     */
    @JsonGetter("CREATEDBY")
    public String getCreatedBy() {
        return CreatedBy;
    }

    /**
     * @param CreatedBy the parameter to set - JsonProperty("CREATEDBY")
     */
    @JsonSetter("CREATEDBY")
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

    @Override
//    @JsonValue
    public String toString() {
        return ("SampleCard [" +
            ", SampleCardId=" + SampleCardId +
            ", DeliveryNote=" + DeliveryNote +
            ", Counter=" + Counter +
            ", CreatedBy=" + CreatedBy +
            ", Created=" + Created +
            "]");
    }
}

