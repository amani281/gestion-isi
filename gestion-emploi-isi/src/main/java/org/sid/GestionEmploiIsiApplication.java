package org.sid;

import java.util.Date;


import org.sid.dao.departementRepository;
import org.sid.entities.departement;
import org.sid.dao.enseignantRepository;
import org.sid.entities.enseignant;
import org.sid.dao.gradeRepository;
import org.sid.entities.grade;
import org.sid.dao.groupeRepository;
import org.sid.entities.groupe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.sid.entities.formation;

import org.sid.dao.formationRepository;
//@EntityScan("<package with entities>")
@SpringBootApplication
public class GestionEmploiIsiApplication implements CommandLineRunner{

    @Autowired
    private departementRepository departementRepository;
    @Autowired
    private enseignantRepository enseignantRepository;
    @Autowired
    private gradeRepository gradeRepository;
    @Autowired
    private formationRepository formationRepository;
    
    
    
	public static void main(String[] args) {
		SpringApplication.run(GestionEmploiIsiApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
	//departement e1=departementRepository.save( new departement((long) 123654,"ams"));
	//departement e2=departementRepository.save( new departement((long) 123655,"res"));
	//departement e3=departementRepository.save( new departement((long) 123656,"rrr"));
	//enseignant e=enseignantRepository.save( new enseignant((long) 122,"amani","mll","rz",e3,g));
	// grade g=gradeRepository.save(new grade((long) 1236589,"a","a",2,"a","a","a","a","a","a","a","a","a",2,2,2,2));
	// enseignant e1=enseignantRepository.save( new enseignant((long) 1257,"","","",e3,g));
	 //les tables enseignant,grade,departement et ses clés étrangères fonctionnent
	 //dimanche: essayer le reste des tables et ajouter table enseignement
	 /*formation f=formationRepository.save( new formation((long)1,"Licence Fondamentale en informatique"));
	 formation f1=formationRepository.save( new formation((long)2,"Mastère professionnel"));
	 formation f2=formationRepository.save( new formation((long)3,"Licence Appliquée en informatique"));
	 formation f3=formationRepository.save( new formation((long)4,"Cycle ingénieur"));
	 formation f4=formationRepository.save( new formation((long)1,"Mastère de recherche en informatique"));*/
	}

}
