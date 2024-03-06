
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.Operacion;


/**
 *
 * @author josez
 */
public class Ctrl_Operacion {

    /**
     * Metodo para guardar nuevo cliente
     */
    public boolean guardar(Operacion objeto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_operaciones values(?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getTiempoEjecuccion());
            consulta.setString(4, objeto.getDepartamento());
       
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Operacion: " + e);
        }
        return respuesta;
    }

    //metodo para consultar si el producto esta registrado en la base de datos
    public boolean existeOperacion(String descripcion) {
        boolean respuesta = false;
        String sql = "select descripcion from tb_operaciones where rut = '" + descripcion + "'; ";
        Statement st;
        try {
            Connection cn = conexion.Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Operacion existe: " + e);
        }
        return respuesta;
    }
    /**
     * Metodo para actualizar un cliente
     * 
     */
    
    public boolean actualizar(Operacion objeto, int idOperacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_operaciones values(?,?,?,?)where idOperacion ='"+idOperacion+"'");
            consulta.setInt(1, 0);//id
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getTiempoEjecuccion());
            consulta.setString(4, objeto.getDepartamento());
            
            
           
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Operacion: " + e);
        }
        return respuesta;
    }

   /**
     * /metodo para eliminar un Cliente
     */
    
    public boolean eliminar(int idOperacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(" delete from tb_operaciones where idOperacion ='" + idOperacion + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Operacion : " + e);
        }
        return respuesta;
    }

}
