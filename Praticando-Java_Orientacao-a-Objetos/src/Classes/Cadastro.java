package Classes;

public class Cadastro {
    private String nome;
    private String cargoAtual;
    private String cargoNovo;
    private int nivelAcessoAtual;
    private int nivelAcessoNovo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getCargoNovo() {
        return cargoNovo;
    }

    public void setCargoNovo(String cargoNovo) {
        this.cargoNovo = cargoNovo;
    }

    public int getNivelAcessoAtual() {
        return nivelAcessoAtual;
    }

    public void setNivelAcessoAtual(int nivelAcessoAtual) {
        this.nivelAcessoAtual = nivelAcessoAtual;
    }

    public int getNivelAcessoNovo() {
        return nivelAcessoNovo;
    }

    public void setNivelAcessoNovo(int nivelAcessoNovo) {
        this.nivelAcessoNovo = nivelAcessoNovo;
    }

    public void exibirAtualizacao() {
        System.out.println("--- Antes da atualização ---" +
                "\nNome:" + nome +
                "\nCargo: " + cargoAtual +
                "\nNível de acesso: "+ nivelAcessoAtual +
                "\n" +
                "--- Após atualização ---" +
                "\nNome: " + nome +
                "\nCargo: " + cargoNovo +
                "\nNível de acesso: " + nivelAcessoNovo);

    }
}
