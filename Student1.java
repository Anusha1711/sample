
public class Student1 extends Student{
	String Department;
	String coresub;
	Student1(String dep,String core,String name,int student_id, int m1,int m2,int m3)
	{
		super(name,student_id,m1,m2,m3);
		Department=dep;
		coresub=core;
		
	}
	public void display()
	{
		System.out.println(" method overloaded from super class");
		System.out.println("name "+name);
		System.out.println("id "+student_id);
		System.out.println(" department:" +Department);
		System.out.println("core sub:" +coresub);
		System.out.println("college "+college);
		System.out.println("degree "+degree);
	}
	public static void main(String args[])
	{
		Student1 s1=new Student1("CSE","JAVA","vinay",3,45,50,48);
		s1.display();
		s1.calulate(s1);
		
		
	}
}
