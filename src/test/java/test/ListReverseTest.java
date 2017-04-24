package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import main.ListReverse;

public class ListReverseTest {

	@Test
	public void test() {
		ListReverse lr=new ListReverse();
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(12);
		al.add(14);
		al.add(7);
		al.add(10);
		ArrayList<Object>al2=lr.listOperations(al);
		ArrayList<Object> al3=new ArrayList<Object>();
		al3.add(10);
		al3.add(7);
		al3.add(14);
		al3.add(12);
		assertTrue(al3.equals(al2));
	}

}
