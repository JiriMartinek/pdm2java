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

import zlbpwa.javatest.util.BooleanDeserializer;
import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * Fsc mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FSC_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fsc {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("FSC_ID")
    private long FscId;

    @JsonProperty("FSC")
    private String Fsc;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FSC_VALIDFROM")
    private Timestamp FscValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FSC_VALIDTO")
    private Timestamp FscValidTo;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("FSC_VALUE_EDIT")
    private boolean FscValueEditable;

    @JsonProperty("FSC_VALUE")
    private double FscValue;

    /**
     * @return the JsonProperty("FSC_ID")
     */
    @JsonGetter("FSC_ID")
    public long getFscId() {
        return FscId;
    }

    /**
     * @param FscId the parameter to set - JsonProperty("FSC_ID")
     */
    @JsonSetter("FSC_ID")
    public void setFscId(long FscId) {
        this.FscId = FscId;
    }

    /**
     * @return the JsonProperty("FSC")
     */
    @JsonGetter("FSC")
    public String getFsc() {
        return Fsc;
    }

    /**
     * @param Fsc the parameter to set - JsonProperty("FSC")
     */
    @JsonSetter("FSC")
    public void setFsc(String Fsc) {
        this.Fsc = Fsc;
    }

    /**
     * @return the JsonProperty("FSC_VALIDFROM")
     */
    @JsonGetter("FSC_VALIDFROM")
    public Timestamp getFscValidFrom() {
        return FscValidFrom;
    }

    /**
     * @param FscValidFrom the parameter to set - JsonProperty("FSC_VALIDFROM")
     */
    @JsonSetter("FSC_VALIDFROM")
    public void setFscValidFrom(Timestamp FscValidFrom) {
        this.FscValidFrom = FscValidFrom;
    }

    /**
     * @return the JsonProperty("FSC_VALIDTO")
     */
    @JsonGetter("FSC_VALIDTO")
    public Timestamp getFscValidTo() {
        return FscValidTo;
    }

    /**
     * @param FscValidTo the parameter to set - JsonProperty("FSC_VALIDTO")
     */
    @JsonSetter("FSC_VALIDTO")
    public void setFscValidTo(Timestamp FscValidTo) {
        this.FscValidTo = FscValidTo;
    }

    /**
     * @return the JsonProperty("FSC_VALUE_EDIT")
     */
    @JsonGetter("FSC_VALUE_EDIT")
    public boolean getFscValueEditable() {
        return FscValueEditable;
    }

    /**
     * @param FscValueEditable the parameter to set - JsonProperty("FSC_VALUE_EDIT")
     */
    @JsonSetter("FSC_VALUE_EDIT")
    public void setFscValueEditable(boolean FscValueEditable) {
        this.FscValueEditable = FscValueEditable;
    }

    /**
     * @return the JsonProperty("FSC_VALUE")
     */
    @JsonGetter("FSC_VALUE")
    public double getFscValue() {
        return FscValue;
    }

    /**
     * @param FscValue the parameter to set - JsonProperty("FSC_VALUE")
     */
    @JsonSetter("FSC_VALUE")
    public void setFscValue(double FscValue) {
        this.FscValue = FscValue;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Fsc [" +
            ", FscId=" + FscId +
            ", Fsc=" + Fsc +
            ", FscValidFrom=" + FscValidFrom +
            ", FscValidTo=" + FscValidTo +
            ", FscValueEditable=" + FscValueEditable +
            ", FscValue=" + FscValue +
            "]");
    }
}

