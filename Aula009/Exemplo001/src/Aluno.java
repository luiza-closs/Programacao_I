public class Aluno {
    
    String nome;
    String matricula;

    // Método de polimorfismo de sobrecarga no construtor
    public Aluno() {
        // Construtor padrão
        this.nome = "Indefinido";
        this.matricula = "00000";
    }

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
