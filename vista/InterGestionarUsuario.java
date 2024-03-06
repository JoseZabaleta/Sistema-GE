package vista;

import conexion.Conexion;
import controlador.Ctrl_Cliente;
import controlador.Ctrl_Usuario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author josez
 */
public class InterGestionarUsuario extends javax.swing.JInternalFrame {

    private int idUsuario = 0;

    public InterGestionarUsuario() {
        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Empleados");
        this.CargarTablaUsuarios();

        //insetar imagen el jlabelwallpaper
        ImageIcon wallpaper = new ImageIcon("src/img/fondo3.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(900, 500, WIDTH));
        jLabel_wallpaper.setIcon(icono);
        this.repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_administarrProductos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuarios = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton_actualizar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel_nombre = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel_nombre1 = new javax.swing.JLabel();
        jLabel_nombre2 = new javax.swing.JLabel();
        jLabel_nombre3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel_direccion = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_rut = new javax.swing.JTextField();
        jLabel_nombre4 = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        jLabel_direccion1 = new javax.swing.JLabel();
        jLabel_direccion2 = new javax.swing.JLabel();
        txt_correoElectronico = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        jLabel_nombre5 = new javax.swing.JLabel();
        txt_fechaIngreso = new javax.swing.JTextField();
        jLabel_nombre6 = new javax.swing.JLabel();
        txt_fechaEgreso = new javax.swing.JTextField();
        jLabel_nombre7 = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_administarrProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_administarrProductos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_administarrProductos.setText("Administrar Empleados");
        getContentPane().add(lbl_administarrProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_usuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizar.setBackground(new java.awt.Color(204, 255, 204));
        jButton_actualizar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, -1));

        jButton_eliminar.setBackground(new java.awt.Color(255, 51, 51));
        jButton_eliminar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre.setText("Nombre: ");
        jPanel3.add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel_nombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre1.setText("Apellido:");
        jPanel3.add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jLabel_nombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre2.setText("Usuario:");
        jPanel3.add(jLabel_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 100, -1));

        jLabel_nombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre3.setText("Telefono:");
        jPanel3.add(jLabel_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, -1));

        jLabel_direccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_direccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion.setText("Password:");
        jPanel3.add(jLabel_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 100, -1));

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        jPanel3.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        txt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rutActionPerformed(evt);
            }
        });
        jPanel3.add(txt_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, -1));

        jLabel_nombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre4.setText("Rut:");
        jPanel3.add(jLabel_nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        txt_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cargoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 170, -1));

        jLabel_direccion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_direccion1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion1.setText("Cargo:");
        jPanel3.add(jLabel_direccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 100, -1));

        jLabel_direccion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_direccion2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_direccion2.setText("E-mail");
        jPanel3.add(jLabel_direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 100, -1));

        txt_correoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correoElectronicoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_correoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 170, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        jPanel3.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 170, -1));

        jLabel_nombre5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre5.setText("Direccion:");
        jPanel3.add(jLabel_nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 100, -1));

        txt_fechaIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaIngresoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 170, -1));

        jLabel_nombre6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre6.setText("Fecha Ingreso:");
        jPanel3.add(jLabel_nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 100, -1));

        txt_fechaEgreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaEgresoActionPerformed(evt);
            }
        });
        jPanel3.add(txt_fechaEgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 170, -1));

        jLabel_nombre7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_nombre7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_nombre7.setText("Fecha Egreso:");
        jPanel3.add(jLabel_nombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 100, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 130));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 6, 890, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        Usuario usuario = new Usuario();
        Ctrl_Usuario controlUsuario = new Ctrl_Usuario();
        if (idUsuario == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario");
        } else {
            if (txt_nombre.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_usuario.getText().isEmpty()
                    || txt_password.getText().isEmpty() || txt_telefono.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else {
                usuario.setNombre(txt_nombre.getText().trim());
                usuario.setApellido(txt_apellido.getText().trim());
                 usuario.setRut(txt_rut.getText().trim());
                usuario.setUsuario(txt_usuario.getText().trim());
                usuario.setPassword(txt_password.getText().trim());
                usuario.setCargo(txt_cargo.getText().trim());
                usuario.setTelefono(txt_telefono.getText().trim());
                usuario.setCorreoElectronico(txt_correoElectronico.getText().trim());
                usuario.setDireccion(txt_direccion.getText().trim());
                usuario.setEstado(1);
                usuario.setFechaIngreso(txt_fechaIngreso.getText().trim());
                usuario.setFechaEgreso(txt_fechaEgreso.getText().trim());
                if (controlUsuario.actualizar(usuario, idUsuario)) {
                    JOptionPane.showMessageDialog(null, "Usuario actualizado con exito");
                    this.Limpiar();
                    this.CargarTablaUsuarios();
                    idUsuario = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar usuario");
                }

            }
        }


    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        Ctrl_Usuario controlUsuario= new Ctrl_Usuario();
        if (idUsuario == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione usuario");
        } else {
           
            if (!controlUsuario.eliminar(idUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                this.CargarTablaUsuarios();
                this.Limpiar();
                idUsuario =0;
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar usaurio");
            }
        }

    }//GEN-LAST:event_jButton_eliminarActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rutActionPerformed

    private void txt_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoActionPerformed

    private void txt_correoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correoElectronicoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_fechaIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaIngresoActionPerformed

    private void txt_fechaEgresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaEgresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaEgresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JLabel jLabel_direccion;
    private javax.swing.JLabel jLabel_direccion1;
    private javax.swing.JLabel jLabel_direccion2;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_nombre2;
    private javax.swing.JLabel jLabel_nombre3;
    private javax.swing.JLabel jLabel_nombre4;
    private javax.swing.JLabel jLabel_nombre5;
    private javax.swing.JLabel jLabel_nombre6;
    private javax.swing.JLabel jLabel_nombre7;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_usuarios;
    private javax.swing.JLabel lbl_administarrProductos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_correoElectronico;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fechaEgreso;
    private javax.swing.JTextField txt_fechaIngreso;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_password;
    private javax.swing.JTextField txt_rut;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
 /*
     * Metodo para limpiar campos tabla
     *  
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_rut.setText("");
        txt_usuario.setText("");
        txt_password.setText("");
        txt_cargo.setText("");
        txt_telefono.setText("");
        txt_correoElectronico.setText("");
        txt_direccion.setText("");
        txt_fechaIngreso.setText("");
        txt_fechaEgreso.setText("");
      

    }

    /**
     * Metodo para caragar tabla cliente
     */
    private void CargarTablaUsuarios() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select *from tb_usuario;";
        Statement st;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarUsuario.jTable_usuarios = new JTable(model);
            InterGestionarUsuario.jScrollPane1.setViewportView(InterGestionarUsuario.jTable_usuarios);

            model.addColumn("N°");
            model.addColumn("NOMBRE");
            model.addColumn("APELLIDO");
            model.addColumn("USUARIO");
            model.addColumn("PASSWORD");
            model.addColumn("RUT");
            model.addColumn("CARGO");
            model.addColumn("TELEFONO");
            model.addColumn("E-MAIL");
            model.addColumn("DIRECCION");
            model.addColumn("ESTADO");
            model.addColumn("FECHA INGRESO");
            model.addColumn("FECHA EGRESO");

            while (rs.next()) {
                Object fila[] = new Object[13];
                for (int i = 0; i < 13; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);

            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla usuarios " + e);
        }

        jTable_usuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_usuarios.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idUsuario = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosUsuarioSeleccionado(idUsuario);//metodo
                }
            }
        });

    }

    /**
     * Metodos que envia datos seleccionados de la tabla gestionar cliente
     */
    private void EnviarDatosUsuarioSeleccionado(int idUsuario) {
        try {

            Connection con = Conexion.conectar();
            PreparedStatement pst = con.prepareStatement(
                    "select * from tb_usuario where idUsuario = '" + idUsuario + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_rut.setText(rs.getString("rut"));
                txt_usuario.setText(rs.getString("usuario"));
                txt_password.setText(rs.getString("password"));
                txt_cargo.setText(rs.getString("cargo"));
                txt_telefono.setText(rs.getString("telefono"));
                txt_correoElectronico.setText(rs.getString("correoElectronico"));
                txt_direccion.setText(rs.getString("direccion"));
                txt_fechaIngreso.setText(rs.getString("fechaIngreso"));
                txt_fechaEgreso.setText(rs.getString("fechaEgreso"));

            }
            con.close();

        } catch (SQLException e) {
            System.out.println("Error Seleccionar usuario");
        }
    }

}