import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String msg) {
        super(msg);
    }
}

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class ContactManager {
    List<Contact> contacts = new ArrayList<>();

    void addContact(String name, String phone) throws InvalidPhoneNumberException {
        if (!phone.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Phone number must be exactly 10 digits");
        }

        for (Contact c : contacts) {
            if (c.phone.equals(phone)) {
                System.out.println("Duplicate contact not allowed");
                return;
            }
        }

        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully");
    }

    void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println(c.name + " - " + c.phone);
                return;
            }
        }
        System.out.println("Contact not found");
    }

    void deleteContact(String phone) {
        contacts.removeIf(c -> c.phone.equals(phone));
        System.out.println("Contact deleted if existed");
    }
}
