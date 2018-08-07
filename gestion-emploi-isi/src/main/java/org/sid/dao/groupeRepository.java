package org.sid.dao;


import org.sid.entities.formation;
import org.sid.entities.groupe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface groupeRepository extends JpaRepository<groupe,Long>{
	public groupe save(groupe d);
}
