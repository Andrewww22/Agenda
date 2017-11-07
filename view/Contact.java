package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Contact extends ViewTools{



	public Contact(int dimX, int dimY)
	{
		super(dimX,dimY);
		this.setTitle("Contact" +"-Operation");

		Container container = getContentPane();

		JLabel labelText = new JLabel();
		labelText.setText("First Name: ");
		container.add(labelText);

		JTextField field = new JTextField(10);
		container.add(field,BorderLayout.SOUTH);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Contact ct = new Contact(200, 300);
	}

}
