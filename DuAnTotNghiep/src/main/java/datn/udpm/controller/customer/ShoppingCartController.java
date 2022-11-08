package datn.udpm.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShoppingCartController {
	@RequestMapping("cart/view")
	public String view() {
		return "customer/cart/view";
	}
}
