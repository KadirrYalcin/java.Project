import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] sayilar=new int[10];
        int toplam=0,enKucuk,enBuyuk,index = 0;
        boolean devam=true;
        boolean dene=true;
        double ortalama;
        for (int i=0;i<10;i++){
            System.out.println((i+1)+". sayıyı giriniz:");
             int sayi=scan.nextInt();
             if ((sayi<=100) && sayi>0){
                 sayilar[i]=sayi;
             }else {
                 System.out.println("Geçersiz sayı girdiniz.");
                 i--;
             }
        }
        System.out.println("Bulmak istediğiniz sayıyı giriniz:");
        int denekSayi= scan.nextInt();
        for (int sayi:sayilar){
            index++;
            if (sayi==denekSayi)
            {

                System.out.println("Girdiğiniz sayı "+index+" numaralı indexte");
                System.out.println("BULUNDU");
                devam=false;
            }
        }
        if (devam)
            System.out.println("Bulunamadı");

        System.out.println("dizideki sayılar:");
        for (int sayi:sayilar){
            System.out.println(sayi);

        toplam+=sayi;

        }
        ortalama=toplam/10;
        enKucuk=sayilar[0];
        enBuyuk=sayilar[0];

        for (int j : sayilar) {

            if (enKucuk > j) {
                enKucuk = j;

            }
            if (enBuyuk < j) {
                enBuyuk = j;

            }

        }
        System.out.println("dizideki en küçük değer => "+enKucuk+" en büyük değer => "+enBuyuk+" ortalama değer => "+ortalama);


        System.out.println("silmek istediğiniz sayıyı giriniz");
        int silinecekSayi=scan.nextInt();
        for (int sayi:sayilar){
            if (sayi==silinecekSayi)
            {
                dene=false;
                for (int i:sayilar){
                    if (i==silinecekSayi){
                        continue;
                    }else System.out.println(i);
                }
                System.out.println("girilen sayı Silindi");
            }
        }
        if (dene)
            System.out.println("girilen sayı Bulunamadı");

    }
}