import java.time.Year;

public class Livro {
    
    String titulo;
    String autor;
    int anoPublicacao;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0 && anoPublicacao <= Year.now().getValue()) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("Ano de publicação inválido.");
        }
        this.anoPublicacao = anoPublicacao;
    }
}
