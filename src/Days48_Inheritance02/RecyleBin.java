package Days48_Inheritance02;

public class RecyleBin extends Bin {

//	public RecyleBin() {
//		setType("recycle Bin");
//	}
	
	public RecyleBin() {
		super("recycle Bin");
	}
	public RecyleBin(String typeOfRecycleBin) {
		super(typeOfRecycleBin);
	}
}
