package com.muhammet;

import com.muhammet.controller.DersController;
import com.muhammet.repository.entity.Ders;
import com.muhammet.utility.DataBase;

public class Runner {

	public static void main(String[] args) {
		/**
		 * 1- E�itim Gruplar�
		 * ---> Grubun adi -> Ankara Java3
		 * ---> Ders -> java, c# v.s  // String - Enum - Class - (Java / JAVA / JavaEE)
		 * ---> Durum - tan�t�m, start, ..
		 * ---> ��renciler
		 * ---> ��retmenler
		 * -----> 1.1. Ders class
		 * -------> uuid
		 * -------> ad
		 * -------> aciklama
		 * -----> 1.2 Durum Enum(tanitim, e�itimde, ...)
		 * -----> 1.3 ��renciler
		 * --------> uuid, ad, soyad, adres, telefon, cinsiyet Enum(E,K, X) v.s.
		 * --------> IsDurum, Enum(e�itimde, stajda, i� aram s�recinde, i�buldu)
		 * --------> Durum, Enum(aktif, pafis,dondurmu�)
		 * --------> KonuListesi
		 * ------------> Konu, uuid, konuadi, OgrenimDuzeyi, Enum(hb,bil,bil k,), sorusayisi
		 * -----> 1.4 ��retmen
		 * --------> uuid, ad, soyad, adres, telefon, cinsiyet, 
		 * --------> Ders 
		 * --------> uzmanl�k s�resi
		 * 
		 */
		DersController dersController = new DersController();
		dersController.dersIslemleri();
		
		
	}

}
