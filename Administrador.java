public class Administrador extends Usuarios {
    // Atributos
    private String companiaID;

    // Métodos
    // Constructor
    public Administrador(String nombreCompleto, int cedula, String sexo, String rol, int contrasenia, String correoElectronico, int telefono, String direccion, String companiaID) {
        super(nombreCompleto, cedula, sexo, rol, contrasenia, correoElectronico, telefono, direccion);
        this.companiaID = companiaID;
    }

    // Getters
    public String getCompaniaID() {
        return companiaID;
    }

    // Setters
    public void setCompaniaID(String companiaID) {
        this.companiaID = companiaID;
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
                "\n ID de Empleado: " + companiaID + "\n";
    }

}
