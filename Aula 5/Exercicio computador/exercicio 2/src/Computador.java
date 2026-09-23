public abstract class Computador {
    int gbMemoria;
    int numProcessadores;

    public Computador(int gbMemeoria, int numProcessadores) {
        this.gbMemoria = gbMemeoria;
        this.numProcessadores = numProcessadores;
    }

    abstract double calculaValor();
}

