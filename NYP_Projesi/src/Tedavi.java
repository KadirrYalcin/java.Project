public class Tedavi {
    private String ilac;
    private String hastalik;
    private String tedaviTarihi;
    private Hayvan hayvan;
    private Veteriner veteriner;

    public Tedavi(){}

    public Tedavi(String ilac, String hastalik, String tedaviTarihi, Hayvan hayvan, Veteriner veteriner) {
        this.ilac = ilac;
        this.hastalik = hastalik;
        this.tedaviTarihi = tedaviTarihi;
        this.hayvan = hayvan;
        this.veteriner = veteriner;
    }

    public String getIlac() {
        return ilac;
    }

    public void setIlac(String ilac) {
        this.ilac = ilac;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }

    public String getTedaviTarihi() {
        return tedaviTarihi;
    }

    public void setTedaviTarihi(String tedaviTarihi) {
        this.tedaviTarihi = tedaviTarihi;
    }
}
