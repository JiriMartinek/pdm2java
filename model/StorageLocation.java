package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import zlbpwa.javatest.util.BooleanDeserializer;

/**
 * StorageLocation mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_STLOC_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StorageLocation {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("WERKS")
    private String Plant;

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("LGORT")
    private String StorageLocation;

    @JsonProperty("LGOBE")
    private String StorageLocationDescription;

    @JsonDeserialize(using = BooleanDeserializer.class)
    @JsonProperty("TOSTORE")
    private boolean ToStore;

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
     * @return the JsonProperty("LGOBE")
     */
    @JsonGetter("LGOBE")
    public String getStorageLocationDescription() {
        return StorageLocationDescription;
    }

    /**
     * @param StorageLocationDescription the parameter to set - JsonProperty("LGOBE")
     */
    @JsonSetter("LGOBE")
    public void setStorageLocationDescription(String StorageLocationDescription) {
        this.StorageLocationDescription = StorageLocationDescription;
    }

    /**
     * @return the JsonProperty("TOSTORE")
     */
    @JsonGetter("TOSTORE")
    public boolean getToStore() {
        return ToStore;
    }

    /**
     * @param ToStore the parameter to set - JsonProperty("TOSTORE")
     */
    @JsonSetter("TOSTORE")
    public void setToStore(boolean ToStore) {
        this.ToStore = ToStore;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("StorageLocation [" +
            ", Plant=" + Plant +
            ", StorageLocation=" + StorageLocation +
            ", StorageLocationDescription=" + StorageLocationDescription +
            ", ToStore=" + ToStore +
            "]");
    }
}

