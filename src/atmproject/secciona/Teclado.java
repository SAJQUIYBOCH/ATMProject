
package atmproject.secciona;

import java.util.Scanner;


public class Teclado {
    private Scanner scan; //selec import para add import java.util.Scanner;
    
    public Teclado(){
        scan = new Scanner(System.in);
    }
    //declarando metodo:
    public int recibirEntrada(); {
       return scan.nextInt(); //retorno capturando datos y convirtiendo a un entero
    
    }
}
