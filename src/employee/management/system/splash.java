package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class splash extends JFrame implements ActionListener {
    splash(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1170,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1170,650);
        add(image);

        setSize(1170,650);
        setLocation(200,50);
        setLayout(null);
        setVisible(true);

        try {
            Thread.sleep(5000);
            setVisible(false);
            new login();
        }catch (Exception E){
            E.printStackTrace();
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args) {
        new splash();
    }
}
