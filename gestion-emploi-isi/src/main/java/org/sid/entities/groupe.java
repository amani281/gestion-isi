package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class groupe {
	
	@Id  @GeneratedValue
	private Long idgroupe;
	private String nom;
	private String niveau;
	
	@ManyToOne
	@JoinColumn(name="ID_DEPARTEMENT")
	private departement departement;
	
	
	@ManyToOne
	@JoinColumn(name="ID_FORMATION")
	private formation formation;
	
	
	public Long getIdgroupe() {
		return idgroupe;
	}
	public void setIdgroupe(Long idgroupe) {
		this.idgroupe = idgroupe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public departement getDepartement() {
		return departement;
	}
	public void setDepartement(departement departement) {
		this.departement = departement;
	}
	public formation getFormation() {
		return formation;
	}
	public void setFormation(formation formation) {
		this.formation = formation;
	}
	@Override
	public String toString() {
		return "groupe [idgroupe=" + idgroupe + ", nom=" + nom + ", niveau=" + niveau + ", departement=" + departement
				+ ", formation=" + formation + "]";
	}
	public groupe(Long idgroupe, String nom, String niveau,departement departement,formation formation) {
		super();
		this.idgroupe = idgroupe;
		this.nom = nom;
		this.niveau = niveau;
		this.departement = departement;
		this.formation = formation;
	}
	public groupe() {
		super();
	}
	
	

}

