public class Locadora {
    private Atendente atendente;
    private Carro[] carros = new Carro[20];

    public Locadora(Atendente atendente) {
        this.atendente = atendente;
    }

    public void adicionarCarro(Carro carro) {
        int indice = 0;
        while (indice < carros.length && carros[indice] != null) {
            indice++;
        }

        if (indice < carros.length) {
            carros[indice] = carro;
        }
    }

    /**
     * b.2) o método exibirCarros() deve imprimir apenas os carros
     * disponíveis, ou seja, aqueles que não estão emprestados;
     */
    public void exibirCarros() {
        System.out.println("Atendente Responsável:");
        atendente.exibirDados();
        System.out.println("Carros Disponíveis");
        for (int indice = 0; indice < carros.length; indice++) {
            Carro carro = carros[indice];
            if (carro != null) {
                if (!carro.getStatus()) {
                    carro.exibirCarro();
                    System.out.println("---");
                }
            }
        }
    }

}
