
public class UnidaysDiscountChallenge {
	//add counter to count quantity of items
	int counterA = 0;
	int counterB = 0;
	int counterC = 0;
	int counterD = 0;
	int counterE = 0;
	//price list
	Item A = new Item(8);
	Item B = new Item(12);
	Item C = new Item(4);
	Item D = new Item(7);
	Item E = new Item(5);
	
	public void AddToBasket(String chosen) {
		switch (chosen) {
		case "A": counterA++;
		System.out.println(chosen + " added to basket!");
		break;
		case "B": counterB++;
		System.out.println(chosen + " added to basket!");
		break;
		case "C": counterC++;
		System.out.println(chosen + " added to basket!");
		break;
		case "D": counterD++;
		System.out.println(chosen + " added to basket!");
		break;
		case "E": counterE++;
		System.out.println(chosen + " added to basket!");
		break;
		default: System.out.println(chosen+" not in the item list!");
		break;
		}
	}

	public double CalculateTotalPrice() {

		double totalA = 0;
		double totalB = 0;
		double totalC = 0;
		double totalD = 0;
		double totalE = 0;

		//discounts
		double discountA = 0;
		double discountB = 4*(counterB/2);
		double discountC = 2*(counterC/3);
		double discountD = D.getPrice()*(counterD/2);
		double discountE = E.getPrice()*(counterE/3);
			
		//calculate total after applying discounts
		totalA = A.getPrice()*counterA-discountA;
		totalB = B.getPrice()*counterB-discountB;
		totalC = C.getPrice()*counterC-discountC;
		totalD = D.getPrice()*counterD-discountD;
		totalE = E.getPrice()*counterE-discountE;

		//total
		double Total = totalA + totalB + totalC + totalD + totalE;
		
		return Total;
	}
}
