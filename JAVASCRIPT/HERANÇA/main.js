const Funcionario = require('./funcionario');

// HERANÇA: Desenvolvedor herda características de Funcionario usando 'extends'
class Desenvolvedor extends Funcionario {
    constructor(nome, salarioBase, linguagemPrincipal) {
        super(nome, salarioBase); // Reaproveita o construtor da classe pai
        this.linguagemPrincipal = linguagemPrincipal;
    }
}

console.log("--- TESTANDO HERANÇA (JAVASCRIPT) ---");
const dev = new Desenvolvedor("Ana", 5000.0, "JavaScript");
console.log(`Funcionário: ${dev.nome} | Linguagem: ${dev.linguagemPrincipal}`);