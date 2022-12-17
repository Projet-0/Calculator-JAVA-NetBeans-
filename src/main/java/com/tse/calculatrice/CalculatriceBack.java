/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tse.calculatrice;

import java.awt.event.MouseAdapter;

import com.tse.calculatrice.CalculatriceInterface ; // J'essaie d'importer la calculatrices
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;



/**
 *
 * @author ayoub
 */
public class CalculatriceBack extends MouseAdapter  { // Héritage
    public String chain = "" ;
    public String caracter ;
    public String first_value ;
    public String second_value ;
   
    public String getCaracter() {
        return caracter;
    }
    public String getFirst_value() {
        return first_value;
    }
    public String getSecond_value() {
        return second_value;
    }
    public String getChain() {
        return chain;
    }
    
    public void setCaracter(String c) {
        caracter = c;
    }
    public void setFirst_value(String f) {
        first_value = f;
    }
    public void setSecond_value(String s) {
        second_value = s;
    }
    public void setChain(String ch) {
        chain = ch;
    }
    
    
    public ArrayList<String> operation = new ArrayList<String>() ;
    
    //public ArrayList<JButton> JButton_List = new ArrayList<JButton>() ;
   
    
    //public CalculatriceInterface I;
            
    CalculatriceBack(){
        super();
        //JButton_List.add(B) ;
    }
    
    
    // Set les buttons
    /*void setCalculatriceBack(JButton B) {
        JButton_List.add(B) ;
    }*/
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You clicked the mouse");
        String f = ((JButton) e.getComponent()).getText() ;
        System.out.println(f);
                
                
        this.setFirst_value(f);
        
        System.out.println("the value of the first value is ");
        System.out.println(this.getFirst_value()) ;
        
        
        
        
        //String f = JButton.getText() ;
        //System.out.println(f);
    } 
    
    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("You released the mouse");
    } 
    
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse");
    }
    
}
