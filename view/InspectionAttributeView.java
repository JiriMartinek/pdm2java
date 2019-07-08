package zlbpwa.javatest.view;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * InspectionAttributeView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_INSPCH_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class InspectionAttributeView {

    @JsonProperty("ZAEHLER")
    private String InspectionAttributePlant;

    @JsonProperty("MKMNR")
    private String InspectionAttribute;

    @JsonProperty("VERSION")
    private String InspectionAttributeVersion;

    @JsonProperty("QAUTH")
    private String InspectionAttributeAuthorizationGroup;

    @JsonProperty("WERKS")
    private String Plant;

    @JsonProperty("STEUERKZ")
    private String InspectionCharacteristic;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("KURZTEXT")
    private String InspectionAttributeDescription;

    /**
     * @return the JsonProperty("ZAEHLER")
     */
    @JsonGetter("ZAEHLER")
    public String getInspectionAttributePlant() {
        return InspectionAttributePlant;
    }

    /**
     * @param InspectionAttributePlant the parameter to set - JsonProperty("ZAEHLER")
     */
    @JsonSetter("ZAEHLER")
    public void setInspectionAttributePlant(String InspectionAttributePlant) {
        this.InspectionAttributePlant = InspectionAttributePlant;
    }

    /**
     * @return the JsonProperty("MKMNR")
     */
    @JsonGetter("MKMNR")
    public String getInspectionAttribute() {
        return InspectionAttribute;
    }

    /**
     * @param InspectionAttribute the parameter to set - JsonProperty("MKMNR")
     */
    @JsonSetter("MKMNR")
    public void setInspectionAttribute(String InspectionAttribute) {
        this.InspectionAttribute = InspectionAttribute;
    }

    /**
     * @return the JsonProperty("VERSION")
     */
    @JsonGetter("VERSION")
    public String getInspectionAttributeVersion() {
        return InspectionAttributeVersion;
    }

    /**
     * @param InspectionAttributeVersion the parameter to set - JsonProperty("VERSION")
     */
    @JsonSetter("VERSION")
    public void setInspectionAttributeVersion(String InspectionAttributeVersion) {
        this.InspectionAttributeVersion = InspectionAttributeVersion;
    }

    /**
     * @return the JsonProperty("QAUTH")
     */
    @JsonGetter("QAUTH")
    public String getInspectionAttributeAuthorizationGroup() {
        return InspectionAttributeAuthorizationGroup;
    }

    /**
     * @param InspectionAttributeAuthorizationGroup the parameter to set - JsonProperty("QAUTH")
     */
    @JsonSetter("QAUTH")
    public void setInspectionAttributeAuthorizationGroup(String InspectionAttributeAuthorizationGroup) {
        this.InspectionAttributeAuthorizationGroup = InspectionAttributeAuthorizationGroup;
    }

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
     * @return the JsonProperty("STEUERKZ")
     */
    @JsonGetter("STEUERKZ")
    public String getInspectionCharacteristic() {
        return InspectionCharacteristic;
    }

    /**
     * @param InspectionCharacteristic the parameter to set - JsonProperty("STEUERKZ")
     */
    @JsonSetter("STEUERKZ")
    public void setInspectionCharacteristic(String InspectionCharacteristic) {
        this.InspectionCharacteristic = InspectionCharacteristic;
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
     * @return the JsonProperty("KURZTEXT")
     */
    @JsonGetter("KURZTEXT")
    public String getInspectionAttributeDescription() {
        return InspectionAttributeDescription;
    }

    /**
     * @param InspectionAttributeDescription the parameter to set - JsonProperty("KURZTEXT")
     */
    @JsonSetter("KURZTEXT")
    public void setInspectionAttributeDescription(String InspectionAttributeDescription) {
        this.InspectionAttributeDescription = InspectionAttributeDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("InspectionAttributeView [" +
            ", InspectionAttributePlant=" + InspectionAttributePlant +
            ", InspectionAttribute=" + InspectionAttribute +
            ", InspectionAttributeVersion=" + InspectionAttributeVersion +
            ", InspectionAttributeAuthorizationGroup=" + InspectionAttributeAuthorizationGroup +
            ", Plant=" + Plant +
            ", InspectionCharacteristic=" + InspectionCharacteristic +
            ", Language=" + Language +
            ", InspectionAttributeDescription=" + InspectionAttributeDescription +
            "]");
    }
}

