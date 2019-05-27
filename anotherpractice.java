import java.io.*;
import java.net.*;
import javax.swing.*;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anotherpractice extends JFrame implements ActionListener{
    public anotherpractice(){
        //입력된 값 및 산출 값 표시
        setTitle("Click");
        JTextArea outgoing = new JTextArea();
        setLayout(new BorderLayout());

        JButton Button = new JButton("send");
        Button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    Socket sock = new Socket("127.0.0.1", 5000);
                    PrintWriter writer = new PrintWriter(sock.getOutputStream());
                    System.out.println("networking established");
                    writer.println(outgoing.getText());
                    writer.flush();
                } catch(IOException ex){
                    ex.printStackTrace();
                }
            }
        });
        add(outgoing, BorderLayout.NORTH);
        add(Button, BorderLayout.SOUTH);
        setSize(300,300);

    }
    public static void main(String args[]){
        JFrame f = new anotherpractice();
        f.setVisible(true);
    }
}