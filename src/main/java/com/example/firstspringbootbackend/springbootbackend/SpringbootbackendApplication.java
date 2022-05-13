package com.example.firstspringbootbackend.springbootbackend;

import com.example.firstspringbootbackend.springbootbackend.model.Employee;
import com.example.firstspringbootbackend.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Rusini");
		employee.setLastName("Wijeratne");
		employee.setEmailId("rusini.gunarathne@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Chamika");
		employee1.setLastName("Wijeratne");
		employee1.setEmailId("chamikawijeratne0000@gmail.com");
		employeeRepository.save(employee1);
	}
}
