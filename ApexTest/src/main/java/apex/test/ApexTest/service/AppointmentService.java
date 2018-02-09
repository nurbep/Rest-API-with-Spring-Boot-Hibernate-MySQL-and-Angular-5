package apex.test.ApexTest.service;

import java.time.LocalDate;
import java.util.List;

import apex.test.ApexTest.model.Appointment;

public interface AppointmentService {
	Appointment save(Appointment appointment);
	
	List<Appointment> findAll();
	
	List<Appointment> findByDescription(String des);
    
	



}
