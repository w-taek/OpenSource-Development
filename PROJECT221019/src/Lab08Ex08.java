import java.awt.*;
import javax.swing.*;

class NorthPanel2 extends JPanel{
    public NorthPanel2() {
        setBackground(Color.LIGHT_GRAY);
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}
class CenterPanel2 extends JPanel{
    public CenterPanel2() {
        setLayout(null);
        for (int i = 0; i < 20; i++) {
            int x = (int)(Math.random()*250);
            int y = (int)(Math.random()*250);
            JLabel label=new JLabel("*");
            label.setForeground(Color.GREEN);
            label.setLocation(x,y);
            label.setSize(20, 20);
            label.setOpaque(true);
            add(label);
        }
    }
}
class SouthPanel2 extends JPanel{
    public SouthPanel2() {
        setBackground(Color.YELLOW);
        add(new JButton("Word Input"));
        add(new TextField(15));
    }
}

public class Lab08Ex08 extends JFrame{
    Lab08Ex08(){
        setTitle("여러 개의 패널을 가진 프레임");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel2 nP=new NorthPanel2();
        CenterPanel2 nC=new CenterPanel2();
        SouthPanel2 nS=new SouthPanel2();
        add(nP, BorderLayout.NORTH);
        add(nS, BorderLayout.SOUTH);
        add(nC);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Lab08Ex08();
    }
}