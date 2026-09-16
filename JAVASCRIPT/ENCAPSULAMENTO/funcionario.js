class Funcionario {
    // ENCAPSULAMENTO: Propriedades privadas usando o caractere '#'
    #nome;
    #salarioBase;

    constructor(nome, salarioBase) {
        this.#nome = nome;
        this.#salarioBase = salarioBase;
    }

    // Getters para acessar os dados de forma controlada e segura
    getNome() {
        return this.#nome;
    }

    getSalarioBase() {
        return this.#salarioBase;
    }

    // Setter para alterar o salário com validação
    setSalarioBase(novoSalario) {
        if (novoSalario > 0) {
            this.#salarioBase = novoSalario;
        } else {
            console.log("Salário inválido!");
        }
    }
}

module.exports = Funcionario;