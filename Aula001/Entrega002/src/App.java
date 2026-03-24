public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Para a questão anterior, proponha as instruções em Java para construir um objeto empregando 
         * cada um dos construtores da classe Conta
         */
        Conta conta1 = new Conta(); // Utiliza o construtor padrão
        Conta conta2 = new Conta(123, 1000.0); // Utiliza o construtor com parâmetros

        System.out.println("Conta 1: Número = " + conta1.getNumero() + ", Saldo = " + conta1.getSaldo());
        System.out.println("Conta 2: Número = " + conta2.getNumero() + ", Saldo = " + conta2.getSaldo());
    }
}