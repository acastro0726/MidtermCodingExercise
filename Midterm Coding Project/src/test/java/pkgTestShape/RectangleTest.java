package pkgTestShape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pkgShape.*;

public class RectangleTest {

	public RectangleTest() 
	{

	}

	@Test
	public void testGetiWidth() throws Exception
	{
		Rectangle recTest = new Rectangle(3, 6);
		assertEquals(recTest.getiWidth() == 3);
	}
	
	
	@Test
	public void testSetiWidth1() throws Exception
	{
		Rectangle recTest = new Rectangle(2, 3);
		recTest.setiWidth(3);
		assertEquals(recTest.getiWidth(), 3);
	}
	
	
	@Test
	(expected = IllegalArgumentException.class)
	public void TestSetiWidth2() throws Exception
	{
		Rectangle recTest = new Rectangle(-5, 4);
		recTest.setiWidth(4);
	}
	
	@Test
	public void testGetiLength() throws Exception
	{
		Rectangle recTest = new Rectangle(2, 7);
		assertEquals(recTest.getiLength() == 7);
	}
	
	@Test
	public void testSetiLength1() throws Exception
	{
		Rectangle recTest = new Rectangle(4, 8);
		recTest.setiLength(8);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void testSetiLength2() throws Exception
	{
		Rectangle recTest = new Rectangle(5, -8);
	}
	
	@Test
	public void testRectArea() throws Exception
	{
		Rectangle rec = new Rectangle(5, 10);
		assertEquals(rec.area() == 50);
	}
	
	@Test
	public void testPerimeter() throws Exception
	{
		Rectangle rec2 = new Rectangle(3, 4);
		assertEquals(rec2.perimeter() == 14);
	}
	
	@Test
	public void testCompareTo1() throws Exception
	{
		Rectangle rec3 = new Rectangle(3, 4);
		Rectangle rec4 = new Rectangle(6, 8);
		int expected = -1;
		int actual = rec3.compareTo(rec4);
		assertEquals(expected, actual);
	}
	
	
}
