import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class StaticFunction {
	
	String name;
	int id;
	float gpa;
	static String college="ASU";
	static String degree ="masters in computer science";
	Scanner reader = new Scanner( System.in );
	public void enterdetails()
	{
		System.out.println("enter name of student: ");
		name= reader.next();
		System.out.println("enter id of student: ");
		id=reader.nextInt();
		System.out.println("enter GPA of student: ");
		gpa=reader.nextFloat();
	}
	
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("GPA "+gpa);
		System.out.println("college "+college);
		System.out.println("degree "+degree);
	}
	public void create() throws Exception {
		Connection c = DBConnection.getConnection();
		PreparedStatement pst = c.prepareStatement("insert into student values (?,?,?,?,?)");
		pst.setString(1, name);
		pst.setInt(2,id);
		pst.setFloat(3,gpa);
		pst.setString(4, college);
		pst.setString(5, degree);
		int rows = pst.executeUpdate();
		System.out.println("number of rows  inserted" + rows);
		pst.close();
		c.close();
	}
	public static void main(String args[]) 
	{
		
		StaticFunction s=new StaticFunction();
		for(int i=0;i<2;i++)
		{
		s.enterdetails();
		
		try {
			s.create();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.display();
		}
		
	}
}
