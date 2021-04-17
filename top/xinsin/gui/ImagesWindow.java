package top.xinsin.gui;

import javax.swing.*;
import java.awt.*;

public class ImagesWindow {
    public static Image logo;
    public static ImageIcon random;
    public static ImageIcon background;
    public static Font globalFont;
    public static Font nameFont;
    public static Color color;
    public ImagesWindow() {
        getLogo();
        getRandom();
        getBackground();
        getFont();
        getColor();
    }

    public void getLogo(){
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/top/xinsin/Images/Icon/logo.png"));
        logo = imageIcon.getImage();
    }
    public void getRandom(){
        random = new ImageIcon(this.getClass().getResource("/top/xinsin/Images/Icon/Random.png"));
    }
    public void getBackground(){
        background = new ImageIcon(this.getClass().getResource("/top/xinsin/Images/Background/background.png"));
    }
    public void getFont(){
        globalFont = new Font("微软雅黑",Font.BOLD,25);
        nameFont = new Font("微软雅黑",Font.BOLD,50);
    }
    public void getColor(){
        color = new Color(64,64,64);
    }
}
