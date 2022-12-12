package classes;

import java.util.ArrayList;

public class Pedido {

    //------------------------------------------- Atributos ---------------------------------------------------------//

    private String CPF;
    private int IDPedidos;
    private float valorTotal;
    private char status;
    private ArrayList <Produtos> itensPedido = new ArrayList<>();

    //----------------------------------------- Fim Atributos -------------------------------------------------------//


    //------------------------------------------- Construtor --------------------------------------------------------//

    public Pedido(String CPF, int IDPedidos, float valorTotal, char status, ArrayList itensPedido){
        this.CPF = CPF;
        this.IDPedidos = IDPedidos;
        this.valorTotal = valorTotal;
        this.status = status;
        this.itensPedido = new ArrayList<>();

    }

    //------------------------------------------ Fim Construtor ----------------------------------------------------//


    //---------------------------------------- Getters and Setters -------------------------------------------------//

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIDPedidos() {
        return IDPedidos;
    }

    public void setIDPedidos(int IDPedidos) {
        this.IDPedidos = IDPedidos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public ArrayList<Produtos> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<Produtos> itensPedido) {
        this.itensPedido = itensPedido;
    }

    //-------------------------------------- Fim Getters and Setters -----------------------------------------------//

}
