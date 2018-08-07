package org.sid.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class grade {
	
	
	@Id @GeneratedValue
	private Long idgrade;
	
	private String titre;
	private String titreL;
	private int ChargeH;
	private String C;
	private String TD;
	private String TP;
	private String CI;
	private String BE;
	private String T1;
	private String T2;
	private String T3;
	private String Conversion;
	private int tauxHC;
	private int tauxHTD;
	private int tauxHTP;
	private int Surveillance;
	
	@OneToMany(mappedBy="grade")
	private List<enseignant> enseignants;
	
	
	public Long getIdgrade() {
		return idgrade;
	}
	public void setIdgrade(Long idgrade) {
		this.idgrade = idgrade;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getTitreL() {
		return titreL;
	}
	public void setTitreL(String titreL) {
		this.titreL = titreL;
	}
	public int getChargeH() {
		return ChargeH;
	}
	public void setChargeH(int chargeH) {
		ChargeH = chargeH;
	}
	public String getC() {
		return C;
	}
	public void setC(String c) {
		C = c;
	}
	public String getTD() {
		return TD;
	}
	public void setTD(String tD) {
		TD = tD;
	}
	public String getTP() {
		return TP;
	}
	public void setTP(String tP) {
		TP = tP;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	public String getBE() {
		return BE;
	}
	public void setBE(String bE) {
		BE = bE;
	}
	public String getT1() {
		return T1;
	}
	public void setT1(String t1) {
		T1 = t1;
	}
	public String getT2() {
		return T2;
	}
	public void setT2(String t2) {
		T2 = t2;
	}
	public String getT3() {
		return T3;
	}
	public void setT3(String t3) {
		T3 = t3;
	}
	public String getConversion() {
		return Conversion;
	}
	public void setConversion(String conversion) {
		Conversion = conversion;
	}
	public int getTauxHC() {
		return tauxHC;
	}
	public void setTauxHC(int tauxHC) {
		this.tauxHC = tauxHC;
	}
	public int getTauxHTD() {
		return tauxHTD;
	}
	public void setTauxHTD(int tauxHTD) {
		this.tauxHTD = tauxHTD;
	}
	public int getTauxHTP() {
		return tauxHTP;
	}
	public void setTauxHTP(int tauxHTP) {
		this.tauxHTP = tauxHTP;
	}
	public int getSurveillance() {
		return Surveillance;
	}
	public void setSurveillance(int surveillance) {
		Surveillance = surveillance;
	}
	@Override
	public String toString() {
		return "grade [idgrade=" + idgrade + ", titre=" + titre + ", titreL=" + titreL + ", ChargeH=" + ChargeH + ", C="
				+ C + ", TD=" + TD + ", TP=" + TP + ", CI=" + CI + ", BE=" + BE + ", T1=" + T1 + ", T2=" + T2 + ", T3="
				+ T3 + ", Conversion=" + Conversion + ", tauxHC=" + tauxHC + ", tauxHTD=" + tauxHTD + ", tauxHTP="
				+ tauxHTP + ", Surveillance=" + Surveillance + "]";
	}
	public grade(Long idgrade, String titre, String titreL, int chargeH, String c, String tD, String tP, String cI,
			String bE, String t1, String t2, String t3, String conversion, int tauxHC, int tauxHTD, int tauxHTP,
			int surveillance) {
		super();
		this.idgrade = idgrade;
		this.titre = titre;
		this.titreL = titreL;
		ChargeH = chargeH;
		C = c;
		TD = tD;
		TP = tP;
		CI = cI;
		BE = bE;
		T1 = t1;
		T2 = t2;
		T3 = t3;
		Conversion = conversion;
		this.tauxHC = tauxHC;
		this.tauxHTD = tauxHTD;
		this.tauxHTP = tauxHTP;
		Surveillance = surveillance;
	}
	public grade() {
		super();
	}
	
	
	

}
