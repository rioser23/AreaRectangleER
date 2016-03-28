/**
 * 
 */
package edu.lonestar.erickrios.cosc1337;

/**
 * @author erick
 *
 */
public class Rectangle {
	/** rectangle width */
	private double width;
	/** rectangle length */
	private double length;

	/**
	 * Constructor
	 * 
	 * @param width-The
	 *            rectangle's width
	 * @param length-The
	 *            rectangle's length
	 */
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	/**
	 * Accessor for the width field
	 * 
	 * @return width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * Accessor for the length field
	 * 
	 * @return length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * Method to calculate rectangle area
	 * 
	 * @return the area
	 */
	public double getArea() {
		return (width * length);
	}

	/**
	 * toString method to format output display
	 */
	@Override
	public String toString() {
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f", width, length,
				getArea());
	}

}
