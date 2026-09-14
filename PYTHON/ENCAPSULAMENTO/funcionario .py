
class Funcionario:
    def __init__(self,nome ,salario):
        self.nome = nome
        self.__salario = salario

# metodo getter:consulta o salario,pois esta privado
    def consultar_salario(self):
        return self.__salario

# metodo setter:modificaria para depositar o dinheiro com validaçao   
    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R$ {valor:.2f} realizado com sucesso.")
        else:
            print("O valor do depósito deve ser positivo!")
# encapsulamento:ocultar a implementação do cdigo ou seja serve 
# para proteger os dados internoos de uma classe
