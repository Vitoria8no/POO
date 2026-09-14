package JAVA.ENCAPSULAMENTO;

public class Funcionario {
    String nome;
    private double salario;
    


    public Funcionario(String nome,double salario){
        this.nome = nome;
        this.salario = salario;

    }

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double novoSalario) {
        if (novoSalario > 0) {
            this.salario = novoSalario;
            System.out.println("Salário atualizado com sucesso.");
        } else {
            System.out.println("O valor do salário deve ser positivo!");
        }
    }
}
