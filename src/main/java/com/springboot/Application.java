package com.springboot;


import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.springboot.sec.user.User;
import com.springboot.base.utils.HelperUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.springboot.app.example1.models.Student;
import com.springboot.app.example2.models.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import com.springboot.sec.user.models.repositories.UserRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springboot.app.example1.models.repositories.StudentRepository;
import com.springboot.app.example2.models.repositories.EmployeeRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Application {

	private final Logger LOGGER = LoggerFactory.getLogger(getClass());

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserRepository userRepository;

	@Bean
	CommandLineRunner runner() {
		return args -> {
			List<Employee> employees = employeeRepository.findAll();
				if (employees.size() == 0) {
					LOGGER.info("******* Inserting Employees to DB *******");
					employeeRepository.saveAll(HelperUtil.employeeSupplier.get());
				} else {
					LOGGER.info("******* Employees stored in DB Size :: {}", employees.size());
					LOGGER.info("******* Employees stored in DB :: {}", employees);
				}

			List<Student> students = studentRepository.findAll();
			if (students.size() == 0) {
				LOGGER.info("******* Inserting students to DB *******");
				studentRepository.saveAll(HelperUtil.superHeroesSupplier.get());
			} else {
				LOGGER.info("******* students stored in DB Size :: {}", students.size());
				LOGGER.info("******* students stored in DB :: {}", students);
			}

			List<User> users = userRepository.findAll();
			if (users.size() == 0) {
				LOGGER.info("******* Inserting sec_users to DB *******");
				userRepository.saveAll(HelperUtil.userSupplier.get());
			}
		};
	}
}
