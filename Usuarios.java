public class Usuarios {
    protected String nombreCompleto;
    protected int cedula;
    protected String sexo;
    protected String rol;
    protected int contrasenia;
    protected String correoElectronico;
    protected int telefono;
    protected String direccion;

    // Métodos
    // Constructor
    public Usuarios(String nombreCompleto, int cedula, String sexo, String rol, int contrasenia, String correoElectronico, int telefono, String direccion) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.sexo = sexo;
        this.rol = rol;
        this.contrasenia = contrasenia;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void usarCuenta(Cuentas cuenta){
        if (cuenta.dueño(nombreCompleto)){
            System.out.println(nombreCompleto + " tiene la cuenta " + cuenta + " La cuenta es: " + cuenta.tipoCuenta + ", " + cuenta.nombreDueño + "\n");
        } else {
            System.out.println("La persona " + nombreCompleto + " no posee una cuenta " + cuenta + cuenta.tipoCuenta + "\n");
        }
    }

    // Getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRol() {
        return rol;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    // Setters
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
                "\n Dirección: " + direccion + "\n";
    }
}
