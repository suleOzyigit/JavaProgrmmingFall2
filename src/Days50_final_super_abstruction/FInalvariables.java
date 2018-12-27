package Days50_final_super_abstruction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FInalvariables {
	private final String SCHOOL_NAME;// it is not static that is color yellow you can not print at the main method
	// and we use constructer
public static final int MAX_NUMBER_OF_STUDENTS;
public static final String FEBRURARY="feburary";
public  static final String ETSY="https://etsy.com";
static {
	MAX_NUMBER_OF_STUDENTS=55;
	}
public FInalvariables() {
	SCHOOL_NAME="cyberttek";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Max=100;
Max=110;
final int K=Max;
System.out.println(K);

final int[] NUMS= {255,200,300};
NUMS[0]=500;
System.out.println(Arrays.toString(NUMS));
final int[] WHITE = new int [3];
WHITE[0]=255;
WHITE[1]=255;
WHITE[2]=255;

WHITE[0]=256;

//WHITE= new int [2]; we can change value but we can not ressing new object
final List<String> PRODUCTS = new ArrayList<>();
PRODUCTS.add("water");
PRODUCTS.add("cookies");
PRODUCTS.add("coffee");

System.out.println(PRODUCTS);
PRODUCTS.remove("cookies");
System.out.println(PRODUCTS);

//PRODUCTS = new ArrayList<>();//will not work























	}

}
