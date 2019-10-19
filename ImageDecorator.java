package images;

public abstract class ImageDecorator implements Image { //decorator pattern
	protected int height;
	protected int width;
	protected Image base;
	public ImageDecorator (Image base) //saving values of base image
	{
		height=base.getHeight();
		width=base.getWidth();
		this.base=base;
	}
	
	@Override
	public int getWidth() {
		return width;
	}
	@Override
	public int getHeight() {
		return height;
	}
	
	
}
