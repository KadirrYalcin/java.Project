import java.util.*;
     /*  for (int gecici:sayilar){
           System.out.print(gecici+",");
        }*/

public class Main {
    static final int OLUSTURULACAK_SAYI=1000000;
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();
        Set<Integer> onSayi=new TreeSet<>();
        HashMap<Integer,Integer> kisalt=new HashMap<>();

            randomSayilaraSayiAta(sayilar);

            sayiMiktariniHesapla(kisalt,sayilar);

            sansliSayilariBul(onSayi,sayilar);

            System.out.println(onSayi);
    }

    private static void sansliSayilariBul(Set<Integer> onSayi, List<Integer> sayilar) {
        while (onSayi.size()<10){
            int randomSayi=(int)(Math.random()*1000000);
            onSayi.add(sayilar.get(randomSayi));
        }
    }

    private static void sayiMiktariniHesapla(HashMap<Integer, Integer> kisalt,List<Integer> sayilar) {

        for (int gecici:sayilar){
            if(kisalt.containsKey(gecici)) {
                int value = kisalt.get(gecici);
                kisalt.put(gecici,++value);
            }
            else
                kisalt.put(gecici,0);
        }
    }

    private static void randomSayilaraSayiAta(List<Integer> sayilar) {
        for (int i=0;i<OLUSTURULACAK_SAYI;i++){

            sayilar.add( (int)(Math.random() * 60+1));
        }
    }
}

