package JAVA.POLIMORFISMO;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método genérico que será sobrescrito pelas classes filhas
    public double calcularBonus() {
        return 0.0;
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        // O gerente ganha 20% de bônus
        return this.salario * 0.20;
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        // O desenvolvedor ganha 10% de bônus
        return this.salario * 0.10;
    }
}
