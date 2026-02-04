package Classes;

public class Pedido {
    private String titulo;
    private int diasAtraso;
    private double valorMulta;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public void exibirDetalhes(){
        valorMulta = diasAtraso * 2.50;

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f\n  ",titulo,diasAtraso,valorMulta);
    }
}
