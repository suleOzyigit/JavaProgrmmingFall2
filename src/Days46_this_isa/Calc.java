package Days46_this_isa;

public class Calc {
private int result;
public Calc plus(int num) {
	result+=num;
	return this;
}
public Calc minus(int num) {
	result-=num;
	return this;
}
public int getResult() {
	return result;
}
}
