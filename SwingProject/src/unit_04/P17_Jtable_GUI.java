package unit_04;

import java.awt.*;
import javax.swing.*;

public class P17_Jtable_GUI {

	public static void main(String[] args) {
		
      table obj=new table();
	}

} 
class table extends JFrame
{
	JTable jt1;
	
	table()
	{   
		String[][] data = {{"1","Lavesh","@gmail.com"},{"2","Harsh","@gmail.com"},{"3","Akash","@gmail.com"}};
        String[] column = {"Id","Name","Email"};
        
        jt1 = new JTable(data,column);
        
        add(jt1);
        
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
