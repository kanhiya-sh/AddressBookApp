package com.AddressBookApp.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.AddressBookApp.model.Contact;

@Service
public class AddressBookService {

    private List<Contact> contactList = new ArrayList<>();
    private Long counter = (long) 1;

    // CREATE
    public Contact addContact(Contact contact) {
        contact.setId(counter++);
        contactList.add(contact);
        return contact;
    }

    // READ
    public List<Contact> getAllContacts() {
        return contactList;
    }

    // UPDATE
    public Contact updateContact(Long id, Contact newContact) {

        for (Contact c : contactList) {
            if (c.getId().equals(id)) {

                c.setFirstName(newContact.getFirstName());
                c.setLastName(newContact.getLastName());
                c.setAddress(newContact.getAddress());
                c.setCity(newContact.getCity());
                c.setState(newContact.getState());
                c.setZip(newContact.getZip());
                c.setPhoneNumber(newContact.getPhoneNumber());
                c.setEmail(newContact.getEmail());

                return c;
            }
        }
        return null;
    }

    // DELETE
    public String deleteContact(Long id) {

        for (Contact c : contactList) {
            if (c.getId().equals(id)) {
                contactList.remove(c);
                return "Contact deleted successfully";
            }
        }
        return "Contact not found";
    }
}