package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
		
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		EnrollmentID = UUID.randomUUID();
	}
	
	private void setGrade(double Grade){
		this.Grade = Grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
