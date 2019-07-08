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
 * BatchValue mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BATCHVAL_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchValue {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("BATCH_ID")
    private long BatchId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("TIME")
    private Timestamp Time;

    @JsonProperty("HUMIDITY")
    private double Humidity;

    @JsonProperty("TEMPERAURE")
    private double Temperaure;

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
     * @return the JsonProperty("TIME")
     */
    @JsonGetter("TIME")
    public Timestamp getTime() {
        return Time;
    }

    /**
     * @param Time the parameter to set - JsonProperty("TIME")
     */
    @JsonSetter("TIME")
    public void setTime(Timestamp Time) {
        this.Time = Time;
    }

    /**
     * @return the JsonProperty("HUMIDITY")
     */
    @JsonGetter("HUMIDITY")
    public double getHumidity() {
        return Humidity;
    }

    /**
     * @param Humidity the parameter to set - JsonProperty("HUMIDITY")
     */
    @JsonSetter("HUMIDITY")
    public void setHumidity(double Humidity) {
        this.Humidity = Humidity;
    }

    /**
     * @return the JsonProperty("TEMPERAURE")
     */
    @JsonGetter("TEMPERAURE")
    public double getTemperaure() {
        return Temperaure;
    }

    /**
     * @param Temperaure the parameter to set - JsonProperty("TEMPERAURE")
     */
    @JsonSetter("TEMPERAURE")
    public void setTemperaure(double Temperaure) {
        this.Temperaure = Temperaure;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("BatchValue [" +
            ", BatchId=" + BatchId +
            ", Time=" + Time +
            ", Humidity=" + Humidity +
            ", Temperaure=" + Temperaure +
            "]");
    }
}

