package org.montanajr.lab11.adapter;

public class TextDocument implements Document 
{

	public void saveToTxt(String data)
	{
		PDFDocument adapter = new PDFDocument();
		adapter.saveToPDF(data, "plik.pdf");
	}
}
