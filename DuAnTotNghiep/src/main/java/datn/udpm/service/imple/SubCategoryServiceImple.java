package datn.udpm.service.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datn.udpm.entity.Category;
import datn.udpm.entity.SubCategory;
import datn.udpm.respository.SubCategoryRespository;
import datn.udpm.service.SubCategoryService;
@Service
public class SubCategoryServiceImple implements SubCategoryService {
	@Autowired
	SubCategoryRespository subCateRepo ;

	@Override
	public List<SubCategory> findAll() {
		return subCateRepo.findAll();
	}

	@Override
	public List<SubCategory> findByById(Integer id) {
		return (List<SubCategory>) subCateRepo.getOne(id);
	}
	
	
}
