const { Desenvolvedor, Gerente } = require('./funcionario');

console.log("--- TESTANDO POLIMORFISMO (JAVASCRIPT) ---");

const funcionarios = [
    new Desenvolvedor("Ana", 5000.0),
    new Gerente("Carlos", 8000.0, 5)
];

// O mesmo método é chamado para objetos diferentes, executando regras distintas
funcionarios.forEach(f => {
    console.log(`Funcionário: ${f.nome} | Bônus: R$ ${f.calcularBonus()}`);
});