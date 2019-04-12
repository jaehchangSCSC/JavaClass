package guipractice;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
public class graphicpractice
{
	//컴포넌트 생성
	JFrame jFrame = new JFrame("Title");
	JButton btn1 = new JButton("1"), btn2 = new JButton("2"),
	btn3 = new JButton("3"), btn4 = new JButton("4"),
	btn5 = new JButton("5");
	
	public graphicpractice()
	{
		Container container = jFrame.getContentPane();
	
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		container.add(btn3, BorderLayout.WEST);
		container.add(btn4, BorderLayout.SOUTH);
		container.add(btn5, BorderLayout.CENTER);
		
		jFrame.setSize(300, 300);
		
		jFrame.setVisible(true);
		
		//종료 버튼 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args)
	{
		//실행
		new graphicpractice();
	}

}