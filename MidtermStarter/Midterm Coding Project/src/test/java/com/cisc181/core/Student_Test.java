package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		// List of Courses
		Course a = new Course(); Course b = new Course("CISC181"); Course c = new Course("MATH426");
		ArrayList<Course> listOfCourses = new ArrayList<Course>();
		listOfCourses.add(a); listOfCourses.add(b); listOfCourses.add(c);
		
		// List of Semesters
		Semester Fall = new Semester(); Semester Spring = new Semester();
		ArrayList<Semester> listOfSemesters = new ArrayList<Semester>();
		listOfSemesters.add(Fall); listOfSemesters.add(Spring);
		
		// List of Sections
		Section af = new Section(); Section as = new Section(); Section bf = new Section();
		Section bs = new Section(); Section cf = new Section(); Section cs = new Section(); 
		ArrayList<Section> listOfSections = new ArrayList<Section>();
		listOfSections.add(af); listOfSections.add(as); listOfSections.add(bf); 
		listOfSections.add(bs); listOfSections.add(cf); listOfSections.add(cs); 
		
		// List of Students
		Student Arthur = new Student("Arthur");
		Student Brad = new Student("Brad");
		Student Claire = new Student("Claire");
		Student Dana = new Student("Dana");
		Student Ethan = new Student("Ethan");
		Student Fred = new Student("Fred");
		Student Greg = new Student("Greg");
		Student Hector = new Student("Hector");
		Student Ian = new Student("Ian");
		Student Jamie = new Student("Jamie");
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(Arthur); listOfStudents.add(Brad); listOfStudents.add(Claire); 
		listOfStudents.add(Dana); listOfStudents.add(Ethan); listOfStudents.add(Fred); 
		listOfStudents.add(Greg); listOfStudents.add(Hector); listOfStudents.add(Ian); 
		listOfStudents.add(Jamie); 
		
	}
 
	@Test
	public void test() {
		// List of Courses
		Course a = new Course(); Course b = new Course("CISC181"); Course c = new Course("MATH426");
		ArrayList<Course> listOfCourses = new ArrayList<Course>();
		listOfCourses.add(a); listOfCourses.add(b); listOfCourses.add(c);
		
		// List of Semesters
		Semester Fall = new Semester(); Semester Spring = new Semester();
		ArrayList<Semester> listOfSemesters = new ArrayList<Semester>();
		listOfSemesters.add(Fall); listOfSemesters.add(Spring);
		
		// List of Sections
		Section af = new Section(); Section as = new Section(); Section bf = new Section();
		Section bs = new Section(); Section cf = new Section(); Section cs = new Section(); 
		ArrayList<Section> listOfSections = new ArrayList<Section>();
		listOfSections.add(af); listOfSections.add(as); listOfSections.add(bf); 
		listOfSections.add(bs); listOfSections.add(cf); listOfSections.add(cs); 
		
		// List of Students
		Student Arthur = new Student("Arthur");
		Student Brad = new Student("Brad");
		Student Claire = new Student("Claire");
		Student Dana = new Student("Dana");
		Student Ethan = new Student("Ethan");
		Student Fred = new Student("Fred");
		Student Greg = new Student("Greg");
		Student Hector = new Student("Hector");
		Student Ian = new Student("Ian");
		Student Jamie = new Student("Jamie");
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(Arthur); listOfStudents.add(Brad); listOfStudents.add(Claire); 
		listOfStudents.add(Dana); listOfStudents.add(Ethan); listOfStudents.add(Fred); 
		listOfStudents.add(Greg); listOfStudents.add(Hector); listOfStudents.add(Ian); 
		listOfStudents.add(Jamie); 
		
		Arthur.sections.addAll(listOfSections); Brad.sections.addAll(listOfSections); 
		Claire.sections.addAll(listOfSections); Dana.sections.addAll(listOfSections);
		Ethan.sections.addAll(listOfSections); Fred.sections.addAll(listOfSections);
		Greg.sections.addAll(listOfSections); Hector.sections.addAll(listOfSections);
		Ian.sections.addAll(listOfSections); Jamie.sections.addAll(listOfSections);
		
		
		
	}
}