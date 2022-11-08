package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.SubCategory;

public interface SubCategoryRespository extends JpaRepository<SubCategory,Integer> {
	
}
