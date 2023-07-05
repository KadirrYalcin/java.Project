import java.util.Scanner;

public class WelcomeScreenFonksiyon {
    public static void kayitEkrani(OwnerAuthentication ownerAuthentication, Scanner input) {
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciAdi1= input.next();
        System.out.print("Parolanızı giriniz: ");
        String parola1= input.next();
        ownerAuthentication.signIn(kullaniciAdi1,parola1);
        Sahip sahip=new Sahip(kullaniciAdi1,parola1);
        Veteriner.sahipler.add(sahip);
    }
    public static void welcomeScreen(VeterinerAuthentication veterinerAuthentication, OwnerAuthentication ownerAuthentication, Scanner input) {
        int order;
        while(true){
            SahipFonksiyon.sahipGiris();
            order = input.nextInt();
            if (order<0|| order>4){
                //kontrol ediyoruz
                System.out.println("Geçerli bir sayı giriniz");
            }
            if (order == 1) {
                SahipFonksiyon.sahipEkrani(ownerAuthentication, input);
            }
            if(order==2){
                VeterinerFonksiyon.veterinerEkrani(veterinerAuthentication, input);
            }
            if(order==3){
                kayitEkrani(ownerAuthentication, input);
            }
            if(order==4){
                break;
            }
        }
    }
}
