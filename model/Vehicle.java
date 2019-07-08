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
 * Vehicle mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_VEHICLE_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Vehicle {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EQUNR")
    private String Vehicle;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("ERDAT")
    private Timestamp Created;

    @JsonProperty("ERNAM")
    private String CreatedBy;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("AEDAT")
    private Timestamp Changed;

    @JsonProperty("AENAM")
    private String ChangedBy;

    @JsonProperty("BRGEW")
    private double Weight;

    @JsonProperty("GEWEI")
    private String WeightUnit;

    @JsonProperty("EQTYP")
    private String VehicleCategory;

    @JsonProperty("PLANT")
    private String Plant;

    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonProperty("LICENSE_NUM")
    private String LicenseNumber;

    @JsonProperty("OBJNR")
    private String ObjectNumber;

    @JsonProperty("TRUCK_TYPE")
    private String TruckType;

    @JsonProperty("TRUCK_VOLUME")
    private double TruckVolume;

    @JsonProperty("WOODMASS")
    private String WoodMass;

    @JsonProperty("FLEET_CAT")
    private String FleetCategory;

    @JsonProperty("GPS_TYPE")
    private String GpsType;

    @JsonProperty("GPS_ID")
    private String GpsId;

    /**
     * @return the JsonProperty("EQUNR")
     */
    @JsonGetter("EQUNR")
    public String getVehicle() {
        return Vehicle;
    }

    /**
     * @param Vehicle the parameter to set - JsonProperty("EQUNR")
     */
    @JsonSetter("EQUNR")
    public void setVehicle(String Vehicle) {
        this.Vehicle = Vehicle;
    }

    /**
     * @return the JsonProperty("ERDAT")
     */
    @JsonGetter("ERDAT")
    public Timestamp getCreated() {
        return Created;
    }

    /**
     * @param Created the parameter to set - JsonProperty("ERDAT")
     */
    @JsonSetter("ERDAT")
    public void setCreated(Timestamp Created) {
        this.Created = Created;
    }

    /**
     * @return the JsonProperty("ERNAM")
     */
    @JsonGetter("ERNAM")
    public String getCreatedBy() {
        return CreatedBy;
    }

    /**
     * @param CreatedBy the parameter to set - JsonProperty("ERNAM")
     */
    @JsonSetter("ERNAM")
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
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
     * @return the JsonProperty("AEDAT")
     */
    @JsonGetter("AEDAT")
    public Timestamp getChanged() {
        return Changed;
    }

    /**
     * @param Changed the parameter to set - JsonProperty("AEDAT")
     */
    @JsonSetter("AEDAT")
    public void setChanged(Timestamp Changed) {
        this.Changed = Changed;
    }

    /**
     * @return the JsonProperty("AENAM")
     */
    @JsonGetter("AENAM")
    public String getChangedBy() {
        return ChangedBy;
    }

    /**
     * @param ChangedBy the parameter to set - JsonProperty("AENAM")
     */
    @JsonSetter("AENAM")
    public void setChangedBy(String ChangedBy) {
        this.ChangedBy = ChangedBy;
    }

    /**
     * @return the JsonProperty("BRGEW")
     */
    @JsonGetter("BRGEW")
    public double getWeight() {
        return Weight;
    }

    /**
     * @param Weight the parameter to set - JsonProperty("BRGEW")
     */
    @JsonSetter("BRGEW")
    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    /**
     * @return the JsonProperty("GEWEI")
     */
    @JsonGetter("GEWEI")
    public String getWeightUnit() {
        return WeightUnit;
    }

    /**
     * @param WeightUnit the parameter to set - JsonProperty("GEWEI")
     */
    @JsonSetter("GEWEI")
    public void setWeightUnit(String WeightUnit) {
        this.WeightUnit = WeightUnit;
    }

    /**
     * @return the JsonProperty("EQTYP")
     */
    @JsonGetter("EQTYP")
    public String getVehicleCategory() {
        return VehicleCategory;
    }

    /**
     * @param VehicleCategory the parameter to set - JsonProperty("EQTYP")
     */
    @JsonSetter("EQTYP")
    public void setVehicleCategory(String VehicleCategory) {
        this.VehicleCategory = VehicleCategory;
    }

    /**
     * @return the JsonProperty("PLANT")
     */
    @JsonGetter("PLANT")
    public String getPlant() {
        return Plant;
    }

    /**
     * @param Plant the parameter to set - JsonProperty("PLANT")
     */
    @JsonSetter("PLANT")
    public void setPlant(String Plant) {
        this.Plant = Plant;
    }

    /**
     * @return the JsonProperty("LIFNR")
     */
    @JsonGetter("LIFNR")
    public String getVendor() {
        return Vendor;
    }

    /**
     * @param Vendor the parameter to set - JsonProperty("LIFNR")
     */
    @JsonSetter("LIFNR")
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * @return the JsonProperty("LICENSE_NUM")
     */
    @JsonGetter("LICENSE_NUM")
    public String getLicenseNumber() {
        return LicenseNumber;
    }

    /**
     * @param LicenseNumber the parameter to set - JsonProperty("LICENSE_NUM")
     */
    @JsonSetter("LICENSE_NUM")
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * @return the JsonProperty("OBJNR")
     */
    @JsonGetter("OBJNR")
    public String getObjectNumber() {
        return ObjectNumber;
    }

    /**
     * @param ObjectNumber the parameter to set - JsonProperty("OBJNR")
     */
    @JsonSetter("OBJNR")
    public void setObjectNumber(String ObjectNumber) {
        this.ObjectNumber = ObjectNumber;
    }

    /**
     * @return the JsonProperty("TRUCK_TYPE")
     */
    @JsonGetter("TRUCK_TYPE")
    public String getTruckType() {
        return TruckType;
    }

    /**
     * @param TruckType the parameter to set - JsonProperty("TRUCK_TYPE")
     */
    @JsonSetter("TRUCK_TYPE")
    public void setTruckType(String TruckType) {
        this.TruckType = TruckType;
    }

    /**
     * @return the JsonProperty("TRUCK_VOLUME")
     */
    @JsonGetter("TRUCK_VOLUME")
    public double getTruckVolume() {
        return TruckVolume;
    }

    /**
     * @param TruckVolume the parameter to set - JsonProperty("TRUCK_VOLUME")
     */
    @JsonSetter("TRUCK_VOLUME")
    public void setTruckVolume(double TruckVolume) {
        this.TruckVolume = TruckVolume;
    }

    /**
     * @return the JsonProperty("WOODMASS")
     */
    @JsonGetter("WOODMASS")
    public String getWoodMass() {
        return WoodMass;
    }

    /**
     * @param WoodMass the parameter to set - JsonProperty("WOODMASS")
     */
    @JsonSetter("WOODMASS")
    public void setWoodMass(String WoodMass) {
        this.WoodMass = WoodMass;
    }

    /**
     * @return the JsonProperty("FLEET_CAT")
     */
    @JsonGetter("FLEET_CAT")
    public String getFleetCategory() {
        return FleetCategory;
    }

    /**
     * @param FleetCategory the parameter to set - JsonProperty("FLEET_CAT")
     */
    @JsonSetter("FLEET_CAT")
    public void setFleetCategory(String FleetCategory) {
        this.FleetCategory = FleetCategory;
    }

    /**
     * @return the JsonProperty("GPS_TYPE")
     */
    @JsonGetter("GPS_TYPE")
    public String getGpsType() {
        return GpsType;
    }

    /**
     * @param GpsType the parameter to set - JsonProperty("GPS_TYPE")
     */
    @JsonSetter("GPS_TYPE")
    public void setGpsType(String GpsType) {
        this.GpsType = GpsType;
    }

    /**
     * @return the JsonProperty("GPS_ID")
     */
    @JsonGetter("GPS_ID")
    public String getGpsId() {
        return GpsId;
    }

    /**
     * @param GpsId the parameter to set - JsonProperty("GPS_ID")
     */
    @JsonSetter("GPS_ID")
    public void setGpsId(String GpsId) {
        this.GpsId = GpsId;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Vehicle [" +
            ", Vehicle=" + Vehicle +
            ", Created=" + Created +
            ", CreatedBy=" + CreatedBy +
            ", Language=" + Language +
            ", Changed=" + Changed +
            ", ChangedBy=" + ChangedBy +
            ", Weight=" + Weight +
            ", WeightUnit=" + WeightUnit +
            ", VehicleCategory=" + VehicleCategory +
            ", Plant=" + Plant +
            ", Vendor=" + Vendor +
            ", LicenseNumber=" + LicenseNumber +
            ", ObjectNumber=" + ObjectNumber +
            ", TruckType=" + TruckType +
            ", TruckVolume=" + TruckVolume +
            ", WoodMass=" + WoodMass +
            ", FleetCategory=" + FleetCategory +
            ", GpsType=" + GpsType +
            ", GpsId=" + GpsId +
            "]");
    }
}

