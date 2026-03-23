/**
 * Sistema de uma lanchonete, onde o garçom pode cadastrar produtos, 
 * criar pedidos, calcular o valor total do pedido e finalizar a conta.
 */
//import java.util.ArrayList;
//simport java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nomeProduto;
        double precoProduto;
        Cardapio cardapio = new Cardapio();
        // Cadastrar cardapio ou abrir novo pedido
        System.out.println("Bem-vindo à Lanchonete! Deseja cadastrar o cardápio? (s/n)");
        String resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("s")) {
            do{
                System.out.println("Digite o nome do produto:");
                nomeProduto = scanner.nextLine();
                System.out.println("Digite o preço do produto:");
                precoProduto = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha
                // Aqui você pode adicionar o produto ao cardápio
                cardapio.adicionarProduto(new Produto(nomeProduto, precoProduto));
                System.out.println("Produto " + nomeProduto + " cadastrado com sucesso!");
                System.out.println("Deseja cadastrar outro produto? (s/n)");
                resposta = scanner.nextLine();
            } while (resposta.equalsIgnoreCase("s"));

            cardapio.mostraCardapio();
        } else {
            System.out.println("Iniciando novo pedido...");
        }

        // Criando um pedido
        Pedido pedido = new Pedido();
        pedido.adicionarItem(cardapio.getProduto("Hambúrguer"), 2);
        pedido.adicionarItem(cardapio.getProduto("Refrigerante"), 2);
        pedido.adicionarItem(cardapio.getProduto("Batata Frita"), 1);

        // Calculando o valor total do pedido
        double total = pedido.calcularTotal();
        System.out.println("Valor total do pedido: R$ " + total);

        // Finalizando a conta
        pedido.finalizarConta();
    }
}