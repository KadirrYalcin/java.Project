import java.util.ArrayList;

public class Musteri {
    private int tc;
    private String isim;
    private ArrayList<Hayvan> petler;

    public Musteri(int tc, String isim ) {
        this.tc = tc;
        this.isim = isim;
        petler=new ArrayList<>();
    }

    public ArrayList<Hayvan> getPetler() {
        return petler;
    }

    public void setPetler(Hayvan petler) {
        this.petler.add(petler);
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;

    }

    @Override
    public String toString() {
        return "Musteri{" +
                "tc=" + tc +
                ", isim='" + isim + '\'' +
                ", petler=" + petler +
                '}';
    }
}
