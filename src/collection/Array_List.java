package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class Array_List
{

	public static void main(String[] args) 
	{
		ArrayList<Object> al =new ArrayList<>();// we are adding generic object....
		                                       // which can acess all datatype.
		
		al.add("Swapna");
		al.add("123");
		al.add('A');
		al.add("23.5f");
		al.add("velocity");
		System.out.println("==================");
		
		System.out.println(al.size());           // tha size of arraylist will be 10..&it acreased by
		                                         //current capacity*3/2)+1==10*1.5+1==16
		System.out.println("==================");// it gives the size of arraylist
		
		System.out.println(al);
		System.out.println("==================");
		
		System.out.println(al.addAll(2, al));
		System.out.println("==================");
		
		System.out.println(al.clone());
		System.out.println("==================");
		
		System.out.println(al.contains("swapnali"));
		System.out.println("==================");
		
		System.out.println(al.isEmpty());
		System.out.println("==================");
		
		//1...use for loop for traversion..........
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));// if we have get method then only we can use for loop
			
		}
		System.out.println("==================");
		
		//2....for each...................
		
		for(Object a:al)
		{
			System.out.println(a);
		}
		System.out.println("==================");
		
		//3.......itrator...........
		
		Iterator<Object> it= al.iterator();
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		System.out.println("==================");
		
		//4.....list itrator........
		
		ListIterator<Object> li = al.listIterator();
		while(li.hasNext())
		{
		System.out.println(li.next());	
		}
		System.out.println("==================");
	}
	

}
