package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * BatchBowl mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_BTBWL_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BatchBowl {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("BATCH_ID")
    private long BatchId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EQUNR")
    private String Bowl;

    @JsonProperty("BOWL_RECORDED_WEIGHT")
    private double BowlRecordedWeight;

    @JsonProperty("START_WEIGHT")
    private double StartWeight;

    @JsonProperty("END_WEIGHT")
    private double EndWeight;

    @JsonProperty("SAMPLECARD_ID")
    private long SampleCardId;

    @JsonProperty("DRY_MASS")
    private double DryMass;

    /**
     * @return the JsonProperty("BATCH_ID")
     */
    @JsonGetter("BATCH_ID")
    public long getBatchId() {
        return BatchId;
    }

    /**
     * @param BatchId the parameter to set - JsonProperty("BATCH_ID")
     */
    @JsonSetter("BATCH_ID")
    public void setBatchId(long BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * @return the JsonProperty("EQUNR")
     */
    @JsonGetter("EQUNR")
    public String getBowl() {
        return Bowl;
    }

    /**
     * @param Bowl the parameter to set - JsonProperty("EQUNR")
     */
    @JsonSetter("EQUNR")
    public void setBowl(String Bowl) {
        this.Bowl = Bowl;
    }

    /**
     * @return the JsonProperty("BOWL_RECORDED_WEIGHT")
     */
    @JsonGetter("BOWL_RECORDED_WEIGHT")
    public double getBowlRecordedWeight() {
        return BowlRecordedWeight;
    }

    /**
     * @param BowlRecordedWeight the parameter to set - JsonProperty("BOWL_RECORDED_WEIGHT")
     */
    @JsonSetter("BOWL_RECORDED_WEIGHT")
    public void setBowlRecordedWeight(double BowlRecordedWeight) {
        this.BowlRecordedWeight = BowlRecordedWeight;
    }

    /**
     * @return the JsonProperty("START_WEIGHT")
     */
    @JsonGetter("START_WEIGHT")
    public double getStartWeight() {
        return StartWeight;
    }

    /**
     * @param StartWeight the parameter to set - JsonProperty("START_WEIGHT")
     */
    @JsonSetter("START_WEIGHT")
    public void setStartWeight(double StartWeight) {
        this.StartWeight = StartWeight;
    }

    /**
     * @return the JsonProperty("END_WEIGHT")
     */
    @JsonGetter("END_WEIGHT")
    public double getEndWeight() {
        return EndWeight;
    }

    /**
     * @param EndWeight the parameter to set - JsonProperty("END_WEIGHT")
     */
    @JsonSetter("END_WEIGHT")
    public void setEndWeight(double EndWeight) {
        this.EndWeight = EndWeight;
    }

    /**
     * @return the JsonProperty("SAMPLECARD_ID")
     */
    @JsonGetter("SAMPLECARD_ID")
    public long getSampleCardId() {
        return SampleCardId;
    }

    /**
     * @param SampleCardId the parameter to set - JsonProperty("SAMPLECARD_ID")
     */
    @JsonSetter("SAMPLECARD_ID")
    public void setSampleCardId(long SampleCardId) {
        this.SampleCardId = SampleCardId;
    }

    /**
     * @return the JsonProperty("DRY_MASS")
     */
    @JsonGetter("DRY_MASS")
    public double getDryMass() {
        return DryMass;
    }

    /**
     * @param DryMass the parameter to set - JsonProperty("DRY_MASS")
     */
    @JsonSetter("DRY_MASS")
    public void setDryMass(double DryMass) {
        this.DryMass = DryMass;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("BatchBowl [" +
            ", BatchId=" + BatchId +
            ", Bowl=" + Bowl +
            ", BowlRecordedWeight=" + BowlRecordedWeight +
            ", StartWeight=" + StartWeight +
            ", EndWeight=" + EndWeight +
            ", SampleCardId=" + SampleCardId +
            ", DryMass=" + DryMass +
            "]");
    }
}

