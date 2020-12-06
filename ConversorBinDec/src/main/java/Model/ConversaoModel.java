/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author victorsantos
 */
public class ConversaoModel {

    public ConversaoModel(String tipoConversao) {
        this.tipo = tipoConversao;
    }
    
    private String tipo;
    private int valor;
    private int valorConvertido;

    public ConversaoModel() {
    }

    public ConversaoModel(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(int valorConvertido) {
        this.valorConvertido = valorConvertido;
    }
    
    
    
    
    
    
    
    
    
}
