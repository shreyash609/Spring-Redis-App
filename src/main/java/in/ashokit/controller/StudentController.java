package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;
import in.ashokit.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody Student student) {
		repo.save(student);
		return "Student Saved";
	}
	
	@GetMapping("/get")
	public List<Student> getStudent(){
		return (List<Student>) repo.findAll();
	}
}
