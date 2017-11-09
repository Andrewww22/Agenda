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
            Contact  contact = new Contact();

				    Container container = gv.getContentPane();
            int  dim =  contact.attributeKey.length;
				    for(int i = 0 ; i < dim ; i++)
				    {
				          JLabel aTextlabel = new JLabel();
				          aTextlabel.setText("First Name: ");
				          container.add(aTextlabel);
                  if(contact.attributeType[i].equals("text"))
						      {
                      JTextField  aTextField = new JTextField(10);
                      container.add(aTextField, BorderLayout.SOUTH);
                  }
		        }

            return gv;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
