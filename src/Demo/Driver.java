package Demo;

import Package1.Airplane;
import Package2.Helicopter;
import Package2.Quadcopter;
import Package4.UAV;
import Package5.AgriculturalDrone;
import Package5.Mav;

public class Driver extends Airplane {

//	public static void findLeastAndMostExpensiveUAV(Airplane[] flyingObjects) {
//		
//		double lowestPrice = flyingObjects[0].getPrice(); 
//		double highestPrice = flyingObjects[0].getPrice();
//		
//		for (int i = 1; i < flyingObjects.length; i++) {
//			if (flyingObjects[i].getPrice() < lowestPrice) {
//				lowestPrice = flyingObjects[i].getPrice(); 
//			}
//		}
//		System.out.printf("The least expensive UAV is $%.2f", lowestPrice);
//
//		for (int i = 1; i < flyingObjects.length; i++) {
//			if (flyingObjects[i].getPrice() > highestPrice) {
//				highestPrice = flyingObjects[i].getPrice(); 
//			}
//		}
//		System.out.printf("\nThe most expensive UAV is $%.2f", highestPrice);
//		
//	}

	public static void findLeastAndMostExpensiveUAV(Airplane[] flyingObjects) {
		
		UAV leastExpensive = null;
		UAV mostExpensive = null;

		for (int i = 0; i < flyingObjects.length; i++) {
			if (flyingObjects[i] instanceof UAV) {
				UAV uav = (UAV) flyingObjects[i];

				if (leastExpensive == null || uav.getPrice() < leastExpensive.getPrice()) {
					leastExpensive = uav;
				}

				if (mostExpensive == null || uav.getPrice() > mostExpensive.getPrice()) {
					mostExpensive = uav;
				}
			}
		}

		if (leastExpensive != null && mostExpensive != null) {
			System.out.println("The least expensive UAV is:\n" + leastExpensive.toString());
			System.out.println("The most Eexpensive UAV is:\n" + mostExpensive.toString());
		} else if (leastExpensive != null) {
			System.out.println("Only one UAV found, the price is :\n" + leastExpensive.toString());
		} else {
			System.out.println("No UAV objects found in the array.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airplane[] flyingObjects = { new Helicopter(), new UAV(150.00, 180000.00), new UAV(200.00, 250000.00),
				new Airplane(), new UAV(300.00, 150000.00) };

		findLeastAndMostExpensiveUAV(flyingObjects);

	}

}
