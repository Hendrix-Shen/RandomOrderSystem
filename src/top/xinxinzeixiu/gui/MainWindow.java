package top.xinxinzeixiu.gui;

import top.xinxinzeixiu.util.Funtion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{
    private final Funtion STUDENT; //创建学生
    private final JFrame WINDOW; //创建窗口
    private final JButton RANDOM; //创建随机按钮
    private final JPanel jPanel; // 创建容器
    private final JLabel RETURN_VALUE; // 创建标签
    private final Font font; // 创建字体
    public MainWindow(){
        STUDENT = new Funtion(); //创建学生对象
        RANDOM = new JButton(); //创建随机按钮对象
        WINDOW = new JFrame("RandomOrder"); //创建窗口对象
        jPanel = new JPanel(); //创建容器对象
        RETURN_VALUE = new JLabel("Name"); //创建标签对象
        font=new Font("华文宋体",Font.BOLD,25);
        jPanel.add(RANDOM); //将按钮添加到容器中
        jPanel.add(RETURN_VALUE);


        WINDOW.setSize(400,300); //设置窗口大小
        WINDOW.setLocationRelativeTo(null); //窗口居中
        WINDOW.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //退出
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/top/xinxinzeixiu/Images/Icon/logo.png"));
        Image image = imageIcon.getImage();
        WINDOW.setIconImage(image);

        RANDOM.setPreferredSize(new Dimension(100, 40)); //设置按钮大小
        RANDOM.setContentAreaFilled(false); //设置按钮透明度
        RANDOM.setFont(font);
        RANDOM.setIcon(new ImageIcon(this.getClass().getResource("/top/xinxinzeixiu/Images/Icon/Random.png")));
        RETURN_VALUE.setFont(new Font("华文宋体",Font.BOLD,50));
        RETURN_VALUE.setForeground(new Color(64,64,64));

        RANDOM.addActionListener(new ActionListener() { //创建按钮监听器
            @Override
            public void actionPerformed(ActionEvent e) {
                RETURN_VALUE.setText(STUDENT.call());
            }
        });

        WINDOW.add(jPanel);
        WINDOW.setResizable(true); // 设置窗口可放大缩小
        WINDOW.setVisible(true);
    }
}
