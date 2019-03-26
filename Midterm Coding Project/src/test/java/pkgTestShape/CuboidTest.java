package pkgTestShape;

import pkgShape.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	Cuboid testCuboid = new Cuboid(5, 10, 15);
	
	public CuboidTest()
	{
		
	}

	@Test
	public void testGetiDepth()
	{
		assertEquals(testCuboid.getiDepth(), 15);
	}
	
	@Test
	public void testSetiDepth1()
	{
		assertEquals(testCuboid.getiDepth(), 15);
	}
	
	@Test
	(expected = IllegalArgumentException.class)
	public void testSetiDepth2()
	{
		testCuboid.setiDepth(-1);
	}
	
	@Test
	public void testVolume()
	{
		assertEquals(testCuboid.volume(), 750, 0);
	}
	
	@Test
	public void testCuboidArea()
	{
		assertEquals(testCuboid.area(), 550, 0);
	}
	
	@Test
	(expected = UnsupportedOperationException.class)
	public void testPerimeter()
	{
		testCuboid.perimeter();
	}
}
