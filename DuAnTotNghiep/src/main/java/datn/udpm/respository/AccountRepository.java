package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import datn.udpm.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {

	
	@Query("SELECT a FROM Account a WHERE a.email=?1")
	public Account findByEmail(String email);
	
}
