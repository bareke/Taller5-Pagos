package co.agenciaviajes.negocio;

/**
 * Representa un cliente de la Agencia de viajes
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class Cliente {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private String id;
    private String nombres;
    private String apellidos;
    private String genero;
    private String email;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public Cliente() {
        this.id = "25783294";
        this.nombres = "Libardo";
        this.apellidos = "Pantoja";
        this.genero = "M";
        this.email = "libardo@gnu.org";
    }

    public Cliente(String id, String nombres, String apellidos, String genero, String email) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.email = email;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setId(String id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public String toString() {
        return "Id: " + id + " Nombres: " + nombres + " Apellidos: " + apellidos;
    }
    // </editor-fold>

}
