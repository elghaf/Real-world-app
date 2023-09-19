import java.time.LocalDateTime;

import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;

public class App {
    public static void main(String[] args) throws Exception {
        
        AppointmentScheduler scheduler = new AppointmentScheduler();
        //lets set some appointment to start : 
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 10, 0, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 11, 0, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 12, 0, 0));
        scheduler.addAppointment(LocalDateTime.of(2023, 3, 4, 13, 0, 0));
    
        //lets put the current of time and date 
        LocalDateTime datetime1 = LocalDateTime.of(2023, 3, 4, 10, 30, 0);
        LocalDateTime nextSlot = scheduler.getNextAvailableSlot(datetime1);
        System.out.println("the next slot of the " + datetime1 + " is: " + nextSlot);
    }
}
