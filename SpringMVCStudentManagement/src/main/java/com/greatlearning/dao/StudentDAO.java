package com.greatlearning.dao;

import java.util.List;

import com.greatlearning.entity.Student;

public interface StudentDAO {

	public List<Student> findAll();

	public Student findById(int id);

	public void save(Student student);

	public void deleteById(int id);

}
