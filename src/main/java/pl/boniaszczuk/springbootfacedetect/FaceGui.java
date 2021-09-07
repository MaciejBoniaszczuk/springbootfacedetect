package pl.boniaszczuk.springbootfacedetect;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import pl.boniaszczuk.springbootfacedetect.model.FaceObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@Route
public class FaceGui extends VerticalLayout {

    public FaceGui(FaceApiClient faceApiClient) {

        TextField textField = new TextField("Image");
        Button button = new Button("Show info");

        List<FaceObject> personList = new ArrayList<>();


        Grid<FaceObject> grid = new Grid<>(FaceObject.class);
        grid.removeAllColumns();
        button.addClickListener(click -> {

            grid.setItems(faceApiClient.getInfoByPhotoUrl(textField.getValue()));
            grid.addColumn(c -> c.getFaceAttributes().getGender()).setHeader("Gender");
            grid.addColumn(c -> c.getFaceAttributes().getAge()).setHeader("Age");
            grid.addColumn(c -> c.getFaceAttributes().getSmile()).setHeader("Smile");
            add(new Image(textField.getValue(), textField.getValue()));
        });


        add(textField,button,grid);


    }

}
