package org.sid.entities;



import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class enseignant {
	@Id @GeneratedValue
	private Long idenseignant;
	

	private String nom;
	private String situa;
	private String prenom;
	private String nature;
	private String nspecialite;
	private String fonction;
	private String adresse;
	private String email;
	private int CIN;
	private int tel;
	private Date datenaiss;
	private Date dateembauche;
	
	
	@ManyToOne
	@JoinColumn(name="ID_DEPARTEMENT")
	private departement departement;
	
	
	@ManyToOne
	@JoinColumn(name="ID_GRADE")
	private grade grade;
	
	
	
	public Long getIdenseignant() {
		return idenseignant;
	}
	public void setIdenseignant(Long idenseignant) {
		this.idenseignant = idenseignant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getSitua() {
		return situa;
	}
	public void setSitua(String situa) {
		this.situa = situa;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getNspecialite() {
		return nspecialite;
	}
	public void setNspecialite(String nspecialite) {
		this.nspecialite = nspecialite;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCIN() {
		return CIN;
	}
	public void setCIN(int cIN) {
		CIN = cIN;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public Date getDatenaiss() {
		return datenaiss;
	}
	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}
	public Date getDateembauche() {
		return dateembauche;
	}
	public void setDateembauche(Date dateembauche) {
		this.dateembauche = dateembauche;
	}

	public grade getGrade() {
		return grade;
	}
	public void setGrade(grade grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "enseignant [idenseignant=" + idenseignant + ", nom=" + nom + ", situa=" + situa + ", prenom=" + prenom
				+ ", nature=" + nature + ", nspecialite=" + nspecialite + ", fonction=" + fonction + ", adresse="
				+ adresse + ", email=" + email + ", CIN=" + CIN + ", tel=" + tel + ", datenaiss=" + datenaiss
				+ ", dateembauche=" + dateembauche +  grade + "]";
	}

	
	public enseignant() {
		super();
	}
	public enseignant(String nom, String situa, String prenom) {
		super();
		this.nom = nom;
		this.situa = situa;
		this.prenom = prenom;
	}
	public enseignant(Long idenseignant, String nom, String situa, String prenom) {
		super();
		this.idenseignant = idenseignant;
		this.nom = nom;
		this.situa = situa;
		this.prenom = prenom;
	}
	public enseignant(Long idenseignant, String nom, String situa, String prenom, String nature, String nspecialite,
			String fonction, String adresse, String email, int cIN, int tel, Date datenaiss, Date dateembauche) {
		super();
		this.idenseignant = idenseignant;
		this.nom = nom;
		this.situa = situa;
		this.prenom = prenom;
		this.nature = nature;
		this.nspecialite = nspecialite;
		this.fonction = fonction;
		this.adresse = adresse;
		this.email = email;
		CIN = cIN;
		this.tel = tel;
		this.datenaiss = datenaiss;
		this.dateembauche = dateembauche;
	}
	public enseignant(Long idenseignant, String nom, String situa, String prenom,
			org.sid.entities.departement departement, org.sid.entities.grade grade) {
		super();
		this.idenseignant = idenseignant;
		this.nom = nom;
		this.situa = situa;
		this.prenom = prenom;
		this.departement = departement;
		this.grade = grade;
	}
	
	


	
	
	
	


}

