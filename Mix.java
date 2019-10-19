package images;

public class Mix extends BinaryImageDecorator {
	private double alpha;
	public Mix(Image base1, Image base2, double alpha)  //creating an image from the base images with super
	{
		super(base1,base2);
		this.alpha=alpha;
	}
	public RGB get(int x,int y)
	{
		if ((x>base1.getWidth()||y>base1.getHeight())&&x<=base2.getWidth()&&y<=base2.getHeight()) //if point is in picture 2 and not in 1
			return base2.get(x, y);
		if ((x>base2.getWidth()||y>base2.getHeight())&&x<=base1.getWidth()&&y<=base1.getHeight()) //if points is in picture 1 and not 2
			return base1.get(x, y);
		if (x<=base1.getWidth()&&y<=base1.getHeight()&&x<=base2.getWidth()&&y<=base2.getHeight()) //if points belongs to both images
			return RGB.mix(base1.get(x, y),base2.get(x, y),alpha);
		return RGB.BLACK;
	}
}
