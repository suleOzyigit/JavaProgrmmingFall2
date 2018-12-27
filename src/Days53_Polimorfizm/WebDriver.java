package Days53_Polimorfizm;
/*Task 2  
Create an interface called WebDriver

	methods : 
		void navigate take one String as URL 
		void open(); 
		void close(); 
		defoult void quit();

Create 2 implementing class called ChromeDriver, FirefoxDriver
		
	in ChromeDriver class
		add methods called 
			setChromeOptions(String[] str)
	in FirefoxDriver class 
		add methods called 
			setFirefoxOptions(List<String> str)
 * create a clas  with a main method and create 2 object of each class with super Type references and call the method
 * 
 * 
 * 
 * 
 */

public interface WebDriver {
	
	/*canstant ---->public static final
	 * No constracter
	 * Defauld
	 * absract method
	 * Static method
	 * 
	 * 
	 */
	
	
	//int browserCount=10; // it is otanaticly makes public static final
	// protected  browserCount=10 ---->everthing shoul be public 
	
	void navigate(String url);
	void open(); 
	void close(); 
	public default void quit() {
		System.out.println("default quit method, sub class may override it or use it as is");
	}
}
