package images;

public class RGB {
	private double red,green,blue;
	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);
	public RGB(double red, double green, double blue) //creating RGB color
	{
		this.red=red;
		this.green=green;
		this.blue=blue;
	}

	public RGB(double grey) //setting all values of the color to grey
	{
		red=grey;
		blue=grey;
		green=grey;
	}

	public double getRed() {
		return red;
	}

	public double getGreen() {
		return green;
	}

	public double getBlue() {
		return blue;
	}

	public RGB invert() //inverting a color
	{
		return new RGB (1-red,1-green,1-blue);
	}

	public RGB filter(RGB filter) //multiplying all values by filter
	{
		return new RGB(red*filter.red,green*filter.green,blue*filter.blue);
	}
	public static RGB superpose(RGB rgb1, RGB rgb2) //adding 2 colors together if value exceeds 1, set it to 1
	{
		double red,green,blue;
		red=rgb1.red+rgb2.red;
		green=rgb1.green+rgb2.green;
		blue=rgb1.blue+rgb2.blue;
		if(rgb1.red+rgb2.red>1) red=1;
		if(rgb1.green+rgb2.green>1) green=1;
		if(rgb1.blue+rgb2.blue>1) blue=1;
		return new RGB(red,green,blue); 
	}
	public static RGB mix(RGB rgb1, RGB rgb2, double alpha) //mixing 2 colors together with given formula
	{
		double red=rgb1.red*alpha+rgb2.red*(1-alpha);
		double green=rgb1.green*alpha+rgb2.green*(1-alpha);
		double blue=rgb1.blue*alpha+rgb2.blue*(1-alpha);
		return new RGB(red,green,blue);
	}
	public String toString()
	{
		return String.format("<%.4f, %.4f, %.4f>",red,green,blue);
	}
	
	
	
	
	
}
