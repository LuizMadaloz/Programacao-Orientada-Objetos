public class Autor {

        private String autor;
        private String email;
        private String nacionalidade;

    public Autor(String autor, String email, String nacionalidade) {
        this.autor = autor;
        this.email = email;
        this.nacionalidade = nacionalidade;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public  void info(){
        System.out.println("Nome Autor: " + autor);
        System.out.println("email: " + email);
        System.out.println("Nacionalidade: " + nacionalidade);
    }
}

