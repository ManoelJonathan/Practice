package Array.DasafioCinema;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cinema cine1 = new Cinema();


        cine1.buy();
        JOptionPane.showMessageDialog(null, cine1.toString());
    }
    
}
