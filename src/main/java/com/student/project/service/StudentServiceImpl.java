package com.student.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.project.model.StudentModel;
import com.student.project.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studrepo;
	
	@Override
	public StudentModel createStudent(StudentModel studmodel) {
		// TODO Auto-generated method stub
		return studrepo.save(studmodel);
	}
	@Override
	public List<StudentModel> findallstudent() {
		// TODO Auto-generated method stub
		return studrepo.findAll();
	}
	@Override
	public void deleteRecord(Integer id) {
		// TODO Auto-generated method stub
		studrepo.deleteById(id);
	}
	public void update(StudentModel studModel) {
		studrepo.save(studModel);
	}
	@Override
	public void updateRecord(StudentModel studModel) {
		// TODO Auto-generated method stub
		studrepo.save(studModel);
	}

}
