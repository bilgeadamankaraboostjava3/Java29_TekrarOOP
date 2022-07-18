package com.muhammet.controller;

import java.util.Scanner;

import com.muhammet.repository.entity.Ders;
import com.muhammet.utility.DataBase;

public class DersController {

	private void dersEkleme() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************************");
		System.out.println("** DERS EKLEME SAYFASI **");
		System.out.println("*************************");
		System.out.println();
		System.out.print("Ders ad�n� giriniz..........: ");
		String ad = sc.nextLine();		
		System.out.print("Ders a��klamas�n� giriniz...: ");
		String aciklama = sc.nextLine();
		Ders ders = new Ders(ad,aciklama);
		DataBase.dersListesi.add(ders);
	}
	private void dersListesiGoster() {
		System.out.println("********************************");
		System.out.println("****  DERS L�STES� SAYFASI *****");
		System.out.println("********************************");
		System.out.println();
		int no=1;
		for(Ders ders: DataBase.dersListesi) {
			System.out.print("S.No: "+no+ " - ");
			System.out.println(ders.toString());
			no++;
		}
	}
	private void dersSilme() {
		
	}
	private void dersGuncelleme() {
		System.out.println("********************************");
		System.out.println("****  DERS G�NCELLEME SAYFASI **");
		System.out.println("********************************");
		System.out.println();
		dersListesiGoster();
		Scanner sc = new Scanner(System.in);
		System.out.print("G�ncellenecek kay�t no...: ");
		// listeden g�ncellenecek kayd�n numaras�n� index ini ald�k
		int sno = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println();
		// g�ncellenece kay�t bilgilerini ald�k
		System.out.print("yeni ad..........: ");
		String ad = sc.nextLine();
		System.out.print("yeni aciklama....: ");
		String aciklama = sc.nextLine();
		// Bu i�lem s�ra nosu yani index de�eri verilen kayd� al�r.
		Ders ders = DataBase.dersListesi.get(sno-1);// [id:1, ad: java, aciklama: yok]
		ders.setAciklama(aciklama);
		ders.setAd(ad);
	}
	public void dersIslemleri() {
		Scanner sc = new Scanner(System.in);
		int secim;
		do {
			System.out.println("********************************");
			System.out.println("****  DERS ��LEMLER� SAYFASI ***");
			System.out.println("********************************");
			System.out.println();
			System.out.println("1- Ders Ekleme");
			System.out.println("2- Ders G�ncelleme");
			System.out.println("3- Ders Silme");
			System.out.println("4- Ders Listeleme");
			System.out.println("0- �IKI�");
			
			System.out.print("Se�iniz....: ");
			secim = sc.nextInt();
			switch (secim) {
			case 1: dersEkleme();break;
			case 2: dersGuncelleme();break;
			case 3: dersSilme();break;
			case 4: dersListesiGoster();break;
			case 0: System.out.println("Ders i�lemlerinden ��k�� yap�ld�.");break;		
			default: 	break;
			}
		}while(secim!=0);
	}
	
	
}
