/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josez
 */
public class Cliente {

    //Atributos
    private int idCliente;
    private String nombre;
    private String apellido;
    private String rut;
    private String telefono;
    private String direccion;
    private int estado;
    
    
    ///Constructor
    public Cliente(){
    this.idCliente=0;
    this.nombre ="";
    this.apellido ="";
    this.rut="";
    this.telefono="";
    this.direccion="";
    this.estado=0;
    
    }
    //Constructor sobrecardo

    public Cliente(int idCliente, String nombre, String apellido, String rut, String telefono, String direccion, int estado) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.telefono = telefono;
        this.direccion = direccion;
        this.estado = estado;
    }
    
    //Metodo Set and Get

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    

}
