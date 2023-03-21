
package atmproject.secciona;

public class ATM {
    
    //Dispensador dispensadorObj = new Dispensador();
    //Pantalla pantallaObj = new Pantalla();
    //RanuraDeDeposito ranuraDeDepositoObj = new RanuraDeDeposito();
    //Teclado tecladoObj = new Teclado();
    
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    
   public ATM() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();
        
        this.inicializar();
    }
    
   private void inicializar() {
    int numeroDeCuenta;
    
    pantallaObj.mostrarMensaje("Bienvenido!");
    pantallaObj.mostrarMensaje("Ingrese su numero de cuenta: ");
    numeroDeCuenta = tecladoObj.recibirEntrada(); //resultado se le asig a la var num de cuenta
    System.out.println("El numero de cuenta ingresado es : ");
    }
   
   public void depositar(int monto) { }
   public void acreditar(int monto) { }
   public void mostrarSaldo(int numeroDeCuenta) { }
   public void retirar(int monto) { }
   public void debitar(int monto) { }
   public boolean autenticar(int nip, int numeroDeCuenta) { return true; }
}
