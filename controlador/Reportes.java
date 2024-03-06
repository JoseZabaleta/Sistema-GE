package controlador;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josez
 */
public class Reportes {

    /**
     * ******************************************************
     * Metodo para crear reportes de ls clientes registrados en el sistema
    *******************************************************
     */
    public void ReportesClientes() {
        Document docuemnto = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(docuemnto, new FileOutputStream(ruta + "/Desktop/Reportes_Clientes.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            //Formato al texto
            Paragraph paraffo = new Paragraph();
            paraffo.setAlignment(Paragraph.ALIGN_CENTER);
            paraffo.add("Reporte creado  por \nJose Zabaleta © Sistema Gestion Empresarial\n\n");
            paraffo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.GRAY));
            paraffo.add("Reporte de Clientes \n\n");

            docuemnto.open();

            //agregar datos
            docuemnto.add(header);
            docuemnto.add(paraffo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("Rut");
            tabla.addCell("Telefono");
            tabla.addCell("Direccion");
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select idCliente, concat(nombre, ' ', apellido) as nombres, rut, telefono, direccion from tb_cliente");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                    } while (rs.next());
                    docuemnto.add(tabla);
                } else {
                }
            } catch (SQLException e) {
                System.out.println("Error en:"+e);
            } 
            docuemnto.close();
            JOptionPane.showMessageDialog(null,"Reporte Creado");
            
            
        } catch (DocumentException e) {
            System.out.println("Error en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
               System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     /**
     * ******************************************************
     * Metodo para crear reportes de los productos registrados en el sistema
    *******************************************************
     */
     public void ReportesProductos() {
        Document docuemnto = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(docuemnto, new FileOutputStream(ruta + "/Desktop/Reportes_Productos.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            //Formato al texto
            Paragraph paraffo = new Paragraph();
            paraffo.setAlignment(Paragraph.ALIGN_CENTER);
            paraffo.add("Reporte creado  por \nJose Zabaleta © Sistema Gestion Empresarial\n\n");
            paraffo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.GRAY));
            paraffo.add("Reporte de Productos \n\n");

            docuemnto.open();

            //agregar datos
            docuemnto.add(header);
            docuemnto.add(paraffo);
            float[]columnasAncho = {3,5,4,5,7,5,6};
            
            PdfPTable tabla = new PdfPTable(columnasAncho);
            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("Cantidad");
            tabla.addCell("Precio");
            tabla.addCell("Descripcion");
            tabla.addCell("Porc. Iva");
            tabla.addCell("Categoria");
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion, p.porcentajeIva, c.descripcion as categoria, p.estado "
                        + "from tb_producto as p, tb_categoria as c "
                        + "where p.idCategoria = c.idCategoria;" );
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                    } while (rs.next());
                    docuemnto.add(tabla);
                } else {
                }
            } catch (SQLException e) {
                System.out.println("Error en:"+e);
            } 
            docuemnto.close();
            JOptionPane.showMessageDialog(null,"Reporte Creado");
            
            
        } catch (DocumentException e) {
            System.out.println("Error en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
               System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

  /**
     * ******************************************************
     * Metodo para crear reportes de las Categorias registrados en el sistema
    *******************************************************
     */
    public void ReportesCategorias() {
        Document docuemnto = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(docuemnto, new FileOutputStream(ruta + "/Desktop/Reportes_Categorias.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            //Formato al texto
            Paragraph paraffo = new Paragraph();
            paraffo.setAlignment(Paragraph.ALIGN_CENTER);
            paraffo.add("Reporte creado  por \nJose Zabaleta © Sistema Gestion Empresarial\n\n");
            paraffo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.GRAY));
            paraffo.add("Reporte de Categorias \n\n");

            docuemnto.open();

            //agregar datos
            docuemnto.add(header);
            docuemnto.add(paraffo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Descripcion");
            tabla.addCell("Estado");
           
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from tb_categoria");
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        
                    } while (rs.next());
                    docuemnto.add(tabla);
                } else {
                }
            } catch (SQLException e) {
                System.out.println("Error en:"+e);
            } 
            docuemnto.close();
            JOptionPane.showMessageDialog(null,"Reporte Creado");
            
            
        } catch (DocumentException e) {
            System.out.println("Error en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
               System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     /**
     * ******************************************************
     * Metodo para crear reportes de los productos registrados en el sistema
    *******************************************************
     */
     public void ReporteVentas() {
        Document docuemnto = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(docuemnto, new FileOutputStream(ruta + "/Desktop/Reportes_Ventas.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            //Formato al texto
            Paragraph paraffo = new Paragraph();
            paraffo.setAlignment(Paragraph.ALIGN_CENTER);
            paraffo.add("Reporte creado  por \nJose Zabaleta © Sistema Gestion Empresarial\n\n");
            paraffo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.GRAY));
            paraffo.add("Reporte de Productos \n\n");

            docuemnto.open();

            //agregar datos
            docuemnto.add(header);
            docuemnto.add(paraffo);
            float[]columnasAncho = {3,9,4,5,3};
            
            PdfPTable tabla = new PdfPTable(columnasAncho);
            tabla.addCell("Codigo");
            tabla.addCell("Cliente");
            tabla.addCell("Total PAGAR");
            tabla.addCell("Fecha");
            tabla.addCell("Estado");
         
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select cv.idCabeceraVenta as id, "
                        + "concat(c.nombre, ' ', c.apellido) as cliente, cv.valorPagar as total, "
                        + "cv.fechaVenta as fecha, cv.estado from tb_cabecera_venta as cv , "
                        + "tb_cliente as c where cv.idCliente = c.idCliente" );
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                     
                    } while (rs.next());
                    docuemnto.add(tabla);
                } else {
                }
            } catch (SQLException e) {
                System.out.println("Error en:"+e);
            } 
            docuemnto.close();
            JOptionPane.showMessageDialog(null,"Reporte Creado");
            
            
        } catch (DocumentException e) {
            System.out.println("Error en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
               System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public void ReportesAsignaciones() {
        Document docuemnto = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(docuemnto, new FileOutputStream(ruta + "/Desktop/Reportes_Asignaciones.pdf"));
            Image header = Image.getInstance("src/img/header1.jpg");
            header.scaleToFit(650, 1000);
            header.setAlignment(Chunk.ALIGN_CENTER);
            //Formato al texto
            Paragraph paraffo = new Paragraph();
            paraffo.setAlignment(Paragraph.ALIGN_CENTER);
            paraffo.add("Reporte creado  por \nJose Zabaleta © Sistema Gestion Empresarial\n\n");
            paraffo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.GRAY));
            paraffo.add("Reporte de Asignaciones \n\n");

            docuemnto.open();

            //agregar datos
            docuemnto.add(header);
            docuemnto.add(paraffo);
            float[]columnasAncho = {10,10,10,10,10,10,10,10};
            
            PdfPTable tabla = new PdfPTable(columnasAncho);
            tabla.addCell("Codigo");
            tabla.addCell("Codigo Operacion");
            tabla.addCell("Descripcion");
            tabla.addCell("Id Supervisor");
            tabla.addCell("Id Empleado");
            tabla.addCell("Fecha Inicio");
            tabla.addCell("Fecha Fin");
            tabla.addCell("Evaluacion");
            try {
                Connection cn = conexion.Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select * from tb_asignacion" );
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    do {                        
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                    } while (rs.next());
                    docuemnto.add(tabla);
                } else {
                }
            } catch (SQLException e) {
                System.out.println("Error en:"+e);
            } 
            docuemnto.close();
            JOptionPane.showMessageDialog(null,"Reporte Creado");
            
            
        } catch (DocumentException e) {
            System.out.println("Error en: " + e);
        } catch (FileNotFoundException ex) {
            System.out.println("Error 2 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
               System.out.println("Error 3 en: " + ex);
            //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
