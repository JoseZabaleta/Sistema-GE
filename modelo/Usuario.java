/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author josez
 */
public class Usuario {
    //Definir atributos clase
    private int  idUsuario;
    private String nombre;
    private String apellido;
    private String rut;
    private String usuario;
    private String password;
    private String cargo;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private int estado;
    private String fechaIngreso;
    private String fechaEgreso;
    
    
    //constructorr estado inicial de nuestros atributos
    public Usuario(){
    this.idUsuario =0;
    this.nombre ="";
    this.apellido ="";
    this.rut="";
    this.usuario = "";
    this.password = "";
    this.cargo ="";
    this.telefono ="";
    this.correoElectronico ="";
    this.direccion="";
    this.estado = 0;
    this.fechaIngreso="";
    this.fechaEgreso ="";
    }
    //set y get

    public Usuario(int idUsuario, String nombre, String apellido, String rut, String usuario, String password, String cargo, String telefono, String correoElectronico, String direccion, int estado, String fechaIngreso, String fechaEgreso) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void setFechaEgreso(String fechaEgreso) {
        this.fechaEgreso = fechaEgreso;
    }

    
    
}
