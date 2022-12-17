/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tse.calculatrice;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author ayoub
 */
public class Calculatrice extends JFrame {

    public Calculatrice() throws HeadlessException {
        this.setSize(300,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        var window = new Calculatrice();
    }
}
