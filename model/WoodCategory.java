package zlbpwa.javatest.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * WoodCategory mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODCA_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodCategory {

    @JsonPropertyDescription("KEYFIELD")
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

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodCategory [" +
            ", WoodCategoryId=" + WoodCategoryId +
            ", WoodCategory=" + WoodCategory +
            ", WoodCategoryValidFrom=" + WoodCategoryValidFrom +
            ", WoodCategoryValidTo=" + WoodCategoryValidTo +
            "]");
    }
}

