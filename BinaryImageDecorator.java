package images;

public abstract class BinaryImageDecorator implements Image {
	protected Image base1,base2;
	protected int height,width;
	public BinaryImageDecorator(Image base1,Image base2) //constructs image with max height and width of 2 given images
	{
		this.base1=base1;
		this.base2=base2;
		height=Math.max(base1.getHeight(), base2.getHeight());
		width=Math.max(base1.getWidth(), base2.getWidth());
	}
	 public int getWidth()
	 {
		 return width;
	 }
	 public int getHeight()
	 {
	     return height;
	 }
}
