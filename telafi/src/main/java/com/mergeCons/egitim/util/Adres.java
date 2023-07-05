package com.mergeCons.egitim.util;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adres implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	private String sokak;
	private String cadde;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

}
