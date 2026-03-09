
from Stack import Stack
if __name__ ==  "__main__":
    pilha = Stack()

    pilha.push("Manoel")
    pilha.push("Senna")
    pilha.push("Memphis Depay")
    pilha.push("Hugo")
    pilha.push("João")

    print(f"Seu primeiro valor é: {pilha.peek()}")
    print()

    pilha.pop()

    print(f"O segundo valor da sua pilha é: {pilha.peek()}")