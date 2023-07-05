package com.mergeCons.egitim.util;

import java.util.List;

import javax.persistence.EntityManager;

public class OgrenciBean {
	private Ogrenci ogrenci = new Ogrenci();

	public void kaydet() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.persist(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void sil() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.remove(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public void guncelle() {
		EntityManager en = EntityUtil.getEntityManager();
		en.getTransaction().begin();
		en.merge(ogrenci);
		en.getTransaction().commit();
		ogrenci = new Ogrenci();

	}

	public List<Ogrenci> getListe() {
		EntityManager en = EntityUtil.getEntityManager();
		return en.createQuery("From Ogrenci").getResultList();

	}

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
	}

}
