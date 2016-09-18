package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaArraysTest {

	@Test
	public void test() {
		JavaArrays oja=new JavaArrays();
		oja.ArraySort(5, 10, 30, 0, 5);
		assertEquals(0, oja.minimum());
		assertEquals(30, oja.maximum());
	}

}
