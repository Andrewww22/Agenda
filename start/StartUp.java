//The starting file of the application
package start;

import javax.swing.JFrame;

public class StartUp extends  JFrame{

	int startX=300;
	int startY = 300;
	int dim = 300;
	
	public StartUp(int startX, int startY , int dim) 
	{
		this.setBounds(startX, startY, startX+dim, startY+dim);
		this.setTitle("Agenda");
		this.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StartUp st = new  StartUp(100, 200, 300);

	}

}
