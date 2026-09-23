public class Desktop extends Computador{
    int acessorios;

    public Desktop(int gbMemoria, int numProcessadores, int acessorios) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    double calculaValor() {
        return  200* gbMemoria + 400* numProcessadores + acessorios;

    }
}
