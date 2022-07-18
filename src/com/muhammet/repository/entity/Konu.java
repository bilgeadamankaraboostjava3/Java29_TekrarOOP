package com.muhammet.repository.entity;

import java.util.UUID;

public class Konu {

	String id;
	String ad;
	String aciklama;
	
	@Override
	public String toString() {
		return "Konu [id=" + id + ", ad=" + ad + ", aciklama=" + aciklama + "]";
	}
	public Konu(String ad, String aciklama) {
		id = UUID.randomUUID().toString();
		this.ad = ad;
		this.aciklama = aciklama;
	}
	public String getId() {
		return id;
	}
	public String getAd() {
		return ad;
	}
	public String getAciklama() {
		return aciklama;
	}
	
	
	
}
