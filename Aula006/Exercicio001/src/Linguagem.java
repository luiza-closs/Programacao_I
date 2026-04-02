public class Linguagem {
    private String nome;
    private int experienciaAnos;
    private int rankingPreferencia;

    public Linguagem(String nome, int experienciaAnos, int rankingPreferencia) {
        this.nome = nome;
        this.experienciaAnos = experienciaAnos;
        this.rankingPreferencia = rankingPreferencia;
    }

    public String getNome() {
        return nome;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }

    public int getRankingPreferencia() {
        return rankingPreferencia;
    }
    
}
