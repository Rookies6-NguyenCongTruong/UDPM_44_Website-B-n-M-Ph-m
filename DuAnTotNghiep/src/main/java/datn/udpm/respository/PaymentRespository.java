package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Payment;

public interface PaymentRespository extends JpaRepository<Payment,Integer> {

}
