package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.OrderDetail;

public interface OrderDetailRespository extends JpaRepository<OrderDetail,Integer> {

}
