package unit_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_SwingInJava{

	public static void main(String[] args) {

		SwingCode2 obj = new SwingCode2();

	}

}

class SwingCode2 extends JFrame {
	
	
	JTextArea tf1;

	JTextField t1;
	JTextField t2;

	JButton b1;
	JButton b2;

	JLabel l1;
	
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	
	JList list;
	JComboBox jb1;
	
	JTable jt1;
      SwingCode2() {
		
		tf1 = new JTextArea(10,30);

		t1 = new JTextField(20);
		t2 = new JTextField(20);

		b1 = new JButton("sum");
		b2 = new JButton("sub");

		l1 = new JLabel("Result");
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		c1 = new JCheckBox("Dancer!");
		c2 = new JCheckBox("Singer!");
		
		
		
		
		//String array to store weekdays
        String week[]= { "Monday","Tuesday","Wednesday",
                         "Thursday","Friday","Saturday","Sunday"};
		
		
        String[][] data = {{"1","Akash","@gmail.com"},{"2","Aki","@gmail.com"},{"3","Chauhan","@gmail.com"}};
        String[] column = {"Id","Name","Email"};
        
        
        list = new JList(week);
		
		jb1 = new JComboBox<>(week);
		
		jt1 = new JTable(data,column);

		add(tf1);
		add(t1);
		add(t2);
		
		add(r1);
		add(r2);
		
		add(c1);
		add(c2);
		
		//add(list);
		add(jb1);
		
		add(jt1);
		
		add(b1);
		add(b2);
		add(l1);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int a1 = Integer.parseInt(t1.getText());
				int a2 = Integer.parseInt(t2.getText());
				
				
				String text = tf1.getText();
				
				
				if(e.getSource() == b1) {

					Integer sum = a1 + a2;
					l1.setText(sum.toString());

				}
				
				if(e.getSource() == b2) {

					Integer sum = a1 - a2;
					l1.setText(sum.toString());

				}
				
				if(r1.isSelected()) {
					l1.setText("It is Male");
				}
				
				if(r2.isSelected()) {
					l1.setText("It is Female");
				}
				
				if(c1.isSelected()) {
					l1.setText("is a Dancer!");
				}
				
				if(c2.isSelected()) {
					l1.setText("is a Singer!");
				}
				
				if(list.getSelectedIndex() != -1) {
					l1.setText("Data: " + list.getSelectedValue());
				}
				
				if(jb1.getSelectedIndex() != -1) {
					l1.setText("Data: " + jb1.getSelectedItem());
				}


			}
		};


		// Logic on b1
		b1.addActionListener(al);

		// Logic on b2
		b2.addActionListener(al);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}