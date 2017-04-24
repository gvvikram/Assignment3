package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StackFunctions;

public class StackFunctionsTest {
	
	@Test
	public void isEmptyTest() {
		StackFunctions s=new StackFunctions(10);
		s.push('i');
		boolean result=s.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void popTest() {
		StackFunctions s=new StackFunctions(10);
		s.push('i');
		s.push('f');
		Object result=s.pop();
		assertEquals('f',result);
		
	}
	@Test
	public void displayTest() {
		StackFunctions s=new StackFunctions(10);
		s.push('i');
		s.push('f');
		String result=s.display();
		assertEquals("[f,i,]",result);
		
	}
	@Test
	public void sizeTest() {
		StackFunctions s=new StackFunctions(13);
		int result=s.size();
		assertEquals(13,result);
		
	}

		
	}

