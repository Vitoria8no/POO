const Funcionario = require('./funcionario');

console.log("--- TESTANDO ENCAPSULAMENTO (JAVASCRIPT) ---");
const func = new Funcionario("Maria", 4000.0);

// Acessando de forma segura via Getter (os dados reais estão ocultos/encapsulados)
console.log(`Nome: ${func.getNome()}`);
console.log(`Salário: R$ ${func.getSalarioBase()}`);