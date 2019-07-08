package zlbpwa.javatest.view;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * WoodCategoryView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODCA_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodCategoryView {

    @JsonProperty("WOODCAT_ID")
    private long WoodCategoryId;

    @JsonProperty("WOODCAT")
    private int WoodCategory;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODCAT_VALIDFROM")
    private Timestamp WoodCategoryValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODCAT_VALIDTO")
    private Timestamp WoodCategoryValidTo;

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
     * @return the JsonProperty("WOODCAT")
     */
    @JsonGetter("WOODCAT")
    public int getWoodCategory() {
        return WoodCategory;
    }

    /**
     * @param WoodCategory the parameter to set - JsonProperty("WOODCAT")
     */
    @JsonSetter("WOODCAT")
    public void setWoodCategory(int WoodCategory) {
        this.WoodCategory = WoodCategory;
    }

    /**
     * @return the JsonProperty("WOODCAT_VALIDFROM")
     */
    @JsonGetter("WOODCAT_VALIDFROM")
    public Timestamp getWoodCategoryValidFrom() {
        return WoodCategoryValidFrom;
    }

    /**
     * @param WoodCategoryValidFrom the parameter to set - JsonProperty("WOODCAT_VALIDFROM")
     */
    @JsonSetter("WOODCAT_VALIDFROM")
    public void setWoodCategoryValidFrom(Timestamp WoodCategoryValidFrom) {
        this.WoodCategoryValidFrom = WoodCategoryValidFrom;
    }

    /**
     * @return the JsonProperty("WOODCAT_VALIDTO")
     */
    @JsonGetter("WOODCAT_VALIDTO")
    public Timestamp getWoodCategoryValidTo() {
        return WoodCategoryValidTo;
    }

    /**
     * @param WoodCategoryValidTo the parameter to set - JsonProperty("WOODCAT_VALIDTO")
     */
    @JsonSetter("WOODCAT_VALIDTO")
    public void setWoodCategoryValidTo(Timestamp WoodCategoryValidTo) {
        this.WoodCategoryValidTo = WoodCategoryValidTo;
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
        return ("WoodCategoryView [" +
            ", WoodCategoryId=" + WoodCategoryId +
            ", WoodCategory=" + WoodCategory +
            ", WoodCategoryValidFrom=" + WoodCategoryValidFrom +
            ", WoodCategoryValidTo=" + WoodCategoryValidTo +
            ", Language=" + Language +
            ", WoodCategoryDescription=" + WoodCategoryDescription +
            "]");
    }
}

