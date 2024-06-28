package com.springboot.clienteapp;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private BCryptPasswordEncoder passEnconder;
	
	
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/index","/home","/","/css/**","/js/**","/images/**").permitAll()
		.antMatchers("/views/clientes/").hasAnyRole("USER")
		.antMatchers("/views/clientes/create").hasAnyRole("ADMIN")
		.antMatchers("/views/clientes/save").hasAnyRole("ADMIN")
		.antMatchers("/views/clientes/edit").hasAnyRole("ADMIN")
		.antMatchers("/views/clientes/edit/**").hasAnyRole("ADMIN")
		.antMatchers("/views/clientes/delete/**").hasAnyRole("ADMIN")
		.anyRequest().authenticated()
		.and()
		.formLogin().permitAll()
		.and()
		.formLogin().loginPage("/login")
		.permitAll()
		.and()
		.logout().permitAll();
	}




	@Autowired
	public void configurerSecyrityGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder.jdbcAuthentication()
		.dataSource(dataSource)
		.passwordEncoder(passEnconder)
		.usersByUsernameQuery("SELECT username, password, enable FROM users WHERE username=?")
		.authoritiesByUsernameQuery("SELECT u.username, r.rol FROM roles r INNER JOIN users u ON r.user_id=u.id WHERE u.username=?");
	}


}
