
public class Box1 {
	
		double l,b,h;
		
		public Box1(double length,double breadth,double height)
		{
		l=length;
		b=breadth;
		h=height;
		}
		public void volume()
		{
			
			System.out.println(" volume is  :" +(l*b*h));
		}
	
public static void main(String[] args)
{
	Box1 b=new Box1(10.5,50.2,1.3);
    b.volume();
	
}
}