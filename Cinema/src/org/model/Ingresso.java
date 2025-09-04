package org.model;

public class Ingresso {
    private EnumIngresso tipoIngresso;
    private int qntIngressosMeia;
    private int qntIngressosInteira;
    private Filmes filmes;
    private double valor;

    public Ingresso() {
        this.tipoIngresso = EnumIngresso.INGRESSO_INTEIRA;
        this.qntIngressosMeia = 0;
        this.qntIngressosInteira = 0;
        this.filmes = new Filmes();
        this.valor = 0;
    }

    public Ingresso(EnumIngresso tipoIngresso, int qntIngressosMeia, int qntIngressosInteira, Filmes filmes, double valor) {
        this.tipoIngresso = tipoIngresso;
        this.qntIngressosMeia = qntIngressosMeia;
        this.qntIngressosInteira = qntIngressosInteira;
        this.filmes = filmes;
        this.valor = valor;
    }
}
