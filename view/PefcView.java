package zlbpwa.javatest.view;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.BooleanDeserializer;
import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * PefcView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_PEFC_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PefcView {

    @JsonProperty("PEFC_ID")
    private long PefcId;

    @JsonProperty("PEFC")
    private String Pefc;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("PEFC_VALIDFROM")
    private Timestamp PefcValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("PEFC_VALIDTO")
    private Timestamp PefcValidTo;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("PEFC_VALUE_EDIT")
    private boolean PefcValueEditable;

    @JsonProperty("PEFC_VALUE")
    private double PefcValue;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("PEFC_DESC")
    private String PefcDescription;

    /**
     * @return the JsonProperty("PEFC_ID")
     */
    @JsonGetter("PEFC_ID")
    public long getPefcId() {
        return PefcId;
    }

    /**
     * @param PefcId the parameter to set - JsonProperty("PEFC_ID")
     */
    @JsonSetter("PEFC_ID")
    public void setPefcId(long PefcId) {
        this.PefcId = PefcId;
    }

    /**
     * @return the JsonProperty("PEFC")
     */
    @JsonGetter("PEFC")
    public String getPefc() {
        return Pefc;
    }

    /**
     * @param Pefc the parameter to set - JsonProperty("PEFC")
     */
    @JsonSetter("PEFC")
    public void setPefc(String Pefc) {
        this.Pefc = Pefc;
    }

    /**
     * @return the JsonProperty("PEFC_VALIDFROM")
     */
    @JsonGetter("PEFC_VALIDFROM")
    public Timestamp getPefcValidFrom() {
        return PefcValidFrom;
    }

    /**
     * @param PefcValidFrom the parameter to set - JsonProperty("PEFC_VALIDFROM")
     */
    @JsonSetter("PEFC_VALIDFROM")
    public void setPefcValidFrom(Timestamp PefcValidFrom) {
        this.PefcValidFrom = PefcValidFrom;
    }

    /**
     * @return the JsonProperty("PEFC_VALIDTO")
     */
    @JsonGetter("PEFC_VALIDTO")
    public Timestamp getPefcValidTo() {
        return PefcValidTo;
    }

    /**
     * @param PefcValidTo the parameter to set - JsonProperty("PEFC_VALIDTO")
     */
    @JsonSetter("PEFC_VALIDTO")
    public void setPefcValidTo(Timestamp PefcValidTo) {
        this.PefcValidTo = PefcValidTo;
    }

    /**
     * @return the JsonProperty("PEFC_VALUE_EDIT")
     */
    @JsonGetter("PEFC_VALUE_EDIT")
    public boolean getPefcValueEditable() {
        return PefcValueEditable;
    }

    /**
     * @param PefcValueEditable the parameter to set - JsonProperty("PEFC_VALUE_EDIT")
     */
    @JsonSetter("PEFC_VALUE_EDIT")
    public void setPefcValueEditable(boolean PefcValueEditable) {
        this.PefcValueEditable = PefcValueEditable;
    }

    /**
     * @return the JsonProperty("PEFC_VALUE")
     */
    @JsonGetter("PEFC_VALUE")
    public double getPefcValue() {
        return PefcValue;
    }

    /**
     * @param PefcValue the parameter to set - JsonProperty("PEFC_VALUE")
     */
    @JsonSetter("PEFC_VALUE")
    public void setPefcValue(double PefcValue) {
        this.PefcValue = PefcValue;
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
     * @return the JsonProperty("PEFC_DESC")
     */
    @JsonGetter("PEFC_DESC")
    public String getPefcDescription() {
        return PefcDescription;
    }

    /**
     * @param PefcDescription the parameter to set - JsonProperty("PEFC_DESC")
     */
    @JsonSetter("PEFC_DESC")
    public void setPefcDescription(String PefcDescription) {
        this.PefcDescription = PefcDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("PefcView [" +
            ", PefcId=" + PefcId +
            ", Pefc=" + Pefc +
            ", PefcValidFrom=" + PefcValidFrom +
            ", PefcValidTo=" + PefcValidTo +
            ", PefcValueEditable=" + PefcValueEditable +
            ", PefcValue=" + PefcValue +
            ", Language=" + Language +
            ", PefcDescription=" + PefcDescription +
            "]");
    }
}

