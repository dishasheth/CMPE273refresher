package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaGenericsTest {

	@Test
	public void test() {
		JavaGenerics ojg=new JavaGenerics();
		System.out.println("3*4="+ojg.mul(3, 4));
		 assertEquals(3*4,ojg.mul(3, 4));
		 System.out.println("3.14*3.14="+ojg.mul(3.14, 3.14));
		 assertEquals(3.14*3.14,ojg.mul(3.14, 3.14));
	}

}
