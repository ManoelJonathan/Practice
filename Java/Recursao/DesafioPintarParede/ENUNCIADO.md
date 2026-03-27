# Desafio: Balde de Tinta (Flood Fill)

Este exercicio tem como objetivo praticar **recursao** em Java usando uma matriz 2D.

## Enunciado

Voce possui uma "tela" representada por uma matriz de inteiros:

- `1` representa parede (nao pode pintar).
- `0` representa area vazia (pode pintar).

Ao clicar em uma posicao inicial da matriz (linha e coluna), o algoritmo deve:

1. Pintar a celula atual com uma nova cor (exemplo: `8`).
2. Espalhar a pintura para os 4 vizinhos:
	- cima
	- baixo
	- esquerda
	- direita
3. Parar quando:
	- sair dos limites da matriz;
	- encontrar parede (`1`);
	- encontrar uma celula que nao seja a cor original.

## Objetivo da funcao

Implementar a funcao recursiva `preencherTinta(...)` para simular o efeito do balde de tinta.

## O que este exercicio treina

- Caso base da recursao (parada)
- Passo recursivo (chamada para os vizinhos)
- Controle de limites da matriz
- Entendimento de propagacao em grade

## Resultado esperado

Depois de executar a funcao, toda a regiao conectada da cor original deve ser preenchida com a nova cor, sem atravessar paredes.

