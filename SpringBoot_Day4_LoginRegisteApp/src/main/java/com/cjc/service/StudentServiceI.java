package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentServiceI 
{

public	void save(Student s);

public List<Student> saveStudent(String username, String password);
public List<String> findByName(String name);
public List<Student> deleteStudent(String name);

public Student editStudent(int rollno);

public List<Student> updateStudent(Student s);

public List<Student> paging(int pageNo, int size);



}
