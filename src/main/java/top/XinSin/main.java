package top.XinSin;

import top.XinSin.gui.MainWindow;
import top.XinSin.io.NameIO;

import java.io.File;
import java.io.IOException;

public class main{
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
        new MainWindow();
    }
}
