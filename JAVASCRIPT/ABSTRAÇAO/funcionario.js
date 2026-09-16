

// ABSTRAÇÃO: Classe base que define o modelo genérico e esconde detalhes complexos
class Funcionario {
    constructor(nome, salarioBase) {
        if (this.constructor === Funcionario) {
            throw new Error("Classes abstratas não podem ser instanciadas diretamente!");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    // Método abstrato que força as classes filhas a implementarem
    calcularBonus() {
        throw new Error("O método calcularBonus precisa ser implementado na subclasse.");
    }
}

module.exports = Funcionario;



















