public class Main {
    public static void main(String[] args) {
        Biblioteka b = new Biblioteka();

        Ksiazka k1 = new Ksiazka();
        k1.tytul = "pan tadeusz";
        k1.autor = "adam nickiewicz";

        Ksiazka k2 = new Ksiazka();
        k2.tytul = "Lalka";
        k2.autor = "boleslaw prus";

        Ksiazka k3 = new Ksiazka();
        k3.tytul = "przedwiosnie";
        k3.autor = "stefan zeromski";

        b.dodajKsiazke(k1);
        b.dodajKsiazke(k2);
        b.dodajKsiazke(k3);

        b.wyswietlWszystkie();
    }
}
