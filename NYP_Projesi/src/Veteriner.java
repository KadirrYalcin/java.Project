public class Veteriner extends Kisi{
    private String lisans;

    public Veteriner() {}

    public Veteriner(String ad, String soyad, String lisans) {
        super(ad, soyad);
        this.lisans = lisans;
    }

    public String getLisans() {
        return lisans;
    }

    public void setLisans(String lisans) {
        this.lisans = lisans;
    }
}
