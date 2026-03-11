package com.AddressBookApp.model;

import java.util.*;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();
    public void addContact(Contact contact) {
        contactList.add(contact);
    }

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
}