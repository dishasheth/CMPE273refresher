package java_programs;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoWheelerTest {

	@Test
	public void test() {
		Vehicle v=new TwoWheeler();
		assertEquals(2,v.capacity());
		assertEquals(2,v.noOfWheels());
		
		v=new FourWheeler();
		assertEquals(8,v.capacity());
		assertEquals(4,v.noOfWheels());
	}

}
