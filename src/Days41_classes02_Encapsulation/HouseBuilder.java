package Days41_classes02_Encapsulation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class HouseBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House house1 = new House();
		house1.bedrooms = 3;
		house1.type = "Townhouse";
		house1.address = "123 Main st, Sterling VA 22222";
		house1.year = 2010;
		
		House house2 = new House();
		house2.bedrooms = 3;
		house2.type = "Single House";
		house2.address = "3456 Lee highway , Fairfax, 22031";
		house2.year = 2014;
		
		House house3 = new House();
		house3.bedrooms = 2;
		house3.type = "Condominuim";
		house3.address = "2234 K st NW Apt 543, Washington DC 20001";
		house3.year = 2014;
		
		House whiteHouse = new House();
		whiteHouse.bedrooms = 132;
		whiteHouse.type = "Mansion";
		whiteHouse.address = "1600 Pennsyllvania ave NW, Washington DC 20001";
		whiteHouse.year = 1800;
		
		System.out.println("House1 type:" + house1.type);
		System.out.println("House2 type:" + house2.type);
		System.out.println("House2 type:" + house3.type);
		System.out.println("whiteHouse type:" + whiteHouse.type);
		
		int[] nums = new int[4];
		nums[0] = 234;
		
		String[] names = new String[4];
		names[0] = "Bill";
		
		House EsqersHouse = new House();
		EsqersHouse.type = "Townhouse";
		EsqersHouse.address = "4321 Jones St, Tysons VA 22102";
		EsqersHouse.bedrooms = 3;
		EsqersHouse.year = 1980;
		
		House[] houses = new House[5];
		houses[0] = house1;
		houses[1] = house2;
		houses[2] = house3;
		houses[3] = whiteHouse;
		houses[4] = EsqersHouse;
		
		System.out.println(houses[0].address);
		
		for(House h : houses) {
			System.out.println(h.type + "=>" + h.address);
		}
		
		for(int i=0; i<houses.length; i++) {
			System.out.println(houses[i].type +" | " +houses[i].address);
		}
		
		System.out.println("====ARRAYLIST OF HOUSE OBJECTS======");	
		
		ArrayList<Integer> numsList = new ArrayList<>();// kullanmadik
		
		ArrayList<House> housesList = new ArrayList<>();
		housesList.add(house1);
		housesList.add(house2);
		housesList.add(house3);
		housesList.add(whiteHouse);
		housesList.add(EsqersHouse);
		
		ArrayList<House> houseList2 = new ArrayList<>(Arrays.asList(houses));// housen icinfekileri
	//	List<House> houseList3 = Arrays.asList(houses);//fix size arraylist. u cannot add another house
		
		
		//print {year and Address} of each house object in arraylist if year is between 2006 and 2016
		
		for(House house : housesList) {
			int y = house.year;
			if(y >= 2006 && y <= 2016) {
				System.out.println(y +" | " + house.address);
			}
		}
		
		for(int j = 0; j < housesList.size(); j++) {
			House tempHouse = housesList.get(j);
			//String tAddress = tempHouse.address;
			if(tempHouse.year >= 2006 && tempHouse.year <= 2016) {
				System.out.println(tempHouse.year +" | "+tempHouse.address);
			}
		}
		
	}

}
