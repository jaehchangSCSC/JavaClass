package guipractice;

import javax.swing.*;
import java.awt.*;

public class calculator extends JFrame{
    public calculator(){
        setTitle("Calculator");
        Container pane = getContentPane();
        JButton[] Buttons = new JButton[22];
        for(int i = 0; i<=9; i++){
            Buttons[i] = new JButton(String.valueOf(i));
            //0부터 9까지 입력
        }
        //연산 및 00
        Buttons[10] = new JButton("00");
        Buttons[11] = new JButton(".");
        Buttons[12] = new JButton("－");
        Buttons[13] = new JButton("×");
        Buttons[14] = new JButton("÷");
        Buttons[15] = new JButton("±");
        Buttons[16] = new JButton("＝");
        Buttons[17] = new JButton("√");
        Buttons[18] = new JButton("+");
        //Control
        Buttons[19] = new JButton("C");
        Buttons[20] = new JButton("AC");
        Buttons[21] = new JButton("←");
        TextField input = new TextField();
    
        for(int i = 0; i < Buttons.length; i++){
            if(i<12){
                Buttons[i].setForeground(Color.black);
            }else if(i >= 12 && i<19){
                Buttons[i].setForeground(Color.gray);
            }else{
                Buttons[i].setForeground(Color.red);
            }
            
        }
        JPanel CPanel = new JPanel();
        CPanel.setLayout(new GridLayout(4,3));
        JPanel WPanel = new JPanel();
        WPanel.setLayout(new GridLayout(4,1));
        JPanel EPanel = new JPanel();
        EPanel.setLayout(new GridLayout(4,1));
        for(int i = 9; i > 0; i--){
            CPanel.add(Buttons[i]);
        }
        WPanel.add(Buttons[15]); WPanel.add(Buttons[19]);WPanel.add(Buttons[20]);
        CPanel.add(Buttons[0]); CPanel.add(Buttons[10]); CPanel.add(Buttons[11]);
        WPanel.add(Buttons[16]);
        EPanel.add(Buttons[14]);EPanel.add(Buttons[13]);EPanel.add(Buttons[12]);
        EPanel.add(Buttons[18]);
        setLayout(new BorderLayout());
        add(CPanel, BorderLayout.CENTER);
        add(input, BorderLayout.NORTH);
        add(WPanel, BorderLayout.WEST);
        add(EPanel, BorderLayout.EAST);
        setSize(200,200);        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]){
        JFrame f = new calculator();
        f.setVisible(true);
    }



}