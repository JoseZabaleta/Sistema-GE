package vista;

import controlador.Ctrl_Categoria;
import javax.swing.JOptionPane;
import modelo.Categoria;

/**
 *
 * @author josez
 */
public class InterCategoria extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterCategoria
     */
    public InterCategoria() {
        initComponents();
        this.setSize(400, 200);
        this.setTitle("Nueva Categoria");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_descripcion_categoria = new javax.swing.JLabel();
        txt_descripcion_categoria = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Categoria");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 22));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        lbl_descripcion_categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_descripcion_categoria.setForeground(new java.awt.Color(255, 255, 255));
        lbl_descripcion_categoria.setText("Descripcion categoria:");
        getContentPane().add(lbl_descripcion_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        getContentPane().add(txt_descripcion_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 170, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 90, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Categoria categoria = new Categoria();
        Ctrl_Categoria controlCategoria = new Ctrl_Categoria();

        //Validar campos vacios
        if (txt_descripcion_categoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los campos");
        } else {
            if (!controlCategoria.existeCategoria(txt_descripcion_categoria.getText().trim())) {

                categoria.setDescripcion(txt_descripcion_categoria.getText().trim());
                categoria.setEstado(1);
                 if (controlCategoria.guardar(categoria)) {
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
            }
            } else {
                JOptionPane.showMessageDialog(null, "Categoria Existe");
            }

           
        }
        //limpiar campo
        txt_descripcion_categoria.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JLabel lbl_descripcion_categoria;
    private javax.swing.JTextField txt_descripcion_categoria;
    // End of variables declaration//GEN-END:variables
}