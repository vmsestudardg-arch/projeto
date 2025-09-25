import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void exibirResumo() {
        cliente.exibirDados();
        System.out.println("Itens do pedido:");
        double total = 0;
        for (Produto p : produtos) {
            p.exibirProduto();
            total += p.calcularPrecoFinal();
        }
        System.out.println("Total do pedido: R$ " + total);
    }
}
