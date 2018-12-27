package Days53_Polimorfizm;

import java.util.ArrayList;
import java.util.List;

public class SeleniumAction {

	public static void main(String[] args) {
		
		//ChromeDriver w1 = new ChromeDriver();
		// Whether objectType IS-A ReferenceType 
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.navigate("cybertekschool.com");
		driver.close();
		driver.quit();

		 driver = new FireFoxDriver();
		driver.open();
		driver.navigate("cybertekschool.com");
		driver.close();
		driver.quit();
		
		
		System.out.println("=================");
		//WebDriver driver1 = new ChromeDriver();
		// WebDriver driver2 = new FireFoxDriver();
		//WebDriver driver2 = new ChromeDriver();
		
		//WebDriver[] drivers= { driver1,driver2,driver3};
		
		
		WebDriver[] drivers={new ChromeDriver(), new FireFoxDriver(),  new ChromeDriver()};
		for(WebDriver Ddriver : drivers) {
			//Ddriver.open();
			Ddriver.open();
			Ddriver.navigate("cybertekschool.com");
			Ddriver.close();
			Ddriver.quit();
			
		}
		
		
		
		
		
//		List<WebDriver> myDrive= new ArrayList<>();
//		myDrive .add(new ChromeDriver());
//		myDrive .add(new FireFoxDriver());
//	
//		for (WebDriver w : myDrive) {
//			w.navigate("Cybertek.com");			
//			w.open();
//			w.close();
//			w.quit();
//			System.out.println();
//		}
		




				
				
				
	}

}
