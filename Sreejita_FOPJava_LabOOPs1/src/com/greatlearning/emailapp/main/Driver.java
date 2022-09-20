package com.greatlearning.emailapp.main;

import java.util.Scanner;

import com.greatlearning.emailapp.service.CredentialService;
import com.greatlearning.emailapp.service.CredentialServiceImpl;

public class Driver {

	public static void main(String[] args) {
		
		String dept[] = {"Tech","Admin","HR","Legal"};
		
		CredentialService service= new CredentialServiceImpl();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your firstname");
		String fname=input.next();
		System.out.println("Enter your lastname");
		String lname=input.next();
		
			
		System.out.println("Please enter the department from following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		String deptname= input.next();
		
		
		
		

	}

}
