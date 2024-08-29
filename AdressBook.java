package com.AdressBookSysem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AdressBook {

	public static void main(String[] args) {
     System.out.println("Welcome to Adress Book");
     Scanner s=new Scanner(System.in);
     ArrayList<Contacts> cl=new ArrayList<Contacts>();
     char ch;
     
   while(true) {
    
     
     System.out.println("Enter the below option for: ");
     System.out.println("A : Add contact in Adress Book System");
     System.out.println("B : Modification of Contacts in Adress Book System");
     System.out.println("C : Remove contacts in Adress Book Sytem");
     System.out.println("D : Exit from  Adress Book System");

	 String str=s.next();
      ch=str.charAt(0); 
    if(ch=='D') {
    	break;
    }
    
     if(ch=='A') {
    	Contacts c=new Contacts();
    	System.out.println("enter the person name");
    	c.firstName=s.next();
    	System.out.println("enter the last name");
    	c.lastName=s.next();
    	System.out.println("enter the phone no");
    	c.phoneNumber=s.nextLong();
    	System.out.println("enter the Adress details");
    	s.next();
    	c.adress=s.nextLine();
    	System.out.println("enter the zip no");
    	c.zip=s.nextInt();
    	System.out.println("enter the mail adress");
    	c.email=s.next();
    	System.out.println("enter the state name");
    	c.state=s.next();
    	cl.add(c);
    	System.out.println("Your contact is added to the Adress Book System");
    	
    	
     }else if(ch=='B') {
    		 System.out.println("enter the person name");
    		 String name=s.next();
    		 
    		 for(Contacts c:cl) {
    			 if(c.firstName.equals(name)) {
    				 System.out.println("enter the new phone number");
    				c.phoneNumber=s.nextLong();
    				 System.out.println("enter the new email adress");
    				 c.email=s.next();
    				 System.out.println("enter the new city name");
    				 c.city=s.next();
    			    	System.out.println("Your contact is Modified in the Adress Book System");

    			 }
    		 } 
    		 
    		 
    	 }else if(ch=='C'){
    		 System.out.println("enter the person name want to delete ");
    		 String name=s.next();
    		 for(Contacts c:cl) {
    			 if(c.firstName.equals(name)) {
    			        cl.remove(c);
    			    	System.out.println("Your contact is removed from  the Adress Book System");

    			 }
    	 }
    	 
     }
   }
	}
     
	}
