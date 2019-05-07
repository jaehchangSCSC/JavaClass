package calculator;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calmain extends JFrame{
    public static void main(String args[]){

    }  //end of main
    public String click;
    public String operation;
    public double double_num;
    // 연산시 사용 변수
    public double ANS = 0;
    public double first = 0;
    public double second = 0;
    public boolean second_typed = false;
    public double temp = 0;
    public double memory = 0;
    public int buttonsetter = 0;
    public boolean onedecimal = false;
    public boolean operator = false;
    public boolean constant = false;

    public calmain(){
        setTitle("Calculator");
        String click = "0";
        //TextField초기화
        JTextField calinput = new JTextField(click);
        calinput.setHorizontalAlignment(JTextField.RIGHT);
        calinput.setFont(new Font(null, Font.PLAIN, 25));
        calinput.setEditable(false);
        


    } //end of calmain

    //Number Buttons
    public class calbuttons extends JButton implements ActionListener{
        public calbuttons(String label) {
            setLabel(label);
            
            addActionListener(this);
        } 
        void doAction(){
            String key = this.getLabel();
            
        }
    
        @Override
        public void actionPerformed(ActionEvent event){
            doAction();
        }
    } //end of calbutton

    //Clear Buttons
    public class ClearButton extends calbuttons{
        public ClearButton(String label) {
            super(label);
        }
        @Override
        void doAction(){
            
        }
    }  //end of ClearButton

    //Operation Buttons (이 버튼 안에 Constant기능을 넣어야한다)
    public class OperationButton extends calbuttons{
        public OperationButton(String label){
            super(label);
        }
        @Override
        void doAction(){

        }
    } //end of OperationButton

    //Memory Buttons (Memory버튼 안에도 등호처럼 계산할 수 있는 기능이 필요하다)
    public class MemoryButton extends calbuttons{
        public MemoryButton(String label){
            super(label);
        }
        @Override
        void doAction(){

        }
    } //end of Memory Buttons
    
    //Sign Change Buttons
    public class SignChange extends calbuttons{
        public SignChange(String label){
            super(label);
        }
        @Override
        void doAction(){

        }
    } //end of SignChange

}