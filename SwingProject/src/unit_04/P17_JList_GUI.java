package unit_04;

import java.awt.*;

import javax.swing.*;

public class P17_JList_GUI {

	public static void main(String[] args) {
		
        list obj=new list();
    }

} 
class list extends JFrame
{   
	JList list1;
	
	list()
	{   
		//String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
        
        list1 = new JList(week);
        
        add(list1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
