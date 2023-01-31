package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set_study 
{

	public static void main(String[] args) 
	{
     HashSet<Object> Hs=new HashSet<>();
     
     Hs.add("kajal");
     Hs.add("puja");
     Hs.add("netra");
     Hs.add("seema");
     Hs.add("kavya");
     Hs.add("jiya");
     
     System.out.println(Hs);
     System.out.println("========================");
     
    System.out.println(Hs.contains("kavya")); 
    System.out.println("========================");
    
    System.out.println(Hs.remove("kajal"));
    System.out.println(Hs);
    System.out.println("========================");
    
    System.out.println(Hs.size());
    System.out.println("========================");
     
    //1........iterator........
    
     Iterator<Object> it = Hs.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
     System.out.println("========================");
     //2....foe each loop.......
    
    for(Object h:Hs)
    {
    	System.out.println(h);
    }
    System.out.println("========================");
    }
    
    
     
     
	

}
