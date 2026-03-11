package com.AddressBookApp;

import java.util.*;
import com.AddressBookApp.model.AddressBook;
import com.AddressBookApp.model.Contact;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Scanner scMyScan = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.print("Enter First Name : ");
        String firstName = scMyScan.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName = scMyScan.nextLine();

        System.out.print("Enter Address : ");
        String address = scMyScan.nextLine();

        System.out.print("Enter City : ");
        String city = scMyScan.nextLine();

        System.out.print("Enter State : ");
        String state = scMyScan.nextLine();

        System.out.print("Enter Zip : ");
        String zip = scMyScan.nextLine();

        System.out.print("Enter Phone Number : ");
        String phone = scMyScan.nextLine();

        System.out.print("Enter Email : ");
        String email = scMyScan.nextLine();

        Contact contact = new Contact(firstName,lastName,address,city,state,zip,phone,email);

        addressBook.addContact(contact);

        System.out.println("\nContact Added Successfully!\n");

        addressBook.displayContacts();
        
        System.out.print("\nEnter the First Name of Contact to Edit : ");
        String nameToEdit = scMyScan.nextLine();
        addressBook.editContact(nameToEdit);
        addressBook.displayContacts();
        
        System.out.print("\nEnter the First Name of Contact to Delete : ");
        String nameToDelete = scMyScan.nextLine();
        addressBook.deleteContact(nameToDelete);
        addressBook.displayContacts();
    }
}