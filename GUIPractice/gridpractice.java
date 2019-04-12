package guipractice;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gridpractice
{
	JFrame jFrame = new JFrame("gridpractice");
	JButton [] btn = new JButton [20]; 
	
	public gridpractice()
    {
		jFrame.setLayout(new GridLayout(3,2));
		Container container = jFrame.getContentPane();
		
		for(int i=0; i < btn.length; i++)
		{
			btn[i] = new JButton( i + "");
			container.add(btn[i]);
		}
		
		jFrame.setSize(500,500);
		
		jFrame.setVisible(true);
		
		//종료버튼에 대한 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
    }

	public static void main(String[] args)
	{
		new gridpractice();
	}

}