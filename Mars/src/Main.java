import java.io.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        System.out.println(marstakiHarfleriSay());;

    }

    private static int marstakiHarfleriSay() {
    int satirSayisi=0;
    int harfSayisi=0;
       try(BufferedReader dosya=new BufferedReader(new FileReader("Mars.dat"))){
           String satir=dosya.readLine();
            while (satir!=null){
                satirSayisi++;
                String[] kelime=satir.split(" ");
                for(String harf:kelime){
                    harfSayisi+=harf.length();


                }
                satir=dosya.readLine();
            }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }
       return harfSayisi;


    }



}