package com.AddressBookApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.AddressBookApp.model.Contact;
import com.AddressBookApp.service.AddressBookService;

@RestController
@RequestMapping("/contacts")
public class AddressBookController {

    private final AddressBookService service;

    public AddressBookController(AddressBookService service) {
        this.service = service;
    }

//  CREATE
    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return service.addContact(contact);
    }

//  READ
    @GetMapping
    public List<Contact> getContacts() {
        return service.getAllContacts();
    }
    
//  UPDATE
    @PutMapping("/{id}")
    public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact) {
        return service.updateContact(id, contact);
    }

//  DELETE
    @DeleteMapping("/{id}")
    public String deleteContact(@PathVariable Long id) {
        return service.deleteContact(id);
    }
}