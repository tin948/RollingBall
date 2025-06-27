package Lib;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class  RollingBall extends JPanel implements ActionListener{
    int x = 100;
    int y = 90;
    int star_angle = 0;
    int ball_size = 80;
    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y,ball_size,ball_size);
        g.fillArc(x,y,ball_size,ball_size,star_angle,180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 2;
        star_angle+=4;
        if(x< -ball_size) x = getWidth();
        if(star_angle>=360) star_angle =0;
        repaint();
    }
}
