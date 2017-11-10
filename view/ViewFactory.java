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
			   Contact  contact = new Contact();
			   gv.setTitle( who +"-Operation");


				//Container container = gv.getContentPane();
			   	JPanel container= new JPanel();
				gv.setContentPane(container);
				gv.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));




				int  dim =  contact.attributeKey.length;
				for(int i = 0 ; i < dim ; i++)
				{
						JPanel aPanel = new JPanel();

						JLabel aTextLabel = new JLabel();
						aTextLabel.setText(contact.attributeLabel[i]);
						aPanel.add(aTextLabel);


						//container.add(aTextLabel);

						if(contact.attributeType[i].equals("text"))
						{
							JTextField  aTextField = new JTextField(10);
							aPanel.add(Box.createHorizontalStrut(40));
							aPanel.add(aTextField);
							//container.add(aTextField, BorderLayout.SOUTH);
						}

						container.add(aPanel);
						gv.pack();
				}
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
