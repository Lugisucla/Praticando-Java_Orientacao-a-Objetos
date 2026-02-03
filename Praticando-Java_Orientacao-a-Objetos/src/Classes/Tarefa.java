package Classes;

public class Tarefa {
    private String descricao;
    private boolean isConcluido;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluido() {
        return isConcluido;
    }

    public void setConcluido(boolean concluido) {
        isConcluido = concluido;
    }
}
