package images;

public class TwoColorImage extends BaseImage{
	private RGB zero,one;
	private TwoDFunc func;
	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func) //uses super to build image and saving 2 colors and a func
	{
		super(width,height);
		this.func=func;
		this.zero=zero;
		this.one=one;
	}
	
	public RGB get(int x,int y)
	{
		double alpha;
		alpha=func.f((double)x/width,(double)y/height); //setting alpha with the func given
		if (alpha<=0) return zero;
		if (alpha>=1) return one;
		return RGB.mix(zero, one, 1-alpha); //returning the mixed color based on the function
	}

}
