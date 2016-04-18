package Company;

import java.util.Date;

public class Employee {
	
	private String name ;
	private Date hireDate ;
	
	public Employee(){} ;
	
	public Employee(String thename , Date theDate)
	{
		name = thename ;
		hireDate = theDate ;
		
	}
	
	
	public Date getHireDate(){
		return hireDate; 
	}
	
	public String getName(){
		
		return name ;
	}
	
	public boolean equals(Employee otherone){
		
		if(otherone.getName().equals(this.name)&&otherone.getHireDate().equals(this.hireDate)){
			return true ;
		}
			else {
					return false ;
				}
		}
	}
	
