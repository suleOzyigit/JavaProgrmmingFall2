package Days53_Polimorfizm;

public class ChromeDriver implements WebDriver {
	
	public void setChromeOptions(String[] options) {
		for (String option : options) {
			System.out.println("Setting Chrome options " + option);
		}
	}

	@Override
	public void navigate(String URL) {
		// TODO Auto-generated method stub
		System.out.println("Navigating to " + URL + " on Chrome");

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("openning Chrome browser");

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("closing Chrome browser");
	}

	@Override
	public void quit() {
		// TODO Auto-generated method
		System.out.println("Chrome quit special");

	}

}
