package com.muhammet.repository;

import java.util.List;

import javax.xml.crypto.Data;

import com.muhammet.repository.entity.Ders;
import com.muhammet.utility.DataBase;

/**
 * Ders bilgilerini kay�t etmek ve onlar� i�lemek
 * @author MuhammetAli
 *
 */
public class DersRepository {

	
	
	/**
	 * CRUD ��lemlerinini yap�ld��� yer.
	 */
	// Kay�t yapar.
	//public void save(Ders ders) {
		
	//}
	// Kay�t i�lemi yapar. geri bildirim yapar. 
	//public boolean save(Ders ders,int s) {
		
	//	return false;
	//}
	// Kay�t eder ve kay�t etti�i nesneyi geri d�ner.
	public Ders save(Ders ders) {
		DataBase.dersListesi.add(ders);
		return ders;
	}
	public Ders update(Ders ders) {	
		/**
		 * g�ncelleme i�lemlerinde id kullan�lacak
		 * MEvcut olan kay�tlar� tek tek geziniyoruz.
		 * bu esnada, bize g�ncellenmek i�in verilen datan�n id si ile
		 * gezinmekte oldu�umuz datalardan birisinin id si e�it ise
		 * bilgilerini g�ncelliyoruz.
		 */
		for(Ders d: DataBase.dersListesi) {
			if(d.getId().equals(ders.getId())) {
				d.setAciklama(ders.getAciklama());
				d.setAd(ders.getAd());
			}
		}
		return ders;
	}
	public boolean delete(Ders ders) {
		return true;
	}
	// tercih edilen y�ntem budur.
	public boolean delete(String id) {
		return true;
	}
	public boolean delete(int index) {
		return true;
	}	
	public List<Ders> findAll(){
		return DataBase.dersListesi;
	}
	public Ders findById(String id) {
		return null;
	}
	public Ders findByAd(String ad) {
		return null;
	}
	
}
