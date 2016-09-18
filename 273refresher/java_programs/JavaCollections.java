package java_programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollections {
	LinkedList list;
	
	public JavaCollections()
	{
		list=new LinkedList();		
	}
	
	public void addElement(String str)
	{
		list.add(str);
	}
	
	public void addMiddleElement(String str, int loc)
	{
		list.add(loc, str);
	}
	
	public LinkedList reverseList()
	{
		LinkedList revList=new LinkedList();
		Iterator it=list.descendingIterator();
		while(it.hasNext())
		{
			revList.add(it.next());
			System.out.println(it.next());
		}
		return revList;
		
	}
}