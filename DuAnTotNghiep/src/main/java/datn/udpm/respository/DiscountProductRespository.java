package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.DiscountProduct;

public interface DiscountProductRespository extends JpaRepository<DiscountProduct,Integer> {

}
