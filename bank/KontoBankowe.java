public class KontoBankowe {
    private double saldo;

    void wplac(double kwota) {
        saldo += kwota;
    }

    void wyplac(double kwota) {
        if (saldo >= kwota) {
            saldo -= kwota;
        } else {
            System.out.println("Brak środków");
        }
    }

    double getSaldo() {
        return saldo;
    }
}