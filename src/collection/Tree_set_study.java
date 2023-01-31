package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_set_study {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts=new TreeSet<>();
		ts.add("vbh");
		ts.add("hfg");
		ts.add("khj");
		ts.add("kjh");
		ts.add("sdh");
		
		System.out.println(ts);
		System.out.println("=======================");
		
		//1..iterator.........
		Iterator<Object> dd= ts.iterator();
		while(dd.hasNext())
		{
			System.out.println(dd.next());
		}
		System.out.println("=========================");
		
		//2.....each loop...........
		
		for(Object l:ts)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
