package unit_04;

import java.awt.*;

import javax.swing.*;

public class P17_JScrollBar_GUI {

	public static void main(String[] args) {
		
       Scrollbar obj=new Scrollbar();
	}

} 

class Scrollbar extends JFrame
{
	JScrollBar s;
	 
	Scrollbar()
	{
		JScrollBar s=new JScrollBar();
		
		add(s);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
