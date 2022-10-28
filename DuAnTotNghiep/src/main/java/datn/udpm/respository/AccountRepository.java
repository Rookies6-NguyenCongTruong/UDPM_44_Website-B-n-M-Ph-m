package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {
	
}
