import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

// right click on the project -> new -> folder -> lib
// copy itextpdf-5.5.0.jar to lib
// right click on the project -> refresh
// right click on itextpdf-5.5.0.jar -> Build Path

public class _9_GeneratePDF {
	
	public static void main(String[] args) {
		
		/**
		 * Write a program to generate a PDF document called Deck-of-Cards.pdf and print 
		 * in it a standard deck of 52 cards, following one after another. 
		 * Each card should be a rectangle holding its face and suit. 
		 */
		
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("MyFirstFile.pdf"));			
			document.open();
			// creating new empty pdf file
			
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100);
		        table.getDefaultCell().setFixedHeight(180);
		    // creating new table in pdf
		    // PdfPTable() shows columns quantity
			
			BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
			Font black = new Font(baseFont, 75f, 0, BaseColor.BLACK);
			Font red = new Font(baseFont, 75f, 0, BaseColor.RED);
			// copy times.ttf from c:/Windows/Fonts to the project folder
			
			String card = "";
			char color = ' ';
			
			// printing unicode chars
			//Window -> Preferences -> General -> Workspace -> Text File Encoding -> Other -> UTF-8
			for (int i = 2; i <= 14; i++) {
				switch (i) {
				case 10: card = "10"; break;
				case 11: card = " J"; break;
				case 12: card = " Q"; break;
				case 13: card = " K"; break;
				case 14: card = " A"; break;
				default: card = " " + i; break;
				}
				for (int j = 1; j <= 4; j++) {
					switch (j) {
					case 1: color = '♣'; table.addCell(new Paragraph(card + color + " ", black)); break;
					case 2: color = '♦'; table.addCell(new Paragraph(card + color + " ", red)); break;
					case 3: color = '♠'; table.addCell(new Paragraph(card + color + " ", black)); break;
					case 4: color = '♥'; table.addCell(new Paragraph(card + color + " ", red)); break;
					}
				}
			}
			document.add(table);
			document.close();	 //close pdf document		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}