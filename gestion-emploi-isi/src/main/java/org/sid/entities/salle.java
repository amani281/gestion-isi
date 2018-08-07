package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class salle {
	@Id @GeneratedValue
	   private Long idsalle;
	   private String nom;
	   private int capacite;
	   private String nature;
	   private Boolean etat;
	   
	  /*  @OneToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="ID_ENSEIGNEMENT")
	    private enseignement enseignement;*/
	   
	   
	public Long getIdsalle() {
		return idsalle;
	}
	public void setIdsalle(Long idsalle) {
		this.idsalle = idsalle;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "salle [idsalle=" + idsalle + ", nom=" + nom + ", capacite=" + capacite + ", nature=" + nature + ", etat="
				+ etat + "]";
	}
	public salle(Long idsalle, String nom, int capacite, String nature, Boolean etat) {
		super();
		this.idsalle = idsalle;
		this.nom = nom;
		this.capacite = capacite;
		this.nature = nature;
		this.etat = etat;
	}
	public salle() {
		super();
	}


	}

