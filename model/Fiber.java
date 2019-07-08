package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Fiber mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FIBER_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Fiber {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("FIBER")
    private String Fiber;

    @JsonProperty("FIBER_LEN")
    private double FiberLength;

    @JsonProperty("FIBER_CUB")
    private double FiberCubicMeters;

    /**
     * @return the JsonProperty("FIBER")
     */
    @JsonGetter("FIBER")
    public String getFiber() {
        return Fiber;
    }

    /**
     * @param Fiber the parameter to set - JsonProperty("FIBER")
     */
    @JsonSetter("FIBER")
    public void setFiber(String Fiber) {
        this.Fiber = Fiber;
    }

    /**
     * @return the JsonProperty("FIBER_LEN")
     */
    @JsonGetter("FIBER_LEN")
    public double getFiberLength() {
        return FiberLength;
    }

    /**
     * @param FiberLength the parameter to set - JsonProperty("FIBER_LEN")
     */
    @JsonSetter("FIBER_LEN")
    public void setFiberLength(double FiberLength) {
        this.FiberLength = FiberLength;
    }

    /**
     * @return the JsonProperty("FIBER_CUB")
     */
    @JsonGetter("FIBER_CUB")
    public double getFiberCubicMeters() {
        return FiberCubicMeters;
    }

    /**
     * @param FiberCubicMeters the parameter to set - JsonProperty("FIBER_CUB")
     */
    @JsonSetter("FIBER_CUB")
    public void setFiberCubicMeters(double FiberCubicMeters) {
        this.FiberCubicMeters = FiberCubicMeters;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Fiber [" +
            ", Fiber=" + Fiber +
            ", FiberLength=" + FiberLength +
            ", FiberCubicMeters=" + FiberCubicMeters +
            "]");
    }
}

