public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Polimorfismo: pode ser sobrescrito por subclasses
    public double calcularPrecoFinal() {
        return preco;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}
