package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta de crédito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaCredito extends Pago {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private String codigo;
    private String franquicia;
    private String numeroTarjeta;
    private String codigoSeguridad;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public PagoTarjetaCredito() {
        this.codigo = "125478546";
        this.franquicia = "VISA";
        this.numeroTarjeta = "3154-123485-12547";
        this.codigoSeguridad = "1346";
        this.valor = 45600122;
        this.cliente = new Cliente("125478546", "Fernanda Maria", "Benavides", "F", "fer@gmail.com");
    }

    public PagoTarjetaCredito(String codigo, String franquicia, String numeroTarjeta, String codigoSeguridad, int valor, Cliente cliente) {
        this.codigo = codigo;
        this.franquicia = franquicia;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoSeguridad = codigoSeguridad;
        this.valor = valor;
        this.cliente = cliente;

    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getCodigo() {
        return codigo;
    }

    public String getFranquicia() {
        return franquicia;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public void registrarPago() {
        //Aqui vendria la logica para guardar en la base de datos

        System.out.println("------------------------------------------------------");
        System.out.println("Pago con tarjeta de crédito registrado en el sistema con éxito.");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código de Seguridad: " + this.getCodigoSeguridad());
        System.out.println("Franquicia: " + this.getFranquicia());
        System.out.println("Número de tarjeta: " + this.getNumeroTarjeta());
        System.out.println("Valor: " + this.getValor());

    }

    // </editor-fold>
}
