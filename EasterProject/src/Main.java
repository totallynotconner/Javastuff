import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int s = (int) JOptionPane.showConfirmDialog(null,
				"Wanna know when Easter is?");

		if (s == 1) {

			String d = (String) JOptionPane.showInputDialog(null,
					"TOO BAD, ENTER IN A YEAR, PITIFUL USER",
					"EASTER SOLVER 720 NOSCOPE V2.0",
					JOptionPane.QUESTION_MESSAGE);

			int intD = Integer.parseInt(d);

			if (!isInteger(d)) {

				JOptionPane.showMessageDialog(null, "PLEASE ENTER IN A YEAR",
						"Error", JOptionPane.ERROR_MESSAGE);

			}

			else if (intD < 1583) {
				JOptionPane
				.showMessageDialog(
						null,
						"Please enter in a year over 1582 next time, PITIFUL USER",
						"Error", JOptionPane.ERROR_MESSAGE);
			}

			else if (intD > 1582) {

				Date easterYear = new Date(intD);

				// Answer
				JOptionPane.showMessageDialog(null, easterYear.czechEaster());

			}
			

		}

		else if (s == 0) {

			String e = (String) JOptionPane.showInputDialog(null,
					"Thank you for complying, now enter a year, pitiful user",
					"EASTER SOLVER 720 NOSCOPE V2.0",
					JOptionPane.QUESTION_MESSAGE);

			int intE = Integer.parseInt(e);

			if (!isInteger(e)) {

				JOptionPane.showMessageDialog(null, "PLEASE ENTER IN A YEAR",
						"Error", JOptionPane.ERROR_MESSAGE);

			}

			else if (intE < 1583) {
				JOptionPane
				.showMessageDialog(
						null,
						"Please enter in a year over 1582 next time, PITIFUL USER",
						"Error", JOptionPane.ERROR_MESSAGE);
			}

			else if (intE > 1582) {

				Date easterYear2 = new Date(intE);

				// Answer
				JOptionPane.showMessageDialog(null, easterYear2.czechEaster());
			}

		} else if (s == 2) {
			JOptionPane.showMessageDialog(null,
					"PLEASE VISIT US AGAIN FOR 50% OFF YOUR NEXT CALCULATION",
					"SEE YOU LATER, PEASANT", JOptionPane.PLAIN_MESSAGE);
		}
	}

	public static boolean isInteger(String input) {

		// czech's whether or not the input is a string
		// this helps show the user the right message,
		// as well as correct them if they have dun goofed.

		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
