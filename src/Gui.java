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
import java.util.ArrayList;

public class Gui extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Gym Tracker");

        new JTableExample();

    }

}

//custom class
class Exercise {
    private String exerciseName;
    private int sets;
    private String reps;

    //constructor
    public Exercise(String exerciseName, int sets, String reps) {
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
    }
}


class JTableExample extends JTable{
    JFrame frame;

    JTable workoutTable;

    JTableExample() {
        frame = new JFrame();

        frame.setTitle("Gym Tracker");

        String[][] data = {
                {"Test", "Test", "Test", "Test"},
                {"Test", "Test", "Data-Data", "Data-Data"},
        };

        String[] columnNames = {"Exercise", "Sets", "Reps"};

        ArrayList<Exercise> dataList = new ArrayList<Exercise>();

        Exercise rowOne = new Exercise("Bench Press", 4, "4-8");
        Exercise rowTwo = new Exercise("Bent Over Row", 3, "4-8");
        Exercise rowThree = new Exercise("Seated OHP", 4, "6-10");
        Exercise rowFour = new Exercise("Pull Ups or Chin Ups", 4, "6-10");
        Exercise rowFive = new Exercise("Barbell Curl x Chest Dips", 3, "10");
        Exercise rowSix = new Exercise("Hanging Leg Raise or Lying Leg Raises", 3, "6-12");

        dataList.add(rowOne);
        dataList.add(rowTwo);
        dataList.add(rowThree);
        dataList.add(rowFour);
        dataList.add(rowFive);
        dataList.add(rowSix);

        ExerciseTableModel model = new Exer
        workoutTable = new JTable(dataList, columnNames);
        workoutTable.setBounds(30,40,200,300);

        JScrollPane scrollPane = new JScrollPane(workoutTable);
        frame.add(scrollPane);

        frame.setSize(500,200);
        frame.setVisible(true);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        int row = workoutTable.convertRowIndexToModel(rowIndex);
        if (0 == columnIndex) {
            row.setId((Integer) aValue);
        }
    }
}
