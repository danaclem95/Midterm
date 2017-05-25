package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		Staff a = new Staff(eTitle.MRS); a.setSalary(6000.00); staffList.add(a);
		Staff b = new Staff(eTitle.MR); b.setSalary(10000.00); staffList.add(b);
		Staff c = new Staff(eTitle.MS); c.setSalary(4000.00); staffList.add(c);
		Staff d = new Staff(eTitle.MR); d.setSalary(8000.00); staffList.add(d);
		Staff e = new Staff(eTitle.MRS); e.setSalary(7000.00); staffList.add(e);
		
		double averageSalary = 0.0;
		for (int i = 0; i < staffList.size(); i ++){
			averageSalary = averageSalary + staffList.get(i).getSalary();
		}
		
		averageSalary = averageSalary / staffList.size();
		
		assertTrue(averageSalary == 7000.00);
		
		
		
		
		
	}	

}
