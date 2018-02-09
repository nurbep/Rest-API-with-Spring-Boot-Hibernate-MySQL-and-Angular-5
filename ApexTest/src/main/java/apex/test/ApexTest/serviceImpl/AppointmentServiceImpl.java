package apex.test.ApexTest.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apex.test.ApexTest.model.Appointment;
import apex.test.ApexTest.repository.AppontmentRepository;
import apex.test.ApexTest.service.AppointmentService;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppontmentRepository appointmentRepository;
	
	public 	Appointment save(Appointment appointment)

	{
		return appointmentRepository.save(appointment);

	}
	
	public 	List<Appointment> findAll()
	{
		return (List<Appointment>) appointmentRepository.findAll();
	}

	public List<Appointment> findByDescription(String des)
	{
		return  (List<Appointment>) appointmentRepository.findByDescription(des);
	}



}
