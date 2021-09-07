
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
    "blurLevel",
    "value"
})
@Generated("jsonschema2pojo")
public class Blur {

    @JsonProperty("blurLevel")
    private String blurLevel;
    @JsonProperty("value")
    private Double value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("blurLevel")
    public String getBlurLevel() {
        return blurLevel;
    }

    @JsonProperty("blurLevel")
    public void setBlurLevel(String blurLevel) {
        this.blurLevel = blurLevel;
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
        return "Blur{" +
                "blurLevel='" + blurLevel + '\'' +
                ", value=" + value +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
