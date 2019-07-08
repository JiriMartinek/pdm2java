package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Violation mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_VIOLAT_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Violation {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("VIOLATION")
    private String Violation;

    @JsonProperty("VIOLATION_PERCENT")
    private double ViolationPercent;

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
     * @return the JsonProperty("VIOLATION_PERCENT")
     */
    @JsonGetter("VIOLATION_PERCENT")
    public double getViolationPercent() {
        return ViolationPercent;
    }

    /**
     * @param ViolationPercent the parameter to set - JsonProperty("VIOLATION_PERCENT")
     */
    @JsonSetter("VIOLATION_PERCENT")
    public void setViolationPercent(double ViolationPercent) {
        this.ViolationPercent = ViolationPercent;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Violation [" +
            ", Plant=" + Plant +
            ", Violation=" + Violation +
            ", ViolationPercent=" + ViolationPercent +
            "]");
    }
}

