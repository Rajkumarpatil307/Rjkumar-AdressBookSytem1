package com.AdressBookSysem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AdressBook {

	public static void main(String[] args) {
     System.out.println("Welcome to Adress Book");
     Scanner s=new Scanner(System.in);
     List<Contacts> cl=new ArrayList<Contacts>();
     System.out.println("want to add the contact person to Adress Book?");
     if(s.next()=="yes") {
    	Contacts c=new Contacts();
    	System.out.println("enter the person name");
    	c.firstName=s.next();
    	System.out.println("enter the last name");
    	c.lastName=s.next();
    	System.out.println("enter the phone no");
    	c.phoneNumber=s.nextLong();
    	System.out.println("enter the Adress details");
    	c.adress=s.nextLine();
    	System.out.println("enter the zip no");
    	c.zip=s.nextInt();
    	System.out.println("enter the mail adress");
    	c.email=s.next();
    	System.out.println("enter the state name");
    	c.state=s.next();
    	cl.add(c);
    	
     }
	}
     
	}