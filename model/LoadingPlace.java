package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * LoadingPlace mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_DIST_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoadingPlace {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LOADINGPLACE_ID")
    private long LoadingPlaceId;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonProperty("ADDRNUMBER")
    private String AdressNumber;

    @JsonProperty("POST_CODE1")
    private String PostalCode;

    @JsonProperty("CITY1")
    private String City;

    @JsonProperty("CITY2")
    private String Location;

    @JsonProperty("COUNTRY")
    private String Region;

    @JsonProperty("DISTZ")
    private double Distance;

    @JsonProperty("DISTZ_KM_EK")
    private double DistanceKm;

    @JsonProperty("MEDST")
    private String DistanceUnit;

    @JsonProperty("MEDST_KM_EK")
    private String DistanceKmUnit;

    /**
     * @return the JsonProperty("LOADINGPLACE_ID")
     */
    @JsonGetter("LOADINGPLACE_ID")
    public long getLoadingPlaceId() {
        return LoadingPlaceId;
    }

    /**
     * @param LoadingPlaceId the parameter to set - JsonProperty("LOADINGPLACE_ID")
     */
    @JsonSetter("LOADINGPLACE_ID")
    public void setLoadingPlaceId(long LoadingPlaceId) {
        this.LoadingPlaceId = LoadingPlaceId;
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
     * @return the JsonProperty("ADDRNUMBER")
     */
    @JsonGetter("ADDRNUMBER")
    public String getAdressNumber() {
        return AdressNumber;
    }

    /**
     * @param AdressNumber the parameter to set - JsonProperty("ADDRNUMBER")
     */
    @JsonSetter("ADDRNUMBER")
    public void setAdressNumber(String AdressNumber) {
        this.AdressNumber = AdressNumber;
    }

    /**
     * @return the JsonProperty("POST_CODE1")
     */
    @JsonGetter("POST_CODE1")
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the parameter to set - JsonProperty("POST_CODE1")
     */
    @JsonSetter("POST_CODE1")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * @return the JsonProperty("CITY1")
     */
    @JsonGetter("CITY1")
    public String getCity() {
        return City;
    }

    /**
     * @param City the parameter to set - JsonProperty("CITY1")
     */
    @JsonSetter("CITY1")
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the JsonProperty("CITY2")
     */
    @JsonGetter("CITY2")
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the parameter to set - JsonProperty("CITY2")
     */
    @JsonSetter("CITY2")
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @return the JsonProperty("COUNTRY")
     */
    @JsonGetter("COUNTRY")
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region the parameter to set - JsonProperty("COUNTRY")
     */
    @JsonSetter("COUNTRY")
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * @return the JsonProperty("DISTZ")
     */
    @JsonGetter("DISTZ")
    public double getDistance() {
        return Distance;
    }

    /**
     * @param Distance the parameter to set - JsonProperty("DISTZ")
     */
    @JsonSetter("DISTZ")
    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    /**
     * @return the JsonProperty("DISTZ_KM_EK")
     */
    @JsonGetter("DISTZ_KM_EK")
    public double getDistanceKm() {
        return DistanceKm;
    }

    /**
     * @param DistanceKm the parameter to set - JsonProperty("DISTZ_KM_EK")
     */
    @JsonSetter("DISTZ_KM_EK")
    public void setDistanceKm(double DistanceKm) {
        this.DistanceKm = DistanceKm;
    }

    /**
     * @return the JsonProperty("MEDST")
     */
    @JsonGetter("MEDST")
    public String getDistanceUnit() {
        return DistanceUnit;
    }

    /**
     * @param DistanceUnit the parameter to set - JsonProperty("MEDST")
     */
    @JsonSetter("MEDST")
    public void setDistanceUnit(String DistanceUnit) {
        this.DistanceUnit = DistanceUnit;
    }

    /**
     * @return the JsonProperty("MEDST_KM_EK")
     */
    @JsonGetter("MEDST_KM_EK")
    public String getDistanceKmUnit() {
        return DistanceKmUnit;
    }

    /**
     * @param DistanceKmUnit the parameter to set - JsonProperty("MEDST_KM_EK")
     */
    @JsonSetter("MEDST_KM_EK")
    public void setDistanceKmUnit(String DistanceKmUnit) {
        this.DistanceKmUnit = DistanceKmUnit;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("LoadingPlace [" +
            ", LoadingPlaceId=" + LoadingPlaceId +
            ", Plant=" + Plant +
            ", AdressNumber=" + AdressNumber +
            ", PostalCode=" + PostalCode +
            ", City=" + City +
            ", Location=" + Location +
            ", Region=" + Region +
            ", Distance=" + Distance +
            ", DistanceKm=" + DistanceKm +
            ", DistanceUnit=" + DistanceUnit +
            ", DistanceKmUnit=" + DistanceKmUnit +
            "]");
    }
}

