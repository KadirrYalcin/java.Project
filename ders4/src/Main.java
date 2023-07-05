public class Main {
    public static void main(String[] args) {
            Kedi h1=new Kedi("Van kedisi",1);
            Kedi h2=new Kedi("Panter",2);
            Kedi h3=new Kedi("Aslan",3);
            Kopek h4=new Kopek("Aslan",3);
            Kopek h5=new Kopek("Aslan",3);
            Kopek h6=new Kopek("Aslan",3);


            Musteri m1=new Musteri(15863,"Arda");
            m1.setPetler(h1);
            m1.setPetler(h2);
            m1.setPetler(h3);
            m1.setPetler(h4);
            m1.setPetler(h5);
            m1.setPetler(h6);
        System.out.println(m1.getPetler());

    }
}
