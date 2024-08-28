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
     }
	}
     
	}