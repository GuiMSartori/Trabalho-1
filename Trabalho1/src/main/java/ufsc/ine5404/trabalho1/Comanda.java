package ufsc.ine5404.trabalho1;

import java.util.ArrayList;

public class Comanda {

    private final String nomeCliente, nomeUsuario;
    private ArrayList<String> listaPedidos;
    private boolean state;
    private final double valorTotal;

    public Comanda(String nomeCliente, String nomeUsuario) {
        this.nomeCliente = nomeCliente;
        this.nomeUsuario = nomeUsuario;
        this.listaPedidos = new ArrayList<>();
        this.state = true;
        this.valorTotal = 0;
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
    
    public void addPedido(String pedido) {
        listaPedidos.add(pedido);
    }

    public double calcularValorTotal() {
        return valorTotal;
    }

}
