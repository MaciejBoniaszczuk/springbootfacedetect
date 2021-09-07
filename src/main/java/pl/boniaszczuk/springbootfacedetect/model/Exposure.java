
package pl.boniaszczuk.springbootfacedetect.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "exposureLevel",
    "value"
})
@Generated("jsonschema2pojo")
public class Exposure {

    @JsonProperty("exposureLevel")
    private String exposureLevel;
    @JsonProperty("value")
    private Double value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("exposureLevel")
    public String getExposureLevel() {
        return exposureLevel;
    }

    @JsonProperty("exposureLevel")
    public void setExposureLevel(String exposureLevel) {
        this.exposureLevel = exposureLevel;
    }

    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Exposure{" +
                "exposureLevel='" + exposureLevel + '\'' +
                ", value=" + value +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
