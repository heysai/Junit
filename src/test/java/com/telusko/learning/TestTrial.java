package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.telusko.Shapes;
import com.telusko.Sortedarray;

class TestTrial {
	Shapes shape=new Shapes();
	@Test
	void test() {
		assertEquals(6,6);
	}
	@Test
	void testcomputeSquareArear() {
		assertEquals(576,shape.computeSquareArea(24));
	}
	@Test
	void testcomputecircleArea() {
		assertEquals(78.5,shape.computeCircleArea(5),"Areaa of circle valuation is wrong");
	}
	@Test
	void testArrays() {
		int []expected= {2,4,6,8};
		int []actual= {4,2,8,6};
		Arrays.sort(actual);
		//assertArrayEquals(expected,actual);
		assertEquals(expected,actual);
	}
	@Test
	void testArray() {
		try {
		Sortedarray array=new Sortedarray();
		int unsorted[]= {2,1,4};
		int sorted[]=array.sortarray(unsorted);
		/*
		 * for(int ele:sorted) { System.out.println(ele); }
		 */
		}
		catch(NullPointerException e) {
			System.out.println("nullpointer excepted");
		}
		
		
	}

}
