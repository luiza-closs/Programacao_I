import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Produto> produtos;

    public Cardapio() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public Produto getProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    //Função mostraCardapio que imprime todos os produtos cadastrados
    public void mostraCardapio(){
        for (Produto produto : produtos) {
            System.err.println(" | " + produto.getNome() + " - R$" + produto.getPreco());
        }
    }
}
