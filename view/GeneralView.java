package view;

import javax.swing.JFrame;

public class GeneralView extends JFrame{

		int startX=300;
		int startY = 300;
		//int dim = 300;


		public GeneralView(int dimX, int dimY )
		{
			this.setBounds(startX, startY, dimX, dimY);


			this.setVisible(true);

		}



}
