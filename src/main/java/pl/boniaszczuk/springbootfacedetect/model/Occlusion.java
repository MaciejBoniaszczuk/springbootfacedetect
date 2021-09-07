
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
    "foreheadOccluded",
    "eyeOccluded",
    "mouthOccluded"
})
@Generated("jsonschema2pojo")
public class Occlusion {

    @JsonProperty("foreheadOccluded")
    private Boolean foreheadOccluded;
    @JsonProperty("eyeOccluded")
    private Boolean eyeOccluded;
    @JsonProperty("mouthOccluded")
    private Boolean mouthOccluded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("foreheadOccluded")
    public Boolean getForeheadOccluded() {
        return foreheadOccluded;
    }

    @JsonProperty("foreheadOccluded")
    public void setForeheadOccluded(Boolean foreheadOccluded) {
        this.foreheadOccluded = foreheadOccluded;
    }

    @JsonProperty("eyeOccluded")
    public Boolean getEyeOccluded() {
        return eyeOccluded;
    }

    @JsonProperty("eyeOccluded")
    public void setEyeOccluded(Boolean eyeOccluded) {
        this.eyeOccluded = eyeOccluded;
    }

    @JsonProperty("mouthOccluded")
    public Boolean getMouthOccluded() {
        return mouthOccluded;
    }

    @JsonProperty("mouthOccluded")
    public void setMouthOccluded(Boolean mouthOccluded) {
        this.mouthOccluded = mouthOccluded;
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
        return "Occlusion{" +
                "foreheadOccluded=" + foreheadOccluded +
                ", eyeOccluded=" + eyeOccluded +
                ", mouthOccluded=" + mouthOccluded +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
