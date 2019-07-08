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
 * GpsConverted mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_GPSCNV_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GpsConverted {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("DELNOTE")
    private long DeliveryNote;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("COUNTER")
    private long Counter;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("GPS_DATE")
    private Timestamp GpsDate;

    @JsonProperty("GPS")
    private String Gps;

    @JsonProperty("GPS_OPER_CODE")
    private String GpsOperationCode;

    @JsonProperty("GPS_ZIP")
    private String GpsZip;

    @JsonProperty("GPS_DISTANCE")
    private double GpsDistance;

    @JsonProperty("GPS_LOCATION")
    private String GpsLocation;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("ERDAT")
    private Timestamp Created;

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
    public long getCounter() {
        return Counter;
    }

    /**
     * @param Counter the parameter to set - JsonProperty("COUNTER")
     */
    @JsonSetter("COUNTER")
    public void setCounter(long Counter) {
        this.Counter = Counter;
    }

    /**
     * @return the JsonProperty("GPS_DATE")
     */
    @JsonGetter("GPS_DATE")
    public Timestamp getGpsDate() {
        return GpsDate;
    }

    /**
     * @param GpsDate the parameter to set - JsonProperty("GPS_DATE")
     */
    @JsonSetter("GPS_DATE")
    public void setGpsDate(Timestamp GpsDate) {
        this.GpsDate = GpsDate;
    }

    /**
     * @return the JsonProperty("GPS")
     */
    @JsonGetter("GPS")
    public String getGps() {
        return Gps;
    }

    /**
     * @param Gps the parameter to set - JsonProperty("GPS")
     */
    @JsonSetter("GPS")
    public void setGps(String Gps) {
        this.Gps = Gps;
    }

    /**
     * @return the JsonProperty("GPS_OPER_CODE")
     */
    @JsonGetter("GPS_OPER_CODE")
    public String getGpsOperationCode() {
        return GpsOperationCode;
    }

    /**
     * @param GpsOperationCode the parameter to set - JsonProperty("GPS_OPER_CODE")
     */
    @JsonSetter("GPS_OPER_CODE")
    public void setGpsOperationCode(String GpsOperationCode) {
        this.GpsOperationCode = GpsOperationCode;
    }

    /**
     * @return the JsonProperty("GPS_ZIP")
     */
    @JsonGetter("GPS_ZIP")
    public String getGpsZip() {
        return GpsZip;
    }

    /**
     * @param GpsZip the parameter to set - JsonProperty("GPS_ZIP")
     */
    @JsonSetter("GPS_ZIP")
    public void setGpsZip(String GpsZip) {
        this.GpsZip = GpsZip;
    }

    /**
     * @return the JsonProperty("GPS_DISTANCE")
     */
    @JsonGetter("GPS_DISTANCE")
    public double getGpsDistance() {
        return GpsDistance;
    }

    /**
     * @param GpsDistance the parameter to set - JsonProperty("GPS_DISTANCE")
     */
    @JsonSetter("GPS_DISTANCE")
    public void setGpsDistance(double GpsDistance) {
        this.GpsDistance = GpsDistance;
    }

    /**
     * @return the JsonProperty("GPS_LOCATION")
     */
    @JsonGetter("GPS_LOCATION")
    public String getGpsLocation() {
        return GpsLocation;
    }

    /**
     * @param GpsLocation the parameter to set - JsonProperty("GPS_LOCATION")
     */
    @JsonSetter("GPS_LOCATION")
    public void setGpsLocation(String GpsLocation) {
        this.GpsLocation = GpsLocation;
    }

    /**
     * @return the JsonProperty("ERDAT")
     */
    @JsonGetter("ERDAT")
    public Timestamp getCreated() {
        return Created;
    }

    /**
     * @param Created the parameter to set - JsonProperty("ERDAT")
     */
    @JsonSetter("ERDAT")
    public void setCreated(Timestamp Created) {
        this.Created = Created;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("GpsConverted [" +
            ", DeliveryNote=" + DeliveryNote +
            ", Counter=" + Counter +
            ", GpsDate=" + GpsDate +
            ", Gps=" + Gps +
            ", GpsOperationCode=" + GpsOperationCode +
            ", GpsZip=" + GpsZip +
            ", GpsDistance=" + GpsDistance +
            ", GpsLocation=" + GpsLocation +
            ", Created=" + Created +
            "]");
    }
}

