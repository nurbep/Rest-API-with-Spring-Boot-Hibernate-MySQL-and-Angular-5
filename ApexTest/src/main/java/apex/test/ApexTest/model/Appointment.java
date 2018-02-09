package apex.test.ApexTest.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@JsonFormat(pattern = "dd::MM::yyyy")
	private LocalDate date;
	
	@JsonFormat(pattern = "KK:mm a")
	private LocalTime time;
	private String description;
	
	public Appointment() {}
	
    public Appointment(int id, LocalDate date, String description) {
	super();
	this.id = id;
	this.date = date;
	this.description = description;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	
	

}
