package java_programs;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void test()  {
		try{
		Game g1=new Game();
		Player p1=new Player("Player 1",g1,1);
		Player p2=new Player("Player 2",g1,2);
		p1.t.join();
		p2.t.join();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}}
