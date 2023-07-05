import java.util.Scanner;

public class BankaHesabi {
    Scanner tara=new Scanner(System.in);
    private int musteriNumarasi;
    private String ad;
    private String soyad;
    private int telefonNumarasi;
    private String ePosta;
    private double toplamPara;
    private double borc;
    private double alabilecegiBorc=1000;

    public void setToplamPara(double toplamPara) {
        this.toplamPara = toplamPara;
    }

    public void setBorc(double borc) {
        this.borc = borc;
        alabilecegiBorc-=borc;
    }

    public BankaHesabi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public double getToplamPara() {
        return toplamPara;
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
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

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getePosta() {
        return ePosta;
    }

    public void setePosta(String ePosta) {
        this.ePosta = ePosta;
    }

    public double getAlabilecegiBorc() {
        return alabilecegiBorc;
    }

    public void setAlabilecegiBorc(double alabilecegiBorc) {
        this.alabilecegiBorc = alabilecegiBorc;
    }

    public void borclandir(){
        System.out.println("Cekmek istediğiniz miktari giriniz:");
        double istenenPara=tara.nextDouble();
       if (istenenPara>alabilecegiBorc) {
            System.out.println("Bu kadar cok borc çekemezsiniz.");

        } else {
            alabilecegiBorc=alabilecegiBorc-istenenPara;
            borc+=istenenPara;
           System.out.println("Kullanabileceğiniz borc limiti "+alabilecegiBorc+"TL");
        }

    }
    public void borcOde(){
        System.out.println("Odemek istediğiniz miktarı giriniz:");
        double miktar=tara.nextDouble();
        if (miktar>borc){
            toplamPara=toplamPara+miktar-borc;
            alabilecegiBorc=1000;
            System.out.println("Arta kalan "+(miktar-borc)+"TL hesabınıza yatırıldı.");
            borc=0;

        }else{
            borc=borc-miktar;
            System.out.println(borc+"TL Borcunuz kaldı.");
        }
    }

    public void paraYatir(){
        System.out.println("Yatırmak istediğiniz miktarı giriniz:");
        double miktar=tara.nextDouble();
        if (miktar>0){
            toplamPara+=miktar;
            System.out.println(miktar+"TL Hesabınıza yatırıldı.\nYeni bakiyeniz "+toplamPara);
        }else {
            System.out.println("Gecerli bir rakam giriniz.");
        }
    }

    public void paraCek(){
        System.out.println("Cekmek istediğiniz miktarı giriniz:");
        double miktar=tara.nextDouble();
        if (miktar>toplamPara){
            System.out.println("Yeterli bakiyeniz bulunmamakta.");

        }else {
            toplamPara-=miktar;
            System.out.println("Kalan miktar "+toplamPara);
        }
    }
}
