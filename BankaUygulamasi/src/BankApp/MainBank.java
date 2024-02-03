package BankApp;
import java.util.*;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

class afasf{
	
}
public class MainBank {

	public static void main(String[] args) {
		String ad="Abdulsamet",soyad="Uçar",email="abdulsamettucar@gmail.com";
		int telefonNumber=54226102;
		Scanner input=new Scanner(System.in);
		System.out.print("Adınızı giriniz:Abdulsamet\n");
		System.out.print("Soyadınızı giriniz:Uçar\n");
		System.out.print("Emailinizi giriniz:abdulsamettucar@gmail.com\n");
		System.out.print("Telefon numaranızı giriniz:0542 261 0207\n");
		System.out.print("TC kimlik numaranız:");
		Random random = new Random();
        String tc = "";//string e ben çevirdim
        for (int i = 0; i < 11; i++) {
            tc += (1+random.nextInt(9));
        }
        System.out.print(tc+"\n");	
        Kisi k1=new Kisi(tc,ad, soyad, email, telefonNumber);
        //Kisi k2=new Kisi(tc,ad, soyad, email, telefonNumber);//yeni kişi eklemek istenirse
	}

}
