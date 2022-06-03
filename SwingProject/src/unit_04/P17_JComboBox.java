package unit_04;
import java.awt.*;
import javax.swing.*;
public class P17_JComboBox {

	public static void main(String[] args) {
		
       ComboBox obj=new ComboBox();
	}

} 
class ComboBox extends JFrame
{   
	JComboBox jb1;
	ComboBox()
	{   
		//String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
        jb1 = new JComboBox<>(week);
        add(jb1);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
