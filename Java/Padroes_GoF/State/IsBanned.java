package Padroes_GoF.State;

public class IsBanned implements StateInterface {
    private User user;

    public IsBanned(User user) {
        this.user = user;
    }

    public void report() {
        throw new IllegalStateException("Usuário já foi banido. Sem mais ações.");
    }

    public void analyze() {
        throw new IllegalStateException("Usuário já foi banido. A análise já foi concluída.");
    }

    public void ban() {
        throw new IllegalStateException("O usuário já se encontra banido.");
    }

    public void resolve() {
        throw new IllegalStateException("Não é possível resolver. O usuário foi banido da plataforma.");
    }

}
