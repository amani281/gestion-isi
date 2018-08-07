package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class type {
	@Id @GeneratedValue
	private Long idtype;
	
	private Boolean permanant;
	private int nbsemaine;
	private String libsemaine;
	
   /* @OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ENSEIGNEMENT")
    private enseignement enseignement;*/
	
	
	public Long getIdtype() {
		return idtype;
	}
	public void setIdtype(Long idtype) {
		this.idtype = idtype;
	}
	public Boolean getPermanant() {
		return permanant;
	}
	public void setPermanant(Boolean permanant) {
		this.permanant = permanant;
	}
	public int getNbsemaine() {
		return nbsemaine;
	}
	public void setNbsemaine(int nbsemaine) {
		this.nbsemaine = nbsemaine;
	}
	public String getLibsemaine() {
		return libsemaine;
	}
	public void setLibsemaine(String libsemaine) {
		this.libsemaine = libsemaine;
	}
	@Override
	public String toString() {
		return "type [idtype=" + idtype + ", permanant=" + permanant + ", nbsemaine=" + nbsemaine + ", libsemaine="
				+ libsemaine + "]";
	}
	public type(Long idtype, Boolean permanant, int nbsemaine, String libsemaine) {
		super();
		this.idtype = idtype;
		this.permanant = permanant;
		this.nbsemaine = nbsemaine;
		this.libsemaine = libsemaine;
	}
	public type() {
		super();
	}
	
	

}


