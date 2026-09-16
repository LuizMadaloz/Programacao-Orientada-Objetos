public class Main {
    public static void main(String[] args) {
        Nota Henry = new Nota();

        Henry.setNota1(9);
        Henry.setNota2(8);
        Henry.setFaltas(4);

        Henry.resultado();

        Henry.setNota1(5);
        Henry.setNota2(3);
        Henry.setFaltas(4);

        Henry.resultado();

        Henry.setNota1(9);
        Henry.setNota2(8);
        Henry.setFaltas(9);

        Henry.resultado();



    }
}
