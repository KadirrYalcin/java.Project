import javax.lang.model.type.ArrayType;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sahipKullanici = new ArrayList<>();
        ArrayList<String> sahipParola = new ArrayList<>();
        ArrayList<String> veterinerKullanici=new ArrayList<>();
        ArrayList<String> veterinerParola=new ArrayList<>();
        veterinerKullanici.add("admin");
        veterinerParola.add("123456");
        VeterinerAuthentication veterinerAuthentication=new VeterinerAuthentication(veterinerKullanici,veterinerParola);
        OwnerAuthentication ownerAuthentication = new OwnerAuthentication();
        Scanner input = new Scanner(System.in);
        int order = 0;
        Boolean oturumDurumu = false;

        while(true){

                System.out.println("1-Kullanıcı girişi yap\n2-Veteriner girişi yap\n3-Kullanıcı kayıt ol\n4-Çıkış Yap");
                order = input.nextInt();
                if (order<0|| order>4){
                    System.out.println("Geçerli bir sayı giriniz");
                }
                if (order == 1) {

                    System.out.println("Kullanıcı adınız: ");
                    String kullaniciAdi = input.next();
                    System.out.println("Parolanız: ");
                    String parola = input.next();
                    int sahiplerIndex=ownerAuthentication.logIn(kullaniciAdi, parola);
                    if (sahiplerIndex!=-1) {
                        Sahip sahip=Veteriner.sahipler.get(sahiplerIndex);
                        System.out.println("Hoşgeldiniz " + kullaniciAdi);
                        Boolean state = true;
                        while (true) {
                            int order1;
                                System.out.println("1-Hayvan ekle\n2-Hayvanlarını Görüntüle\n3-Randevu Al\n4-Randevu Sorgula\n5-Çıkış Yap");
                                order1 = input.nextInt();
                                if (order1<0 || order1>5) {
                                    System.out.println("Geçerli bir sayı giriniz");
                                }
                                if (order1 == 1) {
                                    String ad;
                                    String tur;
                                    String cinsiyet;
                                    int yas;
                                    HashMap<String, Boolean> durumlar = new HashMap<>();
                                    ArrayList<String> gecmisIslemler = new ArrayList<>();
                                    System.out.println("Hayvanın adı:");
                                    ad = input.next();
                                    System.out.println("Hayvanın türü: ");
                                    tur = input.next();
                                    System.out.println("Hayvanın cinsiyeti: ");
                                    cinsiyet = input.next();
                                    System.out.println("Hayvanın yaşı: ");
                                    yas = input.nextInt();
                                    System.out.println("Hayvanın sağlığı iyi/kötü ");
                                    if (input.next().equalsIgnoreCase("iyi")) durumlar.put("hayvanSaglikDurumu", true);
                                    else durumlar.put("hayvanSaglikDurumu", false);
                                    System.out.println("Hayvan kısır mı?");
                                    if (input.next().equalsIgnoreCase("evet")) durumlar.put("kisirlastirma", true);
                                    else durumlar.put("kisirlastirma", false);
                                    System.out.println("Hayvan kuduz aşısı oldu mu?");
                                    if (input.next().equalsIgnoreCase("evet")) durumlar.put("Kuduz", true);
                                    else durumlar.put("Kuduz", false);
                                    durumlar.put("Ateş",false);
                                    durumlar.put("İshal",false);
                                    durumlar.put("Doğum",false);
                                    durumlar.put("Sakinleştirici",false);
                                    Hayvan hayvan = new Hayvan(0, ad, tur, cinsiyet, yas, durumlar, gecmisIslemler);
                                    sahip.hayvanEkle(hayvan);
                                    System.out.println("Hayvan kaydı oluşturuldu");
                                }
                                if(order1==2){
                                    System.out.println("size kayıtlı dostlarınız");
                                    sahip.hayvanlariGoruntule();
                                }
                                if(order1==3){
                                    System.out.println("Lütfen bir hayvanı seçin");
                                    sahip.hayvanlariGoruntule();
                                    ArrayList<Hayvan> hayvanlar=sahip.getHayvanlar();
                                    int index=input.nextInt()-1;
                                    if(index<=hayvanlar.size()){
                                        sahip.randevuAl(hayvanlar.get(index));
                                    }
                                    else{
                                        System.out.println("Lütfen geçeri bir sayı girin");
                                    }
                                }
                                if(order1==4){
                                    sahip.randevuSorgula();
                                }
                                if(order1==5){
                                    break;
                                }

                        }
                    }
                }
                if(order==2){
                    System.out.println("Veteriner girişi yapmayı seçtiniz!!!\nLütfen kullanıcı adınızı giriniz: ");
                    String kullaniciAdiAdmin=input.next();
                    System.out.println("Parola: ");
                    String parolaAdmin=input.next();
                    boolean veterinerDurum= (veterinerAuthentication.logIn(kullaniciAdiAdmin, parolaAdmin) == 1);
                    while(veterinerDurum){
                        Veteriner veteriner=veterinerAuthentication.veterinerCagir(kullaniciAdiAdmin,parolaAdmin);
                        int order2=0;
                        System.out.println("1-Hayvanları Görüntüle");
                        System.out.println("2-Aşı Yap");
                        System.out.println("3-Kısırlaştır");
                        System.out.println("4-Diğer tedavi yöntemleri");
                        System.out.println("5-Randevuları Görüntüle");
                        System.out.println("6-Geçmiş tedavileri görüntüle");
                        System.out.println("7-Çıkış yap");
                        order2=input.nextInt();
                        if(order2==1){
                            for (Sahip sahip : Veteriner.sahipler) {
                                System.out.println(sahip.kullaniciAdi+" adlı kullanıcı adına sahip kişinin dostları: ");
                                sahip.hayvanlariGoruntule();
                            }

                        }
                        if(order2==2){
                            for (Sahip sahip : Veteriner.sahipler) {
                                System.out.println(sahip.kullaniciAdi+" adlı kullanıcı adına sahip kişinin dostları: ");
                                sahip.hayvanlariGoruntule();
                            }
                            System.out.println("Kaçıncı kişinin hayvanına aşı yapmak istiyorsunuz");
                            int sahipNumara=input.nextInt()-1;

                            System.out.println("Kaçıncı hayvana aşı yapmak istiyorsunuz");
                            int sahipHayvan=input.nextInt()-1;
                            for (Asi asi:veteriner.asiTurleri){
                                System.out.println(asi.isim);
                            }
                            System.out.println("Kaçıncı aşıyı yapmak istiyorsunuz");
                            int asiNumarasi=input.nextInt()-1;
                            veteriner.asiYap(Veteriner.sahipler.get(sahipNumara).getHayvanlar().get(sahipHayvan),veteriner.asiTurleri.get(asiNumarasi),veteriner.asiTurleri.get(asiNumarasi).isim);
                            veteriner.tedaviGecmisiEkle(veteriner.asiTurleri.get(asiNumarasi).isim+" aşısı yapıldı",Veteriner.sahipler.get(sahipNumara).getHayvanlar().get(sahipHayvan));

                        }
                        if (order2==3){
                            for (Sahip sahip : Veteriner.sahipler) {
                                System.out.println(sahip.kullaniciAdi+" adlı kullanıcı adına sahip kişinin dostları: ");
                                sahip.hayvanlariGoruntule();
                            }
                            System.out.println("Kaçıncı kişinin hayvanını kısırlarştırmak istiyorsunuz");
                            int sahipNumara=input.nextInt()-1;

                            System.out.println("Kaçıncı hayvanı kısırlaştırmak istiyorsunuz");
                            int sahipHayvan=input.nextInt()-1;
                            veteriner.kisirlastir(Veteriner.sahipler.get(sahipNumara).getHayvanlar().get(sahipHayvan),"Kısırlaştırma");

                        }
                        if (order2==4){
                                    for (Sahip sahip : Veteriner.sahipler) {
                                        System.out.println(sahip.kullaniciAdi+" adlı kullanıcı adına sahip kişinin dostları: ");
                                        sahip.hayvanlariGoruntule();
                                    }
                                    System.out.println("Kaçıncı kişinin hayvanına tedavi uygulamak istiyorsunuz");
                                    int sahipNumara=input.nextInt()-1;

                                    System.out.println("Kaçıncı hayvana tedavi uygulamak istiyorsunuz");
                                    int sahipHayvan=input.nextInt()-1;
                                    System.out.println("Sorunu giriniz");
                                    input.nextLine();
                                    String sorun=input.nextLine();
                                    System.out.println("Tedavi yöntemini giriniz");

                                    String tedavi=sorun+input.nextLine();
                                    veteriner.tedaviGecmisiEkle(tedavi,Veteriner.sahipler.get(sahipNumara).getHayvanlar().get(sahipHayvan));
                        }
                        if(order2==5){
                            for (Sahip sahip : Veteriner.sahipler) {
                                System.out.println(sahip.kullaniciAdi+" adlı kullanıcı adına sahip kişinin randevuları:");
                                sahip.randevuSorgula();
                            }
                        }
                        if (order2 == 6) {
                            for (int i = 0; i < Veteriner.sahipler.size(); i++)
                                for (Sahip sahip : Veteriner.sahipler) {
                                    for (Hayvan hayvan : Veteriner.sahipler.get(i).getHayvanlar()) {
                                        System.out.println(sahip.kullaniciAdi+" Kişisinin dostlarının randevu geçmişi");
                                        hayvan.tedaviGecmisiGoruntule();
                                    }
                                }
                        }

                        if(order2==7)break;
                    }
                }
                if(order==3){
                    System.out.print("Kullanıcı adınızı giriniz: ");
                    String kullaniciAdi1=input.next();
                    System.out.print("Parolanızı giriniz: ");
                    String parola1=input.next();
                    ownerAuthentication.signIn(kullaniciAdi1,parola1);
                    Sahip sahip=new Sahip(kullaniciAdi1,parola1);
                    Veteriner.sahipler.add(sahip);
                }
                if(order==4){
                    break;
                }
        }

    }
}
