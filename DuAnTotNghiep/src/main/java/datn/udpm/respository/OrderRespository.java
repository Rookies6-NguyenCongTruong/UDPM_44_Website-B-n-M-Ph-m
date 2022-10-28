package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Order;

public interface OrderRespository extends JpaRepository<Order,Integer> {

}
