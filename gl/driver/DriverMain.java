package com.gl.driver;

import com.gl.deparmentservice.AdminDepartment;
import com.gl.deparmentservice.HrDepartment;
import com.gl.deparmentservice.SuperDepartment;
import com.gl.deparmentservice.TechDepartment;

public class DriverMain {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDepartment sd = new SuperDepartment();
		AdminDepartment ad = new AdminDepartment();
		System.out.print("Welcome to ");
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		HrDepartment hd=new HrDepartment();
		System.out.println(" ");
		System.out.print("Welcome to ");
		System.out.println(hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(sd.isTodayAHoliday());
		TechDepartment td=new TechDepartment();
		System.out.println(" ");
		System.out.print("Welcome to ");
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(sd.isTodayAHoliday());
		}
	}
