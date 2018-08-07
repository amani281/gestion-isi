package org.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sid.entities.departement;
import org.sid.entities.enseignant;


@Repository
public interface enseignantRepository extends JpaRepository<enseignant,Long>{
	public enseignant save(enseignant d);

}
