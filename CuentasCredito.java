import java.time.LocalDate;

public class CuentasCredito extends Cuentas {
    // Atributos
    private String tipoCredito;
    private int limiteCredito;
    private double saldoCredito = 0;

    // Métodos
    // Constructor
    public CuentasCredito(int numeroCuenta, String tipoCuenta, String nombreDueño, LocalDate fechaCreacion, LocalDate fechaVencimiento, int codigo, String tipoCredito, int limiteCredito, double saldoCredito) {
        super(numeroCuenta, tipoCuenta, nombreDueño, fechaCreacion, fechaVencimiento, codigo);
        this.tipoCredito = tipoCredito;
        this.limiteCredito = limiteCredito;
        this.saldoCredito = saldoCredito;
    }

    public void abono(){
        System.out.println("Ha abonado a su tarjeta de crédito");
    }

    public void creditoLimite(){
        System.out.println("Ha alcanzado su límite de crédito, abone a su tarjeta por favor. ");
    }

    @Override
    public void minimoCuentas() {
        super.minimoCuentas();
    }

    // Getters
    public String getTipoCredito() {
        return tipoCredito;
    }

    public int getLimiteCredito() {
        return limiteCredito;
    }

    public double getSaldoCredito() {
        return saldoCredito;
    }

    // Setters
    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setSaldoCredito(double saldoCredito) {
        this.saldoCredito = saldoCredito;
    }

    // toString
    public String toString(){
        return "\n Nombre Cuenta: " + nombreDueño +
                "\n Numero de Cuenta: " + numeroCuenta +
                "\n Tipo de Cuenta: " + tipoCuenta +
                "\n Fecha Creación: " + fechaCreacion +
                "\n Fecha Vencimiento: " + fechaVencimiento +
                "\n Código: " + codigo +
                "\n Tipo Crédito: " + tipoCredito +
                "\n Límite Crédito: " + limiteCredito +
                "\n Saldo Crédito: " + saldoCredito + "\n";
    }
}
