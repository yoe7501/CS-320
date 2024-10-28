package test;

import org.junit.jupiter.api.Test;

import appointment.Appointment;
import appointment.AppointmentService;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {

    @Test
    public void testAddAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("67890", new Date(), "Doctor Appointment");
        service.addAppointment(appointment);
        assertEquals(appointment, service.getAppointment("67890"));
    }

    @Test
    public void testDeleteAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("67890", new Date(), "Doctor Appointment");
        service.addAppointment(appointment);
        service.deleteAppointment("67890");
        assertNull(service.getAppointment("67890"));
    }

    @Test
    public void testUpdateAppointment() {
        AppointmentService service = new AppointmentService();
        Appointment appointment = new Appointment("67890", new Date(), "Doctor Appointment");
        service.addAppointment(appointment);
        Date newDate = new Date(System.currentTimeMillis() + 86400000L);
        service.updateAppointment("67890", newDate, "Dental Appointment");
        assertEquals("Dental Appointment", service.getAppointment("67890").getDescription());
    }
}
