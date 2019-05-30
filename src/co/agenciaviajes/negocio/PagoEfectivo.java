package co.agenciaviajes.negocio;

/**
 * Pago en efectivo
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public class PagoEfectivo extends Pago {

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public PagoEfectivo() {
        this.valor = 1200000;
        this.cliente = new Cliente("98393282", "Carlos", "Sanchez Londoño", "M", "carlosl@yahoo.com");
    }

    public PagoEfectivo(int valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    @Override
    public void registrarPago() {
        System.out.println("------------------------------------------------------");
        System.out.println("Pago en efectivo en el sistema con éxito");
        System.out.println("Cliente: " + this.getCliente().toString());
        System.out.println("Valor: " + this.getValor());
    }
    // </editor-fold>

}
