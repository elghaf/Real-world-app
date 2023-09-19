import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

import javax.management.RuntimeErrorException;

public class AppointmentScheduler {

    private NavigableSet<LocalDateTime> appointments = new TreeSet<>();

    public void addAppointment(LocalDateTime dateTime) {
        // we need list or array to hold the appointment
        appointments.add(dateTime);
    }

    public LocalDateTime getNextAvailableSlot(LocalDateTime dateTime) {
        return appointments.higher(dateTime);
    }

    public LocalDateTime removeFirstAppointment() {
        if (appointments.isEmpty()) {
            throw new RuntimeErrorException(null, "No appoinments available to remove.");
        }
        LocalDateTime first = appointments.pollFirst();
        return first;
    }

    public LocalDateTime removeLastAppointment() {
        if (appointments.isEmpty()) {
            throw new RuntimeErrorException(null, "not appoinments in the last");

        }
        return appointments.pollLast();
    }

    public NavigableSet<LocalDateTime> getAppointmentsAfter(LocalDateTime localDateTime) {
        return appointments.tailSet(localDateTime, false);
    }
}
