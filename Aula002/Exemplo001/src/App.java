public class App {
    public static void main(String[] args) throws Exception {
        
        Livro livro1 = new Livro("A Hipótese do Amor", 
                                 "Ali Hazelwood", 
                                 2021);

        String ficha1 = livro1.getFicha();
        System.out.println(ficha1);

    }
}
