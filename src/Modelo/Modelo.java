/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 * 
 */

// Atributos del modelo
public class Modelo { 
    
    private String text;
    private String Result;
    
 // Setter y Getter de las propiedades declaradas
    
    public String getText() { 
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResult() {
        return Result;
    }

    public void setResult(String Result) {
        this.Result = Result;
    }
    
    // Metodo de operacion que no recibe ningun parametro
    public String Content(){       
        this.Result = this.text;
        return this.Result;
    }
    
}
