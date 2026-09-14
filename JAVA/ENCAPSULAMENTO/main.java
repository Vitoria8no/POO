package JAVA.ENCAPSULAMENTO;

public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("maria", 3500);

        // Consultando o salário usando o método getter
        System.out.println("Salário atual: R$ " + f.getSalario());


        // Alterando o salário usando o método setter
        f.setSalario(4000);



        // Verificando a alteração
        System.out.println("Novo salário: R$ " + f.getSalario());
    } 
}
