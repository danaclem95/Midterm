package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Student extends Person {

	private eMajor Major;
	private UUID StudentID;
	public ArrayList<Section> sections;
	
	public eMajor getMajor ( )
    {
        return Major;
    }
    public void setMajor (eMajor Major)
    {
        this.Major = Major;    
    }
    public Student(String FirstName){
    	super();
    	this.FirstName = FirstName;
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
    public Student(){
    	
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email)
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}