package com.gl.deparmentservice;

public class TechDepartment extends SuperDepartment {
	public TechDepartment(){
		
	}
	public String departmentName() {
		return "Tech Department";
	}
	public String getTodaysWork() 
	{
		return "Complete coding of Module 1 ";
	}
	public String getWorkDeadline() 
	{
		return "Complete by EOD";
	}
	public String getTechStackInformation() 
	{
		return "Core Java";
	}
}
