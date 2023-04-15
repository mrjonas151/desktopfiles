/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonas
 */
public class AnimesModel {
    private String id;
    private String nome;
    private int temporadas;
    private String dublagemOriginal;

    public AnimesModel(String id, String nome, int temporadas, String dublagemOriginal) {
        this.id = id;
        this.nome = nome;
        this.temporadas = temporadas;
        this.dublagemOriginal = dublagemOriginal;
    }

    public AnimesModel(){
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

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getDublagemOriginal() {
        return dublagemOriginal;
    }

    public void setDublagemOriginal(String dublagemOriginal) {
        this.dublagemOriginal = dublagemOriginal;
    }
    
    
}
