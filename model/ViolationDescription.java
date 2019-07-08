package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * ViolationDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_VIOLAT_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ViolationDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("VIOLATION")
    private String Violation;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("VIOLATION_DESCRIPTION")
    private String ViolationDescription;

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
     * @return the JsonProperty("VIOLATION")
     */
    @JsonGetter("VIOLATION")
    public String getViolation() {
        return Violation;
    }

    /**
     * @param Violation the parameter to set - JsonProperty("VIOLATION")
     */
    @JsonSetter("VIOLATION")
    public void setViolation(String Violation) {
        this.Violation = Violation;
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
     * @return the JsonProperty("VIOLATION_DESCRIPTION")
     */
    @JsonGetter("VIOLATION_DESCRIPTION")
    public String getViolationDescription() {
        return ViolationDescription;
    }

    /**
     * @param ViolationDescription the parameter to set - JsonProperty("VIOLATION_DESCRIPTION")
     */
    @JsonSetter("VIOLATION_DESCRIPTION")
    public void setViolationDescription(String ViolationDescription) {
        this.ViolationDescription = ViolationDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("ViolationDescription [" +
            ", Plant=" + Plant +
            ", Violation=" + Violation +
            ", Language=" + Language +
            ", ViolationDescription=" + ViolationDescription +
            "]");
    }
}

