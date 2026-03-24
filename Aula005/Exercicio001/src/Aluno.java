public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String matricula, String curso) {
        //Algo que foi herda da classe Pessoa, então usamos o super 
        //para chamar o construtor da classe pai  
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
    
}
