package BankApp;

public class Krediler {
	private int krediID;
	double krediMiktari;
	double taksitMiktar;
	public Krediler(int krediID,int musteriNumarasi,double krediMiktari) {
		this.krediID = krediID;
		this.krediMiktari = (krediMiktari*12)/2;
		System.out.println("yıllık kazancınızın %50 si kadar:"+this.krediMiktari+"TL");
		
	}
	public void kampanya(KrediKarti limit) {
		//kampanya constructorde tamamlanmış oldu
	}
	public int getKrediID() {
		return krediID;
	}
	public void setKrediID(int krediID) {
		this.krediID = krediID;
	}
	public double getKrediMiktari() {
		return krediMiktari;
	}
	public void setKrediMiktari(double krediMiktari) {
		this.krediMiktari = krediMiktari;
	}
	public double getTaksitMiktar() {
		return taksitMiktar;
	}
	public void setTaksitMiktar(double taksitMiktar) {
		this.taksitMiktar = taksitMiktar;
	}
	@Override
	public String toString() {
		return "Krediler [krediID=" + krediID + ", krediMiktari=" + krediMiktari + ", taksitMiktar=" + taksitMiktar
				+ "]";
	}
	
}
