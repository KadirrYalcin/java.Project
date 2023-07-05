import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Sahip {
    Scanner scan =new Scanner(System.in);
    private String ad;
    private String soyad;
    private String tc;
    private ArrayList<Hayvan> hayvanlar=new ArrayList<>();
    String sokakHayvaniKonumu;
    String sokakHayvaniTuru;
    boolean rancevuListesiBos=true;


    //Constructor
    public Sahip(String ad, String soyad, String tc) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
    }

    //Sokak hayvani bildirme
    public void sokakHayvaniBildir(String sokakHayvaniKonumu, String sokakHayvaniTuru){
        this.sokakHayvaniKonumu=sokakHayvaniKonumu;
        this.sokakHayvaniTuru=sokakHayvaniTuru;
        System.out.println(sokakHayvaniKonumu+" Konumundaki "+sokakHayvaniTuru+" Bildirilmiştir.");
        System.out.println("Teşekkürler");
    }

    //Hayvan sagligi
    public void hayvanDurumu(Hayvan hayvan){

        if(hayvanlar.contains(hayvan)){
            if (hayvan.randevuVar){
                if (hayvan.hayvanIyi)
                    System.out.println("Hayvanın durumu iyi.\n Geçmiş olsun");
                else
                    System.out.println("Hayvanınız henüz iyileşmedi.");
            }
            else System.out.println("Hayvanın randevusu bulunamadı");
        } else System.out.println("böyle bir hayvanınınz yok.Önce hayvanı kaydediniz.");

    }

    //Randevu alma
    public void randevuAl(Hayvan hayvan){
        if(hayvanlar.contains(hayvan)){
            if (hayvan.randevuVar){
                System.out.println("Hayvanınızın zaten kayıtlı randevusu bulunmakta");
                System.out.println(hayvan.randevuTarihi);
            }
            else {
                System.out.println("Hangi tarihe randevu oluşturmak istiyorsunuz?");
                hayvan.randevuTarihi=scan.nextLine();
                hayvan.randevuVar=true;
                hayvan.hayvanIyi=false;
                System.out.println("Randevunuz oluşturuldu");
            }
        } else System.out.println("böyle bir hayvanınınz yok.Önce hayvanı kaydediniz.");
    }

    //Randevuları sorgula
    public void randevuSorgula(){
        for (Hayvan h:hayvanlar){
            if (h.randevuVar){
                System.out.println(h.hayvanTuru+" Canlısının "+h.randevuTarihi+" tarihli randevusu bulunmakta");
                rancevuListesiBos=false;
            }
        }
        if (rancevuListesiBos){
            System.out.println("Güncel randevunuz bulunmamaktadir.");
        }
    }

    //Aşıları sorgula


    public void hayvanEkle(Hayvan hayvan){
        if (!(hayvanlar.contains(hayvan)))
            hayvanlar.add(hayvan);
        else System.out.println("Hayvan zaten kayıtlı");
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getTc() {
        return tc;
    }
    public void setTc(String tc) {
        this.tc = tc;
    }
    public ArrayList<Hayvan> getHayvanlar() {
        return hayvanlar;
    }
}
