public class Date {

	private int y;
	
	public Date(int year) {
		
		y = year;
		
	}
	
	
	public String czechEaster() {

		int a, b, c, d, e, f, g, h, i, k, r, m, n, p;
		
		a = y % 19;
		b = y / 100;
		c = y % 100;
		d = b / 4;
		e = b % 4;
		f = (b + 8) / 25;
		g = (b - f + 1) / 3;
		h = (19 * a + b - d- g + 15) % 30;
		i = c / 4;
		k = c % 4;
		r = (32 + 2 * e + 2 * i - h - k) % 7;
		m = (a + 11 * h + 22 * r)/451;
		n = (h + r - 7 * m + 114) / 31;
		p =  (h + r - 7 * m + 114) % 31;

		return "a = " + a + "\n b = " + b + "\n c = " + c + "\n d = " + d + "\n e = " + e
				+ "\n f = " + f + "\n g = " + g + "\n h = " + h + "\n i = " + i + "\n r = "
				+ r + "\n k = " + k + "\n m = " + m + "\n n = " + n
				+  "\n p = " + p + "\n \n Easter in " + y + " falls on " + n + "/" + (p+1);

	}

}
