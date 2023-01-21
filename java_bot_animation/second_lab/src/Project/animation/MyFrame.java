package Project.animation;

import javax.swing.*;

public class MyFrame extends JFrame {
    private MyPanel panel;

    public MyFrame()
    {
        panel=new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
