package com.sda.javagda21.currencygame.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableOAuth2Sso
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("Jan")
//                .password(getPasswordEncoder().encode("Jan123"))
//                .roles("ADMIN");     -> tylko jeśli chcemy mieć w pamięci użytkowników
//
//
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
http.authorizeRequests()
        .antMatchers("/game").authenticated()
        .anyRequest().permitAll()
        .and()
//        .formLogin()
//        .and()
        .csrf().disable();
    }
}
