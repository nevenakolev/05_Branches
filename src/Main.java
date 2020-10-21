import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

/**
 * @author Nevena Kolev
 * @version 1.0, 15.10.20
 */
public class Main extends Application {
    public static void main(String[] args) {
        // launch the JavaFX Application
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Converter grid
        GridPane grid = new GridPane();

        //Labels
        Label lbl_celsius = new Label("Grad Celsius");
        Label lbl_fahrenheit = new Label("Grad Fahrenheit");

        //Label style
        lbl_celsius.setStyle("-fx-font-size: 24px; -fx-font-family: 'Times New Roman'");
        lbl_fahrenheit.setStyle("-fx-font-size: 24px; -fx-font-family: 'Times New Roman'");

        //Textfields
        TextField txt_celsiusInput = new TextField();
        TextField txt_fahrenheitInput = new TextField();

        //Buttons
        Button btn_convert_CtoF = new Button();
        Button btn_convert_FtoC = new Button();

        //Button style
        btn_convert_CtoF.setText("Convert C -> F");
        btn_convert_FtoC.setText("Convert F -> C");

        //Gridpane
        grid.add(lbl_celsius, 0, 0);
        grid.add(txt_celsiusInput, 0, 1);
        grid.add(btn_convert_CtoF, 1, 1);
        grid.add(lbl_fahrenheit, 0, 2);
        grid.add(txt_fahrenheitInput, 0, 3);
        grid.add(btn_convert_FtoC, 1, 3);

        //Gridpane style
        grid.setPadding(new Insets(5));
        grid.setHgap(5);

        //Event Handlers
        EventHandler hdl_convertFtoC = new EventHandler() {
            @Override
            public void handle(Event event) {
                double value = Double.parseDouble(txt_fahrenheitInput.getText());

                double celsius = (value - 32) / 1.8;
                txt_celsiusInput.setText(String.valueOf(celsius));
            }
        };

        EventHandler hdl_convertCtoF = new EventHandler() {
            @Override
            public void handle(Event event) {
                double value = Double.parseDouble(txt_celsiusInput.getText());

                double fahrenheit = value * 1.8 + 32;
                txt_fahrenheitInput.setText(String.valueOf(fahrenheit));
            }
        };

        btn_convert_CtoF.setOnMouseClicked(hdl_convertCtoF);
        btn_convert_FtoC.setOnMouseClicked(hdl_convertFtoC);

        //Scene
        Scene scn = new Scene(grid, 270, 120);

        //Stage
        Stage stg = new Stage();
        stg.setTitle("Temp. Converter");
        stg.setScene(scn);
        stg.show();
    }
}