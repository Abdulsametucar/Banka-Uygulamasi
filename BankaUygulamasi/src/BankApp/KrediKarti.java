package BankApp;

import java.util.Random;

public class KrediKarti {
	private int kartNumarasi;
	private double limit;
	private double guncelBorc;
	public KrediKarti(int kartNumarasi, double limit, double guncelBorc,int kullanilabilirLimit,int musteriNumarasi) {
		super();
		this.kartNumarasi = kartNumarasi;
		this.limit = limit;
		this.guncelBorc = guncelBorc;
		if(limit<5000)
			System.out.println("Güncel borcunuz:"+guncelBorc);
		else if(limit>10000) {
			Random rand = new Random();
			int krediID=rand.nextInt(90000) + 100000;//6 haneli random krediID üretildi
			System.out.println("limitiniz 10 bin tl üzeri olduğu için size özel "+krediID+" ID'li kredi teklifimiz:");
			int gelir=10000;//aylık geliri on bin olarak varsaydım
			Krediler krediler1=new Krediler(krediID,musteriNumarasi, gelir);
		}
	}
	public void krediKartiEkle(Musteri m1,int kartNumarasi, double limit,KrediKarti kk1) {//musteri yi ve kk1 parametreye ben ekledim
		m1.krediKartlari.add(kk1);
		System.out.println("----------------------------------------------------------");
		System.out.println(kartNumarasi+"no'lu Kredi kartınız başarıyla oluşturuldu");
		System.out.println("Kullanılabilir limitiniz:"+kullanilabilirLimit(kartNumarasi, kk1.getGuncelBorc()));
	}
	public void krediKartiSil(Musteri m1,int kartNumarasi,double limit,double guncelBorc,KrediKarti kk1) {//musteriyi paramatreye ben ekledim
		if(guncelBorc==0.0) {
			m1.krediKartlari.remove(kk1);//oluşan kredi nesnesini arraylist den siliyor
			System.out.println(kartNumarasi+" no'lu Kredi kartınız başarıyla silindi");
		}else {
			System.out.println("lütfen öncelikle borç ödemesi yapınız");
		}
	}
	public double kullanilabilirLimit(int kartNumarasi,double guncelBorc) {
		return this.limit-this.guncelBorc;
	}
	public void krediKartiBorcOdeme(double vadesizBakiye,KrediKarti guncelBorc) { //void yaptım
		guncelBorc.setGuncelBorc(guncelBorc.getGuncelBorc()-300);//borcun 300 tl si ödeniyor
		guncelBorc.setLimit(guncelBorc.getLimit()-300);//borc odendikten sonra hesapta kalan miktar
		System.out.println("Kalan güncel borcunuz:"+guncelBorc.getGuncelBorc());
		System.out.println("Kalan bakiye:"+guncelBorc.getLimit());
	}
	public double krediOdeme(int krediID,Krediler krediMiktari , Krediler taksitMiktari) {
		//krediKartiBorcOdeme metodunda borc odeme işlemi yapıldı.
		return 0;
	}
	public int getKartNumarasi() {
		return kartNumarasi;
	}
	public void setKartNumarasi(int kartNumarasi) {
		this.kartNumarasi = kartNumarasi;
	}
	public double getLimit() {
		return limit;
	}
	public void setLimit(double limit) {
		this.limit = limit;
	}
	public double getGuncelBorc() {
		return guncelBorc;
	}
	public void setGuncelBorc(double guncelBorc) {
		this.guncelBorc = guncelBorc;
	}
	@Override
	public String toString() {
		return "KrediKarti [kartNumarasi=" + kartNumarasi + ", limit=" + limit + ", guncelBorc=" + guncelBorc + "]";
	}
	
}
