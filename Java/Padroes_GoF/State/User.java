package Padroes_GoF.State;

public class User{
    
    private StateInterface state;

    public User(){
        this.state = new Reported(this);
    }

    public void change(StateInterface state){
        this.state = state;
    }

    public void report() {
        this.state.report();
    }

    public void analyze() {
        this.state.analyze();
    }

    public void resolve() {
        this.state.resolve();
    }

    public void ban() {
        this.state.ban();
    }
}