public class Sahip extends Kisi{
    private String adres;

    public Sahip() {}

    public Sahip(String ad, String soyad, String adres) {
        super(ad, soyad);
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
