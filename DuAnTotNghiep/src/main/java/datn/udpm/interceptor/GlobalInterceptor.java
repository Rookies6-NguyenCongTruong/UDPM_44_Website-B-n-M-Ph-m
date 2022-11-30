package datn.udpm.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import datn.udpm.entity.Category;
import datn.udpm.service.CategoryService;

@Component
public class GlobalInterceptor implements HandlerInterceptor {
	
	@Autowired 
	CategoryService categoryService ;
	

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		List<Category> listCategory = categoryService.findAll();
		request.setAttribute("listCategory", listCategory);
	}
	
	
	
	
}
