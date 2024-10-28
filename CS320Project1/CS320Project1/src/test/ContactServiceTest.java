package test;

import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        assertEquals(contact, service.getContact("12345"));
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.deleteContact("12345");
        assertNull(service.getContact("12345"));
    }

    @Test
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Street");
        service.addContact(contact);
        service.updateContact("12345", "Jane", "Doe", "0987654321", "456 Avenue");
        assertEquals("Jane", service.getContact("12345").getFirstName());
        assertEquals("0987654321", service.getContact("12345").getPhone());
    }
}
