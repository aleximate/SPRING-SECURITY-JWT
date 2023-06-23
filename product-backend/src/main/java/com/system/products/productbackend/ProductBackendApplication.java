package com.system.products.productbackend;

import com.system.products.productbackend.Models.Rols;
import com.system.products.productbackend.Models.UserRol;
import com.system.products.productbackend.Models.Users;
import com.system.products.productbackend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class  ProductBackendApplication {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ProductBackendApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

	/*@Override
	public void run(String... args) throws Exception {
		Users users= new Users();

		users.setName("Alexander");
		users.setLastname("Flores");
		users.setUsername("Aleximate");
		users.setPassword("123");
		users.setEmail("alshmex209@gmail.com");
		users.setPhone("949165118");
		users.setProfile("foto.png");

		Rols rols=new Rols();
		rols.setRolid(1);
		rols.setName("ADMIN");

		Set<UserRol>userRols=new HashSet<>();
		UserRol userRol=new UserRol();
		userRol.setRols(rols);
		userRol.setUser(users);
		userRols.add(userRol);

		Users saveUser= userService.saveUser(users,userRols);
		System.out.println(saveUser.getUsername());

	}*/
}
