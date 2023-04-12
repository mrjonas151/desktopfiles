/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.SeriesModel;

/**
 *
 * @author jonas
 */
public class SeriesControl {
    
    
    static SeriesControlArquivoTexto controller = new SeriesControlArquivoTexto();
    
    public static boolean cadastrarSerie(String id, String nome, String idioma, String genero, int temporadas, String diretor, String plataforma, double avaliacao){
        SeriesModel novaSerie = new SeriesModel();
        
        novaSerie.setId(id);
        novaSerie.setNome(nome);
        novaSerie.setIdioma(idioma);
        novaSerie.setGenero(genero);
        novaSerie.setTemporadas(temporadas);
        novaSerie.setDiretor(diretor);
        novaSerie.setPlataforma(plataforma);
        novaSerie.setAvaliacao(avaliacao);
        
        
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(novaSerie.getId());
        sb.append("\nNOME: ");
        sb.append(novaSerie.getNome());
        sb.append("\nIDIOMA: ");
        sb.append(novaSerie.getIdioma());
        sb.append("\nGENERO: ");
        sb.append(novaSerie.getGenero());
        sb.append("\nTEMPORADAS: ");
        sb.append(novaSerie.getTemporadas());
        sb.append("\nDIRETOR: ");
        sb.append(novaSerie.getDiretor());
        sb.append("\nPLATAFORMA: ");
        sb.append(novaSerie.getPlataforma());
        sb.append("\nAVALIACAO: ");
        sb.append(novaSerie.getAvaliacao());
        sb.append("\n\n");
        
        SeriesControlArquivoTexto arquivo = new SeriesControlArquivoTexto();
        arquivo.setArquivo("Salvar");
        arquivo.setTexto(sb.toString());
        
        if(arquivo.escrever(true)){
            return true;
        }else{
            return false;
        }  
    }
    
    public static String removerSerie(int id){
        String series = lerSerie();
        String[] records = series.split("\n\n");
        
        List<Map<String, String>> listaSeries = new ArrayList<>();
        
        for (String record : records) {
            Map<String, String> map = new HashMap<>();
            String[] linhas = record.split("\n");
            for (String linha : linhas) {
                String[] parts = linha.split(": ");
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            }
            listaSeries.add(map);
        }
        
        for (Map<String, String> record : listaSeries) {
            System.out.println(record);
            String idcomparador = record.get("ID");
            if (idcomparador.equals(String.valueOf(id))) {
                listaSeries.remove(record);
            }   
        }
        
        for (Map<String, String> record : listaSeries) {
            StringBuilder sb = new StringBuilder();
                sb.append("ID: ");
                sb.append(record.get("ID"));
                sb.append("\n");
                sb.append("NOME: ");
                sb.append(record.get("NOME"));
                sb.append("\n");
                sb.append("DIRETOR: ");
                sb.append(record.get("DIRETOR"));
                sb.append("\n");
                sb.append("AVALIACAO: ");
                sb.append(record.get("AVALIACAO"));
                sb.append("\n");
                sb.append("TEMPORADAS: ");
                sb.append(record.get("TEMPORADAS"));
                sb.append("\n");
                sb.append("IDIOMA: ");
                sb.append(record.get("IDIOMA"));
                sb.append("\n");
                sb.append("GENERO: ");
                sb.append(record.get("GENERO"));
                sb.append("\n");
                sb.append("PLATAFORMA: ");
                sb.append(record.get("PLATAFORMA"));
                sb.append("\n");
                sb.append("\n");
                String resultado = sb.toString();
                return resultado;
        }
        
        return "ID nao encontrado!!";
    }
    
    public static boolean atualizarSerie(int id){
        String series = lerSerie();
        String[] records = series.split("\n\n");
        
        List<Map<String, String>> listaSeries = new ArrayList<>();
        
        for (String record : records) {
            Map<String, String> map = new HashMap<>();
            String[] linhas = record.split("\n");
            for (String linha : linhas) {
                String[] parts = linha.split(": ");
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            }
            listaSeries.add(map);
        }
        
        for (Map<String, String> record : listaSeries) {
            System.out.println(record);
            String idcomparador = record.get("ID");
            if (idcomparador.equals(String.valueOf(id))) {
                System.out.println("id encontrado!!");
            }
        }
        return true;
        
    }
    
    public static String lerSeriePorId(int id ){
        String series = lerSerie();
        String[] records = series.split("\n\n");
        
        List<Map<String, String>> listaSeries = new ArrayList<>();
        
        for (String record : records) {
            Map<String, String> map = new HashMap<>();
            String[] linhas = record.split("\n");
            for (String linha : linhas) {
                String[] parts = linha.split(": ");
                String key = parts[0];
                String value = parts[1];
                map.put(key, value);
            }
            listaSeries.add(map);
        }
        for (Map<String, String> record : listaSeries) {
            System.out.println(record);
            String idcomparador = record.get("ID");
            if (idcomparador.equals(String.valueOf(id))) {
                System.out.println("id encontrado!!");
                StringBuilder sb = new StringBuilder();
                sb.append("ID: ");
                sb.append(record.get("ID"));
                sb.append("\n");
                sb.append("NOME: ");
                sb.append(record.get("NOME"));
                sb.append("\n");
                sb.append("DIRETOR: ");
                sb.append(record.get("DIRETOR"));
                sb.append("\n");
                sb.append("AVALIACAO: ");
                sb.append(record.get("AVALIACAO"));
                sb.append("\n");
                sb.append("TEMPORADAS: ");
                sb.append(record.get("TEMPORADAS"));
                sb.append("\n");
                sb.append("IDIOMA: ");
                sb.append(record.get("IDIOMA"));
                sb.append("\n");
                sb.append("GENERO: ");
                sb.append(record.get("GENERO"));
                sb.append("\n");
                sb.append("PLATAFORMA: ");
                sb.append(record.get("PLATAFORMA"));
                sb.append("\n");
                sb.append("\n");
                String resultado = sb.toString();
                System.out.println(resultado);
                return resultado;
            }
        }
        
        
       return "ID nao encontrado!!";
    }
    
    public static String teste(){
        String x = lerSerie();
        return x;
    }
    
    public static String lerSerie(){
        String leitura = "Não foi possivel ler o arquivo";
        controller.setArquivo("CHECAR");
        if(controller.ler()) {
            leitura = (controller.getTexto());
        }
        return leitura;
    }
    
    public static void main(String[] args) {
        atualizarSerie(1);
        
    }
}
