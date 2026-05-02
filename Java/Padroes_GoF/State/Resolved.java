package Padroes_GoF.State;

public class Resolved implements StateInterface {
    private User user;

    public Resolved(User user) {
        this.user = user;
    }

    public void report() {
        throw new IllegalStateException("Este caso já foi resolvido e encerrado.");
    }

    public void analyze() {
        throw new IllegalStateException("Caso encerrado. Análise já foi concluída no passado.");
    }

    public void ban() {
        throw new IllegalStateException("Caso já foi resolvido e julgado inocente. Não é possível banir agora.");
    }

    public void resolve() {
        throw new IllegalStateException("A denúncia já se encontra no estado de resolvida.");
    }
}
