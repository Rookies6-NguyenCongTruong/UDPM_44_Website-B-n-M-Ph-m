package datn.udpm.service.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import datn.udpm.entity.Category;
import datn.udpm.respository.CategoryRespository;
import datn.udpm.service.CategoryService;
@Service
public class CategoryServiceImple implements CategoryService {
	
	@Autowired
	CategoryRespository dao ;
	
	@Override
	public List<Category> findAll() {
		return dao.findAll();
	}

}
