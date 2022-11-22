package datn.udpm.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import datn.udpm.SecurityConfig;
import datn.udpm.entity.Order;
import datn.udpm.service.AccountService;
import datn.udpm.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired
	AccountService accountService ;
	
	@Autowired
	OrderService orderService ;
	@RequestMapping("/order/checkout")
	public String checkout( HttpServletRequest request , Model model) {
		return "customer/order/checkout";
	}
	
	
	
	@RequestMapping("/order/list")
	public String list(Model model ,HttpServletRequest request) {
		String email = request.getRemoteUser();
		model.addAttribute("orders",orderService.findByEmail(email));
		return "customer/order/list";
	}
	@RequestMapping("/order/detail/{id}")
	public String detail(@PathVariable("id") Integer id , Model model) {
		
		Order order = orderService.findById(id);
		model.addAttribute("order",order);
		return "customer/order/detail";
	}
	
	@GetMapping("/order/cancel/{id}")
	public String cancel(@PathVariable("id") Integer id) {
		Order order = orderService.findById(id);
		order.setStatus(2);
		orderService.save(order);
		return "redirect:/order/list";
	}
	
	
	
	
}
