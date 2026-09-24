public class Main {
   public static void main(String[] args) {
       Conta c1 = new Conta("João",4000);
       Conta c2 = new Conta("Maria",100000);
       Conta c3 = new Conta("Pedro",400.55);

       c1.info();
       c2.info();
       c3.info();
       c1.depositar(300);
       c1.info();
       c2.transferir(c3,1000);
       c2.info();
       c3.info();

       try {
           c2.sacar(-3000);
           c2.info();

       } catch (Exception e) {
           System.out.println("Ocorreu um erro");
           System.out.println(e.getMessage());
       }finally {
           System.out.println("-----------(;-----$#@%--");
           System.out.println("Por hoje é isso pessoal!");
       }


   }
}