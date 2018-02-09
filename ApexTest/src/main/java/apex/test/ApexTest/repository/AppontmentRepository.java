package apex.test.ApexTest.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import apex.test.ApexTest.model.Appointment;

@Repository
public interface AppontmentRepository extends CrudRepository<Appointment, Integer>{
	
	Appointment save(Appointment appointment);
	
	List<Appointment> findAll();
	
	
	@Query(value = "SELECT * FROM appointment WHERE description LIKE %:description% ", nativeQuery = true)
	public List<Appointment> findByDescription(@Param("description") String  description);
	

}
