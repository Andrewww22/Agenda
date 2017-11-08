package start;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import start.MenuTools;
import view.GeneralView;
import view.ViewFactory;

public class MenuActions implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {



		if(e.getActionCommand() == MenuTools.MENU_CONTACT_NEW)
		{

			//System.out.println(e);
			//Contact ct = new Contact(200,200);
			ViewFactory vf = new ViewFactory();
			GeneralView gv = vf.createView("Contact");
		}


	}

}
