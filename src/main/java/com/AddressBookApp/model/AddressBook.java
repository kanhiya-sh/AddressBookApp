package com.AddressBookApp.model;

import java.util.*;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();
    
//  ----- Add Contact to Address Book -----
    
    public void addContact(Contact contact) {
        contactList.add(contact);
    }
    
//  ----- Display All Contacts in Address Book -----

    public void displayContacts() {
        for(Contact c : contactList) {
            System.out.println("Name : " + c.getFirstName() + " " + c.getLastName());
            System.out.println("Address : " + c.getAddress());
            System.out.println("City : " + c.getCity());
            System.out.println("State : " + c.getState());
            System.out.println("Zip : " + c.getZip());
            System.out.println("Phone : " + c.getPhoneNumber());
            System.out.println("Email : " + c.getEmail());
            System.out.println("--------------------------");
        }
    }
    
//  ----- Edit Contact in Address Book ------
	
    public void editContact(String name) {
        for(Contact c : contactList) {
            if(c.getFirstName().equalsIgnoreCase(name)) {
                Scanner myScan = new Scanner(System.in);
                
                System.out.print("Enter New Address : ");
                c.setAddress(myScan.nextLine());

                System.out.print("Enter New City : ");
                c.setCity(myScan.nextLine());

                System.out.print("Enter New State : ");
                c.setState(myScan.nextLine());

                System.out.print("Enter New Zip : ");
                c.setZip(myScan.nextLine());

                System.out.print("Enter New Phone : ");
                c.setPhoneNumber(myScan.nextLine());

                System.out.print("Enter New Email : ");
                c.setEmail(myScan.nextLine());

                System.out.println("\nContact Updated Successfully!");
                return;
            }
        }
        System.out.println("\nContact not found.");
    }
    
//   ----- Delete Contact from Address Book ------
	
    public void deleteContact(String name) {
        Contact contactToDelete = null;
        for(Contact c : contactList) {
            if(c.getFirstName().equalsIgnoreCase(name)) {
                contactToDelete = c;
                break;
            }
        }
        if(contactToDelete != null) {
            contactList.remove(contactToDelete);
            System.out.println("\nContact deleted Successfully!");
        } 
        else {
            System.out.println("Contact not found.");
        }
    }
}