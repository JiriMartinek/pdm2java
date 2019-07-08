package zlbpwa.javatest.view;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * FiberView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FIBER_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FiberView {

    @JsonProperty("FIBER")
    private String Fiber;

    @JsonProperty("FIBER_LEN")
    private double FiberLength;

    @JsonProperty("FIBER_CUB")
    private double FiberCubicMeters;

    @JsonProperty("FIBER_DESC")
    private String FiberDescription;

    @JsonProperty("SPRAS")
    private String Language;

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

    /**
     * @return the JsonProperty("FIBER_DESC")
     */
    @JsonGetter("FIBER_DESC")
    public String getFiberDescription() {
        return FiberDescription;
    }

    /**
     * @param FiberDescription the parameter to set - JsonProperty("FIBER_DESC")
     */
    @JsonSetter("FIBER_DESC")
    public void setFiberDescription(String FiberDescription) {
        this.FiberDescription = FiberDescription;
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

    @Override
//    @JsonValue
    public String toString() {
        return ("FiberView [" +
            ", Fiber=" + Fiber +
            ", FiberLength=" + FiberLength +
            ", FiberCubicMeters=" + FiberCubicMeters +
            ", FiberDescription=" + FiberDescription +
            ", Language=" + Language +
            "]");
    }
}

