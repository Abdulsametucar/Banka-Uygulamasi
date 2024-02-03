package BankApp;

public class VadesizHesap extends BankaHesap{
	private String hesapTuru;
	private double vadesizBakiye;
	public VadesizHesap(long iban, double toplamBakiye, String hesapBilgisi, String hesapTuru, double vadesizBakiye) {
		super(iban, toplamBakiye, hesapBilgisi);
		this.hesapTuru = hesapTuru;
		this.vadesizBakiye = vadesizBakiye;
		if (hesapBilgisi.equals("Maaş Hesabı")) {
			System.out.println("para transfer işleminde 0 tl kesinti olacaktır!!");
			super.setToplamBakiye(toplamBakiye-paraTransfer(hesapTuru, iban, vadesizBakiye, 200)-0);//200 tl para transferi yapılıp 0 tl de kesinti alınır
			System.out.println("200 TL Transfer sonrası toplam bakiye:"+(super.getToplamBakiye()));
		}else {//normal hesap
			super.setToplamBakiye(toplamBakiye-paraTransfer(hesapTuru, iban, vadesizBakiye, 200)-8);//200 tl para transferi yapılıp 8 tl de kesinti alınır
			System.out.println("para transfer işleminde 8 tl kesinti olacaktır!!");
			System.out.println("200 TL Transfer sonrası toplam bakiye:"+(super.getToplamBakiye()));
		}
	}
	
	public double paraTransfer(String hesapTuru,long iban,double vadesizBakiye,int islemMiktar) {
		return islemMiktar;
	}

	public String getHesapTuru() {
		return hesapTuru;
	}

	public void setHesapTuru(String hesapTuru) {
		this.hesapTuru = hesapTuru;
	}

	public double getVadesizBakiye() {
		return vadesizBakiye;
	}

	public void setVadesizBakiye(double vadesizBakiye) {
		this.vadesizBakiye = vadesizBakiye;
	}

	@Override
	public String toString() {
		return "VadesizHesap [hesapTuru=" + hesapTuru + ", vadesizBakiye=" + vadesizBakiye + "]";
	}
	
}
