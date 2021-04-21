package top.XinSin.JavaFx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import top.XinSin.io.NameIO;
import top.XinSin.util.StudentNameList;

import java.io.IOException;

public class SerialAssistant extends Application{

    public Button fxid;
    public Label ReturnName;
    public MenuBar MainMenu;

    public static void main(String[] args) {
        new NameIO().read();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/../resources/SerialAssistant.fxml"));
            primaryStage.setTitle("RandomOrderSystem");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void evenButton(ActionEvent actionEvent) {
        ReturnName.setText(new StudentNameList().call());
    }
}
