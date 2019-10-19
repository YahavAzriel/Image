package images;

public class Gradient extends BaseImage {
	private RGB start,end;
	public Gradient(int width, int height, RGB start, RGB end) //creating image with given size and 2 colors
	{
		super(width,height);
		this.start=start;
		this.end=end;
	}
	public RGB get(int x,int y)
	{
		return RGB.mix(start,end,1-(double)x/width); //returning the mix of the colors based on their position relating to the width
	}
	
	

}
