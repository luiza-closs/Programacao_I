public class App {
    public static void main(String[] args) throws Exception {
        Correntista joao = new Correntista("João Silva Pereira Santos", 
                                       "Rua A, 123", 
                                            "123.456.789-00");

        Conta conta001 = new Conta(001, 1000, joao);
        conta001.depositar(500);
        conta001.depositar(500);
        conta001.sacar(200);
        conta001.extratoResumo();
        System.out.println("-----------------------------");
        conta001.extratoCompleto();
    }
}
