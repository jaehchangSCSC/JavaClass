package guipractice;

import javax.swing.*;
import java.awt.*;

public class animation{
    int x = 55;
    int y = 40;
    int y_max = 0;
    //방향도 추가해보자 (++이나 --으로는 현재가고 있는 방향을 알 수가 없다)
    int dx = 2;
    int dy = 9;
    public static void main(String[] args){
        animation gui = new animation();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(100,500);
        frame.setVisible(true);
        while(true){
            int gravity_effect = -5;
            if(y >= 400){
                y_max = y_max - gravity_effect;
            }
            if(x>=100 && y>=(400)){
                dx = -2;
                dy = -1;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(x<=0 && y <= y_max){
                dx = 2;
                dy = 9;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(x<=0 && y>=400){
                dx = 2;
                dy = -1;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(x>=100 && y<=y_max){
                dx = -2;
                dy = 9;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(x>=100){
                dx = -2;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(x<=0){
                dx = 2;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(y>=400){
                dy = -1;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else if(y<=y_max){
                dy = 9;
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }else{
                x = x + dx;
                y = y + dy;
                drawPanel.repaint();
            }try{
                Thread.sleep(10);
            } catch (Exception ex){}
        }


    }
    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(), this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
}
}
