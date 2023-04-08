/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonas
 */
public class SeriesModel {
    private String id;
    private String nome;
    private String idioma;
    private String genero;
    private int temporadas;
    private String diretor;
    private String plataforma;
    private double avaliacao;

    public SeriesModel(String id, String nome, String idioma, String genero, int temporadas, String diretor, String plataforma, double avaliacao) {
        this.id = id;
        this.nome = nome;
        this.idioma = idioma;
        this.genero = genero;
        this.temporadas = temporadas;
        this.diretor = diretor;
        this.plataforma = plataforma;
        this.avaliacao = avaliacao;
    }
    
    public SeriesModel(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
