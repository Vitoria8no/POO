from funcionario import Gerente, Desenvolvedor

def main():
    # Criando uma lista com tipos diferentes de funcionários
    funcionarios = [
        Gerente("Carlos", 6000.00),
        Desenvolvedor("Ana", 4500.00)
    ]

    # Iterando pela lista e chamando o mesmo método (polimorfismo)
    for func in funcionarios:
        bonus = func.calcular_bonus()
        print(f"O(a) funcionário(a) {func.nome} recebeu um bônus de R$ {bonus:.2f}")

if __name__ == '__main__':
    main()