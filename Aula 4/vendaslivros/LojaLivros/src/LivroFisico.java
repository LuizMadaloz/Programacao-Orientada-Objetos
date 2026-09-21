public class LivroFisico extends Livros{
    private int tiragem;
    private int peso;

    public LivroFisico(String titulo, Autor autor, String genero, int edicao, int tiragem, int peso) {
        super(titulo, autor, genero, edicao);
        this.tiragem = tiragem;
        this.peso = peso;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public  void info() {
        super.info();
        System.out.println("Tiragem: " + tiragem);
        System.out.println("Peso: " + peso);
    }
}
