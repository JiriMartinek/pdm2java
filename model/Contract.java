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
 * Contract mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_CONTR_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contract {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EBELN")
    private String Contract;

    @JsonProperty("LIFNR")
    private String Vendor;

    @JsonProperty("EKORG")
    private String PurchasingOrganization;

    @JsonProperty("BUKRS")
    private String CompanyCode;

    @JsonProperty("BSTYP")
    private String PurchasingDocumentCategory;

    @JsonProperty("BSART")
    private String PurchasingDocumentType;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("AEDAT")
    private Timestamp Created;

    @JsonProperty("ERNAM")
    private String CreatedBy;

    @JsonProperty("EKGRP")
    private String PurchasingGroup;

    @JsonProperty("WAERS")
    private String Currency;

    @JsonProperty("WKURS")
    private double ExchangeRate;

    @JsonProperty("LIFRE")
    private String InvoicingParty;

    @JsonProperty("SUBMI")
    private String CollectiveNumber;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("KDATB")
    private Timestamp StartOfValidityPeriod;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("KDATE")
    private Timestamp EndOfValidityPeriod;

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
     * @return the JsonProperty("BUKRS")
     */
    @JsonGetter("BUKRS")
    public String getCompanyCode() {
        return CompanyCode;
    }

    /**
     * @param CompanyCode the parameter to set - JsonProperty("BUKRS")
     */
    @JsonSetter("BUKRS")
    public void setCompanyCode(String CompanyCode) {
        this.CompanyCode = CompanyCode;
    }

    /**
     * @return the JsonProperty("BSTYP")
     */
    @JsonGetter("BSTYP")
    public String getPurchasingDocumentCategory() {
        return PurchasingDocumentCategory;
    }

    /**
     * @param PurchasingDocumentCategory the parameter to set - JsonProperty("BSTYP")
     */
    @JsonSetter("BSTYP")
    public void setPurchasingDocumentCategory(String PurchasingDocumentCategory) {
        this.PurchasingDocumentCategory = PurchasingDocumentCategory;
    }

    /**
     * @return the JsonProperty("BSART")
     */
    @JsonGetter("BSART")
    public String getPurchasingDocumentType() {
        return PurchasingDocumentType;
    }

    /**
     * @param PurchasingDocumentType the parameter to set - JsonProperty("BSART")
     */
    @JsonSetter("BSART")
    public void setPurchasingDocumentType(String PurchasingDocumentType) {
        this.PurchasingDocumentType = PurchasingDocumentType;
    }

    /**
     * @return the JsonProperty("AEDAT")
     */
    @JsonGetter("AEDAT")
    public Timestamp getCreated() {
        return Created;
    }

    /**
     * @param Created the parameter to set - JsonProperty("AEDAT")
     */
    @JsonSetter("AEDAT")
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
     * @return the JsonProperty("EKGRP")
     */
    @JsonGetter("EKGRP")
    public String getPurchasingGroup() {
        return PurchasingGroup;
    }

    /**
     * @param PurchasingGroup the parameter to set - JsonProperty("EKGRP")
     */
    @JsonSetter("EKGRP")
    public void setPurchasingGroup(String PurchasingGroup) {
        this.PurchasingGroup = PurchasingGroup;
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
     * @return the JsonProperty("WKURS")
     */
    @JsonGetter("WKURS")
    public double getExchangeRate() {
        return ExchangeRate;
    }

    /**
     * @param ExchangeRate the parameter to set - JsonProperty("WKURS")
     */
    @JsonSetter("WKURS")
    public void setExchangeRate(double ExchangeRate) {
        this.ExchangeRate = ExchangeRate;
    }

    /**
     * @return the JsonProperty("LIFRE")
     */
    @JsonGetter("LIFRE")
    public String getInvoicingParty() {
        return InvoicingParty;
    }

    /**
     * @param InvoicingParty the parameter to set - JsonProperty("LIFRE")
     */
    @JsonSetter("LIFRE")
    public void setInvoicingParty(String InvoicingParty) {
        this.InvoicingParty = InvoicingParty;
    }

    /**
     * @return the JsonProperty("SUBMI")
     */
    @JsonGetter("SUBMI")
    public String getCollectiveNumber() {
        return CollectiveNumber;
    }

    /**
     * @param CollectiveNumber the parameter to set - JsonProperty("SUBMI")
     */
    @JsonSetter("SUBMI")
    public void setCollectiveNumber(String CollectiveNumber) {
        this.CollectiveNumber = CollectiveNumber;
    }

    /**
     * @return the JsonProperty("KDATB")
     */
    @JsonGetter("KDATB")
    public Timestamp getStartOfValidityPeriod() {
        return StartOfValidityPeriod;
    }

    /**
     * @param StartOfValidityPeriod the parameter to set - JsonProperty("KDATB")
     */
    @JsonSetter("KDATB")
    public void setStartOfValidityPeriod(Timestamp StartOfValidityPeriod) {
        this.StartOfValidityPeriod = StartOfValidityPeriod;
    }

    /**
     * @return the JsonProperty("KDATE")
     */
    @JsonGetter("KDATE")
    public Timestamp getEndOfValidityPeriod() {
        return EndOfValidityPeriod;
    }

    /**
     * @param EndOfValidityPeriod the parameter to set - JsonProperty("KDATE")
     */
    @JsonSetter("KDATE")
    public void setEndOfValidityPeriod(Timestamp EndOfValidityPeriod) {
        this.EndOfValidityPeriod = EndOfValidityPeriod;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Contract [" +
            ", Contract=" + Contract +
            ", Vendor=" + Vendor +
            ", PurchasingOrganization=" + PurchasingOrganization +
            ", CompanyCode=" + CompanyCode +
            ", PurchasingDocumentCategory=" + PurchasingDocumentCategory +
            ", PurchasingDocumentType=" + PurchasingDocumentType +
            ", Created=" + Created +
            ", CreatedBy=" + CreatedBy +
            ", PurchasingGroup=" + PurchasingGroup +
            ", Currency=" + Currency +
            ", ExchangeRate=" + ExchangeRate +
            ", InvoicingParty=" + InvoicingParty +
            ", CollectiveNumber=" + CollectiveNumber +
            ", StartOfValidityPeriod=" + StartOfValidityPeriod +
            ", EndOfValidityPeriod=" + EndOfValidityPeriod +
            "]");
    }
}

