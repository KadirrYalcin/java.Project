class Dugum {
    int veri;
    Dugum sol, sag;

    public Dugum(int veri){
        this.veri = veri;
        this.sol = null;
        this.sag = null;
    }
}

class IkiliAramaAgaci {
    Dugum kok = null;
    public void ekle(int veri){
        kok = ekleAgac(kok, veri);}

    private Dugum ekleAgac(Dugum node, int value) {
        if (node == null) {
            node = new Dugum(value);
            return node;}
        if (value < node.veri)
            node.sol = ekleAgac(node.sol, value);
        else if (value > node.veri)
            node.sag = ekleAgac(node.sag, value);
        return node;}

    public int sayDolu(){
        return sayDoluAgac(kok);}

    private int sayDoluAgac(Dugum dugum){
        if(dugum == null || dugum.sol == null || dugum.sag == null) {
            return 0;}
        int sayac = 1;
        sayac += sayDoluAgac(dugum.sol);
        sayac += sayDoluAgac(dugum.sag);
        return sayac;}

    public int say(){
        return sayAgac(kok);}

    private int sayAgac(Dugum dugum){
        if(dugum == null) {
            return 0;}
        int sayac = 1;
        sayac += sayAgac(dugum.sol);
        sayac += sayAgac(dugum.sag);
        return sayac;}

    private void yaprakDegerler(Dugum dugum) {
        if (dugum == null) {
            return;}
        if (dugum.sol == null && dugum.sag == null) {
            System.out.print(dugum.veri + " ");
        }else {
            yaprakDegerler(dugum.sol);
            yaprakDegerler(dugum.sag);}}

    private int yukseklik(Dugum dugum, int aranilan) {
        if (dugum == null) {
            return -1;}
        if (dugum.veri == aranilan) {
            return yukseklik(dugum);}
        int solY = yukseklik(dugum.sol, aranilan);
        if (solY >= 0) {
            return solY;}
        int sagY = yukseklik(dugum.sag, aranilan);
        if (sagY >= 0) {
            return sagY;}
        return -1;}

    private int yukseklik(Dugum dugum) {
        if (dugum == null) {
            return 0;}
        int solY = yukseklik(dugum.sol);
        int sagY = yukseklik(dugum.sag);
        return Math.max(solY, sagY) + 1;}

    private int altindaki(Dugum dugum, int aranilan) {
        if (dugum == null) {
            return -1;}
        if (dugum.veri == aranilan) {
            return 1;}
        int solD = altindaki(dugum.sol, aranilan);
        if (solD >= 0) {
            return solD + 1;}
        int sagD = altindaki(dugum.sag, aranilan);
        if (sagD >= 0) {
            return sagD + 1;}
        return -1;}

    private boolean ustBul(Dugum dugum, int aranilan) {
        if (dugum == null)
            return false;
        if (dugum.veri == aranilan)
            return true;
        if (ustBul(dugum.sol, aranilan)
                || ustBul(dugum.sag, aranilan)) {
            System.out.print(dugum.veri + " ");
            return true;}
        return false;}

    private boolean altBul(Dugum dugum, int aranilan){
        if(dugum == null){
            return false;}
        if (dugum.veri == aranilan)
            return true;
        if (altBul(dugum.sol, aranilan)) {
            System.out.println(dugum.sag.veri);
            return true;}
        if (altBul(dugum.sag, aranilan)) {
            System.out.println(dugum.sol.veri);
            return true;}
        return false;
    }

    public void agacBilgi(){
        System.out.println("Toplam düğüm sayısı : " + this.say());
        System.out.println("Kök düğüm değeri: " + kok.veri);
        System.out.println("Yaprakların değerleri:");
        yaprakDegerler(kok);
        System.out.println("Yükseklik :" + this.yukseklik(kok));
        System.out.println("X=10 değerine sahip düğümün ataları");
        ustBul(kok, 10);
        System.out.println("");
        System.out.println("Y=5 değerinin kardeşi");
        this.altBul(kok, 5);
        System.out.println("Z=9 değerinin yükseklik ve derinlik bilgisi");
        System.out.println("Yükseklik : " + this.yukseklik(kok, 9));
        System.out.println("Derinlik : " + this.altindaki(kok, 9));
    }
}
class Main {
    public static void main(String[] args){
        IkiliAramaAgaci ia = new IkiliAramaAgaci();
        ia.ekle(8);
        ia.ekle(4);
        ia.ekle(2);
        ia.ekle(3);
        ia.ekle(5);
        ia.ekle(7);
        ia.ekle(12);
        ia.ekle(9);
        ia.ekle(10);
        ia.ekle(14);
        System.out.println("Dolu Düğüm Sayısı");
        System.out.println(ia.sayDolu());
        ia.agacBilgi();
    }
}