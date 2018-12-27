package Days41_classes02_Encapsulation;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book book1=new Book();
book1.setTitle("Grit");
//System.out.println(book1.getTitle());
book1.setAuthor("Angela ");
book1.setPages(400);

Book javaBook=new Book();


javaBook.setTitle("Headfirst Java");
javaBook.setAuthor("Kathy Sierra, Bert Bates");
javaBook.setPages(543);

System.out.println("Title1: " + book1.getTitle());
System.out.println("Title2: " + javaBook.getTitle());

System.out.println("Author1: " + book1.getAuthor());
System.out.println("Author2: " + javaBook.getAuthor());

	}
	

}
