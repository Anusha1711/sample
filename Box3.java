
import java.util.Scanner;
public class Box3 {
	public static void main(String[] args)
	{
	
    Scanner reader = new Scanner( System.in );
	
    int l,b,h;
	System.out.println("enter length ");
	l= reader.nextInt();
	System.out.println("enter breadth ");
	b= reader.nextInt();
	System.out.println("enter height ");
	h= reader.nextInt();
	System.out.println(" volume is" +(l*b*h));
	
}

}