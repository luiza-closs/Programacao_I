import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        this.itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void finalizarConta() {
        //listar os itens do pedido
        for (ItemPedido item : itens) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome() + " - R$ " + item.getProduto().getPreco());
        }
        System.out.println("Conta finalizada. Total a pagar: R$ " + calcularTotal());
    }   
}
