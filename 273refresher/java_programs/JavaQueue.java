package java_programs;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
		Queue<String> queue;
		int front;
	JavaQueue()
	{
	queue=new LinkedList<String>();
	front=0;
	}
	public void add(String x)
	{
	queue.add(x);
	System.out.println("Bowl added : "+x);
	front++;
	}
	public String remove()
	{
		if(queue != null)
		return ""+queue.remove();
		return "The belt is empty";
	}
	public String peek()
	{
	return ""+queue.peek();	
	}

	}

