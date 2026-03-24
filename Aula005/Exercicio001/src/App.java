public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("João", 30);

        Aluno aluno1 = new Aluno("Maria", 20, "2023001", "Engenharia de Software");

        pessoa1.getNome();
        pessoa1.getIdade();
        aluno1.exibirInformacoes();
    }
}
