package top.xinsin.JavaFx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import top.xinsin.util.StudentNameList;

public class SerialAssistant{

    @FXML
    public MenuBar Menu;
    @FXML
    public Button Random;
    @FXML
    public Label ReturnName;

    public void evenButton(ActionEvent actionEvent) {
        ReturnName.setText(new StudentNameList().call());
    }
}
