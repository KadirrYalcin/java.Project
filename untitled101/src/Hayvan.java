import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Hayvan {

    String ad;
    String tur;
    String cinsiyet;
    int yas;
    HashMap<String, Boolean> durumlar;
    ArrayList<String> gecmisIslemler;

    Boolean randevuVar=false;
    Date randevuTarihi;

    public Hayvan(String ad,String tur, String cinsiyet, int yas, HashMap<String, Boolean> durumlar, ArrayList<String> gecmisIslemler){
        this.tur=tur;
        this.cinsiyet=cinsiyet;
        this.yas=yas;
        this.durumlar=durumlar;
        this.gecmisIslemler=gecmisIslemler;
        this.ad=ad;
    }

    public void tedaviGecmisiGoruntule(){
        for (String s : gecmisIslemler) {
            System.out.println(ad+s);
        }
    }

    public void bilgileriGoruntule(){
        System.out.println("Türü: "+tur);
        System.out.println("Cinsiyeti: "+cinsiyet);
        System.out.println("Yaşı "+yas);
    }
}
