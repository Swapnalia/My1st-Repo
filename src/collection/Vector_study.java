package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_study 
{

	public static void main(String[] args) 
	{
		Vector<Object> v=new Vector<>();
		
		v.add("pune");
		v.add("Swapna");
		v.add("123");
		v.add('A');
		v.add("23.5f");
		v.add("velocity");
		System.out.println("==================");
		
		System.out.println(v);
		System.out.println("==================");
		
		System.out.println(v.capacity());        // vector can grow doubly
		System.out.println("==================");// it shows the total capacity of vector
		
		System.out.println(v.size());
		System.out.println("==================");// it shows size of the vector
		
		System.out.println(v.get(3));
		System.out.println("==================");
		
		//1.......using each loop....
		
		for(Object vc:v)
		{
			System.out.println(vc);
		}
		System.out.println("==================");
		
		//2.......itrator.............
		
		Iterator<Object> i=v.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("==================");
		
		//3.......listitrator..........
		
		ListIterator<Object> li=v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("==================");
		
		//4......enumeration.....
		
		Enumeration<Object> en =v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		System.out.println("==================");
		
		
		
		
		
		
		
		
		
		
		
	}

}
