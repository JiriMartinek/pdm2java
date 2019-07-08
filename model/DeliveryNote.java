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

import zlbpwa.javatest.util.BooleanDeserializer;
import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * DeliveryNote mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_DN_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeliveryNote {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("DELNOTE")
    private long DeliveryNote;

    @JsonProperty("DELNOTE_DESC")
    private String DeliveryNoteDescription;

    @JsonProperty("DELNOTE_TYPE")
    private String DeliveryNoteType;

    @JsonProperty("DELNOTE_CREATIONTYPE")
    private String DeliveryNoteCreationType;

    @JsonProperty("DELNOTE_STATUS")
    private String DeliveryNoteStatus;

    @JsonProperty("CREATEDBY")
    private String CreatedBy;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CREATED")
    private Timestamp Created;

    @JsonProperty("CHANGEDBY")
    private String ChangedBy;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CHANGED")
    private Timestamp Changed;

    @JsonProperty("LGORT")
    private String StorageLocation;

    @JsonProperty("MATNR")
    private String MaterialNumber;

    @JsonProperty("FSC_ID")
    private long FscId;

    @JsonProperty("FSC_VALUE")
    private double FscValue;

    @JsonProperty("PEFC_ID")
    private long PefcId;

    @JsonProperty("PEFC_VALUE")
    private double PefcValue;

    @JsonProperty("FMU_ID")
    private long FmuId;

    @JsonProperty("GROWTH_NUM")
    private String GrowthNumber;

    @JsonProperty("CALAMITY")
    private String Calamity;

    @JsonProperty("WOODMASS_ID")
    private long WoodMassId;

    @JsonProperty("TICKET")
    private long Ticket;

    @JsonProperty("WOODTYPE_ID")
    private long WoodTypeId;

    @JsonProperty("EBELN")
    private String Contract;

    @JsonProperty("LOADINGPLACE_ID")
    private long LoadingPlaceId;

    @JsonProperty("WERKS")
    private String Plant;

    @JsonProperty("PSC")
    private String Psc;

    @JsonProperty("PLACE_GPS")
    private String Gps;

    @JsonProperty("GPS_PSC")
    private String GpsPsc;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("GPS_DATE")
    private Timestamp GpsDate;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("GPS_TIME")
    private Timestamp GpsTime;

    @JsonProperty("PLACE_GPS_DISTANCE")
    private double PlaceGpsDistance;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("UNLOADED")
    private boolean Unloaded;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("OVERLOADED")
    private boolean Overloaded;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("MISSING_GPS")
    private boolean MissingGps;

    @JsonProperty("CONS_QUANTITY")
    private double ConsignedQuantity;

    @JsonProperty("DRIVER_PHONE")
    private String DriverPhone;

    @JsonProperty("DRIVER_EMAIL")
    private String DriverEmail;

    @JsonProperty("EQUNR")
    private String Vehicle;

    /**
     * @return the JsonProperty("DELNOTE")
     */
    @JsonGetter("DELNOTE")
    public long getDeliveryNote() {
        return DeliveryNote;
    }

    /**
     * @param DeliveryNote the parameter to set - JsonProperty("DELNOTE")
     */
    @JsonSetter("DELNOTE")
    public void setDeliveryNote(long DeliveryNote) {
        this.DeliveryNote = DeliveryNote;
    }

    /**
     * @return the JsonProperty("DELNOTE_DESC")
     */
    @JsonGetter("DELNOTE_DESC")
    public String getDeliveryNoteDescription() {
        return DeliveryNoteDescription;
    }

    /**
     * @param DeliveryNoteDescription the parameter to set - JsonProperty("DELNOTE_DESC")
     */
    @JsonSetter("DELNOTE_DESC")
    public void setDeliveryNoteDescription(String DeliveryNoteDescription) {
        this.DeliveryNoteDescription = DeliveryNoteDescription;
    }

    /**
     * @return the JsonProperty("DELNOTE_TYPE")
     */
    @JsonGetter("DELNOTE_TYPE")
    public String getDeliveryNoteType() {
        return DeliveryNoteType;
    }

    /**
     * @param DeliveryNoteType the parameter to set - JsonProperty("DELNOTE_TYPE")
     */
    @JsonSetter("DELNOTE_TYPE")
    public void setDeliveryNoteType(String DeliveryNoteType) {
        this.DeliveryNoteType = DeliveryNoteType;
    }

    /**
     * @return the JsonProperty("DELNOTE_CREATIONTYPE")
     */
    @JsonGetter("DELNOTE_CREATIONTYPE")
    public String getDeliveryNoteCreationType() {
        return DeliveryNoteCreationType;
    }

    /**
     * @param DeliveryNoteCreationType the parameter to set - JsonProperty("DELNOTE_CREATIONTYPE")
     */
    @JsonSetter("DELNOTE_CREATIONTYPE")
    public void setDeliveryNoteCreationType(String DeliveryNoteCreationType) {
        this.DeliveryNoteCreationType = DeliveryNoteCreationType;
    }

    /**
     * @return the JsonProperty("DELNOTE_STATUS")
     */
    @JsonGetter("DELNOTE_STATUS")
    public String getDeliveryNoteStatus() {
        return DeliveryNoteStatus;
    }

    /**
     * @param DeliveryNoteStatus the parameter to set - JsonProperty("DELNOTE_STATUS")
     */
    @JsonSetter("DELNOTE_STATUS")
    public void setDeliveryNoteStatus(String DeliveryNoteStatus) {
        this.DeliveryNoteStatus = DeliveryNoteStatus;
    }

    /**
     * @return the JsonProperty("CREATEDBY")
     */
    @JsonGetter("CREATEDBY")
    public String getCreatedBy() {
        return CreatedBy;
    }

    /**
     * @param CreatedBy the parameter to set - JsonProperty("CREATEDBY")
     */
    @JsonSetter("CREATEDBY")
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    /**
     * @return the JsonProperty("CREATED")
     */
    @JsonGetter("CREATED")
    public Timestamp getCreated() {
        return Created;
    }

    /**
     * @param Created the parameter to set - JsonProperty("CREATED")
     */
    @JsonSetter("CREATED")
    public void setCreated(Timestamp Created) {
        this.Created = Created;
    }

    /**
     * @return the JsonProperty("CHANGEDBY")
     */
    @JsonGetter("CHANGEDBY")
    public String getChangedBy() {
        return ChangedBy;
    }

    /**
     * @param ChangedBy the parameter to set - JsonProperty("CHANGEDBY")
     */
    @JsonSetter("CHANGEDBY")
    public void setChangedBy(String ChangedBy) {
        this.ChangedBy = ChangedBy;
    }

    /**
     * @return the JsonProperty("CHANGED")
     */
    @JsonGetter("CHANGED")
    public Timestamp getChanged() {
        return Changed;
    }

    /**
     * @param Changed the parameter to set - JsonProperty("CHANGED")
     */
    @JsonSetter("CHANGED")
    public void setChanged(Timestamp Changed) {
        this.Changed = Changed;
    }

    /**
     * @return the JsonProperty("LGORT")
     */
    @JsonGetter("LGORT")
    public String getStorageLocation() {
        return StorageLocation;
    }

    /**
     * @param StorageLocation the parameter to set - JsonProperty("LGORT")
     */
    @JsonSetter("LGORT")
    public void setStorageLocation(String StorageLocation) {
        this.StorageLocation = StorageLocation;
    }

    /**
     * @return the JsonProperty("MATNR")
     */
    @JsonGetter("MATNR")
    public String getMaterialNumber() {
        return MaterialNumber;
    }

    /**
     * @param MaterialNumber the parameter to set - JsonProperty("MATNR")
     */
    @JsonSetter("MATNR")
    public void setMaterialNumber(String MaterialNumber) {
        this.MaterialNumber = MaterialNumber;
    }

    /**
     * @return the JsonProperty("FSC_ID")
     */
    @JsonGetter("FSC_ID")
    public long getFscId() {
        return FscId;
    }

    /**
     * @param FscId the parameter to set - JsonProperty("FSC_ID")
     */
    @JsonSetter("FSC_ID")
    public void setFscId(long FscId) {
        this.FscId = FscId;
    }

    /**
     * @return the JsonProperty("FSC_VALUE")
     */
    @JsonGetter("FSC_VALUE")
    public double getFscValue() {
        return FscValue;
    }

    /**
     * @param FscValue the parameter to set - JsonProperty("FSC_VALUE")
     */
    @JsonSetter("FSC_VALUE")
    public void setFscValue(double FscValue) {
        this.FscValue = FscValue;
    }

    /**
     * @return the JsonProperty("PEFC_ID")
     */
    @JsonGetter("PEFC_ID")
    public long getPefcId() {
        return PefcId;
    }

    /**
     * @param PefcId the parameter to set - JsonProperty("PEFC_ID")
     */
    @JsonSetter("PEFC_ID")
    public void setPefcId(long PefcId) {
        this.PefcId = PefcId;
    }

    /**
     * @return the JsonProperty("PEFC_VALUE")
     */
    @JsonGetter("PEFC_VALUE")
    public double getPefcValue() {
        return PefcValue;
    }

    /**
     * @param PefcValue the parameter to set - JsonProperty("PEFC_VALUE")
     */
    @JsonSetter("PEFC_VALUE")
    public void setPefcValue(double PefcValue) {
        this.PefcValue = PefcValue;
    }

    /**
     * @return the JsonProperty("FMU_ID")
     */
    @JsonGetter("FMU_ID")
    public long getFmuId() {
        return FmuId;
    }

    /**
     * @param FmuId the parameter to set - JsonProperty("FMU_ID")
     */
    @JsonSetter("FMU_ID")
    public void setFmuId(long FmuId) {
        this.FmuId = FmuId;
    }

    /**
     * @return the JsonProperty("GROWTH_NUM")
     */
    @JsonGetter("GROWTH_NUM")
    public String getGrowthNumber() {
        return GrowthNumber;
    }

    /**
     * @param GrowthNumber the parameter to set - JsonProperty("GROWTH_NUM")
     */
    @JsonSetter("GROWTH_NUM")
    public void setGrowthNumber(String GrowthNumber) {
        this.GrowthNumber = GrowthNumber;
    }

    /**
     * @return the JsonProperty("CALAMITY")
     */
    @JsonGetter("CALAMITY")
    public String getCalamity() {
        return Calamity;
    }

    /**
     * @param Calamity the parameter to set - JsonProperty("CALAMITY")
     */
    @JsonSetter("CALAMITY")
    public void setCalamity(String Calamity) {
        this.Calamity = Calamity;
    }

    /**
     * @return the JsonProperty("WOODMASS_ID")
     */
    @JsonGetter("WOODMASS_ID")
    public long getWoodMassId() {
        return WoodMassId;
    }

    /**
     * @param WoodMassId the parameter to set - JsonProperty("WOODMASS_ID")
     */
    @JsonSetter("WOODMASS_ID")
    public void setWoodMassId(long WoodMassId) {
        this.WoodMassId = WoodMassId;
    }

    /**
     * @return the JsonProperty("TICKET")
     */
    @JsonGetter("TICKET")
    public long getTicket() {
        return Ticket;
    }

    /**
     * @param Ticket the parameter to set - JsonProperty("TICKET")
     */
    @JsonSetter("TICKET")
    public void setTicket(long Ticket) {
        this.Ticket = Ticket;
    }

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
     * @return the JsonProperty("EBELN")
     */
    @JsonGetter("EBELN")
    public String getContract() {
        return Contract;
    }

    /**
     * @param Contract the parameter to set - JsonProperty("EBELN")
     */
    @JsonSetter("EBELN")
    public void setContract(String Contract) {
        this.Contract = Contract;
    }

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
     * @return the JsonProperty("PSC")
     */
    @JsonGetter("PSC")
    public String getPsc() {
        return Psc;
    }

    /**
     * @param Psc the parameter to set - JsonProperty("PSC")
     */
    @JsonSetter("PSC")
    public void setPsc(String Psc) {
        this.Psc = Psc;
    }

    /**
     * @return the JsonProperty("PLACE_GPS")
     */
    @JsonGetter("PLACE_GPS")
    public String getGps() {
        return Gps;
    }

    /**
     * @param Gps the parameter to set - JsonProperty("PLACE_GPS")
     */
    @JsonSetter("PLACE_GPS")
    public void setGps(String Gps) {
        this.Gps = Gps;
    }

    /**
     * @return the JsonProperty("GPS_PSC")
     */
    @JsonGetter("GPS_PSC")
    public String getGpsPsc() {
        return GpsPsc;
    }

    /**
     * @param GpsPsc the parameter to set - JsonProperty("GPS_PSC")
     */
    @JsonSetter("GPS_PSC")
    public void setGpsPsc(String GpsPsc) {
        this.GpsPsc = GpsPsc;
    }

    /**
     * @return the JsonProperty("GPS_DATE")
     */
    @JsonGetter("GPS_DATE")
    public Timestamp getGpsDate() {
        return GpsDate;
    }

    /**
     * @param GpsDate the parameter to set - JsonProperty("GPS_DATE")
     */
    @JsonSetter("GPS_DATE")
    public void setGpsDate(Timestamp GpsDate) {
        this.GpsDate = GpsDate;
    }

    /**
     * @return the JsonProperty("GPS_TIME")
     */
    @JsonGetter("GPS_TIME")
    public Timestamp getGpsTime() {
        return GpsTime;
    }

    /**
     * @param GpsTime the parameter to set - JsonProperty("GPS_TIME")
     */
    @JsonSetter("GPS_TIME")
    public void setGpsTime(Timestamp GpsTime) {
        this.GpsTime = GpsTime;
    }

    /**
     * @return the JsonProperty("PLACE_GPS_DISTANCE")
     */
    @JsonGetter("PLACE_GPS_DISTANCE")
    public double getPlaceGpsDistance() {
        return PlaceGpsDistance;
    }

    /**
     * @param PlaceGpsDistance the parameter to set - JsonProperty("PLACE_GPS_DISTANCE")
     */
    @JsonSetter("PLACE_GPS_DISTANCE")
    public void setPlaceGpsDistance(double PlaceGpsDistance) {
        this.PlaceGpsDistance = PlaceGpsDistance;
    }

    /**
     * @return the JsonProperty("UNLOADED")
     */
    @JsonGetter("UNLOADED")
    public boolean getUnloaded() {
        return Unloaded;
    }

    /**
     * @param Unloaded the parameter to set - JsonProperty("UNLOADED")
     */
    @JsonSetter("UNLOADED")
    public void setUnloaded(boolean Unloaded) {
        this.Unloaded = Unloaded;
    }

    /**
     * @return the JsonProperty("OVERLOADED")
     */
    @JsonGetter("OVERLOADED")
    public boolean getOverloaded() {
        return Overloaded;
    }

    /**
     * @param Overloaded the parameter to set - JsonProperty("OVERLOADED")
     */
    @JsonSetter("OVERLOADED")
    public void setOverloaded(boolean Overloaded) {
        this.Overloaded = Overloaded;
    }

    /**
     * @return the JsonProperty("MISSING_GPS")
     */
    @JsonGetter("MISSING_GPS")
    public boolean getMissingGps() {
        return MissingGps;
    }

    /**
     * @param MissingGps the parameter to set - JsonProperty("MISSING_GPS")
     */
    @JsonSetter("MISSING_GPS")
    public void setMissingGps(boolean MissingGps) {
        this.MissingGps = MissingGps;
    }

    /**
     * @return the JsonProperty("CONS_QUANTITY")
     */
    @JsonGetter("CONS_QUANTITY")
    public double getConsignedQuantity() {
        return ConsignedQuantity;
    }

    /**
     * @param ConsignedQuantity the parameter to set - JsonProperty("CONS_QUANTITY")
     */
    @JsonSetter("CONS_QUANTITY")
    public void setConsignedQuantity(double ConsignedQuantity) {
        this.ConsignedQuantity = ConsignedQuantity;
    }

    /**
     * @return the JsonProperty("DRIVER_PHONE")
     */
    @JsonGetter("DRIVER_PHONE")
    public String getDriverPhone() {
        return DriverPhone;
    }

    /**
     * @param DriverPhone the parameter to set - JsonProperty("DRIVER_PHONE")
     */
    @JsonSetter("DRIVER_PHONE")
    public void setDriverPhone(String DriverPhone) {
        this.DriverPhone = DriverPhone;
    }

    /**
     * @return the JsonProperty("DRIVER_EMAIL")
     */
    @JsonGetter("DRIVER_EMAIL")
    public String getDriverEmail() {
        return DriverEmail;
    }

    /**
     * @param DriverEmail the parameter to set - JsonProperty("DRIVER_EMAIL")
     */
    @JsonSetter("DRIVER_EMAIL")
    public void setDriverEmail(String DriverEmail) {
        this.DriverEmail = DriverEmail;
    }

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

    @Override
//    @JsonValue
    public String toString() {
        return ("DeliveryNote [" +
            ", DeliveryNote=" + DeliveryNote +
            ", DeliveryNoteDescription=" + DeliveryNoteDescription +
            ", DeliveryNoteType=" + DeliveryNoteType +
            ", DeliveryNoteCreationType=" + DeliveryNoteCreationType +
            ", DeliveryNoteStatus=" + DeliveryNoteStatus +
            ", CreatedBy=" + CreatedBy +
            ", Created=" + Created +
            ", ChangedBy=" + ChangedBy +
            ", Changed=" + Changed +
            ", StorageLocation=" + StorageLocation +
            ", MaterialNumber=" + MaterialNumber +
            ", FscId=" + FscId +
            ", FscValue=" + FscValue +
            ", PefcId=" + PefcId +
            ", PefcValue=" + PefcValue +
            ", FmuId=" + FmuId +
            ", GrowthNumber=" + GrowthNumber +
            ", Calamity=" + Calamity +
            ", WoodMassId=" + WoodMassId +
            ", Ticket=" + Ticket +
            ", WoodTypeId=" + WoodTypeId +
            ", Contract=" + Contract +
            ", LoadingPlaceId=" + LoadingPlaceId +
            ", Plant=" + Plant +
            ", Psc=" + Psc +
            ", Gps=" + Gps +
            ", GpsPsc=" + GpsPsc +
            ", GpsDate=" + GpsDate +
            ", GpsTime=" + GpsTime +
            ", PlaceGpsDistance=" + PlaceGpsDistance +
            ", Unloaded=" + Unloaded +
            ", Overloaded=" + Overloaded +
            ", MissingGps=" + MissingGps +
            ", ConsignedQuantity=" + ConsignedQuantity +
            ", DriverPhone=" + DriverPhone +
            ", DriverEmail=" + DriverEmail +
            ", Vehicle=" + Vehicle +
            "]");
    }
}

