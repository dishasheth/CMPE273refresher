package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaCollectionsTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JavaCollections obj1=new JavaCollections();
		assertTrue(obj1.list.isEmpty());
		obj1.addElement("Sam");
		obj1.addElement("Prinas");
		assertEquals(2,obj1.list.size() );
		obj1.addMiddleElement("Paul", 2);
		assertEquals("Paul", obj1.list.get(2));
		
	}

}
