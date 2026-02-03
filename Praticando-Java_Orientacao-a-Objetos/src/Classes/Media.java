package Classes;

public class Media {
    private String nome;
    private double nota1;
    private double nota2;
    private double mediaNotas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void calculaMedia(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;

        mediaNotas = (nota1 + nota2)/2;
    }
}
