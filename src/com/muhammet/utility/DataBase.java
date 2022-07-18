package com.muhammet.utility;

import java.util.ArrayList;
import java.util.List;

import com.muhammet.repository.entity.*;


public class DataBase {
	/**
	 * public olduðu için her yerden ulaþýlabilir.
	 * static olduðu için uygulama run edilirken yaratýlýr ve bellekte sabit adreste
	 * kalýr. böylece deðimeden istifleme için kullanýlabilir.
	 */
	public static List<Ders> dersListesi = new ArrayList<>();
	public static List<Grup> grupListesi = new ArrayList<>();
	public static List<Konu> konuListesi = new ArrayList<>();
	public static List<KonuDuzey> konuDuzseyListesi = new ArrayList<>();
	public static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	public static List<Ogretmen> ogretmenListesi = new ArrayList<>();
	

}
