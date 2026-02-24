package Pilha;

public class Stack<T> {
    
    Node<T> topo;
    int length;

    public  Stack(){
        this.topo = null;
        length = 0;
    }

    public boolean isEmpty(){
        if(this.topo == null){
            return true;
        }else{
            return false;
        }
    }

    public void push(T data){
        Node<T> node = new Node<>(data);

        if(isEmpty()){
            this.topo = node;
            length++;
            return;
        }

        node.next = this.topo;
        this.topo = node;
        length++;
        return;

    }

    public T pop(){
        if(isEmpty()) return null;

        T valor = this.topo.data;
        this.topo = this.topo.next;
        length--;
        return valor;
    }

    public T peek(){
        if(isEmpty()) return null;

        T valor = this.topo.data;
        return valor;
    }

}
