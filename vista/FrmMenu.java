package vista;

import controlador.Reportes;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDesktopPane;

/**
 *
 * @author josez
 */
public class FrmMenu extends javax.swing.JFrame {

    public static JDesktopPane jDestokPane_menu;

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu() {

        initComponents();
        this.setSize(new Dimension(1200, 700));
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setTitle("Sistema Gestion Emprensarial");

        this.setLayout(null);
        jDestokPane_menu = new JDesktopPane();
        int largo = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.jDestokPane_menu.setBounds(0, 0, largo, (alto - 110));
        this.add(jDestokPane_menu);

    }

    @Override
    public Image getIconImage() {
        Image retValueImage = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/ventas.png"));
        return retValueImage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_usuario = new javax.swing.JMenu();
        jMenuItem_nuevoUsuario = new javax.swing.JMenuItem();
        jMenuItem_gestionarUsuario = new javax.swing.JMenuItem();
        jMenu_producto = new javax.swing.JMenu();
        jMenuItem_nuevoProducto = new javax.swing.JMenuItem();
        jMenuItem_gestionarProducto = new javax.swing.JMenuItem();
        jMenuItem_actualizarStock = new javax.swing.JMenuItem();
        jMenuItem_nuevoProducto1 = new javax.swing.JMenuItem();
        jMenu_cliente = new javax.swing.JMenu();
        jMenuItem_nuevoCliente = new javax.swing.JMenuItem();
        jMenuItem_gestionarCliente = new javax.swing.JMenuItem();
        jMenu_categoria = new javax.swing.JMenu();
        jMenuItem_nuevaCategoria = new javax.swing.JMenuItem();
        jMenuItem_gestionarCategoria = new javax.swing.JMenuItem();
        jMenu_facturar = new javax.swing.JMenu();
        jMenuItem_nuevaFactura = new javax.swing.JMenuItem();
        jMenuItem_gestionarVentas = new javax.swing.JMenuItem();
        jMenu_reportes = new javax.swing.JMenu();
        jMenuItem_reportesCliente = new javax.swing.JMenuItem();
        jMenuItem_reportesCategoria = new javax.swing.JMenuItem();
        jMenuItem_reporteProductos = new javax.swing.JMenuItem();
        jMenuItem_reporteVentas = new javax.swing.JMenuItem();
        jMenuItem_reporteVentas1 = new javax.swing.JMenuItem();
        jMenu_historial = new javax.swing.JMenu();
        jMenuItem_verHistorial = new javax.swing.JMenuItem();
        jMenu_registros = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu_cerrarSesion = new javax.swing.JMenu();
        jMenuItem_cerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu_usuario.setText("Empleados");
        jMenu_usuario.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_usuario.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_usuario.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_nuevoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevoUsuario.setText("Nuevo Usuario");
        jMenuItem_nuevoUsuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevoUsuarioActionPerformed(evt);
            }
        });
        jMenu_usuario.add(jMenuItem_nuevoUsuario);

        jMenuItem_gestionarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionarUsuario.setText("Gestionar Usuario");
        jMenuItem_gestionarUsuario.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarUsuarioActionPerformed(evt);
            }
        });
        jMenu_usuario.add(jMenuItem_gestionarUsuario);

        jMenuBar1.add(jMenu_usuario);

        jMenu_producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenu_producto.setText("Producto");
        jMenu_producto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_producto.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_producto.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_nuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevoProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevoProducto.setText("Nuevo Producto");
        jMenuItem_nuevoProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevoProductoActionPerformed(evt);
            }
        });
        jMenu_producto.add(jMenuItem_nuevoProducto);

        jMenuItem_gestionarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/producto.png"))); // NOI18N
        jMenuItem_gestionarProducto.setText("Gestionar Productos");
        jMenuItem_gestionarProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarProductoActionPerformed(evt);
            }
        });
        jMenu_producto.add(jMenuItem_gestionarProducto);

        jMenuItem_actualizarStock.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_actualizarStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_actualizarStock.setText("Actualizar Stock");
        jMenuItem_actualizarStock.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_actualizarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizarStockActionPerformed(evt);
            }
        });
        jMenu_producto.add(jMenuItem_actualizarStock);

        jMenuItem_nuevoProducto1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevoProducto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-producto.png"))); // NOI18N
        jMenuItem_nuevoProducto1.setText("Merma");
        jMenuItem_nuevoProducto1.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevoProducto1ActionPerformed(evt);
            }
        });
        jMenu_producto.add(jMenuItem_nuevoProducto1);

        jMenuBar1.add(jMenu_producto);

        jMenu_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jMenu_cliente.setText("Cliente");
        jMenu_cliente.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_cliente.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_cliente.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_nuevoCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo-cliente.png"))); // NOI18N
        jMenuItem_nuevoCliente.setText("Nuevo Cliente");
        jMenuItem_nuevoCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevoClienteActionPerformed(evt);
            }
        });
        jMenu_cliente.add(jMenuItem_nuevoCliente);

        jMenuItem_gestionarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionarCliente.setText("Gestionar Clientes");
        jMenuItem_gestionarCliente.setPreferredSize(new java.awt.Dimension(210, 30));
        jMenuItem_gestionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarClienteActionPerformed(evt);
            }
        });
        jMenu_cliente.add(jMenuItem_gestionarCliente);

        jMenuBar1.add(jMenu_cliente);

        jMenu_categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenu_categoria.setText("Categoria");
        jMenu_categoria.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_categoria.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_categoria.setPreferredSize(new java.awt.Dimension(180, 30));

        jMenuItem_nuevaCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        jMenuItem_nuevaCategoria.setText("Nueva Categoria");
        jMenuItem_nuevaCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevaCategoriaActionPerformed(evt);
            }
        });
        jMenu_categoria.add(jMenuItem_nuevaCategoria);

        jMenuItem_gestionarCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categorias.png"))); // NOI18N
        jMenuItem_gestionarCategoria.setText("Gestionar Categoria");
        jMenuItem_gestionarCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarCategoriaActionPerformed(evt);
            }
        });
        jMenu_categoria.add(jMenuItem_gestionarCategoria);

        jMenuBar1.add(jMenu_categoria);

        jMenu_facturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carrito.png"))); // NOI18N
        jMenu_facturar.setText("Facturar");
        jMenu_facturar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_facturar.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_facturar.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_nuevaFactura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_nuevaFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/anadir.png"))); // NOI18N
        jMenuItem_nuevaFactura.setText("Nueva Venta");
        jMenuItem_nuevaFactura.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_nuevaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevaFacturaActionPerformed(evt);
            }
        });
        jMenu_facturar.add(jMenuItem_nuevaFactura);

        jMenuItem_gestionarVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_gestionarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuraciones.png"))); // NOI18N
        jMenuItem_gestionarVentas.setText("Gestionar Ventas");
        jMenuItem_gestionarVentas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_gestionarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionarVentasActionPerformed(evt);
            }
        });
        jMenu_facturar.add(jMenuItem_gestionarVentas);

        jMenuBar1.add(jMenu_facturar);

        jMenu_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu_reportes.setText("Reportes");
        jMenu_reportes.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_reportes.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_reportes.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_reportesCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportesCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportesCliente.setText("Reportes Clientes");
        jMenuItem_reportesCliente.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportesClienteActionPerformed(evt);
            }
        });
        jMenu_reportes.add(jMenuItem_reportesCliente);

        jMenuItem_reportesCategoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reportesCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reportesCategoria.setText("Reportes Categorias");
        jMenuItem_reportesCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reportesCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportesCategoriaActionPerformed(evt);
            }
        });
        jMenu_reportes.add(jMenuItem_reportesCategoria);

        jMenuItem_reporteProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporteProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporteProductos.setText("Reporte Productos");
        jMenuItem_reporteProductos.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporteProductosActionPerformed(evt);
            }
        });
        jMenu_reportes.add(jMenuItem_reporteProductos);

        jMenuItem_reporteVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporteVentas.setText("Reportes Ventas");
        jMenuItem_reporteVentas.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporteVentasActionPerformed(evt);
            }
        });
        jMenu_reportes.add(jMenuItem_reporteVentas);

        jMenuItem_reporteVentas1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_reporteVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte1.png"))); // NOI18N
        jMenuItem_reporteVentas1.setText("Reportes Asignacion");
        jMenuItem_reporteVentas1.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_reporteVentas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reporteVentas1ActionPerformed(evt);
            }
        });
        jMenu_reportes.add(jMenuItem_reporteVentas1);

        jMenuBar1.add(jMenu_reportes);

        jMenu_historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenu_historial.setText("Historial");
        jMenu_historial.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_historial.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_historial.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_verHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_verHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial1.png"))); // NOI18N
        jMenuItem_verHistorial.setText("Ver Histrorial");
        jMenuItem_verHistorial.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_verHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_verHistorialActionPerformed(evt);
            }
        });
        jMenu_historial.add(jMenuItem_verHistorial);

        jMenuBar1.add(jMenu_historial);

        jMenu_registros.setText("Registros");
        jMenu_registros.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_registros.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_registros.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem18.setText("Asignacion de Operaciones");
        jMenuItem18.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu_registros.add(jMenuItem18);

        jMenuItem21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem21.setText("Evaluar Asignaciones");
        jMenuItem21.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu_registros.add(jMenuItem21);

        jMenuItem22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem22.setText("jMenuItem21");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenu_registros.add(jMenuItem22);

        jMenuBar1.add(jMenu_registros);

        jMenu_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenu_cerrarSesion.setText("Cerrar Sesion");
        jMenu_cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jMenu_cerrarSesion.setMinimumSize(new java.awt.Dimension(120, 50));
        jMenu_cerrarSesion.setPreferredSize(new java.awt.Dimension(130, 50));

        jMenuItem_cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMenuItem_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar-sesion.png"))); // NOI18N
        jMenuItem_cerrarSesion.setText("Cerrar Sesion");
        jMenuItem_cerrarSesion.setPreferredSize(new java.awt.Dimension(200, 30));
        jMenuItem_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrarSesionActionPerformed(evt);
            }
        });
        jMenu_cerrarSesion.add(jMenuItem_cerrarSesion);

        jMenuBar1.add(jMenu_cerrarSesion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_gestionarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarVentasActionPerformed
        InterGestionarVentas interGestionarVentas = new InterGestionarVentas();
        jDestokPane_menu.add(interGestionarVentas);
        interGestionarVentas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionarVentasActionPerformed

    private void jMenuItem_gestionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarCategoriaActionPerformed
        // TODO add your handling code here:
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDestokPane_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionarCategoriaActionPerformed

    private void jMenuItem_nuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevaCategoriaActionPerformed
        // TODO add your handling code here:
        InterCategoria interCategoria = new InterCategoria();
        jDestokPane_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevaCategoriaActionPerformed

    private void jMenuItem_nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevoProductoActionPerformed
        // TODO add your handling code here:
        InterProducto interProducto = new InterProducto();
        jDestokPane_menu.add(interProducto);
        interProducto.setVisible(true);

    }//GEN-LAST:event_jMenuItem_nuevoProductoActionPerformed

    private void jMenuItem_gestionarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarProductoActionPerformed
        // TODO add your handling code here:
        InterGestionarProducto interGestionarProducto = new InterGestionarProducto();
        jDestokPane_menu.add(interGestionarProducto);
        interGestionarProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionarProductoActionPerformed

    private void jMenuItem_nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevoClienteActionPerformed
        // TODO add your handling code here:
        InterCliente interCliente = new InterCliente();
        jDestokPane_menu.add(interCliente);
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevoClienteActionPerformed

    private void jMenuItem_gestionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarClienteActionPerformed
        // TODO add your handling code here:
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
        jDestokPane_menu.add(interGestionarCliente);
        interGestionarCliente.setVisible(true);


    }//GEN-LAST:event_jMenuItem_gestionarClienteActionPerformed

    private void jMenuItem_actualizarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizarStockActionPerformed
        // TODO add your handling code here:
        InterActualizarStock interActualizarStock = new InterActualizarStock();
        jDestokPane_menu.add(interActualizarStock);
        interActualizarStock.setVisible(true);

    }//GEN-LAST:event_jMenuItem_actualizarStockActionPerformed

    private void jMenuItem_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrarSesionActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jMenuItem_cerrarSesionActionPerformed

    private void jMenuItem_nuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevoUsuarioActionPerformed
        // TODO add your handling code here:
        InterUsuario interusuario = new InterUsuario();
        jDestokPane_menu.add(interusuario);
        interusuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevoUsuarioActionPerformed

    private void jMenuItem_gestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionarUsuarioActionPerformed
        // TODO add your handling code here:
        InterGestionarUsuario interGestionarUsuario = new InterGestionarUsuario();
        jDestokPane_menu.add(interGestionarUsuario);
        interGestionarUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionarUsuarioActionPerformed

    private void jMenuItem_nuevaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevaFacturaActionPerformed
        // TODO add your handling code here:
        InterFacturacion interFacturacion = new InterFacturacion();
        jDestokPane_menu.add(interFacturacion);
        interFacturacion.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevaFacturaActionPerformed

    private void jMenuItem_reportesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportesClienteActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesClientes();
    }//GEN-LAST:event_jMenuItem_reportesClienteActionPerformed

    private void jMenuItem_reporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporteProductosActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesProductos();
    }//GEN-LAST:event_jMenuItem_reporteProductosActionPerformed

    private void jMenuItem_reportesCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportesCategoriaActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesCategorias();
    }//GEN-LAST:event_jMenuItem_reportesCategoriaActionPerformed

    private void jMenuItem_reporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporteVentasActionPerformed
        // TODO add your handling code here:
        Reportes reporte = new Reportes();
        reporte.ReporteVentas();
    }//GEN-LAST:event_jMenuItem_reporteVentasActionPerformed

    private void jMenuItem_verHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_verHistorialActionPerformed
        InterGraficas interGraficas = new InterGraficas();
        jDestokPane_menu.add(interGraficas);
        interGraficas.setVisible(true);
    }//GEN-LAST:event_jMenuItem_verHistorialActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        InterRegistro interRegistro = new InterRegistro();
        jDestokPane_menu.add(interRegistro);
        interRegistro.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
       InterGestionarAsignacion interGestionarAsig = new InterGestionarAsignacion();
       jDestokPane_menu.add(interGestionarAsig);
       interGestionarAsig.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem_reporteVentas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reporteVentas1ActionPerformed
        Reportes reporte = new Reportes();
        reporte.ReportesAsignaciones();
        
    }//GEN-LAST:event_jMenuItem_reporteVentas1ActionPerformed

    private void jMenuItem_nuevoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevoProducto1ActionPerformed
        InterMerma interMerma= new InterMerma();
        jDestokPane_menu.add(interMerma);
        interMerma.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevoProducto1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem_actualizarStock;
    private javax.swing.JMenuItem jMenuItem_cerrarSesion;
    private javax.swing.JMenuItem jMenuItem_gestionarCategoria;
    private javax.swing.JMenuItem jMenuItem_gestionarCliente;
    private javax.swing.JMenuItem jMenuItem_gestionarProducto;
    private javax.swing.JMenuItem jMenuItem_gestionarUsuario;
    private javax.swing.JMenuItem jMenuItem_gestionarVentas;
    private javax.swing.JMenuItem jMenuItem_nuevaCategoria;
    private javax.swing.JMenuItem jMenuItem_nuevaFactura;
    private javax.swing.JMenuItem jMenuItem_nuevoCliente;
    private javax.swing.JMenuItem jMenuItem_nuevoProducto;
    private javax.swing.JMenuItem jMenuItem_nuevoProducto1;
    private javax.swing.JMenuItem jMenuItem_nuevoUsuario;
    private javax.swing.JMenuItem jMenuItem_reporteProductos;
    private javax.swing.JMenuItem jMenuItem_reporteVentas;
    private javax.swing.JMenuItem jMenuItem_reporteVentas1;
    private javax.swing.JMenuItem jMenuItem_reportesCategoria;
    private javax.swing.JMenuItem jMenuItem_reportesCliente;
    private javax.swing.JMenuItem jMenuItem_verHistorial;
    private javax.swing.JMenu jMenu_categoria;
    private javax.swing.JMenu jMenu_cerrarSesion;
    private javax.swing.JMenu jMenu_cliente;
    private javax.swing.JMenu jMenu_facturar;
    private javax.swing.JMenu jMenu_historial;
    private javax.swing.JMenu jMenu_producto;
    private javax.swing.JMenu jMenu_registros;
    private javax.swing.JMenu jMenu_reportes;
    private javax.swing.JMenu jMenu_usuario;
    // End of variables declaration//GEN-END:variables
}
