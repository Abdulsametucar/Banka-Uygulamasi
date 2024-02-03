package BankApp;

import java.util.ArrayList;

public class BankaPersonel extends Kisi{
	private int personelID;
	public ArrayList<Musteri> hesaplar=new ArrayList<>();
	public BankaPersonel(String tcKimlikNo,String ad, String soyad, String email, int telefonNumarasi,int personelID) {
		super();
		this.setTcKimlikNo(tcKimlikNo);
		this.setAd(ad);
		this.setSoyad(soyad);
		this.setEmail(email);
		this.setTelefonNumarasi(telefonNumarasi);
		this.personelID=personelID;
	}
	public int getPersonelID() {
		return personelID;
	}
	public void setPersonelID(int personelID) {
		this.personelID = personelID;
	}
	public ArrayList<Musteri> getHesaplar() {
		return hesaplar;
	}
	public void setHesaplar(ArrayList<Musteri> hesaplar) {
		this.hesaplar = hesaplar;
	}
	@Override
	public String toString() {
		return "BankaPersonel [personelID=" + personelID + ", hesaplar=" + hesaplar + "]";
	}
	
}
