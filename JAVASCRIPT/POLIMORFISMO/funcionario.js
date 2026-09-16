class Funcionario {
    constructor(nome, salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    calcularBonus() {
        return 0;
    }
}

class Desenvolvedor extends Funcionario {
    calcularBonus() {
        return this.salarioBase * 0.10;
    }
}

class Gerente extends Funcionario {
    constructor(nome, salarioBase, equipeTamanho) {
        super(nome, salarioBase);
        this.equipeTamanho = equipeTamanho;
    }

    // POLIMORFISMO: O mesmo método calcularBonus assume um comportamento diferente aqui
    calcularBonus() {
        return (this.salarioBase * 0.20) + (this.equipeTamanho * 100);
    }
}

module.exports = { Funcionario, Desenvolvedor, Gerente };