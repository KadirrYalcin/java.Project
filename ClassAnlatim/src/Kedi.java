public class Kedi extends Hayvan{
    int biyikSayisi;
    Kedi(int ayakSayisi, String habitat,int biyikSayisi) {
        super(ayakSayisi, habitat);
        this.biyikSayisi=biyikSayisi;
    }

    @Override
    public void ayakSay() {
        System.out.println("Seni hiç alakadar etmez");
    }

}
