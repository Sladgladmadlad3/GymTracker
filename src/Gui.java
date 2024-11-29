import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class Gui extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Title
        primaryStage.setTitle("Gym Tracker");

        JFrame frame = new JFrame();

        JTable workoutTable = new JTable(new TableModel());
        workoutTable.setBounds(30,40,200,300);

        //Allows user to scroll when size changes
        JScrollPane scrollPane = new JScrollPane(workoutTable);
        frame.add(scrollPane);

        frame.setSize(500,200);
        frame.setVisible(true);

    }

}

class TableModel extends AbstractTableModel {
    private final String[] columns = {"Exercises", "Sets", "Reps"};
    private Object[][] data = {
            {"Example", "Example", "Example"},
            {"Example", "Example", "Example"}
    };

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
}


