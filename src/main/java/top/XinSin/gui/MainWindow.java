package top.XinSin.gui;

import top.XinSin.util.StudentNameList;

import javax.swing.*;

public class MainWindow extends JFrame{
    protected static JFrame container;
    protected static JPanel form;
    private JButton random;
    private JLabel back;
    private JLabel returnName;
    private JButton textWindow;
    private final ImagesWindow imagesWindow = new ImagesWindow();
    private final StudentNameList studentNameList = new StudentNameList();
    public MainWindow(){
        Shows();
    }

    private void Shows(){
        container = new JFrame("RandomOrderSystem");
        container.setSize(400,400);
        container.setLocationRelativeTo(null);

        container.setIconImage(ImagesWindow.logo);
        form = new JPanel(null);
        random = new JButton("Random",ImagesWindow.random);
        random.setContentAreaFilled(false);
        random.setBounds(15,35,100,40);
//        random.setFont(ImagesWindow.globalFont);
        random.addActionListener(e -> returnName.setText(studentNameList.call()));
        form.add(random);
        back = new JLabel(ImagesWindow.background);
        back.setBounds(0,0,ImagesWindow.background.getIconWidth(),ImagesWindow.background.getIconHeight());
        container.getLayeredPane().add(back,new Integer(Integer.MIN_VALUE));
        JPanel j = (JPanel)container.getContentPane();
        j.setOpaque(false);
        form.setOpaque(false);
        returnName = new JLabel("name");
        returnName.setBounds(random.getWidth() + 20 ,32,300,40);
//        returnName.setFont(ImagesWindow.nameFont);
//        returnName.setForeground(ImagesWindow.color);
        form.add(returnName);
        textWindow = new JButton("新建name");
//        textWindow.setFont(ImagesWindow.globalFont);
        textWindow.setContentAreaFilled(false);
        textWindow.setBounds(15,returnName.getHeight() + random.getHeight(),170,40);
        textWindow.addActionListener(e -> new TextWindow().Show());
        form.add(textWindow);

        container.setResizable(false);
        container.add(form);
        container.setVisible(true);
        container.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
