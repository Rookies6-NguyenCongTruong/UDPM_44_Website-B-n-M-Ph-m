package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Supplier;

public interface SupplierRespository extends JpaRepository<Supplier,Integer> {

}
