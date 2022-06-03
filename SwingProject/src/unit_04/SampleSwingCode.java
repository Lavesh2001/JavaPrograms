package unit_04; 
import java.util.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SampleSwingCode {

	public static void main(String[] args) {
		
        SwingCode1 obj=new SwingCode1();
	}

} 
class SwingCode1 extends JFrame
{   
	JLabel l1,l2,l3,l4,l5;
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JRadioButton r1,r2;
	SwingCode1()
	{    
		l1=new JLabel("Addition and Subtraction");
		l3=new JLabel("Second Number");
		l2=new JLabel("First Number");
		l4=new JLabel();
		l5=new JLabel();
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("ADD"); 
		b2=new JButton("SUB");  
		
		
		setLayout(null); 
		l1.setBounds(100,20,200,50);
		l2.setBounds(50,40,200,70);
		t1.setBounds(150,70,200,20);
		l3.setBounds(50,100,200,20); 
		t2.setBounds(150,100,200,20);
		b1.setBounds(100,150,100,20);
		b2.setBounds(250,150,100,20); 
		l4.setBounds(100,200,100,20);
		l5.setBounds(100,250,100,20);
		add(l1);
		add(l2); 
		add(t1);
		add(l3);
		add(t2);
		add(b1);
		add(b2);
		add(l4);
		add(l5);
		
		ActionListener al = new ActionListener() {
		
			@Override
		public void actionPerformed(ActionEvent e) {
				int  a1=Integer.parseInt(t1.getText());
	            int  a2=Integer.parseInt(t2.getText());
			
		    if(e.getSource()==b1)
			{
		        Integer sum=a1+a2; 
				l4.setText("Result: "+sum.toString());
					
			}
			if(e.getSource()==b2)
			{
				Integer sub=a1-a2; 
				l5.setText("Result: "+sub.toString());
				
			}
			
		}

	    private JLabel setText(String string) {
		// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		b1.addActionListener(al);
		
		b2.addActionListener(al);
		
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
