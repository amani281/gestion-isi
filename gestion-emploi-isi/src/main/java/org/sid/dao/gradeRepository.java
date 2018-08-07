package org.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sid.entities.enseignant;
import org.sid.entities.grade;


@Repository
public interface gradeRepository extends JpaRepository<grade,Long>{
	public grade save(grade d);
}
