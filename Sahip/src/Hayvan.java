public abstract class Hayvan {
    String hayvanTuru;
    boolean hayvanIyi=true;
    boolean randevuVar;
    String randevuTarihi;

    @Override
    public String toString() {
        return "Hayvan{" +
                "hayvanIyi=" + hayvanIyi +
                ", randevuVar=" + randevuVar +
                ", randevuTarihi='" + randevuTarihi + '\'' +
                '}';
    }
}
