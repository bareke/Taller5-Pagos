package co.agenciaviajes.negocio;

/**
 * Clase abstracta de pagos
 *
 * @author Libardo Pantoja, Ricardo Zambrano, Julio A. Hurtado
 */
public abstract class Pago {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    protected int valor;
    protected Cliente cliente;

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Getters">
    public int getValor() {
        return valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Setters">
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Metodos">
    public abstract void registrarPago();

    // </editor-fold>
}
