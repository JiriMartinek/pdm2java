package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * WoodCategoryDescrption mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODCA_DT")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodCategoryDescrption {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WOODCAT_ID")
    private long WoodCategoryId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("WOODCAT_DESC")
    private String WoodCategoryDescription;

    /**
     * @return the JsonProperty("WOODCAT_ID")
     */
    @JsonGetter("WOODCAT_ID")
    public long getWoodCategoryId() {
        return WoodCategoryId;
    }

    /**
     * @param WoodCategoryId the parameter to set - JsonProperty("WOODCAT_ID")
     */
    @JsonSetter("WOODCAT_ID")
    public void setWoodCategoryId(long WoodCategoryId) {
        this.WoodCategoryId = WoodCategoryId;
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
     * @return the JsonProperty("WOODCAT_DESC")
     */
    @JsonGetter("WOODCAT_DESC")
    public String getWoodCategoryDescription() {
        return WoodCategoryDescription;
    }

    /**
     * @param WoodCategoryDescription the parameter to set - JsonProperty("WOODCAT_DESC")
     */
    @JsonSetter("WOODCAT_DESC")
    public void setWoodCategoryDescription(String WoodCategoryDescription) {
        this.WoodCategoryDescription = WoodCategoryDescription;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodCategoryDescrption [" +
            ", WoodCategoryId=" + WoodCategoryId +
            ", Language=" + Language +
            ", WoodCategoryDescription=" + WoodCategoryDescription +
            "]");
    }
}

