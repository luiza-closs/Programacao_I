public class TabelaBrasileirao extends Tabela {
    /* Tabela [][x] - onde x é:
     * 0 - pontos PTS
     * 1 - partidas PJ
     * 2 - vitorias VIT
     * 3 - empates E
     * 4 - derrotas DER
     * 5 - gols marcados GM
     * 6 - gols contra GC
     * 7 - saldo de gols SG
     */

    @Override
    public String primeiroLugar() {
        /**
         * 1) crie uma classe TabelaBrasileirao, filha de Tabela, e 
         * sobreponha o método primeiroLugar para que considere como 
         * segundo critério de desempate o saldo de gols;
         */
        String primeiro = super.primeiroLugar();
        int maiorPontuacao = 0;
        int maiorSaldoGols = 0;
        int tabela[][] = super.getTabela();
        String nomes[] = super.getNomes();
        for (int i = 0; i < 20; i++) {
            if ( tabela[i][0] > maiorPontuacao ) {
                primeiro = nomes[i];
                maiorPontuacao = tabela[i][0];
                maiorSaldoGols = tabela[i][7];
            } else if ( tabela[i][0] == maiorPontuacao && tabela[i][7] > maiorSaldoGols ) {
                primeiro = nomes[i];
                maiorSaldoGols = tabela[i][7];
            }
        }
        return primeiro;

    }

    @Override
    public void adicionaVitoria(String nomeClube, 
                                int golsMarcados, 
                                int golsSofridos) {
        /**
         * 2) sobrecarregue o método adicionaVitoria na nova classe 
         * TabelaBrasileirao para que se possa indicar a posição (linha) 
         * na tabela para o clube que se deseja adicionar a vitória, ao 
         * invés de indicar o nome.
         */
        for (int i = 0; i < 20; i++) {
            if ( i == Integer.parseInt(nomeClube) ) {
                super.adicionaVitoria(super.getNomes()[i], golsMarcados, golsSofridos);
                break;
            } 
        }
    }
}