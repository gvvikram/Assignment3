package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ListFunctions;

	public class ListFunctionsTest {
		/*ListExample le;
		@Before
		public void setUp()
		{
			le=new ListExample(13);
		}*/
		@Test
		public void getIndexOfTest() 
		{
		ListFunctions le=new ListFunctions(13);
	     le.add(5);
	    int result=le.getIndexOf(5);
	    assertEquals(0,result);
	    }
		@Test
		public void getTest() 
		{
			ListFunctions le=new ListFunctions(13);
	        le.add(5);
	        Object result=le.get(0);
	        assertEquals(5,result);
	    }
		@Test
		public void containsTest() 
		{
			ListFunctions le=new ListFunctions(13);
	        le.add(5);
	        boolean result=le.contains(5);
	        assertEquals(true,result);
	    }
		@Test
		public void sizeTest() 
		{
			ListFunctions le=new ListFunctions(13);
	        le.add(5);
	        int result=le.size();
	        assertEquals(1,result);
	    }
		@Test
		public void isEmptyTest() 
		{
			ListFunctions le=new ListFunctions(13);
	        //le.add(5);
	        boolean result=le.isEmpty();
	        assertEquals(true,result);
	    }
		@Test
		public void displayTest() 
		{
			ListFunctions le=new ListFunctions(13);
	        le.add(5);
	        le.add("hi");
	        le.delete("hi");
	        le.add('h');
	        String result=le.display();
	        assertEquals("[5,h,]",result);
	    }
		
	}
