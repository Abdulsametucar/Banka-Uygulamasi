package BankApp;

import java.util.Random;
import java.util.Scanner;

public class Kisi {
	private String tcKimlikNo;
	private String ad;
	private String soyad;
	private String email;
	private int telefonNumarasi;
	Scanner input=new Scanner(System.in);
	public Kisi(String tcKimlikNo,String ad, String soyad, String email, int telefonNumarasi) {
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
		this.telefonNumarasi = telefonNumarasi;
		this.tcKimlikNo=tcKimlikNo;
		
		int alan;
		System.out.println("Lütfen hangi alandan işlem yapmak istediğinizi seçiniz\n1-Banka Personeli\t2-Müşteri");
		alan=input.nextInt();
		if(alan==1) {
			Random rand = new Random();
		    int personelID = rand.nextInt(90000) + 10000;
			int musteriNumarasi;
			System.out.println("Personel numaranızı giriniz:"+personelID);
			System.out.println("Müşterinizin numaranısını giriniz:");
			musteriNumarasi=input.nextInt();
			BankaPersonel bp1=new BankaPersonel(tcKimlikNo,ad, soyad, email, telefonNumarasi,personelID);
			Musteri m2=new Musteri(tcKimlikNo, musteriNumarasi, ad, soyad, email, telefonNumarasi);
			bp1.hesaplar.add(m2);
			System.out.println("Müşteri adediniz:"+bp1.hesaplar.size());
		}
		else {
			int musteriNumarasi;
			System.out.println("Müşteri numaranızı giriniz:");
			musteriNumarasi=input.nextInt();
			Musteri m1=new Musteri(tcKimlikNo,musteriNumarasi,ad, soyad, email,telefonNumarasi);
			System.out.println("-----------------------------------------------------------\nLütfen hangi alandan işlem yapmak istediğinizi seçiniz\n1-Kredi kartı ekle\t2-Kredi kartı sil\t3-Kredi kartı borç öde(300TL)");
			alan=input.nextInt();
			Random rand = new Random();
		    int kartnumara = rand.nextInt(90000) + 10000; //5 haneli random kredi kartı numarası oluşturdum
		    double limit=6000;
		    double guncelBorc=600;//borc değerini buradan değiştirebilirsiniz
		    KrediKarti kk2=new KrediKarti(kartnumara, limit, guncelBorc, alan,musteriNumarasi);
		    if(alan==1) {//kredi kartı ekleme
				System.out.println("Limiti kaç olsun\n1-3000TL(5000TL altı)\t2-12.000TL(10.000TL üstü):");
			    int a=input.nextInt();
			    if(a==1)
			    	limit=3000;
			    else
			    	limit=12000;
			    KrediKarti kk1=new KrediKarti(kartnumara, limit, guncelBorc, alan,musteriNumarasi);
				kk1.krediKartiEkle(m1, kartnumara, limit,kk1);
			}else if(alan==2){//kredi kartı silme
				kk2.krediKartiSil(m1,kartnumara,kk2.getLimit(),kk2.getGuncelBorc(),kk2);
			}else {//borc odeme
				kk2.krediKartiBorcOdeme(0, kk2);
			}
		}
	}
	
	public Kisi(){}	
	@Override
	 public String toString() {
        return "Ad: " + ad + "\n" +
                "Soyad: " + soyad + "\n" +
                "Telefon No: " + telefonNumarasi + "\n" +
                "Email: " + email;
    }
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefonNumarasi() {
		return telefonNumarasi;
	}
	public void setTelefonNumarasi(int telefonNumarasi) {
		this.telefonNumarasi = telefonNumarasi;
	}
	
}
