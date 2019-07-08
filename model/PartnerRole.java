package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * PartnerRole mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_PARTRO_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartnerRole {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EKORG")
    private String PurchasingOrganization;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("PARVW")
    private String VendorRole;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LIFN2")
    private String PaymentRecipient;

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
     * @return the JsonProperty("PARVW")
     */
    @JsonGetter("PARVW")
    public String getVendorRole() {
        return VendorRole;
    }

    /**
     * @param VendorRole the parameter to set - JsonProperty("PARVW")
     */
    @JsonSetter("PARVW")
    public void setVendorRole(String VendorRole) {
        this.VendorRole = VendorRole;
    }

    /**
     * @return the JsonProperty("LIFN2")
     */
    @JsonGetter("LIFN2")
    public String getPaymentRecipient() {
        return PaymentRecipient;
    }

    /**
     * @param PaymentRecipient the parameter to set - JsonProperty("LIFN2")
     */
    @JsonSetter("LIFN2")
    public void setPaymentRecipient(String PaymentRecipient) {
        this.PaymentRecipient = PaymentRecipient;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("PartnerRole [" +
            ", Vendor=" + Vendor +
            ", PurchasingOrganization=" + PurchasingOrganization +
            ", VendorRole=" + VendorRole +
            ", PaymentRecipient=" + PaymentRecipient +
            "]");
    }
}

