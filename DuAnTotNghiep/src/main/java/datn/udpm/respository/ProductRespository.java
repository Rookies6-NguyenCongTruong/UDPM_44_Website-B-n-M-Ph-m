package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Product;

public interface ProductRespository extends JpaRepository<Product,Integer> {

}
