package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * ConditionType mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_CONTYP_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionType {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("KSCHL")
    private String ConditionType;

    /**
     * @return the JsonProperty("KSCHL")
     */
    @JsonGetter("KSCHL")
    public String getConditionType() {
        return ConditionType;
    }

    /**
     * @param ConditionType the parameter to set - JsonProperty("KSCHL")
     */
    @JsonSetter("KSCHL")
    public void setConditionType(String ConditionType) {
        this.ConditionType = ConditionType;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("ConditionType [" +
            ", ConditionType=" + ConditionType +
            "]");
    }
}

