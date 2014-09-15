import java.awt.Color;

import gpdraw.DrawingTool;
import gpdraw.SketchPad;

/**
 * 
 * @author Conner Peterson
 * @version 9/12/14 Draws a sphere on a 2D plane
 *
 */

public class DrawnSphere {

	private double myX; // the x coordinate of the sphere
	private double myY; // the y coordinate of the sphere
	private double myZ; // the z coordinate of the sphere
	private double myRadius; // the radius of the sphere

	/**
	 * Creates nothing
	 * 
	 * @param none
	 * 
	 * @pre No arguments
	 * 
	 * @post all fields are set to 0.0
	 */
	public DrawnSphere() {
		myX = 0.0;
		myY = 0.0;
		myZ = 0.0;
		myRadius = 0.0;
	}

	/**
	 * Creates a new Sphere object
	 * 
	 * @param x
	 *            double that represents x
	 * @param y
	 *            double that represents y
	 * @param z
	 *            double that represents x
	 * @param radius
	 *            double that represents radius
	 * 
	 * @pre must all be positive and initialized
	 * @post sets all fields to what's inputted
	 */
	public DrawnSphere(double x, double y, double z, double radius) {

		myX = x;
		myY = y;
		myZ = z;
		myRadius = radius;

	}

	/**
	 * Calculates and returns a double of the sphere's surface area
	 * 
	 * @return double sphere's surface area
	 */
	public double getSurfaceArea() {

		return 4.0 * Math.PI * (myRadius * myRadius);

	}

	/**
	 * Calculate sphere volume
	 * 
	 * @return double sphere's volume
	 */
	public double getVolume() {
		return 4.0 / 3.0 * Math.PI * (myRadius * myRadius * myRadius);
	}

	/**
	 * Names sphere accordingly
	 * 
	 * Leaves the marker's color and moves it to a weird place in the down
	 * position
	 * 
	 * @param marco
	 *            Initialized DrawingTool
	 * @param name
	 *            a String with the sphere's name
	 **/
	public void nameSphere(DrawingTool marco, String name) {

		int randomInt = (int) (Math.random() * 6);

		marco.up();
		marco.move(myX + myRadius, myY + myRadius + 10);
		marco.down();

		if (randomInt == 0) {
			marco.setColor(Color.yellow);
			marco.drawString(name + ", the Unreadable");

		} else if (randomInt == 1) {
			marco.setColor(Color.pink);
			marco.drawString(name + ", Destroyer of Worlds");

		} else if (randomInt == 2) {
			marco.setColor(Color.red);
			marco.drawString(name + " the Victorious");

		} else if (randomInt == 3) {
			marco.setColor(new Color(128, 0, 128));
			marco.drawString(name + ", of the Pygmy Hippopotami");

		} else if (randomInt == 4) {
			marco.setColor(new Color(255, 235, 205));
			marco.drawString(name + ", of the Blanched Almonds");

		} else if (randomInt == 5) {
			marco.setColor(Color.MAGENTA);
			marco.drawString(name + ", the not-quite-purple");

		} else if (randomInt == 6) {
			marco.drawString(name + " the Boring");

		}

	}

	/**
	 * Sets the color of the sphere so the marker draws it that way.
	 * 
	 * @param marco
	 *            an initialized DrawingTool
	 * @parama sphereColor a color
	 * 
	 * @post sets marker to inputed color
	 **/
	public void setSphereColor(DrawingTool marco, Color sphereColor) {

		marco.setColor(sphereColor);

	}

	/**
	 * Makes your sphere's radius larger
	 * 
	 * @param large
	 *            a double that gets added to radius
	 * @post myRadius gets bigger
	 * 
	 */
	public void embiggen(double large) {

		myRadius += large;

	}

	/**
	 * Draws a sphere on whatever you call it on.
	 * 
	 * @param marco
	 *            an intialized DrawingTool
	 * 
	 * @pre needs an initialized DrawingTool
	 * 
	 * @post the color ends at (0,0,0) and the marco is at (myX,myY)
	 **/
	public void draw(DrawingTool marco) {

		int R = 255, G = 255, B = 255;
		int temp = 1;
		int shaderInt = 1;
		Integer tempRadius = (int) myRadius;
		int color = tempRadius / 255;
		marco.move(myX, myY);

		/*
		 * This works, but isn't as pretty marco.turn(270); marco.up();
		 * marco.move(myX, myY); marco.down(); marco.drawCircle(myRadius);
		 * marco.turn(180); marco.drawOval(myRadius * 2, myRadius * .5);
		 */

		for (int i = 1; i <= myRadius * 100 && R <= 255 && R >= 0; i++) {
			marco.setColor(new Color(R * color, G * color, B * color));
			marco.drawCircle(tempRadius--);
			R--;
			G--;
			B--;

		}

	}

}
