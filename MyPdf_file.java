/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypdf_file;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;


/**
 *
 * @author Gunza
 */
public class MyPdf_file {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, DocumentException {
        Document document=new Document();
        PdfWriter.getInstance(document,new FileOutputStream("YUVIN.pdf"));
        document.open();
        document.add(new Paragraph(" PLEASE CONFIRM YOU ARE E-MAIL."));
        document.close();
        // TODO code application logic here
    }
    
}
