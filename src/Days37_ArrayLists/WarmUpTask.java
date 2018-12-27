package Days37_ArrayLists;

import java.util.ArrayList;

public class WarmUpTask {

	public static void main(String[] args) {
		// create 10 cties Print count of cities in the list
		//print all cities at sam eline by space
		//create another ArrayList longNames and add all cities from cities list with more then 6 character into longNma
		ArrayList<String> city=new ArrayList<>();
		city.add("New York");
		city.add("Chicago");
		city.add("Dallas");
		city.add("Denver");
		city.add("Houston");
		city.add("Las Vegas");
		city.add("Atlanta");
		city.add("Buffalo");
		city.add("Miami");
		city.add("Los Angales");
		System.out.print(city+ " ");
		System.out.println();
		System.out.println(city.size());
		
		for(String mycity:city) {
			System.out.print(mycity+ " | ");
			

		}
		System.out.println("with for i loop");
		for(int i=0;i<city.size();i++) {
			System.out.print(city.get(i)+ "|");
		}
		System.out.println();
		ArrayList<String> longNames=new ArrayList<>();
		for(String mycity:city) {
			if(mycity.length()>6) {
				longNames.add(mycity);
				
			}
		}
		System.out.print(longNames);
		//make longNmaes clear add new thing
		longNames.clear();
		
		for(int idx=0;idx<city.size();idx++) {
			String names=city.get(idx);
			if(names.length()>6) {
				longNames.add(names);
				System.out.println(longNames);
				
//				if(city.get(idx).length()>6) {
//					longNames.add(city.get(idx));
//				}
			}
		}
		
//		for(String mycity:city) {
//			if(mycity.length()>6) {
//			System.out.print(mycity + " ");
//			System.out.println();
//		ArrayList<String> longNmaes=new ArrayList<>();	
//		longNmaes.	add("New York");
//		longNmaes.	add("Chicago");
//		longNmaes.	add("Houston");
//		longNmaes.	add("Las vegas");
//		
//		System.out.println(longNmaes);
//			}
//		}
		//===================================
	}

}
