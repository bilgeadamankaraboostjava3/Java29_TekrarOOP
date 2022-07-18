package com.muhammet.repository.entity;

import java.util.UUID;

/**
 * Parent Class olarak kullan�yoruz.
 * @author MuhammetAli
 *
 */
public class Kisi {
	String id;
	String ad;
	String soyad;
	String adres;
	String telefon;
	int yas;
	/**
	 * cinsiyet ??
	 */
	Cinsiyet cinsiyet;
	
	
	public Kisi(String ad, String soyad, String adres, String telefon, int yas, Cinsiyet cinsiyet) {
		id = UUID.randomUUID().toString();
		this.ad = ad;
		this.soyad = soyad;
		this.adres = adres;
		this.telefon = telefon;
		this.yas = yas;
		this.cinsiyet = cinsiyet;
	}

	public String getId() {
		return id;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public String getAdres() {
		return adres;
	}
	public String getTelefon() {
		return telefon;
	}
	public int getYas() {
		return yas;
	}
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	
	
}
