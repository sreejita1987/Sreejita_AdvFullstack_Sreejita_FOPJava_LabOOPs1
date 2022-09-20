package com.greatlearning.emailapp.service;

import java.util.Random;

import com.greatlearning.emailapp.model.*;

public class CredentialServiceImpl implements CredentialService
{
    
	public String emailAdd;
	public String password;
	
	
	public String generateEmailAddress(String fname,String lname,String deptname) 
	{
		
		String emailAdd= fname+lname+"@"+deptname+".greatlearning.com";
		return emailAdd;	
		
	};
	
	public  String generatePassword()
	{
		StringBuilder sb= new StringBuilder();
		Random r= new Random();
		
		for (int i=0;i<8;i++) {
			int n=r.nextInt(127-32)+32;
			sb.append((char)n);
			
			
		}
		
		password= sb.toString() ;
		
		return password;
		
	};
	
	
	public void showCredentials(Employee e) {
		
		System.out.println("Your email address" +e.getEmailID());
		System.out.println("Your password is" +e.getPassword());
		
	}

	public CredentialServiceImpl() {
		super();
		this.emailAdd = emailAdd;
		this.password = password;
	};
	

}
