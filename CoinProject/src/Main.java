import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String s = (String) JOptionPane.showInputDialog(null,
				"How many cents do you have?", "O WOW, SUCH CHANGE, VERY MONEY",
				JOptionPane.PLAIN_MESSAGE, null, null, "");

		// If a string was returned, say so.
		if ((s != null) && (s.length() > 0) && (isInteger(s))) {

			int money = Integer.parseInt(s);

			Coin userInput = new Coin(money);

			JOptionPane.showMessageDialog(null, s + userInput.solve());
		}

		else if (!isInteger(s)) {
			JOptionPane.showMessageDialog(null, "Please enter in a number",
					"Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	public static boolean isInteger(String yolo) {
											// variable names r 2 hard
		// czech's whether or not the input is a string
		// this helps show the user the right message,
		// as well as correct them if they have dun goofed.

		try {
			Integer.parseInt(yolo);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
