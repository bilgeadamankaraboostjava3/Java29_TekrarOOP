package com.muhammet;

import com.muhammet.controller.DersController;
import com.muhammet.repository.entity.Ders;
import com.muhammet.utility.DataBase;

public class Runner {

	public static void main(String[] args) {
		/**
		 * 1- Eðitim Gruplarý
		 * ---> Grubun adi -> Ankara Java3
		 * ---> Ders -> java, c# v.s  // String - Enum - Class - (Java / JAVA / JavaEE)
		 * ---> Durum - tanýtým, start, ..
		 * ---> Öðrenciler
		 * ---> Öðretmenler
		 * -----> 1.1. Ders class
		 * -------> uuid
		 * -------> ad
		 * -------> aciklama
		 * -----> 1.2 Durum Enum(tanitim, eðitimde, ...)
		 * -----> 1.3 Öðrenciler
		 * --------> uuid, ad, soyad, adres, telefon, cinsiyet Enum(E,K, X) v.s.
		 * --------> IsDurum, Enum(eðitimde, stajda, iþ aram sürecinde, iþbuldu)
		 * --------> Durum, Enum(aktif, pafis,dondurmuþ)
		 * --------> KonuListesi
		 * ------------> Konu, uuid, konuadi, OgrenimDuzeyi, Enum(hb,bil,bil k,), sorusayisi
		 * -----> 1.4 Öðretmen
		 * --------> uuid, ad, soyad, adres, telefon, cinsiyet, 
		 * --------> Ders 
		 * --------> uzmanlýk süresi
		 * 
		 */
		DersController dersController = new DersController();
		dersController.dersIslemleri();
		
		
	}

}
