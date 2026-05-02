package Padroes_GoF.State;

public class IsAnalysis implements StateInterface {
    private User user;

    public IsAnalysis(User user) {
        this.user = user;
    }

    public void report() {
        throw new IllegalStateException("O report já está sendo analisado, não pode ser reportado novamente.");
    }

    public void analyze() {
        throw new IllegalStateException("A denúncia já está no estado de análise.");
    }

    public void ban() {
        this.user.change(new IsBanned(this.user));
        System.out.println("Usuário banido após análise.");
    }

    public void resolve() {
        this.user.change(new Resolved(this.user));
        System.out.println("Caso resolvido após análise. Usuário considerado inocente.");
    }

}