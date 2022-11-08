package datn.udpm.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {
	@RequestMapping("/order/checkout")
	public String checkout() {
		return "customer/order/checkout";
	}
	
	@RequestMapping("/order/list")
	public String list() {
		return "customer/order/list";
	}
	@RequestMapping("/order/detail/{id}")
	public String detail() {
		return "customer/order/detail";
	}
	
}
