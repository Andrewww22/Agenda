package view;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;

//The ViewFacctory is a factory that makes views, it replaces manually making
// classes for each bean, reducing duplicate code
public class ViewFactory
{

   public ViewFactory()
   {}
  //createView creates views with based on the who input
  public GeneralView createView(String who)
  {
    GeneralView gv = new GeneralView(100,100);
    if (who.equals("Contact") )
		   {
			   gv.setTitle( who +"-Operation");

				Container container = gv.getContentPane();

				JLabel labelText = new JLabel();
				labelText.setText("First Name: ");
				container.add(labelText);

				JTextField field = new JTextField(10);
				container.add(field,BorderLayout.SOUTH);
		   }

    return gv;
  }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
