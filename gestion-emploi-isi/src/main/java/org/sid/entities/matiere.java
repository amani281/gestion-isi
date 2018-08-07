package org.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class matiere {
	
	@Id @GeneratedValue
	private Long idmatiere;
	private String nom;
	private int coeff;
	private int nbhc;
	private int nbhtd;
	private int nbhtp;
	private int nbhci;
	


	
	public Long getIdmatiere() {
		return idmatiere;
	}


	public void setIdmatiere(Long idmatiere) {
		this.idmatiere = idmatiere;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getCoeff() {
		return coeff;
	}


	public void setCoeff(int coeff) {
		this.coeff = coeff;
	}


	public int getNbhc() {
		return nbhc;
	}


	public void setNbhc(int nbhc) {
		this.nbhc = nbhc;
	}


	public int getNbhtd() {
		return nbhtd;
	}


	public void setNbhtd(int nbhtd) {
		this.nbhtd = nbhtd;
	}


	public int getNbhtp() {
		return nbhtp;
	}


	public void setNbhtp(int nbhtp) {
		this.nbhtp = nbhtp;
	}


	public int getNbhci() {
		return nbhci;
	}


	public void setNbhci(int nbhci) {
		this.nbhci = nbhci;
	}


	public matiere(Long idmatiere, String nom, int coeff, int nbhc, int nbhtd, int nbhtp, int nbhci) {
		super();
		this.idmatiere = idmatiere;
		this.nom = nom;
		this.coeff = coeff;
		this.nbhc = nbhc;
		this.nbhtd = nbhtd;
		this.nbhtp = nbhtp;
		this.nbhci = nbhci;
	}


	public matiere() {
		super();
	}
	
	
	

}


