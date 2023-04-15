/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonas
 */
public class FilmesModel {
    private String id;
    private String nome;
    private int anoLancamento;
    private int duracao;

    public FilmesModel(String id, String nome, int anoLancamento, int duracao) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public FilmesModel(){
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

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}
