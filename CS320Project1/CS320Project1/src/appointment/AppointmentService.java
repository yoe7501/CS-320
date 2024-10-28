package appointment;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AppointmentService {
    private final Map<String, Appointment> appointments = new HashMap<>();

    public void addAppointment(Appointment appointment) {
        if (appointments.containsKey(appointment.getAppointmentId())) throw new IllegalArgumentException();
        appointments.put(appointment.getAppointmentId(), appointment);
    }

    public void deleteAppointment(String appointmentId) {
        appointments.remove(appointmentId);
    }

    public void updateAppointment(String appointmentId, Date date, String description) {
        Appointment appointment = appointments.get(appointmentId);
        if (appointment != null) {
            appointment.setAppointmentDate(date);
            appointment.setDescription(description);
        }
    }

    public Appointment getAppointment(String appointmentId) {
        return appointments.get(appointmentId);
    }
}
