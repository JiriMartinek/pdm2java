package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * ContractItem mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_CONTRI_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractItem {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EBELN")
    private String Contract;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EBELP")
    private String ContractItem;

    @JsonProperty("TXZ01")
    private String ContractItemDescription;

    @JsonProperty("MATNR")
    private String Material;

    @JsonProperty("WERKS")
    private String Plant;

    @JsonProperty("MATKL")
    private String MaterialGroup;

    @JsonProperty("KTMNG")
    private double TargetQuantity;

    @JsonProperty("MEINS")
    private String UnitOfMeasure;

    @JsonProperty("BPRME")
    private String OrderPriceUnit;

    @JsonProperty("BPUMZ")
    private double OrderPriceUnitToOrderUnitNumerator;

    @JsonProperty("BPUMN")
    private double OrderPriceUnitToOrderUnitDenumerator;

    @JsonProperty("UMREZ")
    private double OrderUnitToBaseUnitNumerator;

    @JsonProperty("UMREN")
    private double OrderUnitToBaseUnitDenumerator;

    @JsonProperty("NETPR")
    private double NetPrice;

    @JsonProperty("PEINH")
    private double PriceUnit;

    @JsonProperty("BRTWR")
    private double GrossOrderValueInPoCurrency;

    @JsonProperty("MWSKZ")
    private String TaxCode;

    @JsonProperty("BEDNR")
    private String RequirementTrackingNumber;

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
     * @return the JsonProperty("EBELP")
     */
    @JsonGetter("EBELP")
    public String getContractItem() {
        return ContractItem;
    }

    /**
     * @param ContractItem the parameter to set - JsonProperty("EBELP")
     */
    @JsonSetter("EBELP")
    public void setContractItem(String ContractItem) {
        this.ContractItem = ContractItem;
    }

    /**
     * @return the JsonProperty("TXZ01")
     */
    @JsonGetter("TXZ01")
    public String getContractItemDescription() {
        return ContractItemDescription;
    }

    /**
     * @param ContractItemDescription the parameter to set - JsonProperty("TXZ01")
     */
    @JsonSetter("TXZ01")
    public void setContractItemDescription(String ContractItemDescription) {
        this.ContractItemDescription = ContractItemDescription;
    }

    /**
     * @return the JsonProperty("MATNR")
     */
    @JsonGetter("MATNR")
    public String getMaterial() {
        return Material;
    }

    /**
     * @param Material the parameter to set - JsonProperty("MATNR")
     */
    @JsonSetter("MATNR")
    public void setMaterial(String Material) {
        this.Material = Material;
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
     * @return the JsonProperty("MATKL")
     */
    @JsonGetter("MATKL")
    public String getMaterialGroup() {
        return MaterialGroup;
    }

    /**
     * @param MaterialGroup the parameter to set - JsonProperty("MATKL")
     */
    @JsonSetter("MATKL")
    public void setMaterialGroup(String MaterialGroup) {
        this.MaterialGroup = MaterialGroup;
    }

    /**
     * @return the JsonProperty("KTMNG")
     */
    @JsonGetter("KTMNG")
    public double getTargetQuantity() {
        return TargetQuantity;
    }

    /**
     * @param TargetQuantity the parameter to set - JsonProperty("KTMNG")
     */
    @JsonSetter("KTMNG")
    public void setTargetQuantity(double TargetQuantity) {
        this.TargetQuantity = TargetQuantity;
    }

    /**
     * @return the JsonProperty("MEINS")
     */
    @JsonGetter("MEINS")
    public String getUnitOfMeasure() {
        return UnitOfMeasure;
    }

    /**
     * @param UnitOfMeasure the parameter to set - JsonProperty("MEINS")
     */
    @JsonSetter("MEINS")
    public void setUnitOfMeasure(String UnitOfMeasure) {
        this.UnitOfMeasure = UnitOfMeasure;
    }

    /**
     * @return the JsonProperty("BPRME")
     */
    @JsonGetter("BPRME")
    public String getOrderPriceUnit() {
        return OrderPriceUnit;
    }

    /**
     * @param OrderPriceUnit the parameter to set - JsonProperty("BPRME")
     */
    @JsonSetter("BPRME")
    public void setOrderPriceUnit(String OrderPriceUnit) {
        this.OrderPriceUnit = OrderPriceUnit;
    }

    /**
     * @return the JsonProperty("BPUMZ")
     */
    @JsonGetter("BPUMZ")
    public double getOrderPriceUnitToOrderUnitNumerator() {
        return OrderPriceUnitToOrderUnitNumerator;
    }

    /**
     * @param OrderPriceUnitToOrderUnitNumerator the parameter to set - JsonProperty("BPUMZ")
     */
    @JsonSetter("BPUMZ")
    public void setOrderPriceUnitToOrderUnitNumerator(double OrderPriceUnitToOrderUnitNumerator) {
        this.OrderPriceUnitToOrderUnitNumerator = OrderPriceUnitToOrderUnitNumerator;
    }

    /**
     * @return the JsonProperty("BPUMN")
     */
    @JsonGetter("BPUMN")
    public double getOrderPriceUnitToOrderUnitDenumerator() {
        return OrderPriceUnitToOrderUnitDenumerator;
    }

    /**
     * @param OrderPriceUnitToOrderUnitDenumerator the parameter to set - JsonProperty("BPUMN")
     */
    @JsonSetter("BPUMN")
    public void setOrderPriceUnitToOrderUnitDenumerator(double OrderPriceUnitToOrderUnitDenumerator) {
        this.OrderPriceUnitToOrderUnitDenumerator = OrderPriceUnitToOrderUnitDenumerator;
    }

    /**
     * @return the JsonProperty("UMREZ")
     */
    @JsonGetter("UMREZ")
    public double getOrderUnitToBaseUnitNumerator() {
        return OrderUnitToBaseUnitNumerator;
    }

    /**
     * @param OrderUnitToBaseUnitNumerator the parameter to set - JsonProperty("UMREZ")
     */
    @JsonSetter("UMREZ")
    public void setOrderUnitToBaseUnitNumerator(double OrderUnitToBaseUnitNumerator) {
        this.OrderUnitToBaseUnitNumerator = OrderUnitToBaseUnitNumerator;
    }

    /**
     * @return the JsonProperty("UMREN")
     */
    @JsonGetter("UMREN")
    public double getOrderUnitToBaseUnitDenumerator() {
        return OrderUnitToBaseUnitDenumerator;
    }

    /**
     * @param OrderUnitToBaseUnitDenumerator the parameter to set - JsonProperty("UMREN")
     */
    @JsonSetter("UMREN")
    public void setOrderUnitToBaseUnitDenumerator(double OrderUnitToBaseUnitDenumerator) {
        this.OrderUnitToBaseUnitDenumerator = OrderUnitToBaseUnitDenumerator;
    }

    /**
     * @return the JsonProperty("NETPR")
     */
    @JsonGetter("NETPR")
    public double getNetPrice() {
        return NetPrice;
    }

    /**
     * @param NetPrice the parameter to set - JsonProperty("NETPR")
     */
    @JsonSetter("NETPR")
    public void setNetPrice(double NetPrice) {
        this.NetPrice = NetPrice;
    }

    /**
     * @return the JsonProperty("PEINH")
     */
    @JsonGetter("PEINH")
    public double getPriceUnit() {
        return PriceUnit;
    }

    /**
     * @param PriceUnit the parameter to set - JsonProperty("PEINH")
     */
    @JsonSetter("PEINH")
    public void setPriceUnit(double PriceUnit) {
        this.PriceUnit = PriceUnit;
    }

    /**
     * @return the JsonProperty("BRTWR")
     */
    @JsonGetter("BRTWR")
    public double getGrossOrderValueInPoCurrency() {
        return GrossOrderValueInPoCurrency;
    }

    /**
     * @param GrossOrderValueInPoCurrency the parameter to set - JsonProperty("BRTWR")
     */
    @JsonSetter("BRTWR")
    public void setGrossOrderValueInPoCurrency(double GrossOrderValueInPoCurrency) {
        this.GrossOrderValueInPoCurrency = GrossOrderValueInPoCurrency;
    }

    /**
     * @return the JsonProperty("MWSKZ")
     */
    @JsonGetter("MWSKZ")
    public String getTaxCode() {
        return TaxCode;
    }

    /**
     * @param TaxCode the parameter to set - JsonProperty("MWSKZ")
     */
    @JsonSetter("MWSKZ")
    public void setTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
    }

    /**
     * @return the JsonProperty("BEDNR")
     */
    @JsonGetter("BEDNR")
    public String getRequirementTrackingNumber() {
        return RequirementTrackingNumber;
    }

    /**
     * @param RequirementTrackingNumber the parameter to set - JsonProperty("BEDNR")
     */
    @JsonSetter("BEDNR")
    public void setRequirementTrackingNumber(String RequirementTrackingNumber) {
        this.RequirementTrackingNumber = RequirementTrackingNumber;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("ContractItem [" +
            ", Contract=" + Contract +
            ", ContractItem=" + ContractItem +
            ", ContractItemDescription=" + ContractItemDescription +
            ", Material=" + Material +
            ", Plant=" + Plant +
            ", MaterialGroup=" + MaterialGroup +
            ", TargetQuantity=" + TargetQuantity +
            ", UnitOfMeasure=" + UnitOfMeasure +
            ", OrderPriceUnit=" + OrderPriceUnit +
            ", OrderPriceUnitToOrderUnitNumerator=" + OrderPriceUnitToOrderUnitNumerator +
            ", OrderPriceUnitToOrderUnitDenumerator=" + OrderPriceUnitToOrderUnitDenumerator +
            ", OrderUnitToBaseUnitNumerator=" + OrderUnitToBaseUnitNumerator +
            ", OrderUnitToBaseUnitDenumerator=" + OrderUnitToBaseUnitDenumerator +
            ", NetPrice=" + NetPrice +
            ", PriceUnit=" + PriceUnit +
            ", GrossOrderValueInPoCurrency=" + GrossOrderValueInPoCurrency +
            ", TaxCode=" + TaxCode +
            ", RequirementTrackingNumber=" + RequirementTrackingNumber +
            "]");
    }
}

