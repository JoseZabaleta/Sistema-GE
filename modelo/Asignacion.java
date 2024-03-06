/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josez
 */
public class Asignacion {
    private int idAsignacion;
    private int idOperacion;
    private String descripcion;
    private int idSupervisor;
    private int idEmpleado;
    private String fechaInicio;
    private String fechaFin;
    private String evaluacion;
    
    public Asignacion(){
    this.idAsignacion = 0;
    this.idOperacion=0;
    this.descripcion="";
    this.idSupervisor=0;
    this.idEmpleado  =0;
    this.fechaInicio ="";
    this.fechaFin="";
    this.evaluacion="";
    }

    public Asignacion(int idAsignacion, int idOperacion, String descripcion, int idSupervisor, int idEmpleado, String fechaInicio, String fechaFin, String evaluacion) {
        this.idAsignacion = idAsignacion;
        this.idOperacion = idOperacion;
        this.descripcion = descripcion;
        this.idSupervisor = idSupervisor;
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.evaluacion = evaluacion;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

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

    public int getIdSupervisor() {
        return idSupervisor;
    }

    public void setIdSupervisor(int idSupervisor) {
        this.idSupervisor = idSupervisor;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }
    
            
    
}

