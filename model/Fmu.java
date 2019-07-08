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
 * Fmu mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FMU_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fmu {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("FMU_ID")
    private long FmuId;

    @JsonProperty("FMU_COUNTRY")
    private String FmuCountry;

    @JsonProperty("FMU")
    private int Fmu;

    @JsonProperty("FMU_LOCATION")
    private String FmuLocation;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FMU_VALIDFROM")
    private Timestamp FmuValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FMU_VALIDTO")
    private Timestamp FmuValidTo;

    @JsonProperty("FMU_APPROVER")
    private String FmuApprover;

    @JsonProperty("FMU_AREA")
    private long FmuArea;

    /**
     * @return the JsonProperty("FMU_ID")
     */
    @JsonGetter("FMU_ID")
    public long getFmuId() {
        return FmuId;
    }

    /**
     * @param FmuId the parameter to set - JsonProperty("FMU_ID")
     */
    @JsonSetter("FMU_ID")
    public void setFmuId(long FmuId) {
        this.FmuId = FmuId;
    }

    /**
     * @return the JsonProperty("FMU_COUNTRY")
     */
    @JsonGetter("FMU_COUNTRY")
    public String getFmuCountry() {
        return FmuCountry;
    }

    /**
     * @param FmuCountry the parameter to set - JsonProperty("FMU_COUNTRY")
     */
    @JsonSetter("FMU_COUNTRY")
    public void setFmuCountry(String FmuCountry) {
        this.FmuCountry = FmuCountry;
    }

    /**
     * @return the JsonProperty("FMU")
     */
    @JsonGetter("FMU")
    public int getFmu() {
        return Fmu;
    }

    /**
     * @param Fmu the parameter to set - JsonProperty("FMU")
     */
    @JsonSetter("FMU")
    public void setFmu(int Fmu) {
        this.Fmu = Fmu;
    }

    /**
     * @return the JsonProperty("FMU_LOCATION")
     */
    @JsonGetter("FMU_LOCATION")
    public String getFmuLocation() {
        return FmuLocation;
    }

    /**
     * @param FmuLocation the parameter to set - JsonProperty("FMU_LOCATION")
     */
    @JsonSetter("FMU_LOCATION")
    public void setFmuLocation(String FmuLocation) {
        this.FmuLocation = FmuLocation;
    }

    /**
     * @return the JsonProperty("FMU_VALIDFROM")
     */
    @JsonGetter("FMU_VALIDFROM")
    public Timestamp getFmuValidFrom() {
        return FmuValidFrom;
    }

    /**
     * @param FmuValidFrom the parameter to set - JsonProperty("FMU_VALIDFROM")
     */
    @JsonSetter("FMU_VALIDFROM")
    public void setFmuValidFrom(Timestamp FmuValidFrom) {
        this.FmuValidFrom = FmuValidFrom;
    }

    /**
     * @return the JsonProperty("FMU_VALIDTO")
     */
    @JsonGetter("FMU_VALIDTO")
    public Timestamp getFmuValidTo() {
        return FmuValidTo;
    }

    /**
     * @param FmuValidTo the parameter to set - JsonProperty("FMU_VALIDTO")
     */
    @JsonSetter("FMU_VALIDTO")
    public void setFmuValidTo(Timestamp FmuValidTo) {
        this.FmuValidTo = FmuValidTo;
    }

    /**
     * @return the JsonProperty("FMU_APPROVER")
     */
    @JsonGetter("FMU_APPROVER")
    public String getFmuApprover() {
        return FmuApprover;
    }

    /**
     * @param FmuApprover the parameter to set - JsonProperty("FMU_APPROVER")
     */
    @JsonSetter("FMU_APPROVER")
    public void setFmuApprover(String FmuApprover) {
        this.FmuApprover = FmuApprover;
    }

    /**
     * @return the JsonProperty("FMU_AREA")
     */
    @JsonGetter("FMU_AREA")
    public long getFmuArea() {
        return FmuArea;
    }

    /**
     * @param FmuArea the parameter to set - JsonProperty("FMU_AREA")
     */
    @JsonSetter("FMU_AREA")
    public void setFmuArea(long FmuArea) {
        this.FmuArea = FmuArea;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Fmu [" +
            ", FmuId=" + FmuId +
            ", FmuCountry=" + FmuCountry +
            ", Fmu=" + Fmu +
            ", FmuLocation=" + FmuLocation +
            ", FmuValidFrom=" + FmuValidFrom +
            ", FmuValidTo=" + FmuValidTo +
            ", FmuApprover=" + FmuApprover +
            ", FmuArea=" + FmuArea +
            "]");
    }
}

