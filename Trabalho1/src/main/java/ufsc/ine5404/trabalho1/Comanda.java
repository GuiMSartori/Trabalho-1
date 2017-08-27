package ufsc.ine5404.trabalho1;

import java.util.ArrayList;

public class Comanda {

    private String nomeCliente, nomeUsuario;
    private ArrayList<String> listaPedidos;
    private boolean state;
    private double valorTotal;

    public Comanda(String nomeCliente, String nomeUsuario, double valorTotal) {
        this.nomeCliente = nomeCliente;
        this.nomeUsuario = nomeUsuario;
        this.listaPedidos = new ArrayList<>();
        this.state = true;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public boolean isOpen() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public double calcularValorTotal() {
        return valorTotal;
    }

}
