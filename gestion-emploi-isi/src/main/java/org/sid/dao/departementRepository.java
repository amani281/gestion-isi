package org.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.sid.entities.departement;


@Repository
public interface departementRepository extends JpaRepository<departement,Long>{

	public departement save(departement d);

}
