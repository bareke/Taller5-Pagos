package co.agenciaviajes.negocio;

/**
 * Pago con tarjeta débito
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoTarjetaDebito extends Pago {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private String codigo;
    private String banco;
    private String numeroCuenta;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public PagoTarjetaDebito() {
        this.codigo = "12352";
        this.banco = "Bancolombia";
        this.numeroCuenta = "5125-6645-1245";
        this.valor = 2650000;
        this.cliente = new Cliente("98123458", "Manuel", "Lara", "M", "manuel@hotmail.com");
    }

    public PagoTarjetaDebito(String codigo, String banco, String numeroCuenta, int valor, Cliente cliente) {
        this.codigo = codigo;
        this.banco = banco;
        this.numeroCuenta = numeroCuenta;
        this.valor = valor;
        this.cliente = cliente;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public String getCodigo() {
        return codigo;
    }

    public String getBanco() {
        return banco;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        System.out.println("Pago con tarjeta débito registrado en el sistema con éxito");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Código del cliente: " + this.getNumeroCuenta());
        System.out.println("Banco: " + this.getBanco());
        System.out.println("Número de cuenta: " + this.getNumeroCuenta());
        System.out.println("Valor: " + this.getValor());
    }

    // </editor-fold>
}
