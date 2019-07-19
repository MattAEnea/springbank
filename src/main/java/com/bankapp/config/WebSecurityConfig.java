package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.bankapp.service.AuthService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Autowired
	private AuthService authService;
	
	@Override
	protected void configure(HttpSecurity http)
	{
		try
		{
			http.authorizeRequests()
				.antMatchers("/", "/create", "/save").permitAll()
				.antMatchers("/account").hasRole("USER")
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
				/*.loginProcessingUrl("/loginProcess")
				.defaultSuccessUrl("/account")
				.failureUrl("/err")*/
				.and()
			.logout();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder authMangBuild)
	{
		try
		{
			authMangBuild.userDetailsService(authService);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
