package datn.udpm.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datn.udpm.entity.Payment;
import datn.udpm.respository.PaymentRespository;
import datn.udpm.service.PaymentService;
@Service
public class PaymentServiceImple implements PaymentService {

	@Autowired
	PaymentRespository paymentRepo ; 
	
	@Override
	public List<Payment> findAll() {
		return paymentRepo.findAll();
	}

}
