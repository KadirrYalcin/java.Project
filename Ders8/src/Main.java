import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);


        System.out.println("Toplam borc miktarını giriniz:");
        double borc=tara.nextDouble();
        Fatura a=new Fatura(borc);
        a.BorcOde();


    }
}