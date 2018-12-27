package Days37_ArrayLists;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListManupulations {

	public static void main(String[] args) {
		// create array list furits with 5 different ways
		ArrayList<String> fruits1=new ArrayList<>();
		List<String> fruits2= new ArrayList<>();//be cerafull  you should import utulities
		List<String> fruits3= new ArrayList<>(10);
		ArrayList<String> furits4=new ArrayList<>(fruits1);
		List<String> fruits5= Arrays.asList(new String [] {"peach", "lemon"});
		List<String> fruits6 = new ArrayList<>(fruits5);
        fruits6.add("Cherry");
        
        List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry","Mango"} ));
        fruits7.add("pears");
        //add value to fruit1
        fruits1.add("Tomato");
        fruits1.add("Grapes");
        fruits1.add("BlueBerries");
        fruits1.add("Black Beries");
        fruits1.add("orange");
        fruits1.add(0,"orange");
        fruits1.add(4,"Straberies");
        System.out.println(fruits1);
        fruits2.addAll(fruits1);
        fruits2.add("Dragon Fruit");
        System.out.println(fruits2);
        
        fruits1.remove(0);
        System.out.println(fruits1);
        fruits1.remove("Straberies");//straberies remome yaptik birden sonra ikiye ekledim frutit 1 den romeve yapincas zaten fruit 2 elementi oldugu icin problem yok
        System.out.println(fruits1);
        //remove all elements of fruit 1 from fruit2
        fruits2.removeAll(fruits1);
        System.out.println("fruits2:"+ fruits2 );
        
        fruits1.clear();
        System.out.println(fruits1);
        List<Integer> nums=new ArrayList();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        System.out.println(nums);
        //remove 3
        nums.remove(new Integer(3));
        
        System.out.println(nums);
        
	}

}
