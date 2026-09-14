package JAVA.HERANÇA;

public class Main {
    public static void main(String[] args) {
       
        Gerente gerente = new Gerente("Carlos", 6000.00, "Tecnologia");
        Desenvolvedor dev = new Desenvolvedor("Ana", 4500.00, "Java");

        // Usando métodos herdados da classe mãe (Funcionario)
        gerente.apresentar();
        dev.apresentar();

        // Usando métodos exclusivos de cada classe filha
        gerente.gerenciar();
        dev.programar();
    }
}
