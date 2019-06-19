package org.montanajr.lab10.zad02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {

	
	public static void main(String[] args) throws IOException {
		String s = "LOREMIMSUM";
		
		

		Context ctx1 = new Context(new Asc());
		System.out.println(ctx1.runStrategy(s));
		
		Context ctx2 = new Context(new Desc());
		System.out.println(ctx2.runStrategy(readFile()));
	}
	
	private static String readFile() throws IOException{
		String contents = new String(Files.readAllBytes(Paths.get("c:\\temp\\myfile.txt")));
		return contents;


	}
	
}
