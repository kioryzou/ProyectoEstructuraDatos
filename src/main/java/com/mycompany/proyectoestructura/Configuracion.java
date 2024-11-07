package com.mycompany.proyectoestructura;


//IMPORTS UTILIZADOS//
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyo
 */

/*
public class Configuracion {
    private String NombreBanco;
    private int CajaPreferencial;
    private int CantidadCajas;
    private int CajaRapida;
    
    
    //------------------------Metodos------------------------//
    //estoy revisando que se puede usar y que no
    //cualquier cosa si alguna libreria no cumple con los requisitos
    //diganme para arreglarlo y ver como hacerlo de otra manera
    
    public void Configuracion_LOAD(){

        Este metodo lo que esta supuesto a hacer es cargar la configuracion guardada en "Save.tx"
        si existe tendria que cargar los datos, si no deberia solicitar la info que se guardara en el save
        su funcionalidad esta dudosa, mas que me faltaria la logica de otro metodo y verificar, si no lo hare desde 0



        File CONF_FILE = new File("Save.txt");

        if (CONF_FILE.exists()) {
            
            try (BufferedReader br = new BufferedReader(new FileReader(CONF_FILE))) {
                NombreBanco = br.readLine();
 
                CantidadCajas = Integer.parseInt(br.readLine());
                
                CajaPreferencial = Integer.parseInt(br.readLine());
                
                CajaRapida = Integer.parseInt(br.readLine());
                
            } catch (IOException e) 
            
            {
                System.out.println("Error al leer la configuración: " + e.getMessage());
            }
            
            
        } else { // Note: si lo prueban quiten de comentarios esta parte, igualmente no funciona todavia//
            
            Scanner scanner = new Scanner(System.in);
          
            System.out.print("nombre del banco: ");
            NombreBanco = scanner.nextLine();
            
            System.out.print("antidad de cajas: ");
            CantidadCajas = scanner.nextInt();
            
            System.out.print("numero de caja preferencial: ");
            CajaPreferencial = scanner.nextInt();
            
            System.out.print("numero de caja rápida: ");
            CajaRapida = scanner.nextInt();
            

            //SE PODIA USAR ? "-", SI NO SOLO BORRAR EL "-"
            //ESTE NO FUNCIONA FALTA LA LOGICA EN EL METODO
            Configuracion_SAVE();
        }
        
        
        
    
    }//fin del meotodo Configuracion_LOAD
    */

//Actualizacion de la clase configuracion
//usar las que mejor les paresca
package proyecto.estructuradatos;

/*
 *
 * @author Kyo
 */


//imports
import java.io.*;
import javax.swing.JOptionPane;

public class Configuracion {
    
    private static final String ConfigFiles = "Conf.txt";
    
    public void configurarSistema() {
     
        if (new File(ConfigFiles).exists()) {
            cargarConfiguracion();
            return;
        }
        
    
        String nombreBanco = JOptionPane.showInputDialog("Ingrese el nombre del banco:");
        

        int totalCajas;
        do {
            
            totalCajas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero total de cajas (NOTA: minimo 3):"));
            
        } while (totalCajas < 3);
        
       
        int cajaPreferencial = 1;  
        int cajaRapida = 2;    
        int cajasGenerales = totalCajas - 2; 
        
 
        StringBuilder cajasGeneralesList = new StringBuilder();
        
        for (int i = 1; i <= cajasGenerales; i++) {
            
            cajasGeneralesList.append("Caja General " + i + "\n");
        }

       
        
        try (PrintWriter pw = new PrintWriter(new FileWriter(ConfigFiles))) 
        
        {
            pw.println("Banco: " + nombreBanco);
            pw.println("Cajas Totales: " + totalCajas);
            pw.println("Caja Preferencial: " + cajaPreferencial);
            pw.println("Caja Rápida: " + cajaRapida);
            pw.println("Cajas Generales:\n" + cajasGeneralesList.toString());
            JOptionPane.showMessageDialog(null, "Configuracion guardada.");
            
        } catch (IOException e) 
        {
            JOptionPane.showMessageDialog(null, "Error guardando la configuracion: " + e.getMessage());
        }
        
        
    }

    // Metodo para cargar la configuracion
    public void cargarConfiguracion() {
        try (BufferedReader br = new BufferedReader(new FileReader(ConfigFiles))) {
            
            String linea;
            StringBuilder configuracion = new StringBuilder();
            while ((linea = br.readLine()) != null) 
            {
                configuracion.append(linea).append("\n");    
            }
            
            JOptionPane.showMessageDialog(null, "configuracion cargada:\n" + configuracion.toString());
            
        } catch (IOException e) 
        {
            JOptionPane.showMessageDialog(null, "Error cargando configuracion: " + e.getMessage());
        }
    }
}


    

