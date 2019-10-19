package images;

public abstract class BaseImage implements Image  {
	int height,width;
	public BaseImage(int width,int height) // constructs image with setting its height and width
	{
		this.height=height;
		this.width=width;
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
