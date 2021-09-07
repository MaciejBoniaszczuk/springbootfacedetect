package pl.boniaszczuk.springbootfacedetect;


import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.boniaszczuk.springbootfacedetect.model.FaceObject;
import pl.boniaszczuk.springbootfacedetect.model.ImageUrl;

import javax.xml.bind.SchemaOutputResolver;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.stream.Stream;

@Controller()
public class FaceApiClient {

    @Value("${Ocp-Apim-Subscription-Key}")
    private String ocpApimSubscriptionKey;
    private static final String FACE_BASE_API_URL = "https://westeurope.api.cognitive.microsoft.com/face/v1.0/detect?";


    public FaceObject[] getInfoByPhotoUrl(String url){
        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<ImageUrl> imageHttpEntity = getHttpEntity(url);

        ResponseEntity<FaceObject[]> exchange = restTemplate.exchange(getApiUrl(), HttpMethod.POST, imageHttpEntity, FaceObject[].class);
        Stream.of(exchange.getBody()).forEach(System.out::println);
        return exchange.getBody();
    }

    private HttpEntity<ImageUrl> getHttpEntity(String url) {
        ImageUrl imageUrl = new ImageUrl(url);
        HttpHeaders httpHeaders = getHttpHeaders();
        return new HttpEntity<>(imageUrl,httpHeaders);
    }

    private HttpHeaders getHttpHeaders() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Content-Type","application/json");
        httpHeaders.add("Ocp-Apim-Subscription-Key",ocpApimSubscriptionKey);
        return httpHeaders;
    }

    private URI getApiUrl(){
        URI uri = null;
        try {
            URIBuilder uriBuilder = new URIBuilder(FACE_BASE_API_URL);
            uriBuilder.addParameter("returnFaceId", "true");
            uriBuilder.addParameter("returnFaceLandmarks", "false");
            uriBuilder.addParameter("returnFaceAttributes", "age,gender,smile,headPose,facialHair,glasses,hair,makeup,accessories,blur,exposure,noise,occlusion");
            uriBuilder.addParameter("recognitionModel", "recognition_01");
            uriBuilder.addParameter("returnRecognitionModel", "false");
            uriBuilder.addParameter("detectionModel", "detection_01");
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}
