import javax.swing.*;
import java.awt.*;

public class Lab08Ex02 extends JFrame {
    Lab08Ex02() {
        setTitle("BorderLayout Practice");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c=getContentPane();
        c.setLayout(new BorderLayout(5,7));

        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab08Ex02();
    }
}
