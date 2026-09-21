public class LivrosDigitais extends Livros{
    private int download;
    private double  tamanho;

    public LivrosDigitais(String titulo, Autor autor, String genero, int edicao, int download, double tamanho) {
        super(titulo, autor, genero, edicao);
        this.download = download;
        this.tamanho = tamanho;
    }

    @Override
    public  void info() {
        super.info();
        System.out.println("Download: " + download);
        System.out.println("Tamanho: " + tamanho);
    }
}
