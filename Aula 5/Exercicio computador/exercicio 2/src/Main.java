public class Main{
void main(String[] args) {
    Desktop compA = new Desktop(1,3,100);
    Notebook compB = new Notebook(1,3,20);
    Computador  comp;
     comp = compA;

    System.out.println(comp.calculaValor());

    comp = compB;
    System.out.println();
    System.out.println(comp.calculaValor());

}}