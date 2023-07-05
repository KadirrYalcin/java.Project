public class Hayvan {
    private String cins;
    private int numarasi;

    @Override
    public String toString() {
        return "Hayvan{" +
                "cins='" + cins + '\'' +
                ", numarasi=" + numarasi +
                '}';
    }

    public Hayvan(String cins, int numarasi) {
        this.cins = cins;
        this.numarasi = numarasi;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public void setNumarasi(int numarasi) {
        this.numarasi = numarasi;
    }

    public String getCins() {
        return cins;
    }

    public int getNumarasi() {
        return numarasi;
    }
}
