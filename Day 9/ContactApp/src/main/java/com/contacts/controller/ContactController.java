package com.contacts.controller;

import com.contacts.dto.request.ContactRequest;
import com.contacts.dto.response.ContactResponse;
import com.contacts.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public ResponseEntity<ContactResponse> createContact(
            @Valid @RequestBody ContactRequest request) {

        ContactResponse response =
                contactService.createContact(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<ContactResponse>> getAllContacts() {

        return ResponseEntity.ok(
                contactService.getAllContacts()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactResponse> getContactById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                contactService.getContactById(id)
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactResponse> updateContact(
            @PathVariable Long id,
            @Valid @RequestBody ContactRequest request) {

        return ResponseEntity.ok(
                contactService.updateContact(id, request)
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(
            @PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<ContactResponse>> searchContacts(
            @RequestParam String keyword) {

        return ResponseEntity.ok(
                contactService.searchContacts(keyword)
        );
    }
}