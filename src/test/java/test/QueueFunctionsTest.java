package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.QueueFunctions;


public class QueueFunctionsTest {

	@Test
	public void isEmptyTest() {
		QueueFunctions q=new QueueFunctions(10);
		q.enQueue('i');
		boolean result=q.isEmpty();
		assertEquals(false,result);
		
	}
	@Test
	public void deQueueTest() {
		QueueFunctions q=new QueueFunctions(10);
		q.enQueue('i');
		q.enQueue('f');
		Object result=q.deQueue();
		assertEquals('i',result);
		
	}
	
	@Test
	public void displayTest() {
		QueueFunctions q=new QueueFunctions(10);
		q.enQueue('i');
		q.enQueue('f');
		String result=q.display();
		assertEquals("[i,f,]",result);
		
	}
	@Test
	public void sizeTest() {
		QueueFunctions q=new QueueFunctions(10);
		int result=q.size();
		assertEquals(10,result);
		
	}

}