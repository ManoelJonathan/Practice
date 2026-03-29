
class PercorrerCaminho:

    def preencher_tinta(self,tela, linha, coluna, cor_original, nova_cor):
       
        #Caso base, fazer com seja minha porta de saida da recursão. Fazendo com eu não fique em um loop infinito
        if linha < 0 or linha >= len(tela) or coluna < 0 or coluna >= len(tela[0]) or tela[linha][coluna] != cor_original:
            return

        #Executa o preenchimento do espaço
        tela[linha][coluna]= nova_cor
        
        #Chama a si próprio, para que possa rodar a recursão
        self.preencher_tinta(tela, linha - 1, coluna, cor_original, nova_cor)
        self.preencher_tinta(tela, linha + 1, coluna, cor_original, nova_cor)
        self.preencher_tinta(tela, linha, coluna - 1, cor_original, nova_cor)
        self.preencher_tinta(tela, linha, coluna + 1, cor_original, nova_cor)

    def imprimir_tela(self, tela):
        for linha in tela:
            print("  ".join(map(str, linha)))
        print("-" * 20)
        
    
if __name__ == "__main__":
    minha_tela = [
        [1, 1, 1, 1, 1, 1],
        [1, 0, 0, 0, 1, 1],
        [1, 0, 1, 0, 0, 1],
        [1, 0, 0, 0, 0, 1],
        [1, 1, 1, 1, 1, 1]
    ]

    caminho = PercorrerCaminho()

    print("--- ANTES DA PINTURA ---")
    caminho.imprimir_tela(minha_tela)

       
    caminho.preencher_tinta(minha_tela, 1, 1, 0, 8)

    print("\n--- DEPOIS DA PINTURA ---")
    caminho.imprimir_tela(minha_tela)