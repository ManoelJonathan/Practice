from Queue import Queue

if __name__ == "__main__":
    filaAtendimento = Queue[str]() 

    print(f"Fila vazia? {filaAtendimento.isEmpty()}")

    print("\n--- Chegou gente ---")
    filaAtendimento.enqueue("João")
    filaAtendimento.enqueue("Maria")
    filaAtendimento.enqueue("José")

    print(f"Tamanho da fila: {filaAtendimento.length}")
    
    
    proximo = filaAtendimento.peek()
    if proximo:
        print(f"Próximo a ser atendido: {proximo}")
    else:
        print("Ninguém na fila.")

    print("\n--- Atendendo ---")
    while not filaAtendimento.isEmpty():
        atendido = filaAtendimento.dequeue()
        print(f"Atendendo: {atendido}")

    print("\n--- Fila acabou ---")
    print(f"Tenta atender mais um: {filaAtendimento.dequeue()}")