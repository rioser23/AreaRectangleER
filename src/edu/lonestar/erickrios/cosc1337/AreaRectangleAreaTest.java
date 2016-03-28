package edu.lonestar.erickrios.cosc1337;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Class used to test the getArea method for proper output
 * @author erick
 *
 */
public class AreaRectangleAreaTest {

	@Test
	public void testGetArea() {
		Rectangle rect= new Rectangle(5.0,10.0);
		assertEquals(50.0,rect.getArea(), .000001);
	}

}
