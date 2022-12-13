package classes;

public class Estoque {

    //------------------------------------------- Atributos ---------------------------------------------------------//

    private int IDProduto;
    private int entradas;
    private int saidas;
    private int qtdReservada;
    private int qtdAtual;

    //----------------------------------------- Fim Atributos -------------------------------------------------------//


    //------------------------------------------- Construtor --------------------------------------------------------//

    public Estoque(int IDProduto, int entradas, int saidas, int qtdReservada, int qtdAtual) {
        this.IDProduto = IDProduto;
        this.entradas = entradas;
        this.saidas = saidas;
        this.qtdReservada = qtdReservada;
        this.qtdAtual = qtdAtual;
    }

    //------------------------------------------ Fim Construtor ----------------------------------------------------//


    //---------------------------------------- Getters and Setters -------------------------------------------------//

    public int getIDProduto() {
        return IDProduto;
    }

    public void setIDProduto(int IDProduto) {
        this.IDProduto = IDProduto;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public int getSaidas() {
        return saidas;
    }

    public void setSaidas(int saidas) {
        this.saidas = saidas;
    }

    public int getQtdReservada() {
        return qtdReservada;
    }

    public void setQtdReservada(int qtdReservada) {
        this.qtdReservada = qtdReservada;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    //-------------------------------------- Fim Getters and Setters -----------------------------------------------//

}

