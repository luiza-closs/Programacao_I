import java.util.ArrayList;

public class Programador extends Funcionario {
    private String linguagemPreferida;
    private ArrayList<Linguagem> linguagens;

    public Programador(String nome, String sobrenome, int idade, String cracha, String linguagemPreferida) {
        super(nome, sobrenome, idade, cracha);
        this.linguagemPreferida = linguagemPreferida;
        this.linguagens = new ArrayList<>();
    }

    
    public String getLinguagemPreferida() {
        return linguagemPreferida;
    }

    //Verificar se o programador já tem 3 linguagens cadastradas antes de adicionar uma nova
    public void adicionarLinguagem(Linguagem linguagem) {
        if (linguagens.size() < 3) {
            linguagens.add(linguagem);
        } else {
            System.out.println("O programador já tem 3 linguagens cadastradas.");
        }
    }

    public String getTempoLinguagem(String nomeLinguagem) {
        for (Linguagem linguagem : linguagens) {
            if (linguagem.getNome().equalsIgnoreCase(nomeLinguagem)) {
                return getNomeCompleto() + " tem experiência em " + nomeLinguagem + " por " + linguagem.getExperienciaAnos() + " anos.";
            }
        }
        return getNomeCompleto() + " não tem experiência em " + nomeLinguagem + ".";
    }

    public ArrayList<Linguagem> getLinguagens() {
        return linguagens;
    }

}
