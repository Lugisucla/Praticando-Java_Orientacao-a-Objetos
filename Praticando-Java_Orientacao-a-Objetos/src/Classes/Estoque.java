package Classes;

public class Estoque {
    private String nome;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void vender(int quantidadeComprada){
        if (quantidadeComprada > quantidade) {
            System.out.println("Estoque insuficiente.");
        } else {
            quantidade -= quantidadeComprada;
            System.out.println("Venda realizada. Estoque restante de Camiseta: " + quantidade);
        }
    }
}
