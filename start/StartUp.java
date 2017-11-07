//The starting file of the application
package start;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class StartUp extends  GeneralView
{

	public StartUp(int dimX, int dimY)
	{
		super(dimX, dimY);
		this.setTitle("Agenda");

		JMenuBar menuBar;
		JMenu menu ;
		JMenuItem menuItem;

		//Create the menu bar;
		menuBar = new  JMenuBar();

		//Build the first menu;
		menu = new JMenu("Contact");

		//addding the menu to the menu bar
		menuBar.add(menu);

		//adding an item to the new menu
		menuItemNew = new JMenuItem(MenuTools.MENU_CONTACT_NEW);
		//Adds shortcut
		menuItemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		menuItemNew.addActionListener(new MenuActions());
		menu.add(menuItemNew);

		setJMenuBar(menuBar);



		this.setVisible(true);

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StartUp st = new  StartUp(300,200);

	}

}
