package top.xinsin;

import top.xinsin.gui.MainWindow;
import top.xinsin.io.NameIO;

public class main {
    public static void main(String[] args) {
        new NameIO().read();
        new MainWindow();
    }
}
