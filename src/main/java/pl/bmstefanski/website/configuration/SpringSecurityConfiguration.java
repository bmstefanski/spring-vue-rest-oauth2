package pl.bmstefanski.website.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication()
        .passwordEncoder(NoOpPasswordEncoder.getInstance())
        .withUser("admin").password("admin").roles("ADMIN")
        .and()
        .withUser("user").password("user").roles("USER");
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
        .formLogin()
        .loginPage("/login")
        .failureUrl("/login-fail")
        .defaultSuccessUrl("/home")
        .and()
        .logout().deleteCookies("JSESSIONID")
        .logoutUrl("/logout")
        .logoutSuccessUrl("/home");
  }

}
