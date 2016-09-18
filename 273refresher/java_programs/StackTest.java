package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JavaStack oj=new JavaStack();
		oj.push("Version1");
		oj.push("Version2");
		oj.push("Version3");
		oj.push("Version4");
		
		System.out.println("Order of items on belt :");
		for(int i=oj.top,j=1;i>0;i--,j++)
		{
			System.out.println("Student["+j+"] gets "+oj.pop());
			oj.top--;
		}
	}

}
