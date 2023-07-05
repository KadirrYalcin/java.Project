import java.util.Scanner;

public class Fatura {
    Scanner tara=new Scanner(System.in);
   private double borc;
   private int musteriNo;

    public Fatura(double borc) {
        this.borc = borc+0.0000001;

        musteriNo=123456;
    }
    public void BorcOde(){
        System.out.println("Odemek istediğiniz borc miktarı:");
        double verilenPara=tara.nextDouble();
        if (verilenPara>borc){
            verilenPara = verilenPara+0.00001;
            paraUstuHesapla(verilenPara);
        }
        else System.out.println("Kalan borcunuz"+(borc-verilenPara));

    }

    public void paraUstuHesapla(double verilenPara){
        double fark=verilenPara-borc;
        int ikiYuzluk=(int)(fark/200);
        fark=fark-ikiYuzluk*200;
        int yuzluk=(int)(fark/100);
        fark=fark-yuzluk*100;
        int ellilik=(int)(fark/50);
        fark=fark-ellilik*50;
        int yirmilik=(int)(fark/20);
        fark=fark-yirmilik*20;
        int onluk=(int)(fark/10);
        fark=fark-onluk*10;
        int beslik=(int)(fark/5);
        fark=fark-beslik*5;
        int birlik=(int)(fark);
        fark=fark-birlik;
        int elliKurus=(int)(fark/0.50);
        fark=fark-elliKurus*0.5;
        int yirmiBesKurus=(int)(fark/0.25);
        fark=fark-yirmiBesKurus*0.25;
        int onKurus=(int)(fark/0.10);
        fark=fark-onKurus*0.10;
        int besKurus=(int)(fark/0.05);
        fark=fark-besKurus*0.05;
        System.out.println(ikiYuzluk+"->ikiyüzlük, \n"
                +yuzluk+"->yüzlük, \n"
                +ellilik+"->ellilik, \n"
                +yirmilik+"->yirmilik, \n"
                +onluk+"->onluk, \n"
                +beslik+"->beşlik, \n"
                +birlik+"->birlik, \n"
                +elliKurus+"->elli kuruşluk, \n"
                +yirmiBesKurus+"->yirmi beş kuruşluk, \n"
                +onKurus+"->on kuruşluk \n"
                +besKurus+"->beş kuruşluk");
    }
}
class a extends Fatura{
    public a(double borc) {
        super(borc);
    }
}
class b extends Fatura{
    public a(double borc) {
        super(borc);
    }
}