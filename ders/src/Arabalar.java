public class Arabalar {

     String marka;
     String model;
     String renk;
     int yil;
     String sinif;
     String plaka;

    public Arabalar(String marka, String model, String renk, int yil, String sinif, String plaka) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.sinif = sinif;
        this.plaka = plaka;
    }

    @Override
    public String toString() {
        return "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", sinif='" + sinif + '\'' +
                ", plaka='" + plaka + '\'';
    }

}
