package com.student.project.service;

import java.util.List;

import com.student.project.model.StudentModel;


public interface StudentService {

	 public StudentModel createStudent(StudentModel studmodel);
	 
	 public List<StudentModel> findallstudent();
	 
	 public void deleteRecord(Integer id);
	 
	 public void updateRecord(StudentModel studModel);
	
}
