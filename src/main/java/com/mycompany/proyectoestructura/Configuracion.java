import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Configuracion {
  private String NombreBanco;
  private int CantidadCajas;
  private int CajaPreferencial;
  private int CajaRapdida;
  
  //------------------------Metodos------------------------//

  public void cargarConfiguracion() {
   File CONF_FILE = new File("CONFIG.txt");
    //trabajando en los metodos al terminar actualizo en github
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
            
            
        }

  public void guardarConfiguracion() {}

  
    



  
}
