from funcionario import Gerente , Dessenvolvedor

def main():
    # Criando objetos das classes filhas
    gerente = Gerente("Carlos", 6000.00, "Tecnologia")
    dev = Dessenvolvedor("Ana", 4500.00, "Python")

    # Usando métodos herdados da classe mãe (Funcionario)
    gerente.apresentar()
    dev.apresentar()

    # Usando métodos específicos de cada classe filha
    gerente.gerenciar()
    dev.programar()

if __name__ == '__main__':
    main()