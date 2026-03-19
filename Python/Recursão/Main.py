from Recursao import Recursao

if __name__ == "__main__":
    f = Recursao()

    resultado = f.fatorial(5)
    print(f"O fatorial de 5 é: {resultado}")
    print()

    c = Recursao()
    print("Contagem Regressiva")
    c.contLess(5)
    print()

    soma = Recursao()
    array = [2,4,4]
    print(f"A soma deste array {array} é {soma.somaArray(array)}")