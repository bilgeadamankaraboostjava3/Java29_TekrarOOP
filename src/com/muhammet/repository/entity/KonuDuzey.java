package com.muhammet.repository.entity;

import java.util.UUID;

public class KonuDuzey {

	String id;
	Konu konu;
	OgrenimDuzeyi duzey;
	int cozulenSoruSayisi;
	int sorulanSoruSayisi;
	int yuzde;//0
	
	
	@Override
	public String toString() {
		return "KonuDuzey [id=" + id + ", konu=" + konu + ", duzey=" + duzey + ", cozulenSoruSayisi="
				+ cozulenSoruSayisi + ", sorulanSoruSayisi=" + sorulanSoruSayisi + ", yuzde=" + yuzde + "]";
	}
	public KonuDuzey(Konu konu, OgrenimDuzeyi duzey, int cozulenSoruSayisi, int sorulanSoruSayisi) {
		id = UUID.randomUUID().toString();
		this.konu = konu;
		this.duzey = duzey;
		this.cozulenSoruSayisi = cozulenSoruSayisi;
		this.sorulanSoruSayisi = sorulanSoruSayisi;
		this.yuzde = (cozulenSoruSayisi*100)/sorulanSoruSayisi;
	}
	public String getId() {
		return id;
	}
	public Konu getKonu() {
		return konu;
	}
	public OgrenimDuzeyi getDuzey() {
		return duzey;
	}
	public int getCozulenSoruSayisi() {
		return cozulenSoruSayisi;
	}
	public int getSorulanSoruSayisi() {
		return sorulanSoruSayisi;
	}
	public int getYuzde() {
		//                90  *100 = 9000        /   100   = 90	
		return yuzde;
	}
	
	
	
}
