def quick_sort(lista):
    if len(lista) <= 1:
        return lista

   
    pivo = lista[len(lista) // 2]



    
    esquerda = [x for x in lista if x < pivo]
    meio     = [x for x in lista if x == pivo]
    direita  = [x for x in lista if x > pivo]


    return quick_sort(esquerda) + meio + quick_sort(direita)


pontuacoes = [85, 20, 45, 90, 15, 60, 35, 10, 75, 50]
print("Ranking Ordenado:", quick_sort(pontuacoes))