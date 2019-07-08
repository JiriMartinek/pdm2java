package zlbpwa.javatest.view;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import zlbpwa.javatest.util.BooleanDeserializer;
import zlbpwa.javatest.util.TimestampDeserializer;
import zlbpwa.javatest.util.TimestampSerializer;

/**
 * VendorView mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_VENDOR_V")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VendorView {

    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonProperty("LAND1")
    private String Country;

    @JsonProperty("NAME1")
    private String Name1;

    @JsonProperty("NAME2")
    private String Name2;

    @JsonProperty("NAME3")
    private String Name3;

    @JsonProperty("NAME4")
    private String Name4;

    @JsonProperty("ORT01")
    private String City;

    @JsonProperty("PSTLZ")
    private String PostalCode;

    @JsonProperty("STRAS")
    private String StreetAndHouseNumber;

    @JsonProperty("SPRAS")
    private String Language;

    @JsonProperty("GPS_USER")
    private String GpsUser;

    @JsonProperty("INCO1")
    private String Incoterms1;

    @JsonProperty("INCO2")
    private String Incoterms2;

    @JsonProperty("GPS_PASSWORD")
    private String GpsPassword;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("GPS_VALID_FROM")
    private Timestamp GpsValidFrom;

    @JsonProperty("API_PASSWORD")
    private String ApiPassword;

    @JsonProperty("EXTRANET_USER")
    private String ExtranetUser;

    @JsonProperty("EXTRANET_MAIL_1")
    private String ExtranetMail1;

    @JsonProperty("EXTRANET_MAIL_2")
    private String ExtranetMail2;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("EXTRANET_VALIDITY")
    private Timestamp ExtranetValidity;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("INVOICE_RECIVER")
    private boolean InvoiceReciver;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("UNDER_LOAD")
    private boolean Underused;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("COL_INVOICE")
    private boolean CollectedInvoice;

    @JsonProperty("PEFC_CERTIFICATE")
    private String PefcCertificate;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("PEFC_CERTIFICATE_VALIDTO")
    private Timestamp PefcCertificateValidTo;

    @JsonProperty("FSC_CERTIFICATE")
    private String FscCertificate;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("FSC_CERTIFICATE_VALIDTO")
    private Timestamp FscCertificateValidTo;

    @JsonProperty("INVOICING_UNIT")
    private String InvoicingUnit;

    @JsonProperty("TRANSPORT_PRICE_LIST")
    private String DerivationOfFreightPriceList;

    @JsonProperty("EKORG")
    private String PurchasingOrganization;

    @JsonProperty("WAERS")
    private String Currency;

    @JsonProperty("ABC_CLASSIFICATION")
    private String AbcClassification;

    @JsonProperty("PARVW")
    private String VendorRole;

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
     * @return the JsonProperty("LAND1")
     */
    @JsonGetter("LAND1")
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the parameter to set - JsonProperty("LAND1")
     */
    @JsonSetter("LAND1")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the JsonProperty("NAME1")
     */
    @JsonGetter("NAME1")
    public String getName1() {
        return Name1;
    }

    /**
     * @param Name1 the parameter to set - JsonProperty("NAME1")
     */
    @JsonSetter("NAME1")
    public void setName1(String Name1) {
        this.Name1 = Name1;
    }

    /**
     * @return the JsonProperty("NAME2")
     */
    @JsonGetter("NAME2")
    public String getName2() {
        return Name2;
    }

    /**
     * @param Name2 the parameter to set - JsonProperty("NAME2")
     */
    @JsonSetter("NAME2")
    public void setName2(String Name2) {
        this.Name2 = Name2;
    }

    /**
     * @return the JsonProperty("NAME3")
     */
    @JsonGetter("NAME3")
    public String getName3() {
        return Name3;
    }

    /**
     * @param Name3 the parameter to set - JsonProperty("NAME3")
     */
    @JsonSetter("NAME3")
    public void setName3(String Name3) {
        this.Name3 = Name3;
    }

    /**
     * @return the JsonProperty("NAME4")
     */
    @JsonGetter("NAME4")
    public String getName4() {
        return Name4;
    }

    /**
     * @param Name4 the parameter to set - JsonProperty("NAME4")
     */
    @JsonSetter("NAME4")
    public void setName4(String Name4) {
        this.Name4 = Name4;
    }

    /**
     * @return the JsonProperty("ORT01")
     */
    @JsonGetter("ORT01")
    public String getCity() {
        return City;
    }

    /**
     * @param City the parameter to set - JsonProperty("ORT01")
     */
    @JsonSetter("ORT01")
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the JsonProperty("PSTLZ")
     */
    @JsonGetter("PSTLZ")
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the parameter to set - JsonProperty("PSTLZ")
     */
    @JsonSetter("PSTLZ")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * @return the JsonProperty("STRAS")
     */
    @JsonGetter("STRAS")
    public String getStreetAndHouseNumber() {
        return StreetAndHouseNumber;
    }

    /**
     * @param StreetAndHouseNumber the parameter to set - JsonProperty("STRAS")
     */
    @JsonSetter("STRAS")
    public void setStreetAndHouseNumber(String StreetAndHouseNumber) {
        this.StreetAndHouseNumber = StreetAndHouseNumber;
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
     * @return the JsonProperty("GPS_USER")
     */
    @JsonGetter("GPS_USER")
    public String getGpsUser() {
        return GpsUser;
    }

    /**
     * @param GpsUser the parameter to set - JsonProperty("GPS_USER")
     */
    @JsonSetter("GPS_USER")
    public void setGpsUser(String GpsUser) {
        this.GpsUser = GpsUser;
    }

    /**
     * @return the JsonProperty("INCO1")
     */
    @JsonGetter("INCO1")
    public String getIncoterms1() {
        return Incoterms1;
    }

    /**
     * @param Incoterms1 the parameter to set - JsonProperty("INCO1")
     */
    @JsonSetter("INCO1")
    public void setIncoterms1(String Incoterms1) {
        this.Incoterms1 = Incoterms1;
    }

    /**
     * @return the JsonProperty("INCO2")
     */
    @JsonGetter("INCO2")
    public String getIncoterms2() {
        return Incoterms2;
    }

    /**
     * @param Incoterms2 the parameter to set - JsonProperty("INCO2")
     */
    @JsonSetter("INCO2")
    public void setIncoterms2(String Incoterms2) {
        this.Incoterms2 = Incoterms2;
    }

    /**
     * @return the JsonProperty("GPS_PASSWORD")
     */
    @JsonGetter("GPS_PASSWORD")
    public String getGpsPassword() {
        return GpsPassword;
    }

    /**
     * @param GpsPassword the parameter to set - JsonProperty("GPS_PASSWORD")
     */
    @JsonSetter("GPS_PASSWORD")
    public void setGpsPassword(String GpsPassword) {
        this.GpsPassword = GpsPassword;
    }

    /**
     * @return the JsonProperty("GPS_VALID_FROM")
     */
    @JsonGetter("GPS_VALID_FROM")
    public Timestamp getGpsValidFrom() {
        return GpsValidFrom;
    }

    /**
     * @param GpsValidFrom the parameter to set - JsonProperty("GPS_VALID_FROM")
     */
    @JsonSetter("GPS_VALID_FROM")
    public void setGpsValidFrom(Timestamp GpsValidFrom) {
        this.GpsValidFrom = GpsValidFrom;
    }

    /**
     * @return the JsonProperty("API_PASSWORD")
     */
    @JsonGetter("API_PASSWORD")
    public String getApiPassword() {
        return ApiPassword;
    }

    /**
     * @param ApiPassword the parameter to set - JsonProperty("API_PASSWORD")
     */
    @JsonSetter("API_PASSWORD")
    public void setApiPassword(String ApiPassword) {
        this.ApiPassword = ApiPassword;
    }

    /**
     * @return the JsonProperty("EXTRANET_USER")
     */
    @JsonGetter("EXTRANET_USER")
    public String getExtranetUser() {
        return ExtranetUser;
    }

    /**
     * @param ExtranetUser the parameter to set - JsonProperty("EXTRANET_USER")
     */
    @JsonSetter("EXTRANET_USER")
    public void setExtranetUser(String ExtranetUser) {
        this.ExtranetUser = ExtranetUser;
    }

    /**
     * @return the JsonProperty("EXTRANET_MAIL_1")
     */
    @JsonGetter("EXTRANET_MAIL_1")
    public String getExtranetMail1() {
        return ExtranetMail1;
    }

    /**
     * @param ExtranetMail1 the parameter to set - JsonProperty("EXTRANET_MAIL_1")
     */
    @JsonSetter("EXTRANET_MAIL_1")
    public void setExtranetMail1(String ExtranetMail1) {
        this.ExtranetMail1 = ExtranetMail1;
    }

    /**
     * @return the JsonProperty("EXTRANET_MAIL_2")
     */
    @JsonGetter("EXTRANET_MAIL_2")
    public String getExtranetMail2() {
        return ExtranetMail2;
    }

    /**
     * @param ExtranetMail2 the parameter to set - JsonProperty("EXTRANET_MAIL_2")
     */
    @JsonSetter("EXTRANET_MAIL_2")
    public void setExtranetMail2(String ExtranetMail2) {
        this.ExtranetMail2 = ExtranetMail2;
    }

    /**
     * @return the JsonProperty("EXTRANET_VALIDITY")
     */
    @JsonGetter("EXTRANET_VALIDITY")
    public Timestamp getExtranetValidity() {
        return ExtranetValidity;
    }

    /**
     * @param ExtranetValidity the parameter to set - JsonProperty("EXTRANET_VALIDITY")
     */
    @JsonSetter("EXTRANET_VALIDITY")
    public void setExtranetValidity(Timestamp ExtranetValidity) {
        this.ExtranetValidity = ExtranetValidity;
    }

    /**
     * @return the JsonProperty("INVOICE_RECIVER")
     */
    @JsonGetter("INVOICE_RECIVER")
    public boolean getInvoiceReciver() {
        return InvoiceReciver;
    }

    /**
     * @param InvoiceReciver the parameter to set - JsonProperty("INVOICE_RECIVER")
     */
    @JsonSetter("INVOICE_RECIVER")
    public void setInvoiceReciver(boolean InvoiceReciver) {
        this.InvoiceReciver = InvoiceReciver;
    }

    /**
     * @return the JsonProperty("UNDER_LOAD")
     */
    @JsonGetter("UNDER_LOAD")
    public boolean getUnderused() {
        return Underused;
    }

    /**
     * @param Underused the parameter to set - JsonProperty("UNDER_LOAD")
     */
    @JsonSetter("UNDER_LOAD")
    public void setUnderused(boolean Underused) {
        this.Underused = Underused;
    }

    /**
     * @return the JsonProperty("COL_INVOICE")
     */
    @JsonGetter("COL_INVOICE")
    public boolean getCollectedInvoice() {
        return CollectedInvoice;
    }

    /**
     * @param CollectedInvoice the parameter to set - JsonProperty("COL_INVOICE")
     */
    @JsonSetter("COL_INVOICE")
    public void setCollectedInvoice(boolean CollectedInvoice) {
        this.CollectedInvoice = CollectedInvoice;
    }

    /**
     * @return the JsonProperty("PEFC_CERTIFICATE")
     */
    @JsonGetter("PEFC_CERTIFICATE")
    public String getPefcCertificate() {
        return PefcCertificate;
    }

    /**
     * @param PefcCertificate the parameter to set - JsonProperty("PEFC_CERTIFICATE")
     */
    @JsonSetter("PEFC_CERTIFICATE")
    public void setPefcCertificate(String PefcCertificate) {
        this.PefcCertificate = PefcCertificate;
    }

    /**
     * @return the JsonProperty("PEFC_CERTIFICATE_VALIDTO")
     */
    @JsonGetter("PEFC_CERTIFICATE_VALIDTO")
    public Timestamp getPefcCertificateValidTo() {
        return PefcCertificateValidTo;
    }

    /**
     * @param PefcCertificateValidTo the parameter to set - JsonProperty("PEFC_CERTIFICATE_VALIDTO")
     */
    @JsonSetter("PEFC_CERTIFICATE_VALIDTO")
    public void setPefcCertificateValidTo(Timestamp PefcCertificateValidTo) {
        this.PefcCertificateValidTo = PefcCertificateValidTo;
    }

    /**
     * @return the JsonProperty("FSC_CERTIFICATE")
     */
    @JsonGetter("FSC_CERTIFICATE")
    public String getFscCertificate() {
        return FscCertificate;
    }

    /**
     * @param FscCertificate the parameter to set - JsonProperty("FSC_CERTIFICATE")
     */
    @JsonSetter("FSC_CERTIFICATE")
    public void setFscCertificate(String FscCertificate) {
        this.FscCertificate = FscCertificate;
    }

    /**
     * @return the JsonProperty("FSC_CERTIFICATE_VALIDTO")
     */
    @JsonGetter("FSC_CERTIFICATE_VALIDTO")
    public Timestamp getFscCertificateValidTo() {
        return FscCertificateValidTo;
    }

    /**
     * @param FscCertificateValidTo the parameter to set - JsonProperty("FSC_CERTIFICATE_VALIDTO")
     */
    @JsonSetter("FSC_CERTIFICATE_VALIDTO")
    public void setFscCertificateValidTo(Timestamp FscCertificateValidTo) {
        this.FscCertificateValidTo = FscCertificateValidTo;
    }

    /**
     * @return the JsonProperty("INVOICING_UNIT")
     */
    @JsonGetter("INVOICING_UNIT")
    public String getInvoicingUnit() {
        return InvoicingUnit;
    }

    /**
     * @param InvoicingUnit the parameter to set - JsonProperty("INVOICING_UNIT")
     */
    @JsonSetter("INVOICING_UNIT")
    public void setInvoicingUnit(String InvoicingUnit) {
        this.InvoicingUnit = InvoicingUnit;
    }

    /**
     * @return the JsonProperty("TRANSPORT_PRICE_LIST")
     */
    @JsonGetter("TRANSPORT_PRICE_LIST")
    public String getDerivationOfFreightPriceList() {
        return DerivationOfFreightPriceList;
    }

    /**
     * @param DerivationOfFreightPriceList the parameter to set - JsonProperty("TRANSPORT_PRICE_LIST")
     */
    @JsonSetter("TRANSPORT_PRICE_LIST")
    public void setDerivationOfFreightPriceList(String DerivationOfFreightPriceList) {
        this.DerivationOfFreightPriceList = DerivationOfFreightPriceList;
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

    /**
     * @return the JsonProperty("ABC_CLASSIFICATION")
     */
    @JsonGetter("ABC_CLASSIFICATION")
    public String getAbcClassification() {
        return AbcClassification;
    }

    /**
     * @param AbcClassification the parameter to set - JsonProperty("ABC_CLASSIFICATION")
     */
    @JsonSetter("ABC_CLASSIFICATION")
    public void setAbcClassification(String AbcClassification) {
        this.AbcClassification = AbcClassification;
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
        return ("VendorView [" +
            ", Vendor=" + Vendor +
            ", Country=" + Country +
            ", Name1=" + Name1 +
            ", Name2=" + Name2 +
            ", Name3=" + Name3 +
            ", Name4=" + Name4 +
            ", City=" + City +
            ", PostalCode=" + PostalCode +
            ", StreetAndHouseNumber=" + StreetAndHouseNumber +
            ", Language=" + Language +
            ", GpsUser=" + GpsUser +
            ", Incoterms1=" + Incoterms1 +
            ", Incoterms2=" + Incoterms2 +
            ", GpsPassword=" + GpsPassword +
            ", GpsValidFrom=" + GpsValidFrom +
            ", ApiPassword=" + ApiPassword +
            ", ExtranetUser=" + ExtranetUser +
            ", ExtranetMail1=" + ExtranetMail1 +
            ", ExtranetMail2=" + ExtranetMail2 +
            ", ExtranetValidity=" + ExtranetValidity +
            ", InvoiceReciver=" + InvoiceReciver +
            ", Underused=" + Underused +
            ", CollectedInvoice=" + CollectedInvoice +
            ", PefcCertificate=" + PefcCertificate +
            ", PefcCertificateValidTo=" + PefcCertificateValidTo +
            ", FscCertificate=" + FscCertificate +
            ", FscCertificateValidTo=" + FscCertificateValidTo +
            ", InvoicingUnit=" + InvoicingUnit +
            ", DerivationOfFreightPriceList=" + DerivationOfFreightPriceList +
            ", PurchasingOrganization=" + PurchasingOrganization +
            ", Currency=" + Currency +
            ", AbcClassification=" + AbcClassification +
            ", VendorRole=" + VendorRole +
            ", PaymentRecipient=" + PaymentRecipient +
            "]");
    }
}

