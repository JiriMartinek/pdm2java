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
 * WoodMass mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODM_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodMass {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOODMASS_ID")
    private long WoodMassId;

    @JsonProperty("WOODMASS")
    private String WoodMass;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODMASS_VALIDFROM")
    private Timestamp WoodMassValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODMASS_VALIDTO")
    private Timestamp WoodMassValidTo;

    /**
     * @return the JsonProperty("WOODMASS_ID")
     */
    @JsonGetter("WOODMASS_ID")
    public long getWoodMassId() {
        return WoodMassId;
    }

    /**
     * @param WoodMassId the parameter to set - JsonProperty("WOODMASS_ID")
     */
    @JsonSetter("WOODMASS_ID")
    public void setWoodMassId(long WoodMassId) {
        this.WoodMassId = WoodMassId;
    }

    /**
     * @return the JsonProperty("WOODMASS")
     */
    @JsonGetter("WOODMASS")
    public String getWoodMass() {
        return WoodMass;
    }

    /**
     * @param WoodMass the parameter to set - JsonProperty("WOODMASS")
     */
    @JsonSetter("WOODMASS")
    public void setWoodMass(String WoodMass) {
        this.WoodMass = WoodMass;
    }

    /**
     * @return the JsonProperty("WOODMASS_VALIDFROM")
     */
    @JsonGetter("WOODMASS_VALIDFROM")
    public Timestamp getWoodMassValidFrom() {
        return WoodMassValidFrom;
    }

    /**
     * @param WoodMassValidFrom the parameter to set - JsonProperty("WOODMASS_VALIDFROM")
     */
    @JsonSetter("WOODMASS_VALIDFROM")
    public void setWoodMassValidFrom(Timestamp WoodMassValidFrom) {
        this.WoodMassValidFrom = WoodMassValidFrom;
    }

    /**
     * @return the JsonProperty("WOODMASS_VALIDTO")
     */
    @JsonGetter("WOODMASS_VALIDTO")
    public Timestamp getWoodMassValidTo() {
        return WoodMassValidTo;
    }

    /**
     * @param WoodMassValidTo the parameter to set - JsonProperty("WOODMASS_VALIDTO")
     */
    @JsonSetter("WOODMASS_VALIDTO")
    public void setWoodMassValidTo(Timestamp WoodMassValidTo) {
        this.WoodMassValidTo = WoodMassValidTo;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodMass [" +
            ", WoodMassId=" + WoodMassId +
            ", WoodMass=" + WoodMass +
            ", WoodMassValidFrom=" + WoodMassValidFrom +
            ", WoodMassValidTo=" + WoodMassValidTo +
            "]");
    }
}

