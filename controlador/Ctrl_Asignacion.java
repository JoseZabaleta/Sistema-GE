package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Asignacion;
import modelo.Producto;

/**
 *
 * @author josez
 */
public class Ctrl_Asignacion {

    /**
     * Metodo para guardar una tarea
     *
     * @param asignacion
     * @return
     */
    public boolean guardar(Asignacion asignacion) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_asignacion values(?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setInt(2, asignacion.getIdOperacion());
            consulta.setString(3, asignacion.getDescripcion());
            consulta.setInt(4, asignacion.getIdSupervisor());
            consulta.setInt(5, asignacion.getIdEmpleado());
            consulta.setString(6, asignacion.getFechaInicio());
            consulta.setString(7, asignacion.getFechaFin());
            consulta.setString(8, asignacion.getEvaluacion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar Asignacion: " + e);
        }
        return respuesta;
    }

    /**
     * Metodo para actualizar una tarea
     *
     * @param objeto
     * @param idAsignacion
     * @return
     */
    public boolean actualizar(Asignacion asignacion, int idAsignacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_asignacion set idOperacion=?,descripcion=?,idSupervisor=?,idEmpleado=?,fechaInicio=?,fechaFin=?,evaluacion=? where idAsignacion ='" + idAsignacion + "'");
            consulta.setInt(1, asignacion.getIdOperacion());
            consulta.setString(2, asignacion.getDescripcion());
            consulta.setInt(3, asignacion.getIdSupervisor());
            consulta.setInt(4, asignacion.getIdEmpleado());
            consulta.setString(5, asignacion.getFechaInicio());
            consulta.setString(6, asignacion.getFechaFin());
            consulta.setString(7, asignacion.getEvaluacion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar Asignacion: " + e);
        }
        return respuesta;
    }
    /**
     * Metodo para evaluar una tarea
     * @param asignacion
     * @param idAsignacion
     * @return 
     */
     public boolean evaluar(Asignacion asignacion, int idAsignacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("update tb_asignacion set evaluacion=? where idAsignacion ='" + idAsignacion + "'");
            consulta.setString(1, asignacion.getEvaluacion());
           

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al Evaluo asignacion: " + e);
        }
        return respuesta;
    }

    /**
     * Metodo para eliminar una tarea
     *
     * @param idAsignacion
     * @return
     */
    public boolean eliminar(int idAsignacion) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(" delete from tb_asignacion where idAsignacion ='" + idAsignacion + "'");
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar Asignacion: " + e);
        }
        return respuesta;
    }

    /**
     * /metodo para actualizar stock producto
     */
    public boolean actualizarStock(Producto object, int idProducto) {
        boolean respuesta = false;
        Connection cn = conexion.Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(" update tb_producto set cantidad=? where idProducto ='" + idProducto + "'");
            consulta.setInt(1, object.getCantidad());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar stock Producto: " + e);
        }
        return respuesta;
    }

}
