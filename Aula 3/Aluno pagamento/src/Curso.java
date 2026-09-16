public class Curso {
    String nome;
    static double pagamento;

    public Curso(String nome, double pagamento) {
        this.nome = nome;
        this.pagamento = pagamento;
    }
    void info(){
        System.out.println("Curso: " + nome);
        System.out.println("Mensalidade: " + pagamento);
    }
}
