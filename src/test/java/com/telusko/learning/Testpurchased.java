package com.telusko.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.telusko.Javacourse;
import com.telusko.Purchased;

class Testpurchased {

	@Test
	void testproceedcourse() {
		Purchased pc=new Purchased();
		boolean status=pc.proceedcourse(new Javacourse());
		assertTrue(status);
	}

}
