package images;

public class Circle extends BaseImage{
	private int centerX,centerY,radius;
	private RGB center,outside;
	public Circle(int width, int height, int centerX, int centerY, int radius, RGB center, RGB outside) 
	{ //constructing a circle setting its values
		super(width,height);
		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;
		this.center=center;
		this.outside=outside;
	}
	public Circle(int size, int radius, RGB center, RGB outside) 
	{ //construct a circle given only size of image and radius.
		super(size,size);
		this.radius=radius;
		centerX=size/2;
		centerY=size/2;
		this.center=center;
		this.outside=outside;
	}

	public RGB get(int x, int y) //returns a color in the circle image.
	{
		double alpha=1-Math.sqrt(Math.pow(centerX-x, 2)+Math.pow(centerY-y, 2))/radius; //setting alpha with distance between two points
		if(Math.pow(x-centerX, 2)+Math.pow(y-centerY, 2)<=radius*radius) //checks if the point is in the cricle, if it is paint it with mix
		return RGB.mix(center,outside,alpha);
		else return outside; //if the point is outside the circle paint it with outside color
	}

}
