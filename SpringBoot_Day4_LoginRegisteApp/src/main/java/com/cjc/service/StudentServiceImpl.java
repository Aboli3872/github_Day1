package com.cjc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepositoryI;
@Service
public class StudentServiceImpl implements StudentServiceI
{

	@Autowired
	StudentRepositoryI sri;
	@Override
	public void save(Student s) 
	{
		sri.save(s);		
	}
	@Override
	public List<Student> saveStudent(String username, String password)
	{
	if(username.equals("admin")&& password.equals("admin"))
	{
		return(List<Student>) sri.findAll();
	}
	else
	{
		return sri.findByUsernameAndPassword(username,password);
		
		}
	}
	
	
	@Transactional
	@Modifying
	@Override
	public List<Student> deleteStudent(String name) 
	{
		sri.deleteByName(name);
		return (List<Student>)sri.findAll();
	}
	@Override
	public List<String> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student editStudent(int rollno) 
	{
		Optional<Student>op=sri.findById(rollno);
		if(op.isPresent())
		{
			Student s=op.get();
			return s;
		}
		else
		{
			return null;
		}
		
	}
	@Override
	public List<Student> updateStudent(Student s) 
	{
		sri.save(s);
		return (List<Student>) sri.findAll();
	}
	@Override
	public List<Student> paging(int pageNo, int size) 
	{
		Pageable p=PageRequest.of(pageNo,size,Sort.by("username").descending());
		return sri.findAll(p).getContent();
	}
	
}
