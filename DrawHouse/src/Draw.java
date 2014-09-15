import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Draw {

	public static void main(String[] args) {

		House home = new House();
		Benzene chemical = new Benzene(90, 120);

		Object[] options = { "House", "Benzene" };

		int n = JOptionPane.showOptionDialog(null,
				"What do you want to draw?",
				"StuffDrawer",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,     //do not use a custom Icon
				options,  //the titles of buttons
				options[0]); //default options
		
		if (n == 0)
			home.drawHouse();

		else if (n == 1)
			chemical.drawBenzene();

	}

}
