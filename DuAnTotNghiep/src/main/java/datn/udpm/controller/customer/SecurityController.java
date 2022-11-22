package datn.udpm.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin("*")
@Controller
public class SecurityController {
	@RequestMapping("/security/login/form")
	public String loginForm(Model model , HttpServletRequest request) {
		
		model.addAttribute("message","Vui lòng đăng nhập !");
		return "customer/security/login";
	}
	
	@RequestMapping("/security/login/success")
	public String loginSuccess(Model model) {
		model.addAttribute("message","Đăng nhập thành công !");
		return "redirect:/";
	}
	@RequestMapping("/security/login/error")
	public String loginError(Model model) {
		model.addAttribute("message","Sai thông tin đăng nhập !");
		return "customer/security/login";
	}
	@RequestMapping("/security/unauthoried")
	public String unauthoried(Model model) {
		model.addAttribute("message","Không có quyền truy xuất !");
		return "customer/security/login";
	}
	@RequestMapping("/security/logoff/success")
	public String logoffSuccess(Model model) {
		model.addAttribute("message","Bạn đã đăng xuất !");
		return "redirect:/security/login/form";
	}
}
