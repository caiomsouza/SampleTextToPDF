package org.sample.texttopdf;

import java.io.*;
import java.awt.*;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.io.*;
import java.util.zip.*;

public class TextToPDF{
	public static void main(String arg[]){
		try{
			InputStreamReader in= new InputStreamReader(System.in);
			BufferedReader bin= new BufferedReader(in);
			System.out.println("Enter text:");
		    String text=bin.readLine();
		    Document document = new Document(PageSize.A4, 36, 72, 108, 180);
		    PdfWriter.getInstance(document,System.out);
		    PdfWriter.getInstance(document,new FileOutputStream("demo/pdfFile.pdf"));
		    document.open();
		    document.add(new Paragraph(text));
		    System.out.println("Text is inserted into pdf file");
		    document.close();
		}catch(Exception e){}
	}
}