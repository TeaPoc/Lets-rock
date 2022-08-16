package com.example.demo;

import com.example.demo.model.City;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.respository.CityRepository;
import com.example.demo.respository.RoleRepository;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	//@Autowired
	//static RoleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	/*	ConfigurableApplicationContext appContext =  SpringApplication.run(DemoApplication.class, args);

		RoleRepository roleRepository = appContext.getBean(RoleRepository.class);

		UserRepository userRepository = appContext.getBean(UserRepository.class);

		CityRepository cityRepository = appContext.getBean(CityRepository.class);

		String firstName = new String("Tea") ;

		Role roleOne = new Role();
		roleOne.setName("Admin");
		 Role role = roleRepository.save(roleOne);



		City cityOne = new City();
		cityOne.setName("VG");

		City cityFromDb = cityRepository.save(cityOne);


		User userOne = new User(firstName,"pocrnic","tea-poc","091 ","012",role,cityFromDb,"glupasam123" );
							//User(String firstName, String lastName, String email, String mobile, String oib, Role role, City city, String password) {
		userRepository.save(userOne);

		userRepository.findAll();


		System.out.println("end");
		*/












































	/*	Role roleOne = new Role();
		roleOne.setName("Admin");
		roleRepository.save(roleOne);

		Role roleTwo = new Role();
		roleTwo.setName("Korisnik");
		roleRepository.save(roleTwo);

		//
		//Optional<Role> role = repository.findById(3);

		List<Role> roles = roleRepository.findAll();

		roleRepository.deleteById(1);

		List<Role> rolesAfterDelete = repository.findAll();

		System.out.println(roles);*/
	}



}
