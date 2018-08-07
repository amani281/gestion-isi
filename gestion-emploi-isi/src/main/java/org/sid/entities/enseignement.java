package org.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class enseignement {
	@Id @GeneratedValue
	private long idenseignement;
	
	
	private String typeens;
	private String jour;
	private String heure;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ENSEIGNANT")
    private enseignant enseignant;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MATIERE")
    private matiere matiere;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_SALLE")
    private salle salle;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_TYPE")
    private type type;


	public long getIdenseignement() {
		return idenseignement;
	}


	public void setIdenseignement(long idenseignement) {
		this.idenseignement = idenseignement;
	}


	public String getTypeens() {
		return typeens;
	}


	public void setTypeens(String typeens) {
		this.typeens = typeens;
	}


	public String getJour() {
		return jour;
	}


	public void setJour(String jour) {
		this.jour = jour;
	}


	public String getHeure() {
		return heure;
	}


	public void setHeure(String heure) {
		this.heure = heure;
	}


	@Override
	public String toString() {
		return "enseignement [idenseignement=" + idenseignement + ", typeens=" + typeens + ", jour=" + jour + ", heure="
				+ heure + ", enseignant=" + enseignant + ", matiere=" + matiere + ", salle=" + salle + ", type=" + type
				+ "]";
	}


	public enseignement(long idenseignement, String typeens, String jour, String heure,
			org.sid.entities.enseignant enseignant, org.sid.entities.matiere matiere, org.sid.entities.salle salle,
			org.sid.entities.type type) {
		super();
		this.idenseignement = idenseignement;
		this.typeens = typeens;
		this.jour = jour;
		this.heure = heure;
		this.enseignant = enseignant;
		this.matiere = matiere;
		this.salle = salle;
		this.type = type;
	}
	
	
	
	
	

}
