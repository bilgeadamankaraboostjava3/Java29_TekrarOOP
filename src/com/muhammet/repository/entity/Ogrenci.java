package com.muhammet.repository.entity;

import java.util.List;

public class Ogrenci extends Kisi {
	
	/**
	 * Öðrenci durumu
	 */
	OgrenciDurumu durum;
	IsSureci isSureci;
	/**
	 * Konularýn durumu listesi
	 * List<KonuDuzey>
	 */
	List<KonuDuzey> konuDuzeyListesi;
	public Ogrenci(String ad, String soyad, String adres, String telefon, int yas, Cinsiyet cinsiyet,
			OgrenciDurumu durum, IsSureci isSureci, List<KonuDuzey> konuDuzeyListesi) {
		super(ad, soyad, adres, telefon, yas, cinsiyet);
		this.durum = durum;
		this.isSureci = isSureci;
		this.konuDuzeyListesi = konuDuzeyListesi;
	}
	
	
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", adres=" + adres + ", telefon=" + telefon
				+ ", yas=" + yas + ", cinsiyet=" + cinsiyet + ", durum=" + durum + ", isSureci=" + isSureci
				+ ", konuDuzeyListesi=" + konuDuzeyListesi + "]";
	}


	public OgrenciDurumu getDurum() {
		return durum;
	}
	public IsSureci getIsSureci() {
		return isSureci;
	}
	public List<KonuDuzey> getKonuDuzeyListesi() {
		return konuDuzeyListesi;
	}
	
	
	
}
