package BankApp;

import java.util.Scanner;

public class YatirimHesap extends BankaHesap{
	private String hesapTuru;
	private int yatirimBakiye;
	private String yatirimTuru;
	private float kur;
	Scanner input=new Scanner(System.in);
	public YatirimHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru, int yatirimBakiye,String yatirimTuru, float kur) {
		super(iban, toplamBakiye, hesapBilgisi);
		this.hesapTuru = hesapTuru;
		this.yatirimBakiye = yatirimBakiye;
		this.yatirimTuru = yatirimTuru;
		this.kur = kur;
		System.out.println("1-Para Ekle(100 Birim)\t2-Para Boz(100 Birim)");
		int tur=input.nextInt();
		if (tur==1) {//para ekle seçilirse
			System.out.println("Yeni Toplam Bakiye:"+(toplamBakiye+paraEkle(yatirimBakiye, yatirimTuru, kur))+"TL");
		}else {// para bozdurmak istenirse
			System.out.println("Yeni Toplam Bakiye:"+(toplamBakiye-paraBoz(yatirimBakiye, yatirimTuru, kur))+"TL");
		}
	}
	public double paraEkle(int yatirimBakiye,String yatirimTuru,float kur) {
		return yatirimBakiye*kur;
	}
	public double paraBoz(int yatirimBakiye,String yatirimTuru,float kur) {
		return yatirimBakiye*kur;
	}

	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	public int getYatirimBakiye() {
		return yatirimBakiye;
	}
	public void setYatirimBakiye(int yatirimBakiye) {
		this.yatirimBakiye = yatirimBakiye;
	}
	public String getYatirimTuru() {
		return yatirimTuru;
	}
	public void setYatirimTuru(String yatirimTuru) {
		this.yatirimTuru = yatirimTuru;
	}
	public float getKur() {
		return kur;
	}
	public void setKur(float kur) {
		this.kur = kur;
	}
	@Override
	public String toString() {
		return "YatirimHesap [hesapTuru=" + hesapTuru + ", yatirimBakiye=" + yatirimBakiye + ", yatirimTuru="
				+ yatirimTuru + ", kur=" + kur + ", input=" + input + "]";
	}
	
}
