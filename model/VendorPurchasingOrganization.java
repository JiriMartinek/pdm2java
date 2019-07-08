package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * VendorPurchasingOrganization mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_VENPUO_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorPurchasingOrganization {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EKORG")
    private String PurchasingOrganization;

    @JsonProperty("WAERS")
    private String Currency;

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
     * @return the JsonProperty("EKORG")
     */
    @JsonGetter("EKORG")
    public String getPurchasingOrganization() {
        return PurchasingOrganization;
    }

    /**
     * @param PurchasingOrganization the parameter to set - JsonProperty("EKORG")
     */
    @JsonSetter("EKORG")
    public void setPurchasingOrganization(String PurchasingOrganization) {
        this.PurchasingOrganization = PurchasingOrganization;
    }

    /**
     * @return the JsonProperty("WAERS")
     */
    @JsonGetter("WAERS")
    public String getCurrency() {
        return Currency;
    }

    /**
     * @param Currency the parameter to set - JsonProperty("WAERS")
     */
    @JsonSetter("WAERS")
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("VendorPurchasingOrganization [" +
            ", Vendor=" + Vendor +
            ", PurchasingOrganization=" + PurchasingOrganization +
            ", Currency=" + Currency +
            "]");
    }
}

