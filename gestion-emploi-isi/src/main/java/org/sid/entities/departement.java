package org.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class departement {
	
	@Id @GeneratedValue
	private Long iddepartement;
	private String nom;
	
	@OneToMany(mappedBy="departement")
	private List<enseignant> enseignants;
	
	@OneToMany(mappedBy="departement")
	private List<groupe> groupes;
	
	
	public Long getIddepartement() {
		return iddepartement;
	}
	public void setIddepartement(Long iddepartement) {
		this.iddepartement = iddepartement;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "formation [iddepartement=" + iddepartement + ", nom=" + nom + "]";
	}
	public departement(Long iddepartement, String nom) {
		super();
		this.iddepartement = iddepartement;
		this.nom = nom;
	}
	public departement() {
		super();
	}
}

