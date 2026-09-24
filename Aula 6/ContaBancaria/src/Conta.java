public class Conta {
    String nome;
    double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
    public void info(){
        System.out.println("------------");
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(int valor){
        if (valor < 0){
        throw new RuntimeException("Valor tem que ser positivo");
        }
        saldo += valor;
    }

   public void sacar(int valor){
       if (valor < 0){
           throw new RuntimeException("Valor tem que ser positivo");
       }
        if(valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("O saque exede o saldo saldo=" + saldo);
        }

    }
    void transferir(Conta destino ,double valor){
        if (valor <= saldo && valor >=0){
        saldo -=valor;
        destino.saldo+=valor;}
    }
}
