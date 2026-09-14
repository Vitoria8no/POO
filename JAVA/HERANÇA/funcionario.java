package JAVA.HERANÇA;


public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.nome + " e meu salário é R$ " + this.salario);
    }
}

// Classe Filha 1
class Gerente extends Funcionario {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario); // Reaproveita o construtor da classe mãe
        this.setor = setor;
    }

    public void gerenciar() {
        System.out.println(this.nome + " está gerenciando o setor de " + this.setor + ".");
    }
}

// Classe Filha 2
class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario); // Reaproveita o construtor da classe mãe
        this.linguagem = linguagem;
    }

    public void programar() {
        System.out.println(this.nome + " está codando em " + this.linguagem + ".");
    }
}
