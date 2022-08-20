package com.taxes.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TaxeTnb {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	public Redevable redevable;
	@ManyToOne
	private Local local;
	private int annee;
	private double montantBase;
	
	@ManyToOne
	private TauxTaxeTnb tauxTaxeTnb;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Redevable getRedevable() {
		return redevable;
	}
	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double getMontantBase() {
		return montantBase;
	}
	public void setMontantBase(double montantBase) {
		this.montantBase = montantBase;
	}
	
	public TauxTaxeTnb getTauxTaxeTnb() {
		return tauxTaxeTnb;
	}
	public void setTauxTaxeTnb(TauxTaxeTnb tauxTaxeTnb) {
		this.tauxTaxeTnb = tauxTaxeTnb;
	}
	
	
	
	
	
	
}
