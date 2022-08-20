package com.taxes.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Local {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String reference;
	private String rue;
	private double surface;
	@ManyToOne
	private Redevable redevable;
	@ManyToOne
	private CategorieTnb categorieTnb;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public Redevable getRedevable() {
		return redevable;
	}
	public void setRedevable(Redevable redevable) {
		this.redevable = redevable;
	}
	public CategorieTnb getCategorieTnb() {
		return categorieTnb;
	}
	public void setCategorieTnb(CategorieTnb categorieTnb) {
		this.categorieTnb = categorieTnb;
	}
	public double getSurface() {
		return surface;
	}
	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	
}
