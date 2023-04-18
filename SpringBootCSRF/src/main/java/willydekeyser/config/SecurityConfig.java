package willydekeyser.config;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	InMemoryUserDetailsManager users() {
		return new InMemoryUserDetailsManager(
				User.withUsername("user")
				.password("{noop}password")
				.roles("USER")
				.build());
				
	}
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.authorizeHttpRequests(authConfig -> {
			authConfig.anyRequest().permitAll();
		})
		.csrf(withDefaults())
		.formLogin(withDefaults());
		return http.build();
	}
	
}
