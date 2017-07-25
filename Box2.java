
public class Box2 {
	private double l,b,h;
	public void setlength(double length)
	{
		this.l=length;

	}
	public void setbreadth(double breadth)
	{
		this.b=breadth;
	}
	public void setwidth(double width)
	{
		this.h=width;
	}
	public void  volume()
	{
		System.out.println ("volume" +(l*b*h));
	}
	public static void main(String args[])
	{
		
		Box2 b=new Box2();
		b.setlength(40.0);
		b.setbreadth(20.0);;
		b.setwidth(12.2);;
		b.volume();
	}
}
