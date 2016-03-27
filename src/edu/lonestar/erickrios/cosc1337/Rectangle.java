/**
 * 
 */
package edu.lonestar.erickrios.cosc1337;

/**
 * @author erick
 *
 */
public class Rectangle {
	/**rectangle width*/
	private double width;
	/** rectangle length*/
	private double length;
	
	/**Constructor
	 * 
	 * @param width-The rectangle's width
	 * @param length-The rectangle's length
	 */
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double getArea(){
		return .5 * (width * length);
	}
	
	/**
	 * 
	 */
	@Override
	public String toString(){
		return String.format("Rectangle width = %f\nRectangle length = %f\nRectangle area = %f",
				width, length, getArea());
	}

}
