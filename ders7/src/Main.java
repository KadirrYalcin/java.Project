import java.util.Scanner;

public class Main {
    static Scanner tara=new Scanner(System.in);
    public static void main(String[] args) {
        soru3();
    }

    private static void soru4() {
        System.out.println("Lütfen bir sayı giriniz:");
        int sayi=tara.nextInt();
        for (int i=1;i<=sayi;i++){
            for (int k=0;k<sayi-i;k++)
                System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void soru3() {
        System.out.println("------ Vücut Kitle Indeksi Hesaplama Uygulaması ------");
        System.out.println("Kilonuzu giriniz(KG):");
        int kilo=tara.nextInt();
        System.out.println("Boyunuzu giriniz(METRE):");
        double boy= tara.nextDouble();
        double index= (kilo/(Math.pow(boy,2)));
        System.out.println("Indeksiniz "+index);
        if (index<18.4)
            System.out.println("Zayıfsınız");
        else if (18.4<=index && index< 24.9)
            System.out.println("Normalsiniz");
          else if (24.9<=index && index<29.9 )
            System.out.println("Kilolusunuz");
          else if (29.9<=index && index< 34.9)
            System.out.println("Şişmansınız");
          else if (34.9<=index && index< 44.9)
            System.out.println("Aşırı şişmansınız");
          else if (index> 44.9)
            System.out.println("Obezsiniz");

    }

    private static void soru2() {
        int randomSayi=(int) (Math.random()*100);
        int girilenSayi = 0;
        while (!(randomSayi==girilenSayi)){
            System.out.println("Bir sayi giriniz:");
            girilenSayi=tara.nextInt();
            System.out.println("---------------");
        }
        System.out.println("Tebrikler Buldunuz");
        System.out.println("girilen sayi  "+girilenSayi+"\nTutulan sayi  "+randomSayi);
    }

    private static void soru1() {
        System.out.println("Polidormik Kelime Programı");
        System.out.println("Kelime giriniz:");
        String kelime=tara.next();
        String yeniKelime="";
        for (int i=kelime.length();i>0;i--){

            yeniKelime=yeniKelime+kelime.charAt(i-1);

        }
        if (kelime.equals(yeniKelime)){
            System.out.println("Kelime polidormik");;
            System.out.println(kelime+" "+yeniKelime);
        }
        else{
            System.out.println("Kelime polidormik değil");
            System.out.println(kelime+" "+yeniKelime);
        }




    }
}