package test;

import org.junit.jupiter.api.Test;

import contact.Contact;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testContactConstructor() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Street");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Street", contact.getAddress());
    }

    @Test
    public void testInvalidContact() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Street"));
    }
}
