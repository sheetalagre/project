package com.student.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.project.model.StudentModel;
import com.student.project.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studService;
	
	
	
	//-------------------------for INSERT
	
	@PostMapping("/save")                                     
	public StudentModel saveStudent(@RequestBody StudentModel studModel) {
		return studService.createStudent(studModel);		
	}

	
	
	
	//------------------------- for FETCH
	
	@GetMapping("/read")                                      
	private List<StudentModel> getalllist(){
		
		return studService.findallstudent();
	}
	
	
	
	
	//------------------------- for DELETE
	
	@DeleteMapping("/deleterecordbyid/{id}")                  
	public void deleteStudent(@PathVariable Integer id) {
		studService.deleteRecord(id);
	}
	
	
	
	
	//------------------------- for UPDATE
	
	@PutMapping("/update")
	public void updateStudent(@RequestBody StudentModel studModel) {
		studService.updateRecord(studModel);
	}
}
