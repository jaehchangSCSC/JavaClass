package guipractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
    public String click = new String("");
    public int ANS = 0;
    public int buttonsetter = 0;
    public calculator() {
        setTitle("Calculator");
        TextField calinput = new TextField();
        TextField result = new TextField();
        Container pane = getContentPane();
        JButton[] Buttons = new JButton[22];
        for(int i = 0; i<=9; i++){
            Buttons[i] = new JButton(String.valueOf(i));
            //0부터 9까지 입력
            Buttons[i].setFont(new Font(null, Font.PLAIN, 10));
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
        //TextField calinput = new TextField("INPUT AREA");
        //TextField result = new TextField("RESULT AREA");
        //버튼 입력부분 시작(노가다)
        Buttons[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[0].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[1].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[2].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[3].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[4].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[5].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[6].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[7].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[8].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[9].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[10].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[11].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[11].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[12].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[12].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[13].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[13].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[14].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[14].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[15].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                //Result에서 맨 앞 부호 바꿔주기
            }
        });
        Buttons[16].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                result.setText("결과");
            }
        });
        Buttons[17].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[17].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[18].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[18].getLabel();
                calinput.setText(click);
            }
        });
        Buttons[19].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click = "";
                calinput.setText(click);
            }
        });
        Buttons[20].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ANS = 0;
                click = "";
                calinput.setText(click);
                result.setText("");
            }
        });
        Buttons[21].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click = click.substring(0,click.length()-2);
                calinput.setText(click);
            }
        });

        //버튼 입력 부분 끝
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
        for(int i = 0; i <= 9; i++){
            CPanel.add(Buttons[i]);
        }
        JPanel NPanel = new JPanel();
        NPanel.setLayout(new GridLayout(2,1));
        NPanel.add(calinput); NPanel.add(result);
        WPanel.add(Buttons[15]); WPanel.add(Buttons[19]);WPanel.add(Buttons[20]);
        CPanel.add(Buttons[0]); CPanel.add(Buttons[10]); CPanel.add(Buttons[11]);
        WPanel.add(Buttons[16]);
        EPanel.add(Buttons[14]);EPanel.add(Buttons[13]);EPanel.add(Buttons[12]);
        EPanel.add(Buttons[18]);
        setLayout(new BorderLayout());
        add(CPanel, BorderLayout.CENTER);
        add(NPanel, BorderLayout.NORTH);
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


//click += "1";
//input.setText(click);
//click += "2";
//input.setText(click);