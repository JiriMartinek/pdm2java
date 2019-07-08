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
 * WoodTypeView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_WOODTY_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WoodTypeView {

    @JsonProperty("WOODTYPE_ID")
    private long WoodTypeId;

    @JsonProperty("WOODCAT_ID")
    private long WoodCategoryId;

    @JsonProperty("WOODCAT_DESC")
    private String WoodCategoryDescription;

    @JsonProperty("WOODLEN_ID")
    private long WoodLengthId;

    @JsonProperty("WOODLEN_DESC")
    private String WoodLengthDescription;

    @JsonProperty("WOOD_ID")
    private long WoodId;

    @JsonProperty("WOOD_DESC")
    private String WoodDescription;

    @JsonProperty("KSCHL")
    private String ConditionType;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODTYPE_VALIDFROM")
    private Timestamp WoodTypeValidFrom;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("WOODTYPE_VALIDTO")
    private Timestamp WoodTypeValidTo;

    /**
     * @return the JsonProperty("WOODTYPE_ID")
     */
    @JsonGetter("WOODTYPE_ID")
    public long getWoodTypeId() {
        return WoodTypeId;
    }

    /**
     * @param WoodTypeId the parameter to set - JsonProperty("WOODTYPE_ID")
     */
    @JsonSetter("WOODTYPE_ID")
    public void setWoodTypeId(long WoodTypeId) {
        this.WoodTypeId = WoodTypeId;
    }

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

    /**
     * @return the JsonProperty("WOODLEN_ID")
     */
    @JsonGetter("WOODLEN_ID")
    public long getWoodLengthId() {
        return WoodLengthId;
    }

    /**
     * @param WoodLengthId the parameter to set - JsonProperty("WOODLEN_ID")
     */
    @JsonSetter("WOODLEN_ID")
    public void setWoodLengthId(long WoodLengthId) {
        this.WoodLengthId = WoodLengthId;
    }

    /**
     * @return the JsonProperty("WOODLEN_DESC")
     */
    @JsonGetter("WOODLEN_DESC")
    public String getWoodLengthDescription() {
        return WoodLengthDescription;
    }

    /**
     * @param WoodLengthDescription the parameter to set - JsonProperty("WOODLEN_DESC")
     */
    @JsonSetter("WOODLEN_DESC")
    public void setWoodLengthDescription(String WoodLengthDescription) {
        this.WoodLengthDescription = WoodLengthDescription;
    }

    /**
     * @return the JsonProperty("WOOD_ID")
     */
    @JsonGetter("WOOD_ID")
    public long getWoodId() {
        return WoodId;
    }

    /**
     * @param WoodId the parameter to set - JsonProperty("WOOD_ID")
     */
    @JsonSetter("WOOD_ID")
    public void setWoodId(long WoodId) {
        this.WoodId = WoodId;
    }

    /**
     * @return the JsonProperty("WOOD_DESC")
     */
    @JsonGetter("WOOD_DESC")
    public String getWoodDescription() {
        return WoodDescription;
    }

    /**
     * @param WoodDescription the parameter to set - JsonProperty("WOOD_DESC")
     */
    @JsonSetter("WOOD_DESC")
    public void setWoodDescription(String WoodDescription) {
        this.WoodDescription = WoodDescription;
    }

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
     * @return the JsonProperty("WOODTYPE_VALIDFROM")
     */
    @JsonGetter("WOODTYPE_VALIDFROM")
    public Timestamp getWoodTypeValidFrom() {
        return WoodTypeValidFrom;
    }

    /**
     * @param WoodTypeValidFrom the parameter to set - JsonProperty("WOODTYPE_VALIDFROM")
     */
    @JsonSetter("WOODTYPE_VALIDFROM")
    public void setWoodTypeValidFrom(Timestamp WoodTypeValidFrom) {
        this.WoodTypeValidFrom = WoodTypeValidFrom;
    }

    /**
     * @return the JsonProperty("WOODTYPE_VALIDTO")
     */
    @JsonGetter("WOODTYPE_VALIDTO")
    public Timestamp getWoodTypeValidTo() {
        return WoodTypeValidTo;
    }

    /**
     * @param WoodTypeValidTo the parameter to set - JsonProperty("WOODTYPE_VALIDTO")
     */
    @JsonSetter("WOODTYPE_VALIDTO")
    public void setWoodTypeValidTo(Timestamp WoodTypeValidTo) {
        this.WoodTypeValidTo = WoodTypeValidTo;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("WoodTypeView [" +
            ", WoodTypeId=" + WoodTypeId +
            ", WoodCategoryId=" + WoodCategoryId +
            ", WoodCategoryDescription=" + WoodCategoryDescription +
            ", WoodLengthId=" + WoodLengthId +
            ", WoodLengthDescription=" + WoodLengthDescription +
            ", WoodId=" + WoodId +
            ", WoodDescription=" + WoodDescription +
            ", ConditionType=" + ConditionType +
            ", WoodTypeValidFrom=" + WoodTypeValidFrom +
            ", WoodTypeValidTo=" + WoodTypeValidTo +
            "]");
    }
}

