
public class AutomaticTypeConversion {
	
	public float abs(float a)
	{
		System.out.println("float");
		return a<0?a*-1:a;
	}
	public int abs(int a)
	{
		System.out.println(" int");
		return a<0?a*-1:a;
	}
	
	public double abs(double a)
	{
		System.out.println("double");
		return a<0?a*-1:a;
	}
	
public static void main(String args[])
{
	AutomaticTypeConversion a=new AutomaticTypeConversion();
	System.out.println(" int value"+a.abs(-20));
	System.out.println("double value"+a.abs(-20d));
	System.out.println("float value"+a.abs(-20f));
}
}
