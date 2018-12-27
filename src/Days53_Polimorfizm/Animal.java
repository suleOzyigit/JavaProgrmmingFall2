package Days53_Polimorfizm;
interface Pet{}

public class Animal implements Pet {
	public void makeNoise() {
		System.out.println("Let sub class object make noise");
	}
}

