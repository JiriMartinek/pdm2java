package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * ConditionTypeDescription mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_CONTYP_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConditionTypeDescription {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("KSCHL")
    private String ConditionType;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("VTEXT")
    private String ConditionTypeDescription;

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
     * @return the JsonProperty("VTEXT")
     */
    @JsonGetter("VTEXT")
    public String getConditionTypeDescription() {
        return ConditionTypeDescription;
    }

    /**
     * @param ConditionTypeDescription the parameter to set - JsonProperty("VTEXT")
     */
    @JsonSetter("VTEXT")
    public void setConditionTypeDescription(String ConditionTypeDescription) {
        this.ConditionTypeDescription = ConditionTypeDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("ConditionTypeDescription [" +
            ", ConditionType=" + ConditionType +
            ", Language=" + Language +
            ", ConditionTypeDescription=" + ConditionTypeDescription +
            "]");
    }
}

