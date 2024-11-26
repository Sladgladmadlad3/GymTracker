import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends Application {
    Button button;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gym Tracker");
        button = new Button();
        button.setText("Click Me");

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
