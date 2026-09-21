public class Main {
   public void main(String[] args) {
       Autor autor1 = new Autor("Beto", "beto@email.com", "Brasileira");
       Autor autor2 = new Autor("Marcos", "marcos@email.com", "Portuguesa");
LivroFisico lf1 = new LivroFisico("Rei dos mares",autor1,"Aventura",1,1,3);
LivrosDigitais ld1 = new LivrosDigitais("Fogo",autor2,"ação",3,300,300);

lf1.info();
ld1.info();


}}