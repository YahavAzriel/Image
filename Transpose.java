package images;

public class Transpose implements Image {
	private Image base;
	private int height,width;
	public Transpose(Image base) //saving base image info,the height and width are opposite
	{
		this.base=base;
		this.height=base.getWidth();
		this.width=base.getHeight();
	}
	public RGB get(int x,int y) //returning the opposite point from base picture
	{
		return base.get(y,x);
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
