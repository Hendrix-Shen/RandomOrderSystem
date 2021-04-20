package top.XinSin;

import javafx.application.Application;
import javafx.stage.Stage;
import top.XinSin.JavaFx.SerialAssistant;
import top.XinSin.io.NameIO;

import java.io.File;
import java.io.IOException;

import static javafx.application.Application.launch;

public class main{
    private String[] args;

    public static void main(String[] args) {
        File file = new File("1.txt");
        if (!file.isFile()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        new File("1.txt");
        new NameIO().read();
        
//        new MainWindow();
    }
}
