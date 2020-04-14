/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camila Urueña
 * @author Harold Gomez
 */

//Escucha los eventos de algun boton
public class Controlador implements ActionListener{  
    
    //Declara variables de tipo objeto
    private Vista view;
    private Modelo model;
    DefaultTableModel table;
    
    //Constructor de la clase Controlador que recibe dos parametros (vista, modelo)
    public Controlador(Vista view, Modelo model){
        
        //Se igualan las propiedades
        this.view = view;
        this.model = model;
        this.view.btnGuardar.addActionListener(this);
        
        //se iguala el modelo de la tabla
        table = new DefaultTableModel();
        view.tablaResultado.setModel(table);
        
        //nombre para la columna de la tabla
        table.addColumn("Listado"); 
    
    }
    
    //Metodo para iniciar la vista
    public void iniciar(){
    
        view.setTitle("MVC Proyecto");
        //Indica posicion, null -> posicion 0 = centro
        view.setLocationRelativeTo(null);
       
    }
    
    //Funcion que realiza el boton
    @Override
    public void actionPerformed(ActionEvent e) {
        model.setText(view.txtTexto.getText());
        model.Content();
        Object []object = new Object[1];
        object [0] = view.txtTexto.getText();
        table.addRow(object);
        limpiar();
    }
    
    //Limpia el espacio de texto despues de almacenar
    private void limpiar() {
        view.txtTexto.setText("");
    }
    
    
}
