from funcionario import Funcionario

def main():
    f = Funcionario("maria", 3500)
    
    # método getter 
    print(f"Salário atual: {f.consultar_salario()}")
    
    # método setter 
    f.depositar(500)


if __name__ == '__main__':
    main()


# 