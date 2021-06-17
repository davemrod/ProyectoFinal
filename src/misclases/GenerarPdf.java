
package misclases;

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
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GenerarPdf extends JFrame {
    public static void main(String[] args) throws FileNotFoundException,DocumentException {
        
//        String nomhuesped,ciudad;
//        
//        
//        nomhuesped="Maria Alejandra";
//        ciudad="Aguascalientes";
        
        crearPDF(); 
    }
    
    private static void crearPDF() throws FileNotFoundException,DocumentException {
       Document doc=new Document();
       FileOutputStream ficheroPDF=new FileOutputStream("ReciboAtlantis.pdf");
       PdfWriter.getInstance(doc,ficheroPDF);
       doc.open();
       
       Paragraph nombrehotel=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.NORMAL,BaseColor.BLACK));
       nombrehotel.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph lema=new Paragraph("Un hotel confortable, la experiencia que necesitas",FontFactory.getFont("Lucida Fax",15,Font.BOLD,BaseColor.BLACK));
       lema.setAlignment(Element.ALIGN_CENTER);
       
       Paragraph ubicacion=new Paragraph("Ubicación: Calle Van Dulken,15,29649 Calahonda,Málaga,España.",FontFactory.getFont("Lucida Fax",13,Font.BOLD,BaseColor.BLACK));
       ubicacion.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph fecha=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       fecha.setAlignment(Element.ALIGN_CENTER);
//       
////       Paragraph nomhuesped=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
////       nomhuesped.setAlignment(Element.ALIGN_CENTER);
//       
////       Paragraph ciudad=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
////       ciudad.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph fechaingreso=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       fechaingreso.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph fechasalida=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       fechasalida.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph tipohab=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       tipohab.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph costohab=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       costohab.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph diasinstancia=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       diasinstancia.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph totalsincargos=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       totalsincargos.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph totalconcargos=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       totalconcargos.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph cargosextra=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       cargosextra.setAlignment(Element.ALIGN_CENTER);
//       
//       Paragraph mensaje=new Paragraph("HOTEL ATLANTIS RESORT",FontFactory.getFont("Lucida Fax",22,Font.BOLD,BaseColor.BLACK));
//       mensaje.setAlignment(Element.ALIGN_CENTER);
//       
       
       try{
           Image logotipo=Image.getInstance("/imagenes/logoatlantis.jpg");
           logotipo.scaleToFit(200, 200);
           logotipo.setAlignment(Chunk.ALIGN_MIDDLE);
           doc.add(logotipo);   
       }catch(Exception e){
           e.printStackTrace();
       }
       
//       try{
//           Image firma=Image.getInstance("/imagenes/firma.jpg");
//           firma.scaleToFit(200, 200);
//           firma.setAlignment(Chunk.ALIGN_MIDDLE);
//           doc.add(firma);   
//       }catch(Exception e){
//           e.printStackTrace();
//       }
       
       doc.add( Chunk.NEWLINE );
       
       doc.add(nombrehotel);
       doc.add( Chunk.NEWLINE );
       doc.add(lema);
       doc.add( Chunk.NEWLINE );
       doc.add(ubicacion);
       doc.add( Chunk.NEWLINE );
//       doc.add(fecha);
//       doc.add(fechaingreso);
//       doc.add(fechasalida);
//       doc.add(tipohab);
//       doc.add(costohab);
//       doc.add(diasinstancia);
//       doc.add(totalsincargos);
//       doc.add(totalconcargos);
//       doc.add(cargosextra);
//       doc.add(mensaje);
       
       
       doc.close();
        JOptionPane.showMessageDialog(null, "Documento PDF creado exitosamente...Vuelva pronto!");
    }
}
