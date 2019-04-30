package guipractice;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends JFrame implements ActionListener{
    public String click = new String("");
    public String operation;
    //연산시 사용 변수
    public double ANS = 0;
    public double first = 0;
    public double second = 0;
    public boolean secondtyped = false;

    public double temp = 0;
    public double memory = 0;

    public int buttonsetter = 0;

    public boolean onedecimal = false;
    public boolean operator = false;
    public boolean double_operator = false;


    public calculator() {
        setTitle("Calculator");
        JTextField calinput = new JTextField();
        calinput.setHorizontalAlignment(JTextField.RIGHT);
        calinput.setFont(new Font(null, Font.PLAIN, 28));
        calinput.setEditable(false);
        Container pane = getContentPane();
        JButton[] Buttons = new JButton[26];
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
        //Memory
        //Memory Return
        Buttons[22] = new JButton("MR");
        //Memory Clear
        Buttons[23] = new JButton("MC");
        //Memory plus
        Buttons[24] = new JButton("M+");
        //Memory minus
        Buttons[25] = new JButton("M-");
        //calinput => "INPUT AREA"
        //result => "RESULT AREA"

        //버튼 입력부분 시작
        //숫자 0
        Buttons[0].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(click == "0"){
                    calinput.setText(click);
                }else{
                    click += Buttons[0].getLabel();
                    if(operator == true){
                        second = Double.parseDouble(click);
                        secondtyped = true;
                    }else{
                        first = Double.parseDouble(click);
                    }
                    calinput.setText(click);
                }
            }
        });
        //숫자 1
        Buttons[1].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[1].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 2
        Buttons[2].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[2].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 3
        Buttons[3].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[3].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 4
        Buttons[4].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[4].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 5
        Buttons[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[5].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 6
        Buttons[6].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[6].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 7
        Buttons[7].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[7].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 8
        Buttons[8].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[8].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //숫자 9
        Buttons[9].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[9].getLabel();
                if(operator == true){
                    second = Double.parseDouble(click);
                    secondtyped = true;
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //two zeros
        Buttons[10].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(click.length() == 0){
                    click += "0";
                    if(operator == true){
                        second = Double.parseDouble(click);
                        secondtyped = true;
                    }else{
                        first = Double.parseDouble(click);
                    }
                    calinput.setText(click);
                onedecimal = true;
                }else if(click == "0"){
                    return;
                }else{
                    click += Buttons[10].getLabel();
                    if(operator == true){
                        second = Double.parseDouble(click);
                        secondtyped = true;
                    }else{
                        first = Double.parseDouble(click);
                    }
                    calinput.setText(click);
                    onedecimal = true;
                }
            }
        });
        //decimal point
        Buttons[11].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(onedecimal == false){
                    if(click.length() == 0){
                        click = "0";
                    }
                    click += Buttons[11].getLabel();
                    if(operator == true){
                        second = Double.parseDouble(click);
                        secondtyped = true;
                    }else{
                        first = Double.parseDouble(click);
                    }
                    calinput.setText(click);
                    onedecimal = true;
                }
            }
        });
        //minus
        Buttons[12].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(operator == true && secondtyped == false){
                    double_operator = true;
                    operation = "--";
                }else if (operator == true && secondtyped == true){
                    ANS = first - second;
                    first = ANS;
                    second = 0;
                    secondtyped = false;
                    operation = "";
                    click = ANS + "";
                    calinput.setText(click);
                    click = "";
                }else{
                    operator = true;
                    click = "";
                    operation ="-";
                }
            }
        });
        //multiply
        Buttons[13].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(operator == true && secondtyped == false){
                    double_operator = true;
                    operation = "**";
                }else if (operator == true && secondtyped == true){
                    ANS = first * second;
                    first = ANS;
                    second = 0;
                    secondtyped = false;
                    click = ANS + "";
                    operation = "";
                    calinput.setText(click);
                    click = "";
                }else{
                    operator = true;
                    click = "";
                    operation ="*";
                }
            }
        });
        //divide
        Buttons[14].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(operator == true && secondtyped == false){
                    double_operator = true;
                    operation = "//";
                }else if (operator == true && secondtyped == true){
                    if(second == 0){
                        click = "ERROR";
                        calinput.setText(click);
                        click = "";
                        operator = false;
                        operation = "";
                        first = 0;
                        second = 0;
                        secondtyped = false;
                        
                    }else{
                        ANS = first / second;
                        first = ANS;
                        second = 0;
                        secondtyped = false;
                        click = ANS + "";
                        operation = "";
                        calinput.setText(click);
                        click = "";
                    }  
                }else{
                    operator = true;
                    click = "";
                    operation ="/";
                }
            }
        });
        //sign changer
        Buttons[15].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                //Result에서 맨 앞 부호 바꿔주기
            }
        });
        //equal
        Buttons[16].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //여태 들어간 click을 후위로 변환하고 계산
                if(operator = false){
                }else if(operator = true){
                    switch(operation){
                        case "+":
                            if(secondtyped = false){
                                second = first;
                            }
                            ANS = first + second;
                            first = ANS;
                            second = 0;
                            secondtyped = false;
                            click = ANS + "";
                            operator = false;
                            operation = "";
                            calinput.setText(click);
                            click = "";
                            break;
                        case "-":
                            if(secondtyped = false){
                                second = first;
                            }
                            ANS = first - second;
                            first = ANS;
                            second = 0;
                            secondtyped = false;
                            click = ANS + "";
                            operator = false;
                            operation = "";
                            calinput.setText(click);
                            click = "";
                            break;
                        case "*":
                            if(secondtyped = false){
                                second = first;
                            }
                            ANS = first * second;
                            first = ANS;
                            second = 0;
                            secondtyped = false;
                            click = ANS + "";
                            operation = "";
                            operator = false;
                            calinput.setText(click);
                            click = "";
                            break;
                        case "/":
                            if(secondtyped = false){
                                second = first;
                            }
                            if(second == 0){
                                click = "ERROR";
                                calinput.setText(click);
                                click = "";
                                operator = false;
                                first = 0;
                                second = 0;
                                secondtyped = false;
                                operation = "";
                                operator = false;
                            }else{
                                ANS = first / second;
                                first = ANS;
                                second = 0;
                                secondtyped = false;
                                click = ANS + "";
                                operation = "";
                                operator = false;
                                calinput.setText(click);
                                click = "";
                            }  
                            break;
                        default:
                            break;
                    }
                }else if(double_operator = true){
                    switch(operation){
                        case "++":
                            if(secondtyped = false){
                                second = first;
                            }
                            ANS = first + second;
                            first = ANS;
                            click = ANS + "";
                            calinput.setText(click);
                            click = "";
                            break;
                        case "--":
                            if(secondtyped = false){
                                second = first;
                            }    
                            ANS = first - second;
                            first = ANS;
                            click = ANS + "";
                            calinput.setText(click);
                            click = "";
                            break;
                        case "**":
                            if(secondtyped = false){
                                second = first;
                            }
                            ANS = first * second;
                            first = ANS;
                            click = ANS + "";
                            calinput.setText(click);
                            click = "";
                            break;
                        case "//":
                            if(secondtyped = false){
                                second = first;
                            }
                            if(second == 0){
                                click = "ERROR";
                                calinput.setText(click);
                                click = "";
                                operator = false;
                                first = 0;
                                second = 0;
                                secondtyped = false;
                                operation = "";
                                operator = false;
                            }else{
                                ANS = first / second;
                                first = ANS;
                                click = ANS + "";
                                calinput.setText(click);
                                click = "";
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        });
        //root
        Buttons[17].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click += Buttons[17].getLabel();
                calinput.setText(click);
            }
        });
        //plus
        Buttons[18].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(operator == true && secondtyped == false){
                    double_operator = true;
                    operation = "++";
                }else if (operator == true && secondtyped == true){
                    ANS = first + second;
                    first = ANS;
                    second = 0;
                    secondtyped = false;
                    click = ANS + "";
                    operation = "";
                    calinput.setText(click);
                    click = "";
                }else{
                    operator = true;
                    click = "";
                    operation ="+";
                }
            }
        });
        //Clear
        Buttons[19].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click = "";
                onedecimal = false;
                calinput.setText(click);
            }
        });
        //All Clear
        Buttons[20].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ANS = 0;
                first = 0;
                second = 0;
                operation = "";
                operator = false;
                double_operator = false;
                click = "";
                onedecimal = false;
                calinput.setText(click);
            }
        });
        //Delete one digit
        Buttons[21].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(click.length() != 0){
                    click = calinput.getText();
                    click = click.substring(0, click.length()-1);
                }else{
                    click = "0";
                }
                if(secondtyped = true){
                    second = Double.parseDouble(click);
                }else{
                    first = Double.parseDouble(click);
                }
                calinput.setText(click);
            }
        });
        //Memory 
        //MR
        Buttons[22].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                click = memory + "";
                calinput.setText(click);
                click = "";
            }
        });
        //Memory Clear
        Buttons[23].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                memory = 0;
            }
        });
        //Memory Plus
        Buttons[24].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                memory += first;
                first = 0;
                click = "";
            }
        });
        //Memory Minus
        Buttons[25].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                memory -= first;
                first = 0;
                click = "";
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
        CPanel.setLayout(new GridLayout(5,3));
        JPanel WPanel = new JPanel();
        WPanel.setLayout(new GridLayout(5,1));
        JPanel EPanel = new JPanel();
        EPanel.setLayout(new GridLayout(5,1));
        WPanel.add(Buttons[21]); CPanel.add(Buttons[22]); CPanel.add(Buttons[23]); CPanel.add(Buttons[24]);
        EPanel.add(Buttons[25]);
        for(int i = 0; i <= 9; i++){
            CPanel.add(Buttons[i]);
        }
        JPanel NPanel = new JPanel();
        NPanel.setLayout(new GridLayout(1,1));
        NPanel.add(calinput);
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
        setSize(300,300);        

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