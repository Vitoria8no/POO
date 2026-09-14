from abc import ABC, abstractmethod


class Funcionario(ABC):

    def __init__(self,nome,salario):
        self.nome = nome
        self.salario =salario

    @abstractmethod
    def trabalhar(self):
        pass

    @abstractmethod
    def sair(self):
        pass



