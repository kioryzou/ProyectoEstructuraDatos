/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectoestructura;

import javax.swing.JOptionPane;

/**
 *
 * @author dques
 */
public class ProyectoEstructura {

    public static void main(String[] args) {
       Cola cola = new Cola();
       Tiquete Juan = new Tiquete("Juan","10:00", "Deposito", "P", 30, -1, 1L);
       Tiquete Paula = new Tiquete("Paula","08:00", "Retiro", "A", 23, -1, 2L);
       Tiquete Gerald = new Tiquete("Gerald","12:00", "Cambio Divisas", "B", 30, -1, 3L);
       
       cola.ingresarTicket(Juan);
       cola.ingresarTicket(Paula);
       cola.ingresarTicket(Gerald);
       JOptionPane.showMessageDialog(null, cola);
    }
}
