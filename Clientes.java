public class Clientes extends Usuarios{
    // Atributos
    private String profesion;
    private int numeroCliente;

    // Métodos
    // Constructor
    public Clientes(String nombreCompleto, int cedula, String sexo, String rol, int contrasenia, String correoElectronico, int telefono, String direccion, String profesion, int numeroCliente) {
        super(nombreCompleto, cedula, sexo, rol, contrasenia, correoElectronico, telefono, direccion);
        this.profesion = profesion;
        this.numeroCliente = numeroCliente;
    }

    // Getters
    public String getProfesion() {
        return profesion;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    // Setters
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    // toString
    public String toString(){
        return "\n Nombre Completo: " + nombreCompleto +
                "\n Cédula: " + cedula +
                "\n Sexo: " + sexo +
                "\n Rol: " + rol +
                "\n Contraseña: " + contrasenia +
                "\n Correo Electrónico: " + correoElectronico +
                "\n Número Telefónico: " + telefono +
                "\n Dirección: " + direccion +
                "\n Profesion: " + profesion +
                "\n Número de Cliente: " + numeroCliente + "\n";
    }
}
