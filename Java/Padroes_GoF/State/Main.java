package Padroes_GoF.State;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User();

        user.analyze();
        user.ban();

        System.out.println();

        user2.analyze();
        user2.resolve();

        System.out.println();
        System.out.println("Causando as expections");
        user.report();
    }

}