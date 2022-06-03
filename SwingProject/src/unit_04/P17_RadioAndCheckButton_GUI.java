package unit_04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class P17_RadioAndCheckButton_GUI {

	public static void main(String[] args) {
		
		RadioAndCkeckButton obj=new RadioAndCkeckButton();
	}

}

class RadioAndCkeckButton extends JFrame
{    
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox c1;
	JCheckBox c2;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	
	
	RadioAndCkeckButton()
	{
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		c1 = new JCheckBox("Dancer!");
		c2 = new JCheckBox("Singer!"); 
		
		
		l1 = new JLabel("Result");
		l2 = new JLabel("Result");
		l3 = new JLabel("Result");
		l4 = new JLabel("Result");
		
		add(r1);
		add(r2);
		
		add(c1);
		add(c2);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		 
		ButtonGroup bt = new ButtonGroup();
		bt.add(c1);
		bt.add(c2); 
		
		ActionListener al = new ActionListener(){ 
			
			public void actionPerformed(ActionEvent e) 
			{
			if(r1.isSelected()) {
				l1.setText("It is Male");
			}
			
			if(r2.isSelected()) {
				l2.setText("It is Female");
			}
			
			if(c1.isSelected()) {
				l3.setText("is a Dancer!");
			}
			
			if(c2.isSelected()) {
				l4.setText("is a Singer!");
			}
			
		} 
		};
		r1.addActionListener(al);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
