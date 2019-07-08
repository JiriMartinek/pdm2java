package zlbpwa.javatest.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Owen mapping class
 *
 * @author itelligence
 */
@JsonRootName(value = "ZLBPWA_OWEN_T")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Owen {

    @JsonPropertyDescription("KEYFIELD")
    @JsonProperty("EQUNR")
    private String Owen;

    /**
     * @return the JsonProperty("EQUNR")
     */
    @JsonGetter("EQUNR")
    public String getOwen() {
        return Owen;
    }

    /**
     * @param Owen the parameter to set - JsonProperty("EQUNR")
     */
    @JsonSetter("EQUNR")
    public void setOwen(String Owen) {
        this.Owen = Owen;
    }

    @Override
//    @JsonValue
    public String toString() {
        return ("Owen [" +
            ", Owen=" + Owen +
            "]");
    }
}

