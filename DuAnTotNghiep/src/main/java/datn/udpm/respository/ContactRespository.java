package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Contact;

public interface ContactRespository extends JpaRepository<Contact,Integer> {
	
}
