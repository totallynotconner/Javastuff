import java.awt.Color;

import gpdraw.*;

public class DrawnRectangle {

	private double myX; // the x coordinate of the rectangle
	private double myY; // the y coordinate of the rectangle
	private double myWidth; // the width of the rectangle
	private double myHeight; // the height of the rectangle

	/**
	 * Creates a default instance of a Rectangle object with all dimensions set
	 * to zero.
	 * 
	 * @pre must be empty
	 * @param none
	 * 
	 * 
	 **/
	public DrawnRectangle() {
		myX = 0.0;
		myY = 0.0;
		myWidth = 0.0;
		myHeight = 0.0;

	}

	/**
	 * Creates a new instance of a Rectangle object with the left and right
	 * edges of the rectangle at x and x + width. The top and bottom edges //
	 * are at y and y + height.
	 * 
	 * @pre needs to be intialized positive
	 * @param x
	 *            represents x
	 * @param y
	 *            represents y
	 * @param width
	 *            represents width
	 * @param height
	 *            represents height
	 * 
	 * @post intializes all these to my fields
	 **/
	public DrawnRectangle(double x, double y, double width, double height) {

		myX = x;
		myY = y;
		myWidth = width;
		myHeight = height;

	}

	/**
	 * Calculates and returns the perimeter of the rectangle
	 * 
	 * @return double the perimeter of of your sphere
	 **/
	public double getPerimeter() {

		return 2 * (myWidth + myHeight);

	}

	/**
	 * Calculates and returns the area of your rectangle
	 * 
	 * @return double your rektangle's area
	 */
	public double getArea() {
		return myWidth * myHeight;

	}

	/**
	 * Draws a new instance of a Rectangle object with the left and right edges
	 * of the rectangle at x and x + width. The top and bottom edges are at y
	 * and y + height.
	 * 
	 * @pre an intialized DrawingTool
	 * @param marco
	 *            an initialized DrawingTool
	 * @post leaves your DrawingTool up and at myX,myY
	 * 
	 */
	public void draw(DrawingTool marco) {

		marco.up();
		marco.move(myX, myY);
		marco.down();
		marco.drawRect(myWidth, myHeight);
		marco.up();
	}

	/**
	 * Names your rectangle
	 * 
	 * @param marco
	 *            an initialized DrawingTool
	 * @param name
	 *            a string with the rectangle's name
	 * @post leaves your DrawingTool up and at myX,myY
	 */
	public void nameRect(DrawingTool marco, String name) {

		int randomInt = (int) (Math.random() * 6);

		marco.up();
		marco.move(myX - myX, myY);
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

}