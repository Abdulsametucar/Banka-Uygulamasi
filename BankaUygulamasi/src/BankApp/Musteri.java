package BankApp;

import java.util.*;

//import javax.sql.rowset.CachedRowSet;

public class Musteri extends Kisi{
	private int musteriNumarasi;
	public ArrayList<BankaHesap> hesaplar=new ArrayList<>();
	public ArrayList<KrediKarti> krediKartlari=new ArrayList<>();
	Scanner input=new Scanner(System.in);
	public Musteri(String tcKimlikNo,int musteriNumarasi,String ad, String soyad, String email, int telefonNumarasi) {
		super();
		this.setTcKimlikNo(tcKimlikNo);
		this.musteriNumarasi=musteriNumarasi;
		int alan;
		
		System.out.println("Lütfen hangi alandan işlem yapmak istediğinizi seçiniz\n1-Hesap ekle\t2-Hesap sil");
		alan=input.nextInt();
		if(alan==1) {
			hesapEkle(tcKimlikNo, musteriNumarasi, ad, soyad);
		}else {
			hesapSil(tcKimlikNo, musteriNumarasi, ad, soyad);
		}
	}
	Random random = new Random();
	public long iban= 1000000000000000000L + random.nextLong(90000000000000000L);
	BankaHesap h1=new BankaHesap(iban,6000, "");	//toplam bakiyeyi buradan değiştirebilirsiniz
	public void hesapEkle(String tcKimlikNo,int musteriNumarasi,String ad,String soyad) {
		int hesapno,hesapBilgiNo;	//ben oluşturdum
		System.out.println("Lütfen hesap türü seçiniz\n1-Maaş Hesabı\t2-Normal Hesap");
		hesapBilgiNo=input.nextInt();
		if(hesapBilgiNo==1) {
			h1.setHesapBilgisi("Maaş Hesabı");
		}else {
			h1.setHesapBilgisi("Normal Hesap");
		}
		h1.hesapGoruntuleme(musteriNumarasi, ad, soyad, iban, h1.getToplamBakiye(), h1.getHesapBilgisi());
		System.out.println("Açmak istediğiniz hesap türünü giriniz\n1-Vadeli hesap\t2-yatırım hesabı\t3-Vadesiz hesap:");
		hesapno=input.nextInt();
		switch (hesapno) {
			case 1: {
				h1.setHesapTuru("Vadeli hesap");
				break;
			}
			case 2:{
				h1.setHesapTuru("yatırım hesabı");
				break;
			}
			default :{
				h1.setHesapTuru("Vadesiz hesap");
				break;
			}
		}
		double gelir=10000;
		if(h1.getHesapTuru().equals("Vadeli hesap")) {
			float faizOraniNo;
			if(h1.getHesapBilgisi().equals("Maaş Hesabı")) {//maas-vadeli hesap seçildiyse
				faizOraniNo=0.2f;
				h1=new VadeliHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),0,faizOraniNo,gelir);
				System.out.println("faiz oranı "+faizOraniNo+" olan Maaş-vadeli hesap başarıyla oluşturuldu");
			}else {	//normal-vadeli hesap seçildiyse
				faizOraniNo=0.1f;
				h1=new VadeliHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),0.0,faizOraniNo,gelir);
				System.out.println("faiz oranı "+faizOraniNo+" olan normal-vadeli hesap başarıyla oluşturuldu");
			}
			hesaplar.add(h1);
		}
		else if(h1.getHesapTuru().equals("Vadesiz hesap")) {
			if (h1.getHesapBilgisi().equals("Maaş Hesabı")) {
				System.out.println("Maaş-vadesiz hesap başarıyla oluşturuldu");
				h1=new VadesizHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),0);
			}else {//normal-vadesiz hesap seçildiyse
				System.out.println("normal-vadesiz hesap başarıyla oluşturuldu");
				h1=new VadesizHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),0);
			}
			hesaplar.add(h1);
		}
		else if(h1.getHesapTuru().equals("yatırım hesabı")) {
			System.out.println("Lütfen hesap türü seçiniz\n1-Altın(kur:20) \t2-Döviz(kur:10):");
			int tur=input.nextInt();
			if (tur==1) {
				h1=new YatirimHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),100,"Altın",20);//altın için kur 20.yatırım bakiyesi 100
			}else {
				h1=new YatirimHesap(h1.getIban(), h1.getToplamBakiye(), h1.getHesapBilgisi(),h1.getHesapTuru(),100,"Döviz",10);//doviz için kur 10.yatırım bakiyesi 100
			}
			hesaplar.add(h1);
		}
		
	}
	public void hesapSil(String tcKimlikNo,int musteriNumarasi,String ad, String soyad) {
		if(h1.getToplamBakiye()>0) {
			System.out.println("lütfen öncelikle bakiyenizi başka bir hesaba aktarınız!!!");
			System.out.println("toplam bakiye:"+h1.getToplamBakiye()+"TL");
	}
		else {
			hesaplar.remove(h1);	//oluşan hesabı siliyor
			System.out.println("Hesabınız başarıyla silindi");
		}
	}
	public int getMusteriNumarasi() {
		return musteriNumarasi;
	}
	public void setMusteriNumarasi(int musteriNumarasi) {
		this.musteriNumarasi = musteriNumarasi;
	}
	@Override
	public String toString() {
		return "Musteri [musteriNumarasi=" + musteriNumarasi + ", hesaplar=" + hesaplar + ", krediKartlari="
				+ krediKartlari + ", input=" + input + ", random=" + random + ", iban=" + iban + ", h1=" + h1 + "]";
	}
	
}
