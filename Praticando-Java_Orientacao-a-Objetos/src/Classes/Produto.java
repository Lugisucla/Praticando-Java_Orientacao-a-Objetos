package Classes;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInfoProduto() {
        System.out.printf("Classes.Produto: %s \nPreço: %.2f \nQuantidade: %d\n", nome, preco, quantidade);
    }
}
