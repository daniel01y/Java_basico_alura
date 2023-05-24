package principal;

import modelo.CartaoDeCredito;
import modelo.Compra;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Compra compra = new Compra();
        Compra aux;
        CartaoDeCredito cartao = new CartaoDeCredito();
        List<Compra> listaDeCompras = new ArrayList<>();
        int determinante = 1;
        System.out.println("Digite o limite do cartão:");
        cartao.setLimiteDoCartao(s.nextDouble());
        while(determinante == 1){
            aux = compra.comprar(s, cartao);
            if(cartao.getSaldo() > cartao.getLimiteDoCartao()){
                System.out.println("Saldo insuficiente!");
                cartao.setSaldo(-aux.getValor());
                determinante = 0;
            } else {
                listaDeCompras.add(aux);
                System.out.println("Digite 0 para sair ou 1 para continuar");
                determinante = s.nextInt();
            }

            if(determinante == 0){
                listaDeCompras.sort(Comparator.comparing(Compra::getValor));
                System.out.println("************************" +
                        "\nCOMPRAS REALIZADAS:");
                for (Compra compras:listaDeCompras) {
                    System.out.println(compras.getItem() + " - " + compras.getValor());
                }
                System.out.println();
                System.out.println("************************");
                System.out.println("Saldo do cartão: " + cartao.getSaldo());
                break;
            }
        }

    }
}