import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

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
        //Converter
        VBox root = new VBox();

        //Labels
        Label lbl_celsius = new Label("Grad Celsius");
        Label lbl_fahrenheit = new Label("Grad Fahrenheit");

        //Textfields
        TextField txt_celsiusInput = new TextField();
        TextField txt_fahrenheitInput = new TextField();

        //Buttons
        Button btn_convert_CtoF = new Button();
        Button btn_convert_FtoC = new Button();

        //adding elements
        root.getChildren().addAll(lbl_celsius, txt_celsiusInput, lbl_fahrenheit, txt_fahrenheitInput, btn_convert_CtoF, btn_convert_FtoC);

        //Scene
        Scene scn = new Scene(root, 300, 400);

        //Stage
        Stage stg = new Stage();
        stg.setTitle("Temp. Converter");
        stg.setScene(scn);
        stg.show();
    }
}