package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		JavaQueue ojq=new JavaQueue();
		ojq.add("bowl1");
		ojq.add("bowl2");
		System.out.println("Order of items on belt :");
		for(int i=ojq.front;i>0;i--)
		{
			System.out.println(ojq.remove());
			ojq.front--;
		}
		
	}}
