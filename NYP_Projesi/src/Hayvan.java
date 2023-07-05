public class Hayvan {
    private String yas;
    private String ID;
    private String ad;
    private Sahip sahip;

    public Hayvan() {
    }

    public Hayvan(String yas, String ID, String ad, Sahip sahip) {
        this.yas = yas;
        this.ID = ID;
        this.ad = ad;
        this.sahip = sahip;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
    //sahibin getter ve setteri yok
}
