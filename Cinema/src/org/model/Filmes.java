package org.model;

import java.time.LocalTime;

public class Filmes {
    private String titulo;
    private LocalTime duracao;

    public Filmes() {
        this.titulo = "";
        this.duracao = LocalTime.of(00,00);
    }

    public Filmes(String titulo, LocalTime duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalTime getDuracao() {
        return duracao;
    }

    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    public void Filmes(){
        System.out.println("O título do filme é: "+titulo);
        System.out.println("A duração do filme é de: "+duracao);
    }
}
