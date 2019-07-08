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
 * Wood mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOOD_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wood {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOOD_ID")
    private long WoodId;

    @JsonProperty("WOOD")
    private String Wood;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOOD_VALIDFROM")
    private Timestamp WoodValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOOD_VALIDTO")
    private Timestamp WoodValidTo;

    /**
     * @return the JsonProperty("WOOD_ID")
     */
    @JsonGetter("WOOD_ID")
    public long getWoodId() {
        return WoodId;
    }

    /**
     * @param WoodId the parameter to set - JsonProperty("WOOD_ID")
     */
    @JsonSetter("WOOD_ID")
    public void setWoodId(long WoodId) {
        this.WoodId = WoodId;
    }

    /**
     * @return the JsonProperty("WOOD")
     */
    @JsonGetter("WOOD")
    public String getWood() {
        return Wood;
    }

    /**
     * @param Wood the parameter to set - JsonProperty("WOOD")
     */
    @JsonSetter("WOOD")
    public void setWood(String Wood) {
        this.Wood = Wood;
    }

    /**
     * @return the JsonProperty("WOOD_VALIDFROM")
     */
    @JsonGetter("WOOD_VALIDFROM")
    public Timestamp getWoodValidFrom() {
        return WoodValidFrom;
    }

    /**
     * @param WoodValidFrom the parameter to set - JsonProperty("WOOD_VALIDFROM")
     */
    @JsonSetter("WOOD_VALIDFROM")
    public void setWoodValidFrom(Timestamp WoodValidFrom) {
        this.WoodValidFrom = WoodValidFrom;
    }

    /**
     * @return the JsonProperty("WOOD_VALIDTO")
     */
    @JsonGetter("WOOD_VALIDTO")
    public Timestamp getWoodValidTo() {
        return WoodValidTo;
    }

    /**
     * @param WoodValidTo the parameter to set - JsonProperty("WOOD_VALIDTO")
     */
    @JsonSetter("WOOD_VALIDTO")
    public void setWoodValidTo(Timestamp WoodValidTo) {
        this.WoodValidTo = WoodValidTo;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Wood [" +
            ", WoodId=" + WoodId +
            ", Wood=" + Wood +
            ", WoodValidFrom=" + WoodValidFrom +
            ", WoodValidTo=" + WoodValidTo +
            "]");
    }
}

