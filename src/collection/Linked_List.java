package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List
{

	public static void main(String[] args) 
	{
		LinkedList<Object> ll=new LinkedList<>();
		
		ll.add("vector");
		ll.add("katraj");
		ll.add("pune");
		ll.add("nasik");
		ll.add("dhule");
		ll.add("jalna");
		
		System.out.println(ll);
		System.out.println("==================");
		
		//System.out.println(ll.addAll(3, ll));
		System.out.println("==================");
		
		//System.out.println(ll.peek());
		System.out.println("==================");
		
		//System.out.println(ll.poll());
		System.out.println("==================");
		//System.out.println(ll);
		System.out.println("==================");
		
		//System.out.println(ll.pop());
		//System.out.println(ll);
		System.out.println("==================");
		
		//1....for loop.........
		
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("==================");
		
		//2...for each loop.........
		
		for(Object L:ll)
		{
			System.out.println(L);
		}
		System.out.println("==================");
		
		//3....itrator....
		
		Iterator<Object> i= ll.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("==================");
		
		//4.....listitrerator......
		
		ListIterator<Object> lt= ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		System.out.println("==================");
		

	}

}
