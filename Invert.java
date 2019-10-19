package images;

public class Invert extends ImageDecorator{
		public Invert(Image base) //building a base image
		{
			super(base);
		}
		public RGB get(int x,int y) //returning the color in a point in the base image inverted
		{
			return base.get(x, y).invert();
		}
}
