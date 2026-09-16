public class Nota {
    private double nota1;
    private double nota2;
    private  int faltas;

    public void setNota1(double nota){
        nota1 =nota;
    };
    public void setNota2(double nota){
        nota2 =nota;

    };
    public void setFaltas (int falta){
        faltas = falta;

    };



    void resultado(){
        double media = (nota1 + nota2)/2;

        if(media > 8 && faltas < 8){
            System.out.println("Media: " + media);
            System.out.println("Faltas: " + faltas);
            System.out.println("Aprovado com louvor");
        }else if(media > 7 && faltas < 8){
            System.out.println("Media: " + media);
            System.out.println("Faltas: " + faltas);
            System.out.println("Aprovado");
        }else{
            System.out.println("Media: " + media);
            System.out.println("Faltas: " + faltas);
            System.out.println("Desaprovado");
        }
    }
}
