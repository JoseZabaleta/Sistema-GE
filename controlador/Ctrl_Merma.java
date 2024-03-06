package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Merma;
import modelo.Producto;

/**
 *
 * @author josez
 */
public class Ctrl_Merma {

    /**
     * Metodo para guardar una merma
     *
     * @param merma
     * @return
     */
    public boolean guardar(Merma merma) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_merma values(?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, merma.getDescripcion());
            consulta.setInt(3, merma.getCantidad());
            consulta.setString(4, merma.getFecha());
            consulta.setInt(5, merma.getIdProducto());
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar merma: " + e);
        }
        return respuesta;
    }

    /**
     * Metodo para actualizar una tarea
     *
     * @param merma
     * @param idMerma
     * @return
     */
    public boolean actualizar(Merma merma, int idMerma) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_merma set descripcion=?,cantidad=?,fecha=?,idProducto=? where idMerma ='" + idMerma + "'");
            consulta.setString(1, merma.getDescripcion());
            consulta.setInt(2, merma.getCantidad());
            consulta.setString(3, merma.getFecha());
            consulta.setInt(4, merma.getIdProducto());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar merma: " + e);
        }
        return respuesta;
    }
 
    /**
     * Metodo para eliminar una merma
     *
     * @param idMerma
     * @return
     */
    public boolean eliminar(int idMerma) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(" delete from tb_merma where idMerma ='" + idMerma + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar merma: " + e);
        }
        return respuesta;
    }

    
}
