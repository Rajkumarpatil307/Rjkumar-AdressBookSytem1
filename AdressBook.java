package com.AdressBookSysem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AdressBook {

	public static void main(String[] args) {
     System.out.println("Welcome to Adress Book");
     Scanner s=new Scanner(System.in);
     ArrayList<Contacts> cl=new ArrayList<Contacts>();
     System.out.println("want to add the contact person to Adress Book?");
     String str=s.next();
     if(str.equals("yes")) {
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
    	
     }else if(str.equals("no")) {
    	 System.out.println("want to edit the person details");
    	 String str1=s.next();
    	 if(str1.equals("yes")) {
    		 System.out.println("enter the person name");
    		 String name=s.next();
    		 for(Contacts c:cl) {
    			 if(c.firstName.equals(name)) {
    				 System.out.println("enter the new phone number");
    				c.phoneNumber=s.nextLong();
    				 System.out.println("enter the new email adress");
    				 c.email=s.next();
    				 System.out.println("enter the new city name");
    			 }
    		 }
    	 }else {
    		 System.out.println("enter the person want to delete ");
    		 String name=s.next();
    		 for(Contacts c:cl) {
    			 if(c.firstName.equals(name)) {
    			        cl.remove(c);
    			 }
    	 }
    	 
     }
	}
     
	}
}