import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Vector;
public class Alist {
ArrayList alist;
Iterator it;
Vector v;
LinkedList link;
LinkedHashSet linkhash;
TreeSet tree;
Hashtable hash;
HashMap map;
Box b1,b2,b3;
Bank bank1,bank2,bank3;
public void createlist()
{
	Scanner reader = new Scanner( System.in );
	alist =new ArrayList();
	alist.add(10);
	alist.add(20);
	alist.add(30);
	alist.add("array list");
	
	it=alist.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		it.remove();
	}
	
    v=new Vector();
	v.add(10);
	v.add(100);
	v.add("vector");
	it=v.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}		
	link=new LinkedList();
	link.add("l1");
	link.add("l2");
	link.add("l3");
	it=link.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	linkhash =new LinkedHashSet();
	linkhash.add("alpha");
	linkhash.add("gamma");
	linkhash.add("beta");
	it=linkhash.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	tree=new TreeSet();
	tree.add("t1");
	tree.add("t2");
	tree.add("t3");
	it=tree.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	hash =new Hashtable();
	hash.put(1, "h1");
	hash.put(2, "h2");
	hash.put(3, "h2");
	Set s1=hash.keySet();
	it=s1.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		hash.put(5,"h4");
		
		
	}
	alist=new ArrayList();
	b1=new Box(10,20,30);
	b2=new Box(20,20,20);
	b3=new Box(30,20,10);
	alist.add(b1);
	alist.add(b2);
	alist.add(b3);
	it=alist.iterator();
	while(it.hasNext())
	{
		Box b=(Box)it.next();
		System.out.println("Length:"+b.getLength());
		System.out.println("Breadth:"+b.getBreadth());
		System.out.println("Height:"+b.getHeight());
	}
	map=new HashMap();
	map.put("1002","Rakesh");
	map.put("1004","kishore");
	map.put("1006","Naveen");
	map.put("1008","Srikanth");
	map.put("1010","Mohan");
	map.put("1010","Rakesh");
	map.put(null, null);
	   Set s=map.keySet();	
	   
	   it=s.iterator();
	   
	   while(it.hasNext())
	   {
		   String key=(String)it.next();
		   System.out.println("Key:"+key);
		   System.out.println("value:"+map.get(key));
		  // System.out.println(map.get(it.next()));
	   }
	   hash=new Hashtable();
	   bank1=new Bank("VIJ1","a",25,50000);
	   bank2=new Bank("VIJ2","b",25,50000);
	   bank3=new Bank("VIJ3","c",25,50000);
	   hash.put(bank1,1);
	   hash.put(bank2,2);
	   hash.put(bank3,3);
	   Set s11=hash.keySet();
	   
	   it=s11.iterator();
	   while(it.hasNext())
	   {
		   Bank b1=(Bank)it.next();
		   System.out.println(" accno:" +b1.getAccno());
		   		   System.out.println("accname:  "  +b1.getName());
		   		   System.out.println("age  :" +b1.getAge());
		   		   System.out.println("acc balance:  " +b1.getAmmount()); 
		   		 
   
	   }
		
}
public static void main(String args[])
{
	Alist l=new Alist();
	l.createlist();
}
}
