import java.time.LocalDate;

public class CuentasDebito extends Cuentas{
    // Atributos
    private double saldoDebito;

    // Métodos
    // Constructor
    public CuentasDebito(int numeroCuenta, String tipoCuenta, String nombreDueño, LocalDate fechaCreacion, LocalDate fechaVencimiento, int codigo, double saldoDebito) {
        super(numeroCuenta, tipoCuenta, nombreDueño, fechaCreacion, fechaVencimiento, codigo);
        this.saldoDebito = saldoDebito;
    }

    @Override
    public void depositosCuentas() {
        super.depositosCuentas();
        System.out.println("Ha depositado exitosamente a su cuenta de débito. ");
    }

    @Override
    public void minimoCuentas() {
        super.minimoCuentas();
    }

    // Getters
    public double getSaldoDebito() {
        return saldoDebito;
    }

    // Setters
    public void setSaldoDebito(double saldoDebito) {
        this.saldoDebito = saldoDebito;
    }

    // toString
    public String toString(){
        return "\n Nombre Cuenta: " + nombreDueño +
                "\n Numero de Cuenta: " + numeroCuenta +
                "\n Tipo de Cuenta: " + tipoCuenta +
                "\n Fecha Creación: " + fechaCreacion +
                "\n Fecha Vencimiento: " + fechaVencimiento +
                "\n Código: " + codigo +
                "\n Saldo Debito: " + saldoDebito + "\n";
    }

}
