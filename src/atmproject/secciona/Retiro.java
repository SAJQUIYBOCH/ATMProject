
package atmproject.secciona;

public class Retiro extends Transaccion {
    public void ejecutar(){
    System.out.println("Se ejecuta el método ejecutar() de la clase Retiro");
    }
    //Sobrecarga de métodos:
    //Métodos con el mismo nombre pero diferente firma dentro de la misma clase
    //No depende de relaciones de herencia
    
    private int monto;
    
    public void ejecutar(){}
    
}
