package datn.udpm;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import datn.udpm.entity.Account;
import datn.udpm.service.AccountService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	AccountService accountService ;
	
	@Autowired
	BCryptPasswordEncoder pe ;
	
	
	//Cung cấp nguồn dữ liệu đăng nhập
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(username -> {
			try {
				Account user = accountService.findByEmail(username);
				String password = pe.encode(user.getPassword());
				String role = user.getRole().getId();
				return User.withUsername(username).password(password).roles(role).build();
			} catch (NoSuchElementException e) {
				throw new UsernameNotFoundException(username + "not found!");
			}
		});
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		
	}
	
	
	//Phân quyền sử dụng
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests()
			.antMatchers("/order/**").authenticated()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().permitAll();
		
		
		http.formLogin()
			.loginPage("/security/login/form")
			.loginProcessingUrl("/security/login")
			.defaultSuccessUrl("/security/login/success",false)
			.failureUrl("/security/login/error");
			
		http.rememberMe()
			.tokenValiditySeconds(86400);
		
		http.exceptionHandling()
			.accessDeniedPage("/security/unauthoried");
		
		http.logout()
			.logoutUrl("/security/logoff")
			.logoutSuccessUrl("/security/logoff/success");
			
	}
	
	
	
	
}
