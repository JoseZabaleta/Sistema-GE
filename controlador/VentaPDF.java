package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.sql.StatementEvent;
import vista.InterFacturacion;

/**
 *
 * @author josez
 */
public class VentaPDF {
    
    private String nombreCliente;
    private String rutCliente;
    private String telefonoCLiente;
    private String direccionCliente;
    
    private String fechaActual = "";
    private String nombrePdfVenta = "";

    //Metodo para obtener datos de cliente
    public void datosCliente(int idCliente) {
        Connection cn = conexion.Conexion.conectar();
        String sql = " select *from tb_cliente where idCliente = '" + idCliente + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nombreCliente = rs.getString("nombre") + " " + rs.getString("apellido");
                rutCliente = rs.getString("rut");
                telefonoCLiente = rs.getString("telefono");
                direccionCliente = rs.getString("direccion");
            }
            cn.close();
            
        } catch (Exception e) {
            System.out.println("Error al obtener id cliente " + e);
        }
        
    }

    //Metodo paa generar factura
    public void generarFactura() {
        try {
            Date date = new Date();
            fechaActual = new SimpleDateFormat("yyyy/MM/dd").format(date);
            String fechaNueva = "";
            for (int i = 0; i < fechaActual.length(); i++) {
                if (fechaActual.charAt(i) == '/') {
                    fechaNueva = fechaActual.replace("/", "_");
                }
            }
            nombrePdfVenta = "Venta_" + nombreCliente + "_" + fechaNueva + ".pdf";
            
            FileOutputStream archivo;
            File file = new File("src/pdf/" + nombrePdfVenta);
            archivo = new FileOutputStream(file);
            
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            Image img = Image.getInstance("src/img/ventas.png");
            Paragraph fecha = new Paragraph();
            Font ngrita = new Font(Font.FontFamily.COURIER, 12, Font.BOLD, BaseColor.BLUE);
            fecha.add(Chunk.NEWLINE);
            fecha.add("Factura : 001" + "\nFecha:" + fechaActual + "\n\n");
            
            PdfPTable Encabezado = new PdfPTable(4);
            Encabezado.setWidthPercentage(100);
            Encabezado.getDefaultCell().setBorder(0);
            //tamaño celdas
            float[] ColumnaEncabezado = new float[]{20f, 30f, 70f, 40f};
            Encabezado.setWidths(ColumnaEncabezado);
            Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);
            //agregar celdas
            Encabezado.addCell(img);
            
            String rut = "15697774-8";
            String nombre = "Sisetma de Gestion de Ventas";
            String telefono = "0242-8526598";
            String direccion = "San Fernando";
            String razonSocial = "Generando Software, SPA";
            
            Encabezado.addCell("");//VACIA
            Encabezado.addCell("Rut " + rut + "\nNombre " + nombre + "\nTelefono " + telefono + "\nDireccion " + direccion + "\nRazon Social " + razonSocial);
            Encabezado.addCell(fecha);
            doc.add(Encabezado);
            // Body
            Paragraph cliente = new Paragraph();
            cliente.add(Chunk.NEWLINE);
            cliente.add("Datos del cliente: " + "\n\n");
            doc.add(cliente);
            //Datos del cliente
            PdfPTable tablaCliente = new PdfPTable(4);
            tablaCliente.setWidthPercentage(100);
            tablaCliente.getDefaultCell().setBorder(0);
            float[] ColumnaCliente = new float[]{25f, 45f, 30f, 40f};
            tablaCliente.setWidths(ColumnaCliente);
            tablaCliente.setHorizontalAlignment(Element.ALIGN_LEFT);
            PdfPCell cliented = new PdfPCell(new Phrase("Rut: ", ngrita));
            PdfPCell clientec = new PdfPCell(new Phrase("Nombre: ", ngrita));
            PdfPCell clientee = new PdfPCell(new Phrase("Telefono: ", ngrita));
            PdfPCell clientef = new PdfPCell(new Phrase("Dirección: ", ngrita));
            cliented.setBorder(0);
            clientec.setBorder(0);
            clientec.setBorder(0);
            clientef.setBorder(0);
            //agregarceldas
            tablaCliente.addCell(cliented);
            tablaCliente.addCell(clientec);
            tablaCliente.addCell(clientee);
            tablaCliente.addCell(clientef);
            tablaCliente.addCell(rutCliente);
            tablaCliente.addCell(nombreCliente);
            tablaCliente.addCell(telefonoCLiente);
            tablaCliente.addCell(direccionCliente);
            doc.add(cliente);

            //
            Paragraph espacio = new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            //Productos
            PdfPTable tablaProducto = new PdfPTable(4);
            tablaProducto.setWidthPercentage(100);
            tablaProducto.getDefaultCell().setBorder(0);
            //tamaño celdas
            float[] ColumnaProductos = new float[]{15f, 50f, 15f, 20f};
            tablaProducto.setWidths(ColumnaProductos);
            tablaProducto.setHorizontalAlignment(Element.ALIGN_LEFT);
            //agregar celdas
            PdfPCell p1 = new PdfPCell(new Phrase("Cantidad : ",ngrita));
            PdfPCell p2 = new PdfPCell(new Phrase("Descripcion : ",ngrita));
            PdfPCell p3 = new PdfPCell(new Phrase("Precio Unitario : ",ngrita));
            PdfPCell p4 = new PdfPCell(new Phrase("Precio Total : ",ngrita));
            //quitar bordes
            p1.setBorder(0);
            p2.setBorder(0);
            p3.setBorder(0);
            p4.setBorder(0);
            // backgroung encabezado
            p1.setBackgroundColor(BaseColor.LIGHT_GRAY);
            p2.setBackgroundColor(BaseColor.LIGHT_GRAY);
            p3.setBackgroundColor(BaseColor.LIGHT_GRAY);
            p4.setBackgroundColor(BaseColor.LIGHT_GRAY);
            //agregar celdas
            tablaProducto.addCell(p1);
            tablaProducto.addCell(p2);
            tablaProducto.addCell(p3);
            tablaProducto.addCell(p4);
            for (int i = 0; i < InterFacturacion.jTable_producos.getRowCount(); i++) {
                String producto = InterFacturacion.jTable_producos.getValueAt(i,1).toString();
                String cantidad = InterFacturacion.jTable_producos.getValueAt(i,2).toString();
                String precio = InterFacturacion.jTable_producos.getValueAt(i,3).toString();
                String total = InterFacturacion.jTable_producos.getValueAt(i,7).toString();
            tablaProducto.addCell(cantidad);
            tablaProducto.addCell(producto);
            tablaProducto.addCell(precio);
            tablaProducto.addCell(total);
            }
            //agregar al pdf
            doc.add(tablaProducto);
            //Total pagar
            Paragraph saldo = new Paragraph();
            saldo.add(Chunk.NEWLINE);
            saldo.add("Total a pagar: "+InterFacturacion.txt_totalApagar.getText());
            saldo.setAlignment(Element.ALIGN_RIGHT);
            doc.add(saldo);
            
            //Firma
            Paragraph footer = new Paragraph();
            footer.add(Chunk.NEWLINE);
            footer.add("Pago y firma\n\n");
            footer.add("________________");
            footer.setAlignment(Element.ALIGN_CENTER);
            doc.add(footer);
            
            //footer 2
             Paragraph footer2 = new Paragraph();
            footer2.add(Chunk.NEWLINE);
            footer2.add("Gracias por preferirnos");
            footer2.setAlignment(Element.ALIGN_CENTER);
            doc.add(footer2);
            
            //cerrar archivo y doc
            doc.close();
            archivo.close();
            
            //open documento al facturar autom
            Desktop.getDesktop().open(file);
            
            
            
        } catch (DocumentException | IOException e) {
            System.out.println("Error en :" + e);
        }
    }
    
}
