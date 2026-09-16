

    public class Conta {
        int numero;
        String titular;
        double saldo;
        double limite;

        public Conta(int numero, String titular, double saldo, double limite) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
            this.limite = limite;
        }

        boolean sacar(double valor) {
            if (!(valor > this.limite) && !(valor > this.saldo) && !(valor <= (double)0.0F)) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }

        boolean depositar(double valor) {
            if (valor <= (double)0.0F) {
                return false;
            } else {
                this.saldo += valor;
                return true;
            }
        }

        boolean transferir(Conta outra, double valor) {
            if (!this.sacar(valor)) {
                return false;
            } else {
                outra.depositar(valor);
                return true;
            }
        }

        void info() {
            System.out.println("Nome: " + this.titular);
            System.out.println("Numero: " + this.numero);
            System.out.println("Saldo: " + this.saldo);
            System.out.println("Limite: " + this.limite);
        }
    }


