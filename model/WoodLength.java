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
 * WoodLength mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODLE_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodLength {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOODLEN_ID")
    private long WoodLengthId;

    @JsonProperty("WOODLEN")
    private double WoodLength;

    @JsonProperty("WOODLEN_GROUP")
    private int WoodLengthGroup;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODLEN_VALIDFROM")
    private Timestamp WoodLengthValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODLEN_VALIDTO")
    private Timestamp WoodLengthValidTo;

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
     * @return the JsonProperty("WOODLEN")
     */
    @JsonGetter("WOODLEN")
    public double getWoodLength() {
        return WoodLength;
    }

    /**
     * @param WoodLength the parameter to set - JsonProperty("WOODLEN")
     */
    @JsonSetter("WOODLEN")
    public void setWoodLength(double WoodLength) {
        this.WoodLength = WoodLength;
    }

    /**
     * @return the JsonProperty("WOODLEN_GROUP")
     */
    @JsonGetter("WOODLEN_GROUP")
    public int getWoodLengthGroup() {
        return WoodLengthGroup;
    }

    /**
     * @param WoodLengthGroup the parameter to set - JsonProperty("WOODLEN_GROUP")
     */
    @JsonSetter("WOODLEN_GROUP")
    public void setWoodLengthGroup(int WoodLengthGroup) {
        this.WoodLengthGroup = WoodLengthGroup;
    }

    /**
     * @return the JsonProperty("WOODLEN_VALIDFROM")
     */
    @JsonGetter("WOODLEN_VALIDFROM")
    public Timestamp getWoodLengthValidFrom() {
        return WoodLengthValidFrom;
    }

    /**
     * @param WoodLengthValidFrom the parameter to set - JsonProperty("WOODLEN_VALIDFROM")
     */
    @JsonSetter("WOODLEN_VALIDFROM")
    public void setWoodLengthValidFrom(Timestamp WoodLengthValidFrom) {
        this.WoodLengthValidFrom = WoodLengthValidFrom;
    }

    /**
     * @return the JsonProperty("WOODLEN_VALIDTO")
     */
    @JsonGetter("WOODLEN_VALIDTO")
    public Timestamp getWoodLengthValidTo() {
        return WoodLengthValidTo;
    }

    /**
     * @param WoodLengthValidTo the parameter to set - JsonProperty("WOODLEN_VALIDTO")
     */
    @JsonSetter("WOODLEN_VALIDTO")
    public void setWoodLengthValidTo(Timestamp WoodLengthValidTo) {
        this.WoodLengthValidTo = WoodLengthValidTo;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodLength [" +
            ", WoodLengthId=" + WoodLengthId +
            ", WoodLength=" + WoodLength +
            ", WoodLengthGroup=" + WoodLengthGroup +
            ", WoodLengthValidFrom=" + WoodLengthValidFrom +
            ", WoodLengthValidTo=" + WoodLengthValidTo +
            "]");
    }
}

