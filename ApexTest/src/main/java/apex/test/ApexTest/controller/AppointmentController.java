package apex.test.ApexTest.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import apex.test.ApexTest.model.Appointment;
import apex.test.ApexTest.service.AppointmentService;

@RestController
public class AppointmentController {
@Autowired
private AppointmentService appointmentService;

@PostMapping("/add")
public Appointment addAppointment(@RequestBody Appointment appointment)
 {
	return appointmentService.save(appointment);
 }

@GetMapping("/appointments")
public List<Appointment> getAppointments()
 {
	return (List<Appointment>) appointmentService.findAll();
 }

 @GetMapping("/appointments/{des}")
 public List<Appointment> search(@PathVariable String des)
 {
	 return (List<Appointment>) appointmentService.findByDescription(des);
 }

}
