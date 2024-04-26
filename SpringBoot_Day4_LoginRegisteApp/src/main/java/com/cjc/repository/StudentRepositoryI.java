package com.cjc.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;
@Repository
public interface StudentRepositoryI extends JpaRepository<Student,Integer>
{

	public List<String> findByName(String name);
	public void deleteByName(String name);
	public List<Student> findByUsernameAndPassword(String username, String password);

}
