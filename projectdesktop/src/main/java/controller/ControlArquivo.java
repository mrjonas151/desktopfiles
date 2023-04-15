/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author jonas
 */
public abstract class ControlArquivo {
    public File arquivo = null;
    public abstract boolean ler(); //metodo abstrato que obriga sobrescrever na herança
    public abstract boolean escrever(boolean append); //metodo abstrato que obriga sobrescrever na herança
    
    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }

    /**
     * @param TextoBotao o texto para o botão de escolha do usuário
     */
    public void setArquivo(String TextoBotao) {
        arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        }     
    }
}
