
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
    "eyeMakeup",
    "lipMakeup"
})
@Generated("jsonschema2pojo")
public class Makeup {

    @JsonProperty("eyeMakeup")
    private Boolean eyeMakeup;
    @JsonProperty("lipMakeup")
    private Boolean lipMakeup;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("eyeMakeup")
    public Boolean getEyeMakeup() {
        return eyeMakeup;
    }

    @JsonProperty("eyeMakeup")
    public void setEyeMakeup(Boolean eyeMakeup) {
        this.eyeMakeup = eyeMakeup;
    }

    @JsonProperty("lipMakeup")
    public Boolean getLipMakeup() {
        return lipMakeup;
    }

    @JsonProperty("lipMakeup")
    public void setLipMakeup(Boolean lipMakeup) {
        this.lipMakeup = lipMakeup;
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
        return "Makeup{" +
                "eyeMakeup=" + eyeMakeup +
                ", lipMakeup=" + lipMakeup +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
