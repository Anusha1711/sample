
 public class Student {
	String name;
	int student_id,m1,m2,m3;
	static String college="ASU",degree="computers masters";
	Student()
	{
		super();
	}
	Student(String n,int id,int s1,int s2,int s3)
	{
		name=n;
		student_id=id;
		m1=s1;
		m2=s2;
		m3=s3;
	}
	
	static public void calulate(Student s)
	{
		
		System.out.println("total is :" +(s.m1+s.m2+s.m3));
		System.out.println(" avg is:" +(s.m1+s.m2+s.m3)/3);
	}
	public void display()
	{
		System.out.println("name "+name);
		System.out.println("id "+student_id);
		System.out.println("college "+college);
		System.out.println("degree "+degree);
	}	
public static void main(String args[])
{
	Student s =new Student("nani",1,50,50,50);
	Professor p=new Professor("pavan kumar",7);
	System.out.println("name of prof :"+p.profname);
	System.out.println("exp of prof  :"+p.exp);
	System.out.println(" Desination :"+Student.degree);
		s.display();
	s.calulate(s);
	
	}
}
 class Professor{
		String profname;
		int exp;
		String Designation;
		Professor(String pname,int pexp)
		{
		  profname=pname;
		  exp=pexp;
		  
		}
			
			// TODO Auto-generated constructor stub
				
		
			}
