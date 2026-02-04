package Array.ArrayDinâmico;

public class ManoelList {
    public int[] arrayInterno;
    private int tamanhoAtual;

    public ManoelList(){
        this.arrayInterno = new int[2];
        this.tamanhoAtual = 0;
    }

    public void adicionar(int elemento){
        if(this.tamanhoAtual == this.arrayInterno.length){
            int[] novoArray = new int [arrayInterno.length * 2];
            for(int i = 0; i < arrayInterno.length; i++){
                novoArray[i] = arrayInterno[i];
            }
            this.arrayInterno = novoArray;
        }

        this.arrayInterno[this.tamanhoAtual] = elemento;
        this.tamanhoAtual++;
    }

    public int pegar(int index){
        if(index >= this.tamanhoAtual || index < 0){
            throw new IndexOutOfBoundsException("Index maior ou menor do que array");
        }
       return arrayInterno[index];
    }

    public int length(){
        return arrayInterno.length;
    }

}
