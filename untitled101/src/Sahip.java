import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sahip extends Kisi{
    Scanner scan =new Scanner(System.in);

    private ArrayList<Hayvan> hayvanlar=new ArrayList<>();
    String sokakHayvaniKonumu;
    String sokakHayvaniTuru;
    boolean rancevuListesiBos=true;

    //Constructor
    public Sahip(String kullaniciAdi,String sifre) {
      super(kullaniciAdi,sifre);
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
                if (hayvan.durumlar.get("hayvanSaglikDurumu"))
                    System.out.println("Hayvanın durumu iyi.\n Geçmiş olsun");
                else
                    System.out.println("Hayvanınız henüz iyileşmedi.");
            }
            else System.out.println("Hayvanın randevusu bulunamadı");
        } else System.out.println("böyle bir hayvanınınz yok.Önce hayvanı kaydediniz.");

    }

    //Randevu alma
    public void randevuAl(Hayvan hayvan){
            if (hayvan.randevuVar){
                System.out.println("Hayvanınızın zaten kayıtlı randevusu bulunmakta");
                System.out.println(hayvan.randevuTarihi);
            }
            else {
                DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
                System.out.println("Hangi tarihe randevu oluşturmak istiyorsunuz?");
                String tarih = scan.next();
                try {
                    hayvan.randevuTarihi = df.parse(tarih);
                    hayvan.randevuVar = true;
                    hayvan.durumlar.put("hayvanSaglikDurumu", false);
                    System.out.println("Randevunuz oluşturuldu");
                } catch (ParseException e) {
                    System.out.println("Geçerli bir tarih giriniz!!!");
                }
            }
    }

    //Randevuları sorgula
    public void randevuSorgula(){
        for (Hayvan h:hayvanlar){
            if (h.randevuVar){
                System.out.println(h.ad+" dostunuzun "+h.randevuTarihi+" tarihli randevusu bulunmakta");
                rancevuListesiBos=false;
            }
        }
        if (rancevuListesiBos){
            System.out.println("Güncel randevunuz bulunmamaktadir.");
        }
    }
    //Hayvanların listesi
    public void hayvanlariGoruntule(){
        int i = 0;
        for (Hayvan hayvan : hayvanlar) {
            i++;
            System.out.println(i+"."+hayvan.ad+" hayvanın durumu: "+(hayvan.durumlar.get("hayvanSaglikDurumu") ? "iyi" : "kötü"));
        }
    }

    public void hayvanEkle(Hayvan hayvan){
        if (!(hayvanlar.contains(hayvan))){
            hayvanlar.add(hayvan);
        }
        else System.out.println("Hayvan zaten kayıtlı");
    }
    public ArrayList<Hayvan> getHayvanlar() {
        return hayvanlar;
    }
}
