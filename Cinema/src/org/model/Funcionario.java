package org.model;

public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario() {
        this.nome = "";
        this.cpf = "";
    }

    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        this.cpf = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public void Funcionario(){
        System.out.println("O nome do Funcionário é: "+ nome);
        System.out.println("O CPF do funcionário é; "+cpf);
    }
}
