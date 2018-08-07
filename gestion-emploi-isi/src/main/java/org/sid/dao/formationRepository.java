package org.sid.dao;



import org.sid.entities.formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface formationRepository extends JpaRepository<formation,Long>{

	public formation save(formation d);
	
	
	
}
