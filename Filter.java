package images;

public class Filter extends ImageDecorator {
	private RGB filter;
	public Filter(Image base, RGB filter) //setting base image and setting filter value
	{
		super(base);
		this.filter=filter;
	}

	public RGB get(int x, int y) {
		return base.get(x, y).filter(filter); //returning the color from the base image filtered with the value given
	}
	
}
