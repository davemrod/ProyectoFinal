
package misclases;

import controlMySql.MySqlConn;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfEncodings;
import static com.itextpdf.text.pdf.PdfName.DEST;
import java.io.File;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.text.Text;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class GenerarPdf extends JFrame {
    
    private MySqlConn conn;
    int habitacion;
    String aux;
    
    public GenerarPdf(int habitacion) {
        this.conn = new MySqlConn();
        this.habitacion = habitacion;
    }
    
    public void main(String[] args) throws FileNotFoundException,DocumentException {   
        crearPDF(); 
    }
    
    private void crearPDF() throws FileNotFoundException,DocumentException {
           
       String query = "select * from huespedes where numhabitacion = "+"'"+habitacion + "'";
        this.conn.Consult(query);
        int n = 0;
        try {
            this.conn.rs.last(); //se posiciona en el ultimo registro de la tabla
            n = this.conn.rs.getRow(); //regresa el numero actual del registro
            this.conn.rs.first();
        }
        catch (Exception e) {
            System.out.println("Error#1 ...");
        }
        if (n !=0 ) {
            System.out.println("n "+n);
            Object datos[][] = new Object[n][9];
            for(int i=0; i<n; i++) { //n total de registros
                try {
                    datos[i][0] = this.conn.rs.getString(1);
                    datos[i][1] = this.conn.rs.getString(2);
                    datos[i][2] = this.conn.rs.getString(3);
                    datos[i][3] = this.conn.rs.getString(4);
                    datos[i][4] = this.conn.rs.getInt(5);
                    datos[i][5] = this.conn.rs.getInt(6);
                    datos[i][6] = this.conn.rs.getString(7);
                    datos[i][7] = this.conn.rs.getInt(8);
                    datos[i][8] = this.conn.rs.getInt(9);
                    //datos[i][9] = this.conn.rs.getInt(10);
                    //String medico = this.conn.rs.getString(4); //no se usa
                    
                    this.conn.rs.next(); // avanzamos un registro
                }
                catch (Exception e) {
                    System.out.println("Error#2 ..."+e.getMessage());
                }
                String aux =(String) datos[i][0];
                //this.jLabelMostrarDiaSalida.setText(aux);
            }//fin for
            //String columnas[] = {"Huesped", "Ciudad", "Fecha ingreso", "Fecha salida", "Habitación", "Piso", "Tipo habitación", "Ocupantes", "Total al ingresar"};
            //jTableListaHuespedes.setModel(new DefaultTableModel(datos, columnas));
            
            //String totalsincargos = String.valueOf(datos[0][8]);
            //int totalSC = Integer.parseInt (totalsincargos);
            //int totalFINAL = cuentaTotal + totalSC;
            //String totalMostrar = String.valueOf(totalFINAL); 
            //this.jLabelMostrarTotalPago.setText(totalMostrar);
                    
        } // fin if
        else {
            JOptionPane.showMessageDialog(this, "No hay datos ...");
        }
     
        
        
       Document doc=new Document();
       FileOutputStream ficheroPDF=new FileOutputStream("ReciboAtlantis.pdf");
       PdfWriter.getInstance(doc,ficheroPDF);
       doc.open();

       Paragraph nombrehotel=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont(BaseFont.TIMES_ROMAN,20,Font.BOLD,BaseColor.BLACK));
       nombrehotel.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph lema=new Paragraph("- Un hotel confortable, la experiencia que necesitas -",FontFactory.getFont(BaseFont.TIMES_ROMAN,12,Font.BOLDITALIC,BaseColor.BLACK));
       lema.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph ubicacion=new Paragraph("Ubicación: Calle Van Dulken, 15, 29649 Calahonda, Málaga, España.",FontFactory.getFont(BaseFont.TIMES_ROMAN,11,Font.BOLDITALIC,BaseColor.BLACK));
       ubicacion.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph linea1=new Paragraph("_______________________________________________________________________________________",FontFactory.getFont(BaseFont.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK));
       linea1.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph fecha=new Paragraph("Fecha del dia: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       fecha.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph nomhuesped=new Paragraph("> Nombre del huesped: "+this.aux,FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       nomhuesped.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph ciudad=new Paragraph("> Ciudad: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       ciudad.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph fechaingreso=new Paragraph("> Fecha de ingreso: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       fechaingreso.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph fechasalida=new Paragraph("> Fecha de salida: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       fechasalida.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph tipohab=new Paragraph("> Tipo de habitacion: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       tipohab.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph costohab=new Paragraph("> Costo de habitacion: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       costohab.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph diasinstancia=new Paragraph("> Dias de instancia: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       diasinstancia.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph totalsincargos=new Paragraph("> Total sin cargos: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       totalsincargos.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph totalconcargos=new Paragraph("> Total con cargos",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       totalconcargos.setAlignment(Element.ALIGN_LEFT);
       
       //////////////////////////////////////////
       Paragraph cargosextra=new Paragraph("> Cargos extra: ",FontFactory.getFont(BaseFont.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK));
       cargosextra.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph bar=new Paragraph("Bar:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       bar.setAlignment(Element.LIST);
       
       Paragraph spa=new Paragraph("Spa:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       spa.setAlignment(Element.LIST);
       
       Paragraph serhab=new Paragraph("Servicio Habitacion:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       serhab.setAlignment(Element.LIST);
       
       Paragraph resta=new Paragraph("Restaurante:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       resta.setAlignment(Element.LIST);
       
       Paragraph gym=new Paragraph("Gimnasio:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       gym.setAlignment(Element.LIST);
       
       Paragraph atrac=new Paragraph("Atracciones de playa:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       atrac.setAlignment(Element.LIST);
       
       Paragraph entre=new Paragraph("Entretenimiento:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       entre.setAlignment(Element.LIST);
       
       Paragraph buseo=new Paragraph("Buseo:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       buseo.setAlignment(Element.LIST);
       
       Paragraph sauna=new Paragraph("Sauna:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       sauna.setAlignment(Element.LIST);
       
       Paragraph niños=new Paragraph("Area de niños:____",FontFactory.getFont(BaseFont.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK));
       niños.setAlignment(Element.LIST);
       
       //////////////////////////////////////////////
       
       Paragraph linea2=new Paragraph("_______________________________________________________________________________________",FontFactory.getFont(BaseFont.TIMES_ROMAN,12,Font.BOLD,BaseColor.BLACK));
       linea2.setAlignment(Element.ALIGN_LEFT);
       
       Paragraph mensaje=new Paragraph("¡Gracias por su estadia en Atlantis Resort, vuelva pronto!",FontFactory.getFont(BaseFont.TIMES_ROMAN,11,Font.BOLDITALIC,BaseColor.BLACK));
       mensaje.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph gerente=new Paragraph("Dimitri Alexei Vasiliev Zakharov",FontFactory.getFont(BaseFont.TIMES_ROMAN,7,Font.BOLDITALIC,BaseColor.BLACK));
       gerente.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph msj=new Paragraph("Salida completada.",FontFactory.getFont(BaseFont.TIMES_ROMAN,11,Font.BOLDITALIC,BaseColor.BLACK));
       msj.setAlignment(Element.ALIGN_CENTER);
       
       //doc.add( Chunk.NEWLINE );
       
       try{
           Image logotipo=Image.getInstance("logoatlantis.jpg");
           //logotipo.scaleToFit(550, 850);
           logotipo.scaleToFit(150, 150);
           logotipo.setAlignment(Chunk.ALIGN_MIDDLE);
           
           doc.add(logotipo);  
           doc.add( Chunk.NEWLINE );
       }catch(Exception e){
           e.printStackTrace();
       }
       
       
       doc.add( Chunk.NEWLINE );
       doc.add( Chunk.NEWLINE );
       doc.add(nombrehotel);
       //doc.add( Chunk.NEWLINE );
       doc.add(lema);
       //doc.add( Chunk.NEWLINE );
       doc.add(ubicacion);
       //doc.add( Chunk.NEWLINE );
       doc.add(linea1);
       doc.add( Chunk.NEWLINE );
       doc.add(fecha);
       doc.add( Chunk.NEWLINE );
       doc.add(fechaingreso);
       doc.add(fechasalida);
       doc.add(tipohab);
       doc.add(costohab);
       doc.add(diasinstancia);
       doc.add(totalsincargos);
       doc.add(totalconcargos);
       doc.add(cargosextra);
       
       doc.add( Chunk.NEWLINE );
       
       doc.add(bar);
       doc.add(spa);
       doc.add(serhab);
       doc.add(resta);
       doc.add(gym);
       doc.add(atrac);
       doc.add(entre);
       doc.add(buseo);
       doc.add(sauna);
       doc.add(niños);
       doc.add(linea2);
       //doc.add( Chunk.NEWLINE );
       
       try{
           Image firma=Image.getInstance("firmagerente.jpg");
           firma.scaleToFit(150, 150);
           firma.setAlignment(Chunk.ALIGN_MIDDLE);
           
           doc.add( Chunk.NEWLINE );
           doc.add(firma);   
       }catch(Exception e){
           e.printStackTrace();
       }
       
        doc.add( Chunk.NEWLINE );
       doc.add(gerente);
        doc.add( Chunk.NEWLINE );
       doc.add( Chunk.NEWLINE );
       doc.add(mensaje);
       doc.add( Chunk.NEWLINE );
       doc.add(msj);
       
       doc.close();
        JOptionPane.showMessageDialog(null, "Documento PDF creado exitosamente");
    }
}

