class Funcionario:
    def __init__(self,nome,salario):
        self.nome = nome
        self.salario = salario

    def apresentar(self):
        print(f"o meu nome é {self.nome} meu salario é {self.salario}")


class Gerente(Funcionario):
    def __init__(self,nome,salario,setor):
        super().__init__(nome,salario) # Puxa os atributos da classe mãe
        self.setor = setor





    def gerenciar(self):
        print(f"meu nome é {self.nome} sou do setor {self.setor} ganho R${self.salario}")




class Dessenvolvedor(Funcionario):
    def __init__(self, nome, salario, linguagem):
        super().__init__(nome, salario)  # Puxa os atributos da classe mãe
        self.linguagem = linguagem

    def programar(self):
        print(f"{self.nome} está codando em {self.linguagem}.")