class Funcionario:
    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    def calcular_bonus(self):
        # Método genérico que será sobrescrito pelas classes filhas
        pass


class Gerente(Funcionario):
    def calcular_bonus(self):
        # O gerente ganha um bônus maior (ex: 20% do salário)
        return self.salario * 0.20


class Desenvolvedor(Funcionario):
    def calcular_bonus(self):
        # O desenvolvedor ganha um bônus diferente (ex: 10% do salário)
        return self.salario * 0.10