public class AlunoPosGraduacao extends Aluno {
    String linhaDePesquisa;

    public AlunoPosGraduacao() {
        super(); // Chama o construtor da classe pai (Aluno)
        this.linhaDePesquisa = "Indefinida";
    }

    public AlunoPosGraduacao(String nome, String matricula, String linhaDePesquisa) {
        super(nome, matricula); // Chama o construtor da classe pai (Aluno)
        this.linhaDePesquisa = linhaDePesquisa;
    }


    // Método de polimorfismo de sobreposição
    public double calcularMedia(double nota1, double nota2, double nota3) {
        // Para alunos de pós-graduação, a média é ponderada
        return (nota1 * 0.2 + nota2 * 0.2 + nota3 * 0.6);
    }
    
    // Método de polimorfismo de sobrecarga
    public double calcularMedia(double nota1, double nota2) {
        // Para alunos de pós-graduação, se houver apenas duas notas, a média é ponderada
        return (nota1 * 0.4 + nota2 * 0.6);
    }

    @Override
    public String toString() {
        return "AlunoPosGraduacao{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", linhaDePesquisa='" + linhaDePesquisa + '\'' +
                '}';
    }
}
