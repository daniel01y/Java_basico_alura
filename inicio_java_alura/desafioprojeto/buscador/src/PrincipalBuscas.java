import java.io.IOException;
import java.util.Scanner;

public class PrincipalBuscas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        BuscarCep buscarCep = new BuscarCep();

        System.out.println("Digite um número de Cep para consulta: ");
        var cep = leitura.nextLine();

        try {
            Endereco novoEndereco = buscarCep.buscarEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.geraJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}