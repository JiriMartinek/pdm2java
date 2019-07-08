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
 * Ticket mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_TICKET_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ticket {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("TICKET")
    private long Ticket;

    @JsonProperty("EBELN")
    private String Contract;

    @JsonProperty("TICKET_STATUS")
    private String TicketStatus;

    @JsonProperty("DW_ID")
    private long DeliverywindowId;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CREATED")
    private Timestamp Created;

    @JsonProperty("CREATED_BY")
    private String CreatedBy;

    @JsonDeserialize(using = TimestampDeserializer.class)
    @JsonSerialize(using = TimestampSerializer.class)
    @JsonProperty("CHANGED")
    private Timestamp Changed;

    @JsonProperty("CHANGED_BY")
    private String ChangedBy;

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
     * @return the JsonProperty("TICKET_STATUS")
     */
    @JsonGetter("TICKET_STATUS")
    public String getTicketStatus() {
        return TicketStatus;
    }

    /**
     * @param TicketStatus the parameter to set - JsonProperty("TICKET_STATUS")
     */
    @JsonSetter("TICKET_STATUS")
    public void setTicketStatus(String TicketStatus) {
        this.TicketStatus = TicketStatus;
    }

    /**
     * @return the JsonProperty("DW_ID")
     */
    @JsonGetter("DW_ID")
    public long getDeliverywindowId() {
        return DeliverywindowId;
    }

    /**
     * @param DeliverywindowId the parameter to set - JsonProperty("DW_ID")
     */
    @JsonSetter("DW_ID")
    public void setDeliverywindowId(long DeliverywindowId) {
        this.DeliverywindowId = DeliverywindowId;
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
     * @return the JsonProperty("CREATED_BY")
     */
    @JsonGetter("CREATED_BY")
    public String getCreatedBy() {
        return CreatedBy;
    }

    /**
     * @param CreatedBy the parameter to set - JsonProperty("CREATED_BY")
     */
    @JsonSetter("CREATED_BY")
    public void setCreatedBy(String CreatedBy) {
        this.CreatedBy = CreatedBy;
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
     * @return the JsonProperty("CHANGED_BY")
     */
    @JsonGetter("CHANGED_BY")
    public String getChangedBy() {
        return ChangedBy;
    }

    /**
     * @param ChangedBy the parameter to set - JsonProperty("CHANGED_BY")
     */
    @JsonSetter("CHANGED_BY")
    public void setChangedBy(String ChangedBy) {
        this.ChangedBy = ChangedBy;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Ticket [" +
            ", Ticket=" + Ticket +
            ", Contract=" + Contract +
            ", TicketStatus=" + TicketStatus +
            ", DeliverywindowId=" + DeliverywindowId +
            ", Created=" + Created +
            ", CreatedBy=" + CreatedBy +
            ", Changed=" + Changed +
            ", ChangedBy=" + ChangedBy +
            "]");
    }
}

