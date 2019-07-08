package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * FiberDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_FIBER_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FiberDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("FIBER")
    private String Fiber;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("FIBER_DESC")
    private String FiberDescription;

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

    @Override
//    @JsonValue
    public String toString() {
        return ("FiberDescription [" +
            ", Fiber=" + Fiber +
            ", Language=" + Language +
            ", FiberDescription=" + FiberDescription +
            "]");
    }
}

