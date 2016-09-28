package de.dhbw;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Vector;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testSortieren() {
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(new Integer(3));
		v.addElement(new Integer(1));
		v.addElement(new Integer(8));
		v.addElement(new Integer(4));
		v.addElement(new Integer(7));
		Vector<Integer> v1 = BubbleSort.sortieren(v);
		for (Iterator iterator = v1.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			assertTrue(integer < integer+1);
		}
	}
}
