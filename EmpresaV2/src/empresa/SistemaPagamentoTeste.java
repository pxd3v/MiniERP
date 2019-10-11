package empresa;

import java.util.Scanner;

public class SistemaPagamentoTeste {
    public static void main(String[] args) {
        ControlePagamento controle = new ControlePagamento();
        int n;
        
        boolean status = true;
        int m=0;
        while(status == true){
        System.out.println("O que deseja fazer?");
        System.out.println("(1)- Adicionar nova Conta");
        System.out.println("(2)- Adicionar novo Empregado");
        System.out.println("(3)- Verificar o valor total a pagar");
        System.out.println("(4)- Sair da aplicação");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        switch (n) {
            case 1:
                int dia=0;
                int mes=0;
                double valor=0;
                System.out.println("A conta é um (1)Titulo ou (2)Concessionaria?");
                Scanner scanConta = new Scanner(System.in);
                m = scanConta.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("Digite o dia de vencimento:");
                        dia = scanConta.nextInt();
                        System.out.println("Digite o mes de vencimento:");
                        mes = scanConta.nextInt();
                        System.out.println("Digite o valor a ser pago:");
                        valor = scanConta.nextDouble();
                        Pagavel titulo = new Titulo(dia, mes, valor, 4, 10);
                        controle.adicionarPendencia(titulo);
                        System.out.println("Conta adicionada!");
                        m=0;
                        n=0;
                        break;
                    case 2:
                        System.out.println("Digite o dia de vencimento:");
                        dia = scanConta.nextInt();
                        System.out.println("Digite o mes de vencimento:");
                        mes = scanConta.nextInt();
                        System.out.println("Digite o valor a ser pago:");
                        valor = scanConta.nextDouble();
                        Pagavel concessionaria = new Concessionaria(dia, mes, valor);
                        controle.adicionarPendencia(concessionaria);
                        System.out.println("Conta adicionada!");
                        m=0;
                        n=0;
                        break;
                    default:
                        m=0;
                        n=0;
                        break;
                }
                m=0;
                n=0;
                break;
            case 2:
                String nome;
                String sobrenome;
                int numIdent;
                int horasTrabalhadas;
                double valorVendido;
                System.out.println("O empregado é: (1)Assalariado, (2)Comissionado, (3)Terceirizado, ou (4)Assalariado e Comissionado?");
                Scanner scanEmpregado = new Scanner(System.in);
                m = scanEmpregado.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("Digite o nome do funcionário:");
                        nome = scanEmpregado.next();
                        System.out.println("Digite o sobrenome do funcionário:");
                        sobrenome = scanEmpregado.next();
                        System.out.println("Digite o numero de identidade do funcionário:");
                        numIdent = scanEmpregado.nextInt();
                        System.out.println("Digite o numero de horas trabalhadas do funcionário:");
                        horasTrabalhadas = scanEmpregado.nextInt();
                        Pagavel assalariado = new Assalariado(nome, sobrenome, numIdent, horasTrabalhadas);
                        controle.adicionarPendencia(assalariado);
                        System.out.println("Funcionário adicionado!");
                        m=0;
                        n=0;
                        break;
                    case 2:
                        System.out.println("Digite o nome do funcionário:");
                        nome = scanEmpregado.next();
                        System.out.println("Digite o sobrenome do funcionário:");
                        sobrenome = scanEmpregado.next();
                        System.out.println("Digite o numero de identidade do funcionário:");
                        numIdent = scanEmpregado.nextInt();
                        System.out.println("Digite o valor vendido no mês pelo funcionário:");
                        valorVendido = scanEmpregado.nextDouble();
                        Pagavel comissionado = new Comissionado(nome, sobrenome, numIdent, valorVendido);
                        controle.adicionarPendencia(comissionado);
                        System.out.println("Funcionário adicionado!");
                        m=0;
                        n=0;
                        break;
                    case 3:
                        System.out.println("Digite o nome do funcionário:");
                        nome = scanEmpregado.next();
                        System.out.println("Digite o sobrenome do funcionário:");
                        sobrenome = scanEmpregado.next();
                        System.out.println("Digite o numero de identidade do funcionário:");
                        numIdent = scanEmpregado.nextInt();
                        System.out.println("Digite o numero de horas trabalhadas do funcionário:");
                        horasTrabalhadas = scanEmpregado.nextInt();
                        Pagavel terceirizado = new Terceirizado(nome, sobrenome, numIdent, horasTrabalhadas);
                        controle.adicionarPendencia(terceirizado);
                        System.out.println("Funcionário adicionado!");
                        m=0;
                        n=0;
                        break;
                    case 4:
                        System.out.println("Digite o nome do funcionário:");
                        nome = scanEmpregado.next();
                        System.out.println("Digite o sobrenome do funcionário:");
                        sobrenome = scanEmpregado.next();
                        System.out.println("Digite o numero de identidade do funcionário:");
                        numIdent = scanEmpregado.nextInt();
                        System.out.println("Digite o valor vendido no mês pelo funcionário:");
                        valorVendido = scanEmpregado.nextDouble();
                        Pagavel assalariadoComissionado = new AssalariadoComissionado(nome, sobrenome, numIdent, valorVendido);
                        controle.adicionarPendencia(assalariadoComissionado);
                        System.out.println("Funcionário adicionado!");
                        m=0;
                        n=0;
                        break;
                    default:
                        m=0;
                        n=0;
                        break;
                }
                break;
            case 3:
                double valorConta = controle.totalAPagar()[0];
                    System.out.println("O valor total a pagar em Contas é:" + valorConta);
                double valorFuncionario = controle.totalAPagar()[1];
                    System.out.println("O valor total a pagar para funcionários é:" + valorFuncionario);
                double valorTotal = valorConta + valorFuncionario;
                    System.out.println("Valor total:" + valorTotal);
                    m=0;
                    n=0;
                break;
            case 4:
                status = false;
                m=0;
                n=0;
                break;
            default:
                m=0;
                n=0;
                break;
        }

    }
    
}
}