/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author josez
 */
public class Ctrl_Usuario {
    /**
     * Metodo para guardar usuario
    */
        public boolean guardar(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApellido());
            consulta.setString(4,objeto.getRut());
            consulta.setString(5, objeto.getUsuario());
            consulta.setString(6, objeto.getPassword());
            consulta.setString(7,objeto.getCargo());
            consulta.setString(8, objeto.getTelefono());
            consulta.setString(9, objeto.getCorreoElectronico());
            consulta.setString(10,objeto.getDireccion());
            consulta.setInt(11, objeto.getEstado());
            consulta.setString(12, objeto.getFechaIngreso());
            consulta.setString(13, objeto.getFechaEgreso());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }

    //metodo para consultar si el usuario esta registrado en la base de datos
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuario where usuario = '" + usuario + "'; ";
        Statement st;
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    //metodo para iniciar sesion
    public boolean inicioUsuario(Usuario objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from tb_usuario where usuario ='" + objeto.getUsuario() + "' and password='" + objeto.getPassword() + "'";
        Statement st;
        try {

            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al iniciar Sesion");
        }
        return respuesta;
    }
    /**
     * Metodo para actualizar un usuario
     * 
     */
    
    public boolean actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre=?,apellido=?,rut=?,usuario=?,password=?,cargo=?,telefono=?,correoElectronico=?,direccion=?,estado=?,fechaIngreso=?,fechaEgreso=? where idUsuario ='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3,objeto.getRut());
            consulta.setString(4, objeto.getUsuario());
            consulta.setString(5, objeto.getPassword());
            consulta.setString(6,objeto.getCargo());
            consulta.setString(7, objeto.getTelefono());
            consulta.setString(8, objeto.getCorreoElectronico());
            consulta.setString(9,objeto.getDireccion());
            consulta.setInt(10, objeto.getEstado());
            
            consulta.setString(11, objeto.getFechaIngreso());
            consulta.setString(12,objeto.getFechaEgreso());
            
            
            
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Usuario: " + e);
        }
        return respuesta;
    }

   /**
     * /metodo para eliminar un usuario
     */
    
    public boolean eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(" delete from tb_usuario where idUsuario ='" + idUsuario + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Usuario: " + e);
        }
        return respuesta;
    }

}
