import java.util.Scanner;
public class Bank {
 @Override
	public String toString() {
		return "Bank [accno=" + accno + ", name=" + name + ", age=" + age + ", ammount=" + ammount + "]";
	}
String accno;	
 String name;
 int age;
 float ammount;
 
 public Bank(String i, String accname, int accage, float accammount) {
	accno=i;
	name=accname;
	age=accage;
	ammount=accammount;
	
}
public String getAccno() {
	return accno;
}
public void setAccno(String accno) {
	this.accno = accno;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public float getAmmount() {
	return ammount;
}
public void setAmmount(float ammount) {
	this.ammount = ammount;
}
public static void main(String Args[])
{
	Bank b=new Bank("1a","ASU",20,5000);
	 Scanner reader = new Scanner( System.in );
	 System.out.println("enter account number for details");
	   String num;
	   num= reader.next();
	   
}
 
}
