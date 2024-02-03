package BankApp;

import java.util.Date;
import java.util.Iterator;

public class BankaHesap {
	private long iban;
	private Date hesapAcilisTarihi=new Date();
	private double toplamBakiye;
	private String hesapBilgisi;
	private double islemMiktar;
	private String hesapTuru;
	public BankaHesap(long iban, double toplamBakiye, String hesapBilgisi) {
		this.iban = iban;
		this.toplamBakiye = toplamBakiye;
		this.hesapBilgisi = hesapBilgisi;
	}
	public void hesapGoruntuleme(int musterNumrasi,String ad,String soyad,long iban,double toplamBakiye,String hesapBilgisi) {
		System.out.println("--------------------------Hesap Bilgileri----------------------------");
		System.out.println("Müşteri Numarası:"+musterNumrasi+"\nAd:"+ad+"\nSoyad:"+soyad+
				"\nIban:TR"+iban+"\nHesap Bilgisi:"+hesapBilgisi);
		if(getHesapAcilisTarihi().after(new Date(0))) {//hesabın açılış tarihi 1 ocaktan sonra ise true döndürür.
			System.out.println("Açılış tarihi:"+hesapAcilisTarihi+"\nToplam Bakiye:"+toplamBakiye);
		}
		System.out.println("----------------------------------------------------------");
	}
	
	
	
	public long getIban() {
		return iban;
	}
	public void setIban(long iban) {
		this.iban = iban;
	}
	public Date getHesapAcilisTarihi() {
		return hesapAcilisTarihi;
	}
	public void setHesapAcilisTarihi(Date hesapAcilisTarihi) {
		this.hesapAcilisTarihi = hesapAcilisTarihi;
	}
	public double getToplamBakiye() {
		return toplamBakiye;
	}
	public void setToplamBakiye(double toplamBakiye) {
		this.toplamBakiye = toplamBakiye;
	}
	public String getHesapBilgisi() {
		return hesapBilgisi;
	}
	public void setHesapBilgisi(String hesapBilgisi) {
		this.hesapBilgisi = hesapBilgisi;
	}
	public double getIslemMiktar() {
		return islemMiktar;
	}
	public void setIslemMiktar(double islemMiktar) {
		this.islemMiktar = islemMiktar;
	}
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	@Override
	public String toString() {
		return "BankaHesap [iban=" + iban + ", hesapAcilisTarihi=" + hesapAcilisTarihi + ", toplamBakiye="
				+ toplamBakiye + ", hesapBilgisi=" + hesapBilgisi + ", islemMiktar=" + islemMiktar + ", hesapTuru="
				+ hesapTuru + "]";
	}
	
}
