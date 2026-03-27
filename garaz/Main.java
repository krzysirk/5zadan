public class Main {
    public static void main(String[] args) {
        Samochod s1 = new Samochod();
        s1.marka = "Ford";
        s1.model = "Focus";
        s1.rokProdukcji = 2010;

        Samochod s2 = new Samochod();
        s2.marka = "Toyota";
        s2.model = "Corolla";
        s2.rokProdukcji = 2015;

        s1.wyswietlInfo();
        s2.wyswietlInfo();
    }
}