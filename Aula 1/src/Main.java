//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int i = teclado.nextInt();
    System.out.println("Digite um numero menor que o anterior: ");
    int a = teclado.nextInt();
    while (i >= a){
        System.out.println(i);
        i = i - 1;
    }
}
