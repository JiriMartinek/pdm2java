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
 * ReportedVendor mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_REPVEN_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportedVendor {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LICENSE_NUM")
    private String Vehicle;

    @JsonProperty("REPVEN_MSG")
    private String ReportedVendorMessage;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("REPVEN_VALIDFROM")
    private Timestamp ReportedVendorValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("REPVEN_VALIDTO")
    private Timestamp ReportedVendorValidTo;

    /**
     * @return the JsonProperty("WERKS")
     */
    @JsonGetter("WERKS")
    public String getPlant() {
        return Plant;
    }

    /**
     * @param Plant the parameter to set - JsonProperty("WERKS")
     */
    @JsonSetter("WERKS")
    public void setPlant(String Plant) {
        this.Plant = Plant;
    }

    /**
     * @return the JsonProperty("LIFNR")
     */
    @JsonGetter("LIFNR")
    public String getVendor() {
        return Vendor;
    }

    /**
     * @param Vendor the parameter to set - JsonProperty("LIFNR")
     */
    @JsonSetter("LIFNR")
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * @return the JsonProperty("LICENSE_NUM")
     */
    @JsonGetter("LICENSE_NUM")
    public String getVehicle() {
        return Vehicle;
    }

    /**
     * @param Vehicle the parameter to set - JsonProperty("LICENSE_NUM")
     */
    @JsonSetter("LICENSE_NUM")
    public void setVehicle(String Vehicle) {
        this.Vehicle = Vehicle;
    }

    /**
     * @return the JsonProperty("REPVEN_MSG")
     */
    @JsonGetter("REPVEN_MSG")
    public String getReportedVendorMessage() {
        return ReportedVendorMessage;
    }

    /**
     * @param ReportedVendorMessage the parameter to set - JsonProperty("REPVEN_MSG")
     */
    @JsonSetter("REPVEN_MSG")
    public void setReportedVendorMessage(String ReportedVendorMessage) {
        this.ReportedVendorMessage = ReportedVendorMessage;
    }

    /**
     * @return the JsonProperty("REPVEN_VALIDFROM")
     */
    @JsonGetter("REPVEN_VALIDFROM")
    public Timestamp getReportedVendorValidFrom() {
        return ReportedVendorValidFrom;
    }

    /**
     * @param ReportedVendorValidFrom the parameter to set - JsonProperty("REPVEN_VALIDFROM")
     */
    @JsonSetter("REPVEN_VALIDFROM")
    public void setReportedVendorValidFrom(Timestamp ReportedVendorValidFrom) {
        this.ReportedVendorValidFrom = ReportedVendorValidFrom;
    }

    /**
     * @return the JsonProperty("REPVEN_VALIDTO")
     */
    @JsonGetter("REPVEN_VALIDTO")
    public Timestamp getReportedVendorValidTo() {
        return ReportedVendorValidTo;
    }

    /**
     * @param ReportedVendorValidTo the parameter to set - JsonProperty("REPVEN_VALIDTO")
     */
    @JsonSetter("REPVEN_VALIDTO")
    public void setReportedVendorValidTo(Timestamp ReportedVendorValidTo) {
        this.ReportedVendorValidTo = ReportedVendorValidTo;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("ReportedVendor [" +
            ", Plant=" + Plant +
            ", Vendor=" + Vendor +
            ", Vehicle=" + Vehicle +
            ", ReportedVendorMessage=" + ReportedVendorMessage +
            ", ReportedVendorValidFrom=" + ReportedVendorValidFrom +
            ", ReportedVendorValidTo=" + ReportedVendorValidTo +
            "]");
    }
}

