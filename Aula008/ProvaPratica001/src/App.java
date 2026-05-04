public class App {
    public static void main(String[] args) throws Exception {
        /**
         * b) Elabore uma classe de aplicação que crie instâncias das
         * classes para que seja possível demonstrar o funcionamento do
         * método Locadora.exibirCarros().
         */
        Atendente atendente = new Atendente("João", "123.456.789-00", "A001");
        Locadora locadora = new Locadora(atendente);
        Carro carro1 = new Carro("Toyota Corolla", "ABC-1234");
        Carro carro2 = new Carro("Honda Civic", "DEF-5678");
        locadora.adicionarCarro(carro1);
        locadora.adicionarCarro(carro2);
        locadora.exibirCarros();

        /**
         * c.2) crie uma classe de aplicação que demonstre o funcionamento
         * da locadora e das locações de maneira adequada e correta; não é
         * necessário a leitura das informações via teclado; as instâncias
         * podem ser criadas de maneira fixa na classe APP.
         */

        Cliente cliente = new Cliente("Maria", "987.654.321-00");
        cliente.alugarCarro(carro1);
        cliente.exibirDados();

        locadora.exibirCarros();

        cliente.devolverCarro();
        cliente.exibirDados();

        locadora.exibirCarros();
    }
}




