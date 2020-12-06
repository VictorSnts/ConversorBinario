/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ConversaoModel;
import javax.swing.JOptionPane;

/**
 *
 * @author victorsantos
 */
public class ConversaoController {
    
    private String tipo;
    private int valor;
    private int valorConvertido;
    private String strValorConvertido;

    public ConversaoController(String tipo) {
        this.tipo = tipo;
    }
    public ConversaoController() {
        
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
    
    
    public ConversaoModel Converter(ConversaoModel converter){
        
        String valor = String.valueOf(converter.getValor());
        int nCaracteres = valor.length();
        
        if(converter.getTipo().equals("BD")){
            // Implementar conversao Binario para Decimal
            for (int i=0; i<valor.length(); i++) {
                int numero = Character.getNumericValue(valor.charAt(i));
                nCaracteres = nCaracteres- 1;
                
                valorConvertido = valorConvertido + ((int) (numero * (Math.pow(2, nCaracteres))));
                
                converter.setValorConvertido(valorConvertido);
                                           
             }
            
        } else if(converter.getTipo().equals("DB")){
            // implementar conversao de Binario para Decimal
            int numero = Integer.parseInt(valor);
            strValorConvertido = "";
            
            while(numero > 0){
                int resto = numero % 2;
                numero = (int) numero / 2;
                strValorConvertido = String.valueOf(resto) + strValorConvertido;
                converter.setValorConvertido(Integer.parseInt(strValorConvertido));

            }
            
            
            
            
        }
        
        
        return converter;
    }
    
    
    
}
