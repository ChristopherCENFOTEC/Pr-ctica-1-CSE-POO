import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Cuentas {
    // Atributos
    protected int numeroCuenta;
    protected String tipoCuenta;
    protected String nombreDueño;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaVencimiento;
    protected int codigo;
    protected String[] cuentas;


    // Métodos
    // Constructor
    public Cuentas(int numeroCuenta, String tipoCuenta, String nombreDueño, LocalDate fechaCreacion, LocalDate fechaVencimiento, int codigo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.nombreDueño = nombreDueño;
        this.fechaCreacion = fechaCreacion;
        this.fechaVencimiento = fechaVencimiento;
        this.codigo = codigo;
    }

    public void minimoCuentas(){
        System.out.println("El monto mínimo que puede manejar la cuenta es de 0 doláres. ");
    }

    public void depositosCuentas(){

    }

    public boolean dueño(String nombreUsuario){
        return nombreDueño.equals(nombreUsuario);
    }

    // Getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    // Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    // Ninguna cuenta puede entrar a negativos. Ahorro siempre debe tener mínimo 100 USD.
    // Solo se puede depositar a cuentas de ahorro o de débito.
    // Abonar solo a las de crédito.

    // toString
    public String toString(){
        return "\n Nombre Cuenta: " + nombreDueño +
                "\n Numero de Cuenta: " + numeroCuenta +
                "\n Tipo de Cuenta: " + tipoCuenta +
                "\n Fecha Creación: " + fechaCreacion +
                "\n Fecha Vencimiento: " + fechaVencimiento +
                "\n Código: " + codigo +
                "\n Cuentas: " + cuentas + "\n";
    }

}
