import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        boolean bitir = false;
        double toplamNot = 0;
        int dersSayisi = 1;
        int toplamKredi = 0;


        while (!bitir) {
            System.out.println(dersSayisi + "Numaralı dersin Kredisini giriniz:");
            int kredi = tara.nextInt();
            toplamKredi += kredi;
            System.out.println(dersSayisi + "Numaralı dersin Notunu giriniz:");
            String not = tara.next();

            if (not.equalsIgnoreCase("AA")) {
                toplamNot += 4 * kredi;
            } else if (not.equalsIgnoreCase("BA")) {
                toplamNot += 3.5 * kredi;
            } else if (not.equalsIgnoreCase("BB")) {
                toplamNot += 3 * kredi;
            } else if (not.equalsIgnoreCase("CB")) {
                toplamNot += 2.5 * kredi;
            } else if (not.equalsIgnoreCase("CC")) {
                toplamNot += 2 * kredi;
            } else if (not.equalsIgnoreCase("DC")) {
                toplamNot += 1.5 * kredi;
            } else if (not.equalsIgnoreCase("DD")) {
                toplamNot += kredi;
            } else if (not.equalsIgnoreCase("FD")) {
                toplamNot += 0.5 * kredi;
            }
            dersSayisi += 1;
            System.out.println("Bitirmek için h'ye, devam etmek için herhangi bir tuşa tıklayınız:");
            String sonuc = tara.next();
            if (sonuc.equalsIgnoreCase("h")) {
                bitir = true;
            }
        }
            double agno = toplamNot / (toplamKredi);
            if (agno > 3 && agno < 3.5) {
                System.out.println("Agno'nuz " + agno + " Onur belgesi kazandınız.");
            } else if (agno > 3.5 && agno <= 4) {
                System.out.println("Agno'nuz " + agno + " Yüksek onur belgesi kazandınız.");
            } else

                System.out.println("Agno'nuz " + agno);


        }
    }