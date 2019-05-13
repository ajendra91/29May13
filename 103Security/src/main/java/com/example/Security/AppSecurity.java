package com.example.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class AppSecurity extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        //http.authorizeRequests().antMatchers("/*").permitAll();
        //same
        //http.authorizeRequests().anyRequest().permitAll();

        http.authorizeRequests().antMatchers("/dash1").permitAll();
        http.authorizeRequests().antMatchers("/dash2").authenticated().and().httpBasic();

        //now dash1 and slash / mapping also free and
        //dash2 are secure


        //http.authorizeRequests().antMatchers().fullyAuthenticated().and().formLogin();

    }
}
