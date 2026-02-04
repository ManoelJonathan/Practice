package Array.JogoDaVelha;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha newJogo = new JogoDaVelha();
        int jogadas = 0;
        while (newJogo.eWinner() == 0 && jogadas < 9 ){
            JOptionPane.showMessageDialog(null, newJogo.toString());
            try{
                newJogo.play();
                jogadas++;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Jogada Inválida");
            }
        }
        JOptionPane.showMessageDialog(null, newJogo.toString());
        newJogo.winner();
    }
    
}
