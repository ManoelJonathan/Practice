package Lists.PlayerMusic;

public class Main {
    public static void main(String[] args) {
       
        Player player = new Player();

        
        System.out.println("--- Adicionando Músicas ---");
        player.addMusic("Bohemian Rhapsody - Queen");
        player.addMusic("Billie Jean - Michael Jackson");
        player.addMusic("Hotel California - Eagles");

        
        System.out.println("\n--- Ligando o Player ---");
        player.play();

       
        System.out.println("\n--- Testando Botão NEXT ---");
        player.next(); 
        player.next(); 
        player.next(); 

        
        System.out.println("\n--- Testando Botão PREVIOUS ---");
        player.previous(); 
        player.previous(); 

      
        System.out.println("\n--- Teste de Segurança ---");
        Player playerVazio = new Player();
        playerVazio.play();
    }
}