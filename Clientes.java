package classes;

import javax.print.DocFlavor;

public class Clientes {

    //------------------------------------------- Atributos ---------------------------------------------------------//

    private String nome;
    private String CPF;
    private String endereco;
    private String senha;

    //----------------------------------------- Fim Atributos -------------------------------------------------------//


    //------------------------------------------- Construtor --------------------------------------------------------//

    public Clientes(String nome, String CPF, String endereco, String senha){
        this.CPF=CPF;
        this.nome = nome;
        this.endereco = endereco;
        this.senha = senha;

    }

    //------------------------------------------ Fim Construtor ----------------------------------------------------//

    public Clientes() {
   // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    //---------------------------------------- Getters and Setters -------------------------------------------------//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //-------------------------------------- Fim Getters and Setters -----------------------------------------------//
}

