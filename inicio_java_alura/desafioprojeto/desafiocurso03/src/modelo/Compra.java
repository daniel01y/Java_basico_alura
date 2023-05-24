package modelo;

import java.util.Scanner;

public class Compra {
    private String item;
    private double valor;
    private int limiteCartao;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Compra comprar(Scanner s, CartaoDeCredito cartao){
        Compra c = new Compra();
        System.out.println("Digite a descrição da compra: ");
        c.setItem(s.next());
        System.out.println("Digite o valor da compra: ");
        c.setValor(s.nextInt());
        cartao.setSaldo(c.getValor());
        return c;
    }

    @Override
    public String toString() {
        return getItem() + " - " + getValor();
    }
}
