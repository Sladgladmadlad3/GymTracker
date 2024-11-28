import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JTable;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

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

class JTableExample {
    JFrame frame;

    JTable workoutTable;

    JTableExample() {
        frame = new JFrame();

        frame.setTitle("Gym Tracker");

        String[][] data = {
                {"Kamla Harris", "2023", "Data"},
                {"Donald Trump", "1999", "Data-Data"}
        };

        String[] columnNames = {"Name", "Year", "Words"};

        workoutTable = new JTable(data, columnNames);
        workoutTable.setBounds(30,40,200,300);

        JScrollPane scrollPane = new JScrollPane(workoutTable);
        frame.add(scrollPane);

        frame.setSize(500,200);
        frame.setVisible(true);
    }
}
