package Array.ArrayDinâmico;

public class Main {
    public static void main(String[] args) {
 ManoelList lista = new ManoelList();

        System.out.println("Adicionando elementos...");
        lista.adicionar(10);
        lista.adicionar(20); 
        lista.adicionar(30); 
        lista.adicionar(40); 

        System.out.println("Recuperando elementos:");
        
        
        System.out.println("Item 0: " + lista.pegar(0));
        System.out.println("Item 2: " + lista.pegar(2)); 

        
    }

}
