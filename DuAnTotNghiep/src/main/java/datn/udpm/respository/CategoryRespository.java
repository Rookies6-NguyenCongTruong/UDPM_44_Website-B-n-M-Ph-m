package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Category;

public interface CategoryRespository extends JpaRepository<Category,Integer> {

}
