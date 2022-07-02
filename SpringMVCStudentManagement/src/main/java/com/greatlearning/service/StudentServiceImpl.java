package com.greatlearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.StudentDAO;
import com.greatlearning.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentDAO studentDaoImpl;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDaoImpl.findAll();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findById(id);
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		studentDaoImpl.save(student);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteById(id);
	}

}
