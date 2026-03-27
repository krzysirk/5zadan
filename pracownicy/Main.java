public class Main {
    public static void main(String[] args) {
        Programista p = new Programista();
        p.imie = "Jan";
        p.pensja = 8000;
        p.jezykProgramowania = "Java";

        Menadzer m = new Menadzer();
        m.imie = "Anna";
        m.pensja = 10000;
        m.premia = 2000;

        System.out.println(p.imie + " " + p.jezykProgramowania);
        System.out.println(m.imie + " premia: " + m.premia);
    }
}