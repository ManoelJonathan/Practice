package Padroes_GoF.State;

public class Reported implements StateInterface {

    private User user;

    public Reported(User user) {
        this.user = user;
    }

    public void report() {
        throw new IllegalStateException("A denúncia já foi reportada.");
    }

    public void analyze() {
        this.user.change(new IsAnalysis(this.user));
        System.out.println("O report passou para o estágio de análise.");
    }

    public void ban() {
        throw new IllegalStateException("Não podemos banir sem antes analisar a denúncia.");
    }

    public void resolve() {
        throw new IllegalStateException("Não podemos resolver sem antes analisar a denúncia.");
    }
}
