package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Bowl mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BOWL_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bowl {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EQUNR")
    private String Bowl;

    @JsonProperty("BOWL_WEIGHT")
    private double BowlWeight;

    @JsonProperty("BOWL_WEIGHT_UNIT")
    private String BowlWeightUnit;

    /**
     * @return the JsonProperty("EQUNR")
     */
    @JsonGetter("EQUNR")
    public String getBowl() {
        return Bowl;
    }

    /**
     * @param Bowl the parameter to set - JsonProperty("EQUNR")
     */
    @JsonSetter("EQUNR")
    public void setBowl(String Bowl) {
        this.Bowl = Bowl;
    }

    /**
     * @return the JsonProperty("BOWL_WEIGHT")
     */
    @JsonGetter("BOWL_WEIGHT")
    public double getBowlWeight() {
        return BowlWeight;
    }

    /**
     * @param BowlWeight the parameter to set - JsonProperty("BOWL_WEIGHT")
     */
    @JsonSetter("BOWL_WEIGHT")
    public void setBowlWeight(double BowlWeight) {
        this.BowlWeight = BowlWeight;
    }

    /**
     * @return the JsonProperty("BOWL_WEIGHT_UNIT")
     */
    @JsonGetter("BOWL_WEIGHT_UNIT")
    public String getBowlWeightUnit() {
        return BowlWeightUnit;
    }

    /**
     * @param BowlWeightUnit the parameter to set - JsonProperty("BOWL_WEIGHT_UNIT")
     */
    @JsonSetter("BOWL_WEIGHT_UNIT")
    public void setBowlWeightUnit(String BowlWeightUnit) {
        this.BowlWeightUnit = BowlWeightUnit;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Bowl [" +
            ", Bowl=" + Bowl +
            ", BowlWeight=" + BowlWeight +
            ", BowlWeightUnit=" + BowlWeightUnit +
            "]");
    }
}

