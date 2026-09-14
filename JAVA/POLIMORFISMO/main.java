package JAVA.POLIMORFISMO;

public class Main {
    public static void main(String[] args) {
        // Criando um array do tipo Funcionario contendo diferentes cargos
        Funcionario[] funcionarios = {
            new Gerente("Carlos", 6000.00),
            new Desenvolvedor("Ana", 4500.00)
        };

        // Iterando e chamando o mesmo método polimórfico
        for (Funcionario f : funcionarios) {
            double bonus = f.calcularBonus();
            System.out.println("O(a) funcionário(a) " + f.nome + " recebeu um bônus de R$ " + bonus);
        }
    }
}
