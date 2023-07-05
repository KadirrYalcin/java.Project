package ders3;

import java.util.Scanner;

public class ders3 {
	static boolean var=false;
	static boolean acik=false;
	static TV televizyon;
	static Scanner tara=new Scanner(System.in);
	public static void main(String[] args) {
		menuGoster();
		boolean cikis=false;
		while(cikis==false) {
		System.out.println("Seçiminiz");
		int secim=tara.nextInt();
		switch(secim) {
		case 0: 
			System.out.println("SİSTEMDEN CIKILIYOR...");
			cikis=true;
			break;
		case 1:
			televizyon=televizyonOlustur();
			break;
		case 2:
			televizyonAc();
			break;
		case 3:
			sesAc();
			break;
		case 4:
			sesKapat();
			break;
		case 8:
			menuGoster();
			break;
		}
		}
	}
	private static void sesAc() {
		if (var) {
			if (acik) {
				televizyon.sesArttir();
			}else {
				System.out.println("Televizyonu açınız");
			}
			
		}else
		System.out.println("Televizyonu oluşturunz");
	}
	public static void sesKapat() {
		if (var) {
			if (acik) {
				televizyon.sesAzalt();
			}else {
				System.out.println("Televizyonu açınız");
			}
			
		}else
		System.out.println("Televizyonu oluşturunuz");
	}
	public static void televizyonAc() {
		if (var) {
			if(acik==false) {
				System.out.println("Televizyon açılıyor");
			acik=true;
			}
			
			else {
				System.out.println("Televizyon zaten açık");
			}
		}
		else {
			System.out.println("Önce televizyonu oluşturunuz");
		}
	}
	public static TV televizyonOlustur() {
		String marka;
		String isim;
	if(var) {
		System.out.println("Televizyon zaten oluşturuldu.");
		return null;
	}else {
		marka=tara.nextLine();
		System.out.println("Televizyonun markasını giriniz:");
		marka=tara.nextLine();
		System.out.println("Televizyonun ismini giriniz:");
		isim=tara.nextLine();
		TV televizyon=new TV(marka, isim);
		System.out.println(televizyon.toString());
		var=true;
		return televizyon;
	}
	}

	private static void menuGoster() {
		System.out.println("********** MENU **********");
		System.out.println("0 -- Çıkış\n"
				+ "1 -- Televizyonu kur\n"
				+ "2 -- Televizyonu aç\n"
				+ "3 -- Sesi arttır\n"
				+ "4 -- Sesi azalt\n"
				+ "5 -- Kanal değiştir\n"
				+ "6 -- Kanal bilgisi göster\n"
				+ "7 -- Televizyonu kapat\n"
				+ "8 -- Menüyü göster\n");
		
	}
}