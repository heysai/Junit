package com.telusko;

public class Springbootcourse implements Course {

	@Override
	public boolean coursepurchased() {
		System.out.println("Springboot course");
		return true;
		
	}

}
