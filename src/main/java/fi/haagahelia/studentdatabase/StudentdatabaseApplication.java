package fi.haagahelia.studentdatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.studentdatabase.domain.Student;
import fi.haagahelia.studentdatabase.domain.StudentRepository;

@SpringBootApplication
public class StudentdatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentdatabaseApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
	return (args) -> {
	Student s1 = new Student("Kate", "Cole");
	Student s2 = new Student("Dan", "Brown");
	Student s3 = new Student("Mike", "Mars");
	
	repository.save(s1);
	repository.save(s2);
	repository.save(s3);
	
	};
	}

}
