import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String nome = "Daniel Yuji";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int operacoes = 0;
        double auxTransferencia = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("""
                ***********************************
                Dados iniciais do cliente:
                
                Nome:               """ + nome + """
                Tipo Conta:         """ + tipoConta + """
                Saldo Inicial:      R$ """ + saldo + """
                ***********************************
                """);

        String menu = """
                    Operações
                                    
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                                    
                    Digite a opção desejada:
                    """;

        while (operacoes != 4) {
            System.out.println(menu);
            operacoes = s.nextInt();
            if(operacoes == 1){
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (operacoes == 2) {
                System.out.println("Informe o valor a receber: ");
                saldo += s.nextDouble();
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (operacoes == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                auxTransferencia = s.nextDouble();
                if (auxTransferencia > saldo) {
                    System.out.println("Não há saldo suficiente" +
                        "para fazer essa transferência.");
                } else {
                    saldo -= auxTransferencia;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (operacoes < 1 || operacoes > 4) {
                System.out.println("Opção inválida");
            }
        }
    }
}