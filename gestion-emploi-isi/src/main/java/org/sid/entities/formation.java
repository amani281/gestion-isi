package org.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class formation {

@Id @GeneratedValue
private Long idformation;
private String libformation;

@OneToMany(mappedBy="formation")
private List<groupe> groupes;


public Long getIdformation() {
	return idformation;
}
public void setIdformation(Long idformation) {
	this.idformation = idformation;
}
public String getLibformation() {
	return libformation;
}
public void setLibformation(String libformation) {
	this.libformation = libformation;
}
@Override
public String toString() {
	return "formation [idformation=" + idformation + ", libformation=" + libformation + "]";
}
public formation(Long idformation, String libformation) {
	super();
	this.idformation = idformation;
	this.libformation = libformation;
}
public formation() {
	super();
}


	
	

}
