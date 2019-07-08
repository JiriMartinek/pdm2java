package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * GpsRaw mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_GPSRAW_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GpsRaw {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("ID")
    private String Id;

    @JsonProperty("DATEINSERTED")
    private String Dateinserted;

    @JsonProperty("SPZ")
    private String Spz;

    @JsonProperty("DELIVERYNUMBER")
    private String Deliverynumber;

    @JsonProperty("DATESTART")
    private String Datestart;

    @JsonProperty("GPS")
    private String Gps;

    @JsonProperty("LOCATION")
    private String Location;

    @JsonProperty("DISTRICT")
    private String District;

    @JsonProperty("ZIP")
    private String Zip;

    @JsonProperty("KM")
    private String Km;

    @JsonProperty("OPERATIONCODE")
    private String Operationcode;

    @JsonProperty("DATEREAD")
    private String Dateread;

    @JsonProperty("DATEEXPECTEDARR")
    private String Dateexpectedarr;

    /**
     * @return the JsonProperty("ID")
     */
    @JsonGetter("ID")
    public String getId() {
        return Id;
    }

    /**
     * @param Id the parameter to set - JsonProperty("ID")
     */
    @JsonSetter("ID")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return the JsonProperty("DATEINSERTED")
     */
    @JsonGetter("DATEINSERTED")
    public String getDateinserted() {
        return Dateinserted;
    }

    /**
     * @param Dateinserted the parameter to set - JsonProperty("DATEINSERTED")
     */
    @JsonSetter("DATEINSERTED")
    public void setDateinserted(String Dateinserted) {
        this.Dateinserted = Dateinserted;
    }

    /**
     * @return the JsonProperty("SPZ")
     */
    @JsonGetter("SPZ")
    public String getSpz() {
        return Spz;
    }

    /**
     * @param Spz the parameter to set - JsonProperty("SPZ")
     */
    @JsonSetter("SPZ")
    public void setSpz(String Spz) {
        this.Spz = Spz;
    }

    /**
     * @return the JsonProperty("DELIVERYNUMBER")
     */
    @JsonGetter("DELIVERYNUMBER")
    public String getDeliverynumber() {
        return Deliverynumber;
    }

    /**
     * @param Deliverynumber the parameter to set - JsonProperty("DELIVERYNUMBER")
     */
    @JsonSetter("DELIVERYNUMBER")
    public void setDeliverynumber(String Deliverynumber) {
        this.Deliverynumber = Deliverynumber;
    }

    /**
     * @return the JsonProperty("DATESTART")
     */
    @JsonGetter("DATESTART")
    public String getDatestart() {
        return Datestart;
    }

    /**
     * @param Datestart the parameter to set - JsonProperty("DATESTART")
     */
    @JsonSetter("DATESTART")
    public void setDatestart(String Datestart) {
        this.Datestart = Datestart;
    }

    /**
     * @return the JsonProperty("GPS")
     */
    @JsonGetter("GPS")
    public String getGps() {
        return Gps;
    }

    /**
     * @param Gps the parameter to set - JsonProperty("GPS")
     */
    @JsonSetter("GPS")
    public void setGps(String Gps) {
        this.Gps = Gps;
    }

    /**
     * @return the JsonProperty("LOCATION")
     */
    @JsonGetter("LOCATION")
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the parameter to set - JsonProperty("LOCATION")
     */
    @JsonSetter("LOCATION")
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * @return the JsonProperty("DISTRICT")
     */
    @JsonGetter("DISTRICT")
    public String getDistrict() {
        return District;
    }

    /**
     * @param District the parameter to set - JsonProperty("DISTRICT")
     */
    @JsonSetter("DISTRICT")
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * @return the JsonProperty("ZIP")
     */
    @JsonGetter("ZIP")
    public String getZip() {
        return Zip;
    }

    /**
     * @param Zip the parameter to set - JsonProperty("ZIP")
     */
    @JsonSetter("ZIP")
    public void setZip(String Zip) {
        this.Zip = Zip;
    }

    /**
     * @return the JsonProperty("KM")
     */
    @JsonGetter("KM")
    public String getKm() {
        return Km;
    }

    /**
     * @param Km the parameter to set - JsonProperty("KM")
     */
    @JsonSetter("KM")
    public void setKm(String Km) {
        this.Km = Km;
    }

    /**
     * @return the JsonProperty("OPERATIONCODE")
     */
    @JsonGetter("OPERATIONCODE")
    public String getOperationcode() {
        return Operationcode;
    }

    /**
     * @param Operationcode the parameter to set - JsonProperty("OPERATIONCODE")
     */
    @JsonSetter("OPERATIONCODE")
    public void setOperationcode(String Operationcode) {
        this.Operationcode = Operationcode;
    }

    /**
     * @return the JsonProperty("DATEREAD")
     */
    @JsonGetter("DATEREAD")
    public String getDateread() {
        return Dateread;
    }

    /**
     * @param Dateread the parameter to set - JsonProperty("DATEREAD")
     */
    @JsonSetter("DATEREAD")
    public void setDateread(String Dateread) {
        this.Dateread = Dateread;
    }

    /**
     * @return the JsonProperty("DATEEXPECTEDARR")
     */
    @JsonGetter("DATEEXPECTEDARR")
    public String getDateexpectedarr() {
        return Dateexpectedarr;
    }

    /**
     * @param Dateexpectedarr the parameter to set - JsonProperty("DATEEXPECTEDARR")
     */
    @JsonSetter("DATEEXPECTEDARR")
    public void setDateexpectedarr(String Dateexpectedarr) {
        this.Dateexpectedarr = Dateexpectedarr;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("GpsRaw [" +
            ", Id=" + Id +
            ", Dateinserted=" + Dateinserted +
            ", Spz=" + Spz +
            ", Deliverynumber=" + Deliverynumber +
            ", Datestart=" + Datestart +
            ", Gps=" + Gps +
            ", Location=" + Location +
            ", District=" + District +
            ", Zip=" + Zip +
            ", Km=" + Km +
            ", Operationcode=" + Operationcode +
            ", Dateread=" + Dateread +
            ", Dateexpectedarr=" + Dateexpectedarr +
            "]");
    }
}

