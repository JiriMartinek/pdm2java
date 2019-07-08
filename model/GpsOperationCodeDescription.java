package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * GpsOperationCodeDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_GPSCNV_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GpsOperationCodeDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("GPS_OPER_CODE")
    private String GpsOperationCode;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("GPS_OC_DESC")
    private String GpsOperationCodeDescription;

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
     * @return the JsonProperty("GPS_OC_DESC")
     */
    @JsonGetter("GPS_OC_DESC")
    public String getGpsOperationCodeDescription() {
        return GpsOperationCodeDescription;
    }

    /**
     * @param GpsOperationCodeDescription the parameter to set - JsonProperty("GPS_OC_DESC")
     */
    @JsonSetter("GPS_OC_DESC")
    public void setGpsOperationCodeDescription(String GpsOperationCodeDescription) {
        this.GpsOperationCodeDescription = GpsOperationCodeDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("GpsOperationCodeDescription [" +
            ", GpsOperationCode=" + GpsOperationCode +
            ", Language=" + Language +
            ", GpsOperationCodeDescription=" + GpsOperationCodeDescription +
            "]");
    }
}

