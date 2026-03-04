package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial < 0 ? 0 : saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: la cantidad a depositar debe ser mayor a 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a retirar debe ser mayor a 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: fondos insuficientes.");
        } else {
            saldo -= cantidad;
        }
    }
}