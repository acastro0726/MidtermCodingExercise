package pkgShape;

public class Cuboid extends Rectangle implements Comparable<Object>{

	private int iDepth;

	public Cuboid(int a, int b, int c)
	{
		super(a, b);
		setiDepth(c);
	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		if(iDepth < 0)
		{
			throw new IllegalArgumentException("The Depth is not a positive value!");
		}
		else
		{
			this.iDepth = iDepth;
		}
	}
	
	@Override
	public double area()
	{
		return ((2 * getiLength() * getiWidth()) + (2 * getiLength() * getiDepth()) + (2 * getiDepth() * getiWidth()));
	}
	
	public double volume()
	{
		return (getiLength() * getiWidth() * getiDepth());
	}
	
	@Override
	public double perimeter()
	{
		throw new UnsupportedOperationException();
	}

}
