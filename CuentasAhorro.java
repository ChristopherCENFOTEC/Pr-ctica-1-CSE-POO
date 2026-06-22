import java.time.LocalDate;

public class CuentasAhorro extends Cuentas{
    // Atributos
    private double saldoAhorro = 100;

    // Métodos
    // Constructor
    public CuentasAhorro(int numeroCuenta, String tipoCuenta, String nombreDueño, LocalDate fechaCreacion, LocalDate fechaVencimiento, int codigo, double saldoAhorro) {
        super(numeroCuenta, tipoCuenta, nombreDueño, fechaCreacion, fechaVencimiento, codigo);
        this.saldoAhorro = saldoAhorro;
    }

    public void limiteAhorro(){
        System.out.println("El límite minímo dentro de una cuenta de ahorro es de 100 doláres. ");
    }

    @Override
    public void depositosCuentas() {
        super.depositosCuentas();
        System.out.println("Ha depositado exitosamente a su cuenta de ahorros. ");
    }

    // Getters
    public double getSaldoAhorro() {
        return saldoAhorro;
    }

    // Setters
    public void setSaldoAhorro(double saldoAhorro) {
        this.saldoAhorro = saldoAhorro;
    }

    // toString
    public String toString(){
        return "\n Nombre Cuenta: " + nombreDueño +
                "\n Numero de Cuenta: " + numeroCuenta +
                "\n Tipo de Cuenta: " + tipoCuenta +
                "\n Fecha Creación: " + fechaCreacion +
                "\n Fecha Vencimiento: " + fechaVencimiento +
                "\n Código: " + codigo +
                "\n Saldo Crédito: " + saldoAhorro + "\n";
    }

}
