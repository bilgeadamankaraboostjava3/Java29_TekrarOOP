package com.muhammet.utility;

import java.util.ArrayList;
import java.util.List;

import com.muhammet.repository.entity.*;


public class DataBase {
	/**
	 * public oldu�u i�in her yerden ula��labilir.
	 * static oldu�u i�in uygulama run edilirken yarat�l�r ve bellekte sabit adreste
	 * kal�r. b�ylece de�imeden istifleme i�in kullan�labilir.
	 */
	public static List<Ders> dersListesi = new ArrayList<>();
	public static List<Grup> grupListesi = new ArrayList<>();
	public static List<Konu> konuListesi = new ArrayList<>();
	public static List<KonuDuzey> konuDuzseyListesi = new ArrayList<>();
	public static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	public static List<Ogretmen> ogretmenListesi = new ArrayList<>();
	

}
