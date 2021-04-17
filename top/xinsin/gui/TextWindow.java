package top.xinsin.gui;

import top.xinsin.io.NameIO;

import javax.swing.*;

public class TextWindow{
    private JDialog text;
    private JButton fixed;
    private JTextArea textField;
    public TextWindow() {

    }
    public void Show(){
        text = new JDialog(MainWindow.container,"新建");
        text.setLocationRelativeTo(null);
        text.setSize(200,400);
        text.setLayout(null);
        textField = new JTextArea(13,14);
//        textField.setLocation(20,0);
//        textField.setSize(150,330);
        textField.setBounds(20,10,text.getWidth() - 40,text.getHeight() / 2);
        textField.setLineWrap(true);
        text.add(textField);
        fixed = new JButton("确认");
        fixed.setSize(80,30);
        fixed.setLocation(50,textField.getHeight() + 40);
        fixed.addActionListener(e -> {
            new NameIO().write(textField.getText());
        });
        text.add(fixed);

        text.setVisible(true);
        text.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
