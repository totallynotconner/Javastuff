public class Coin {

	private int cents;

	public Coin(int c) {

		cents = c;

	}

	public String solve() {

		// quarter
		int q = 0;
		// dime
		int d = 0;
		// nickel
		int n = 0;
		// penny
		int p = 0;

		// How many quarters are left
		q = cents / 25;
		cents -= q * 25; // Subtracts those quarters so you can move on

		// How many dimes are left
		d = cents / 10;
		cents -= d * 10; // Subtracts those dimes so you can move on

		// How many nickels are left
		n = cents / 5;
		cents -= n * 5; // Subtracts those nickels so you can move on

		p = cents; //Whatever you've got left is your pennies

		return " cents => \n" + " Quarter(s)     " + q + "\n Dime(s)          " + d
				+ "\n Nickel(s)        " + n + "\n Penny(s)        " + p;

	}

}
