public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.matricula = "12345";

        double media = aluno1.calcularMedia(7.5, 8.0, 9.0);
        System.out.println("A média do aluno " + aluno1.nome + " é: " + media);

        AlunoPosGraduacao aluno2 = new AlunoPosGraduacao();
        aluno2.nome = "Maria";
        aluno2.matricula = "54321";
        aluno2.linhaDePesquisa = "Inteligência Artificial";

        double mediaPos = aluno2.calcularMedia(7.5, 9.0);
        System.out.println("A média do aluno de pós-graduação " + aluno2.nome + " é: " + mediaPos);

        Aluno aluno3 = new AlunoPosGraduacao(); // Polimorfismo de inclusão
        aluno3.nome = "Carlos";
        aluno3.matricula = "67890";
        double mediaPolimorfismo = aluno3.calcularMedia(7.5, 8.0, 9.0);
        System.out.println("A média do aluno " + aluno3.nome + " (polimorfismo) é: " + mediaPolimorfismo);

        //Turma Especial - Com alunos e alunos de pós-graduação
        Aluno turma[] = new Aluno[3];
        turma[0] = aluno1; // Aluno
        turma[1] = aluno2; // Aluno de pós-graduação
        turma[2] = aluno3; // Aluno de pós-graduação (polimorfismo)

        for (Aluno aluno : turma) {
            System.out.println(aluno.toString());
        }
    }
}
