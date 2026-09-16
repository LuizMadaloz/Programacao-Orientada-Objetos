public class Main {
    public static void main(String[] args) {
            Conta c1 = new Conta(111, "Mario", (double)2000.0F, (double)500.0F);
            c1.info();
            if (!c1.sacar((double)2000.0F)) {
                System.out.println("Problema ao sacar");
            }

            if (!c1.depositar((double)-500.0F)) {
                System.out.println("Problema ao depositar");
            }

            c1.info();
            Conta c2 = new Conta(222, "Luigi", (double)4000.0F, (double)600.0F);
            c1.transferir(c2, (double)2000.0F);
            c1.info();
            c2.info();

    }
}