package A2;

import java.io.File;

import org.apache.pdfbox.pdmodel.PDDocument;

public class Main {

	public static String lines[];
	
	public static void main(String[] args) {
		
		try {
			PDDocument document = PDDocument.load(new File("C:\\Users\\HP\\Desktop\\A182 Draft Stud.pdf"));
			{
	 
				document.getClass();

				if (!document.isEncrypted()) {
			
					org.apache.pdfbox.text.PDFTextStripper stripper = new org.apache.pdfbox.text.PDFTextStripper();
					stripper.setSortByPosition(true);

					org.apache.pdfbox.text.PDFTextStripper tStripper = new org.apache.pdfbox.text.PDFTextStripper();

					String pdfFileInText = tStripper.getText(document);
					System.out.print("Text:" + pdfFileInText);

					lines = pdfFileInText.split("\\r?\\n");
						
				}
				Thread t1 = new Thread(new T1(lines),"Thread-1 :");
				t1.start();
				try {
					t1.join();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				Thread t2 = new Thread(new T2(lines),"Thread-2 :");
				t2.start();
				try {
					t2.join();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				Thread t4 = new Thread(new T4(lines),"Thread-4 :");
				t4.start();
				try {
					t4.join();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				Thread t3 = new Thread(new T3(lines),"Thread-3 :");
				t3.start();
				try {
					t3.join();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				Thread t5 = new Thread(new T5(lines),"Thread-5 :");
				t5.start();
				try {
					t5.join();
				}catch(Exception ex) {
					ex.printStackTrace();
				}

			}

   
		}catch (Exception e)
        {
	      	   e.printStackTrace();
	    }
	}
}
	
	
	



