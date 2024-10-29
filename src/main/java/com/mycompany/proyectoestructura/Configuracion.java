

public class Configuracion {
  private String NombreBanco;
  private int CantidadCajas;
  private int CajaPreferencial;
  private int CajaRapdida;
  
  //------------------------Metodos------------------------//

  public void cargarConfiguracion() {
   File archivo = new File("prod.txt");
    //trabajando en los metodos al terminar actualizo en github
    if (archivo.exists()) {
    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                NombreBanco = br.readLine();
                CantidadCajas = Integer.parseInt(br.readLine());
                CajaPreferencial = Integer.parseInt(br.readLine());
                CajaRapida = Integer.parseInt(br.readLine());
            } catch (IOException e) {
                System.out.println("Error al leer la configuración: " + e.getMessage());
            }
        }
  }

  public void guardarConfiguracion() {}

  
    



  
}
