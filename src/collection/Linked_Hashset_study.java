package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hashset_study 
{

	public static void main(String[] args) 
	{
		
    LinkedHashSet<Object> ls=new LinkedHashSet<>();
    
    ls.add("Swapna");
	ls.add("123");
	ls.add('A');
	ls.add("23.5f");
	ls.add("velocity");
	System.out.println("==================");
    
    System.out.println(ls);
	System.out.println("==================");
	
	System.out.println(ls.isEmpty());
	System.out.println("==================");
	
	System.out.println(ls.size());
	System.out.println("==================");
	
	//1...iterator.......
	
	Iterator<Object> ss=ls.iterator();
    while(ss.hasNext())
    {
    	System.out.println(ss.next());
    }
	System.out.println("==================");
	
	//2....each loop.......
	
	for(Object d:ls)
	{
		System.out.println(d);
	}
    
	}

}
