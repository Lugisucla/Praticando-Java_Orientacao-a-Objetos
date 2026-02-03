package Classes;

import java.util.Scanner;

public class Conta {
    Scanner leitor = new Scanner(System.in);
    private double saldo;

    public void Saldo (double saldo){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo () {
        System.out.println("Saldo atual: " + saldo);
    }

    public void zerarSaldo () {
        saldo = 0;
    }

    public void setSaldo() {
    }
}
