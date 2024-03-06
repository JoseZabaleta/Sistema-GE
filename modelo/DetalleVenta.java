
package modelo;

/**
 *
 * @author josez
 */
public class DetalleVenta {
    //Atributos
    private int idDetalletVenta;
    private int idCabeceraVenta;
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private double descuento;
    private double iva;
    private double totalPagar;
    private int estado;
    
    //constructor
    public DetalleVenta(){
    this.idDetalletVenta =0;
    this.idDetalletVenta = 0;
    this.idProducto=0;
    this.nombre="";
    this.cantidad=0;
    this.precioUnitario=0.0;
    this.subtotal=0.0;
    this.descuento=0.0;
    this.iva=0.0;
    this.totalPagar=0.0;
    this.estado=0;
       
    }
    //constructor sobrecargado

    public DetalleVenta(int idDetalletVenta, int idCabeceraVenta, int idProducto, String nombre, int cantidad, double precioUnitario, double subtotal, double descuento, double iva, double totalPagar, int estado) {
        this.idDetalletVenta = idDetalletVenta;
        this.idCabeceraVenta = idCabeceraVenta;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }

    public int getIdDetalletVenta() {
        return idDetalletVenta;
    }

    public void setIdDetalletVenta(int idDetalletVenta) {
        this.idDetalletVenta = idDetalletVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalletVenta=" + idDetalletVenta + ", idCabeceraVenta=" + idCabeceraVenta + ", idProducto=" + idProducto + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal + ", descuento=" + descuento + ", iva=" + iva + ", totalPagar=" + totalPagar + ", estado=" + estado + '}';
    }
    
    
}
