package Days53_Polimorfizm;

public class AnimalConcert {

	public static void main(String[] args) {
		
Animal a1=new Cat();
a1.makeNoise();
//Dog d =new Dog();
Pet p1=new Dog();

Animal a2=new Dog();
a2.makeNoise();
Animal a3=new Horse();
a3.makeNoise();
Animal [] animals = {a1,a2,a3};

for(Animal each : animals) {
	each.makeNoise();


}
	}

}
