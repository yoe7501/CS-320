package test;

import org.junit.jupiter.api.Test;

import appointment.Appointment;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {

    @Test
    public void testAppointmentConstructor() {
        Appointment appointment = new Appointment("67890", new Date(), "Doctor Appointment");
        assertEquals("67890", appointment.getAppointmentId());
        assertNotNull(appointment.getAppointmentDate());
        assertEquals("Doctor Appointment", appointment.getDescription());
    }

    @Test
    public void testInvalidAppointment() {
        assertThrows(IllegalArgumentException.class, () -> new Appointment(null, new Date(), "Description"));
        assertThrows(IllegalArgumentException.class, () -> new Appointment("12345678901", new Date(), "Description"));
    }
}
