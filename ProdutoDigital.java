// Herança: ProdutoDigital herda de Produto
public class ProdutoDigital extends Produto {
    private double taxaDownload;

    public ProdutoDigital(String nome, double preco, double taxaDownload) {
        super(nome, preco);
        this.taxaDownload = taxaDownload;
    }

    // Polimorfismo: sobrescrevendo calcularPrecoFinal()
    @Override
    public double calcularPrecoFinal() {
        return preco + taxaDownload;
    }
}
