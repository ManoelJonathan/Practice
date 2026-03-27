class Recursao:

    def fatorial(self, n):
        if (n == 0):
            return 1
        return n * self.fatorial(n-1)
    
    def contLess(self, n):
       if n < 0:
        return
       print(f"Contagem: {n}")
       self.contLess(n-1)

    def somaArray(self, array):
        if len(array) == 0:
           return 0
        
        return array[0] + self.somaArray(array[1:])
       

    