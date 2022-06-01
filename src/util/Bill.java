package util;

public class Bill {
	
	
	
	public static double cover(double totalCover) {
		if (totalCover > 30.00) {
			return 0.00;
		}else {
			return totalCover = 4.00;
		}
		
	}
	
	public static double feeding(int qtsBeer, int qtsBarbecue, int qtsSoftDrink) {
		double beer = 5.00, barbecue = 7.00, softDrink = 3.00;
		double totalConsumption;
		
		double totalBeer = beer * qtsBeer;
		double totalBarbecue = barbecue * qtsBarbecue;
		double totalSoftDrink = softDrink * qtsSoftDrink;
		
		totalConsumption = totalBeer + totalBarbecue + totalSoftDrink;
		
		return totalConsumption;
	}
	
	public static double ticket(char genre) {
		if (genre == 'F') {
			return 8.00;
		} else {
			return 10.0;
		}
	}
	
	public static double total( double consumptionTotal, double valueCover, double valueTitcket) {
		return consumptionTotal + valueCover + valueTitcket;
	}

}
