package Days51_abstruction_and_classes;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//File file1= new File(); we can not create object from abstruc class
	XLSFile xl =new XLSFile();
	xl.open();
	xl.close();
	xl.setName("Test data. xls");
	System.out.println("XLS file name: " + xl.getName());
	JPGFile jpg= new JPGFile();
	jpg.setName("even01.jpg");
	jpg.open();
	jpg.close();
	System.out.println("JPG file name: " + jpg.getName());
	System.out.println(XLSFile.count);
	System.out.println(JPGFile.count);
	
	PDFFile pdf=new PDFFile("AgileBook.pdf");
	pdf.open();
	pdf.close();
	System.out.println(File.count);
	
	
	}

}
