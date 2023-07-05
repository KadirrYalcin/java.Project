import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       BankaHesabi b1=new BankaHesabi(51165);
     boolean cikis=false;
        Scanner tara=new Scanner(System.in);
        System.out.println("İsminizi giriniz:");
        String isim=tara.next();
        b1.setAd(isim);
        System.out.println("Soyadınızı giriniz:");
        String soyad=tara.next();
        b1.setSoyad(soyad);
        System.out.println("Telefon numaranızı giriniz:");
        int telefon=tara.nextInt();
        b1.setTelefonNumarasi(telefon);
        System.out.println("E-postanızı giriniz:");
        String ePosta=tara.next();
        b1.setePosta(ePosta);
        System.out.println("Toplam para miktarınızı girinz:");
        double paraMikrari=tara.nextDouble();
        b1.setToplamPara(paraMikrari);
        System.out.println("Toplam borc miktarınızı girinz:");
        double borcMikrari=tara.nextDouble();
        b1.setBorc(borcMikrari);

       while (!cikis){
           System.out.println("*******************************");
           System.out.print("Para çekmek için 1:\n" +
                   "Para yatırmak için 2:\n" +
                   "borc almak için 3:\n" +
                   "borç ödemek için 4:\n" +
                   "Çıkmak için 5:\n" +
                   "tuşlayınız");
           int secim=tara.nextInt();
           switch (secim) {
               case 1 -> b1.paraCek();
               case 2 -> b1.paraYatir();
               case 3 -> b1.borclandir();
               case 4 -> b1.borcOde();
               case 5 -> cikis = true;
           }
       }
    }
}