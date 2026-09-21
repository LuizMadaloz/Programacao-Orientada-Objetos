public abstract class Livros {
    private String titulo;
    private Autor autor;
    private static String genero;
    private int edicao;

    public Livros(String titulo, Autor autor, String genero, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.edicao = edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
    public  void info(){
        System.out.println("Titulo: " + titulo);
        this.autor.info();
        System.out.println("Gênero: " + genero);
        System.out.println("Edicao" + edicao);


    }
}
