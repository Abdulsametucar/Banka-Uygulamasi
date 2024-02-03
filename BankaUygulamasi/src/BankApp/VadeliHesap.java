package BankApp;

public class VadeliHesap extends BankaHesap{
	String hesapTuru;
	double vadeliBakiye;
	float faizOrani;
	public VadeliHesap(long iban, double toplamBakiye, String hesapBilgisi,String hesapTuru, double vadeliBakiye,float faizOrani,double gelir) {
		super(iban, toplamBakiye, hesapBilgisi);
		this.hesapTuru = hesapTuru;
		this.faizOrani = faizOrani;
		this.vadeliBakiye =gelir+(faizOrani*gelir);//faizin gelire eklenmesi
		super.setToplamBakiye(super.getToplamBakiye()+this.vadeliBakiye);//vadeli bakiyenin toplam bakiyeye eklenmesi
		System.out.println("Vadeli hesapta faiz oranıyla oluşan güncel toplam bakiye:"+(int)super.getToplamBakiye());
	}
	public String getHesapTuru() {
		return hesapTuru;
	}
	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}
	public double getVadeliBakiye() {
		return vadeliBakiye;
	}
	public void setVadeliBakiye(double vadeliBakiye) {
		this.vadeliBakiye = vadeliBakiye;
	}
	public float getFaizOrani() {
		return faizOrani;
	}
	public void setFaizOrani(float faizOrani) {
		this.faizOrani = faizOrani;
	}
	@Override
	public String toString() {
		return "VadeliHesap [hesapTuru=" + hesapTuru + ", vadeliBakiye=" + vadeliBakiye + ", faizOrani=" + faizOrani
				+ "]";
	}
	
}
