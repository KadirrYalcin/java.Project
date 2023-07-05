import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Hayvan kedi1=new Kedi();
        Hayvan kopek1=new Kopek();
    Sahip s1=new Sahip("Kadir","Yalçın","123456789");
    s1.hayvanEkle(kedi1);
    s1.hayvanEkle(kopek1);
    s1.randevuAl(kedi1);
    s1.hayvanDurumu(kedi1);
    s1.randevuSorgula();
    }

}