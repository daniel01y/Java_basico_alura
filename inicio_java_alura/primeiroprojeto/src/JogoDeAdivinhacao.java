import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        int numAleatorio = 0;
        int contadorTentativas = 0;
        int tentativa = 0;
        Scanner s = new Scanner(System.in);
        numAleatorio = new Random().nextInt(100);

        while (contadorTentativas <= 4) {
            System.out.println("Tente adivivinhar o número aleatório!");
            tentativa = s.nextInt();
            if (tentativa > numAleatorio) {
                System.out.println("Seu chute é maior que o número sorteado!");
            } else if (tentativa < numAleatorio) {
                System.out.println("Seu chute é menor que o número sorteado!");
            } else {
                System.out.println("Parabéns você acertou!");
                break;
            }
            contadorTentativas++;
            if (contadorTentativas == 4) {
                System.out.println("Suas tentativas acabaram!");
            }
        }
    }
}
