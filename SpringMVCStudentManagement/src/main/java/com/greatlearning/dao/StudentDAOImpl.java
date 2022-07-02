package com.greatlearning.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	private SessionFactory factory;

	private Session session;

	@Autowired
	public StudentDAOImpl(SessionFactory factory) {
		// TODO Auto-generated constructor stub

		this.factory = factory;

		try {
			session = factory.getCurrentSession();
		} catch (HibernateException e) {
			session = factory.openSession();
		}
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		
		List<Student> students = session.createQuery("from Student").list();
		
		transaction.commit();
		
		return students;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		transaction.commit();
		
		return student;
	}

	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub

		Transaction transaction = session.beginTransaction();
		
		session.save(student);
		
		transaction.commit();

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		session.delete(student);
		
		transaction.commit();

	}

}
