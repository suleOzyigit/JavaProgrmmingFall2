package Days53_Polimorfizm;

import java.util.List;

public class FireFoxDriver implements WebDriver {

	public void setChromeOptions(List<String> options) {
		for (String option : options) {
			System.out.println("Setting Firefox options " + option);
		}
	}

	@Override
	public void navigate(String URL) {
		// TODO Auto-generated method stub
		System.out.println("Navigating to " + URL + " on Firefox");

	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("openning Firefox browser");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("closing Firefox browser");
	}

	//@Override
//	public void quit() {
//		// TODO Auto-generated method stub
//
//	}

}
