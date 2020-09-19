package com.ms;

import com.ms.dto.StudentDTO;
import com.ms.model.Address;
import com.ms.model.Group;
import com.ms.model.Project;
import com.ms.model.Student;
import com.ms.repository.GroupRepository;
import com.ms.service.GroupService;
import com.ms.service.StudentService;
import com.ms.service.impl.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@EnableJpaRepositories
@SpringBootApplication
public class MsPart1Application  {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MsPart1Application.class, args);
     	StudentServiceImpl studentService = context.getBean(StudentServiceImpl.class);
    	GroupService groupService = context.getBean(GroupService.class);

/*
		Address address = new Address();
		address.setStreet("Ilqar Zulfuqarov");
		address.setCity("Baku");

		Project project = new Project();
		project.setName("Cargo");
		project.setDescription("Cargo App");


		Student student1 = new Student();
		student1.setEmail("ayaz@mail.ru");
		student1.setName("Ayaz");
		student1.setProject(project);
		student1.setAddress(address);

//		studentService.saveStudentEntity(student1);
		Set<Student> students = new HashSet<>();
		students.add(student1);

		Group group = new Group();
		group.setName("Ayaz Ibrahims group");
		group.setDescription("this is Ibrahims and Ayazs groups");
		group.setStudents(students);
		groupService.saveGroup(group);
		*/

	//	List<StudentDTO> students = studentService.getStudents();
	//	System.out.println(students);
/*		students.forEach(student -> {
			System.out.println(student);
		});*/

	}


}
