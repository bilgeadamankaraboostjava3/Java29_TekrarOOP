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
		System.out.print("Ders adýný giriniz..........: ");
		String ad = sc.nextLine();		
		System.out.print("Ders açýklamasýný giriniz...: ");
		String aciklama = sc.nextLine();
		Ders ders = new Ders(ad,aciklama);
		DataBase.dersListesi.add(ders);
	}
	private void dersListesiGoster() {
		System.out.println("********************************");
		System.out.println("****  DERS LÝSTESÝ SAYFASI *****");
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
		System.out.println("****  DERS GÜNCELLEME SAYFASI **");
		System.out.println("********************************");
		System.out.println();
		dersListesiGoster();
		Scanner sc = new Scanner(System.in);
		System.out.print("Güncellenecek kayýt no...: ");
		// listeden güncellenecek kaydýn numarasýný index ini aldýk
		int sno = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println();
		// güncellenece kayýt bilgilerini aldýk
		System.out.print("yeni ad..........: ");
		String ad = sc.nextLine();
		System.out.print("yeni aciklama....: ");
		String aciklama = sc.nextLine();
		// Bu iþlem sýra nosu yani index deðeri verilen kaydý alýr.
		Ders ders = DataBase.dersListesi.get(sno-1);// [id:1, ad: java, aciklama: yok]
		ders.setAciklama(aciklama);
		ders.setAd(ad);
	}
	public void dersIslemleri() {
		Scanner sc = new Scanner(System.in);
		int secim;
		do {
			System.out.println("********************************");
			System.out.println("****  DERS ÝÞLEMLERÝ SAYFASI ***");
			System.out.println("********************************");
			System.out.println();
			System.out.println("1- Ders Ekleme");
			System.out.println("2- Ders Güncelleme");
			System.out.println("3- Ders Silme");
			System.out.println("4- Ders Listeleme");
			System.out.println("0- ÇIKIÞ");
			
			System.out.print("Seçiniz....: ");
			secim = sc.nextInt();
			switch (secim) {
			case 1: dersEkleme();break;
			case 2: dersGuncelleme();break;
			case 3: dersSilme();break;
			case 4: dersListesiGoster();break;
			case 0: System.out.println("Ders iþlemlerinden çýkýþ yapýldý.");break;		
			default: 	break;
			}
		}while(secim!=0);
	}
	
	
}
