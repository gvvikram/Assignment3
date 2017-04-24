package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Parenthesis;

public class ParenthesisTest {

	@Test
	public void test() {
		Parenthesis be=new Parenthesis();
		boolean result=be.balancing("{(a,b)}");
		assertEquals(true,result);
		
	}
	@Test
	public void test2() {
		Parenthesis be=new Parenthesis();
		boolean result=be.balancing("{(a},)))))b");
		assertEquals(false,result);
		
	}
	@Test
	public void test3() {
		Parenthesis be=new Parenthesis();
		boolean result=be.balancing("{((a,b))}");
		assertEquals(true,result);
		
	}

}
