class Cinema:
    def __init__(self):
       self.vip = 20
       self.normal = 10
       self.sala = []
       for i in range(5):
           linha = [0] * 5
           self.sala.append(linha)

    def clear(self):
        for i in range(5):
            for j in range(5):
                self.sala[i][j] = 0
    
    def __str__(self):
        mapa = ""
        for i in range(5):
            for j in range(5):
                if(self.sala[i][j] == 1):
                    mapa += "[X] "
                else:
                    mapa += "[ ] "
            mapa +="\n"
        return mapa


    def buy(self):
        continuar = "s"
        total = 0

        while (continuar.upper() == "S"):
            print(self)
            fileira = int(input( "What line do you want to be in?"))
            print(self)
            coluna = int(input("What column do you to be in?"))

            if (fileira < 0 or fileira >= 5 or coluna < 0 or coluna >= 5):
                print("This accent does not exist")
                continue
            
            if(self.sala[fileira][coluna] == 1):
                print("This accent is bought")
                continue

            self.sala[fileira][coluna] = 1
            if(fileira == 0):
                print(f'That amount to pay is: {self.vip}')
                total += self.vip
            else:
                print(f'That amount to pay is: {self.normal}')
                total += self.normal

            continuar = input("Type S to continue shopping or N to complete your purchase.")

        print(self)
        print(f'That total amount to pay is: {total}')