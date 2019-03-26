package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{

	private int iWidth;
	private int iLength;

	public Rectangle(int a, int b)
	{
		
	}
	
	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		if(iLength < 0)
		{
			throw new IllegalArgumentException("The width is not a positive value!");
		}
		else
		{
		this.iLength = iLength;
		}
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		if(iWidth < 0)
		{
			throw new IllegalArgumentException("The length is not a positive value!");
		}
		else
		{
			this.iWidth = iWidth;
		}
	}
	
	public double area()
	{
		return iWidth * iLength;
	}
	
	public double perimeter()
	{
		return ((2 * iWidth) + (2 * iLength));
	}
	
	public int compareTo(Object recComparison)
	{
		Rectangle rec2 = (Rectangle) recComparison;
		if(area() < rec2.area())
		{
			return -1;
		}
		else if(area() > rec2.area())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
