
package modelo;

/**
 *
 * @author josez
 */
public class Operacion {

    //Atributos
    private int idOperacion;
    private String descripcion;
    private int tiempoEjecuccion;
    private String departamento;
    
    
    
    ///Constructor
    public Operacion(){
    this.idOperacion=0;
    this.descripcion ="";
    this.tiempoEjecuccion =0;
    this.departamento="";
    
    
    }
    //Constructor sobrecardo

    public Operacion(int idOperacion, String descripcion, int tiempoEjecuccion, String departamento) {
        this.idOperacion = idOperacion;
        this.descripcion = descripcion;
        this.tiempoEjecuccion = tiempoEjecuccion;
        this.departamento = departamento;
    }
    
    //Gettter and setter

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEjecuccion() {
        return tiempoEjecuccion;
    }

    public void setTiempoEjecuccion(int tiempoEjecuccion) {
        this.tiempoEjecuccion = tiempoEjecuccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    

   

}
