import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int secim;
            int index;
            boolean cikis=false;
            String renk;
            Scanner tara=new Scanner(System.in);
            List<Arabalar> arabalar=new ArrayList<>();

            arabalar.add(new Arabalar("Toyota","CHR","gri",2017,"SUV","06 ABC 123"));
            arabalar.add(new Arabalar("OPEL","Corsa","mavi",2016,"Sedan","06 AC 543"));
            arabalar.add(new Arabalar("Honda","Civic","sarı",2001,"Sedan","07 DF 123"));
            arabalar.add(new Arabalar("Ferrari","falan","Beyaz",2021,"Sedan","06 ABC 123"));
            arabalar.add(new Arabalar("BMW","filan","siyah",2021,"SUV","16 FV 423"));
            arabalar.add(new Arabalar("Hyundai","inter","sarı",2001,"SUW","17 IB 753"));
            arabalar.add(new Arabalar("Mercedes","Milan","siyah",1991,"Sedan","06 GC 83"));

                while (!cikis){
                    System.out.println("Arabaları sıralamak için 1\nİstenilen Numaralı indexteki araç için 2\nİstenilen araç rengi için 3\nCıkış için 4\nTıklayınız");
                    secim=tara.nextInt();
                    switch (secim){
                        case 1:
                            for (Arabalar a:arabalar){
                                System.out.println(a);
                            }
                            System.out.println("\n");
                            break;
                        case 2:
                            System.out.println("Hangi indexteki arabayı görmek istiyorsunuz");
                           index=tara.nextInt();
                            System.out.println(arabalar.get(index));
                            System.out.println("\n");
                            break;
                        case 3:
                            System.out.println("Hangi renk arabayı sıralamak istiyorsunuz");
                            renk=tara.next();
                            for (Arabalar a:arabalar){
                                if (a.renk.equalsIgnoreCase(renk)){
                                    System.out.println(a);
                                }}break;
                        case 4:
                            System.out.println("Sistemden çıkılıyor..");
                            cikis=true;
                            break;
                    }
                }


            }
    }
}
