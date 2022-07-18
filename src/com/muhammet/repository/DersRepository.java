package com.muhammet.repository;

import java.util.List;

import javax.xml.crypto.Data;

import com.muhammet.repository.entity.Ders;
import com.muhammet.utility.DataBase;

/**
 * Ders bilgilerini kayýt etmek ve onlarý iþlemek
 * @author MuhammetAli
 *
 */
public class DersRepository {

	
	
	/**
	 * CRUD Ýþlemlerinini yapýldýðý yer.
	 */
	// Kayýt yapar.
	//public void save(Ders ders) {
		
	//}
	// Kayýt iþlemi yapar. geri bildirim yapar. 
	//public boolean save(Ders ders,int s) {
		
	//	return false;
	//}
	// Kayýt eder ve kayýt ettiði nesneyi geri döner.
	public Ders save(Ders ders) {
		DataBase.dersListesi.add(ders);
		return ders;
	}
	public Ders update(Ders ders) {	
		/**
		 * güncelleme iþlemlerinde id kullanýlacak
		 * MEvcut olan kayýtlarý tek tek geziniyoruz.
		 * bu esnada, bize güncellenmek için verilen datanýn id si ile
		 * gezinmekte olduðumuz datalardan birisinin id si eþit ise
		 * bilgilerini güncelliyoruz.
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
	// tercih edilen yöntem budur.
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
