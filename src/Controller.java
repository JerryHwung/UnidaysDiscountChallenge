import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		
		
		//Console controller
		Scanner input = new Scanner(System.in);//order scanner
		Scanner sc = new Scanner(System.in);//command scanner
		int option = 0;
		while (option==0) {
			//refresh a new basket in every loop 
			UnidaysDiscountChallenge basket = new UnidaysDiscountChallenge();
			System.out.println("Please place your order.");
			String orderList = input.nextLine();
			//convert string into upper case
			String order = orderList.toUpperCase();
			//split string into single letters
			String[] alphabets = order.split("");
			for(String alphabet : alphabets ) {
				basket.AddToBasket(alphabet);
			}
			//calculate total price
			double result = basket.CalculateTotalPrice();
			//apply delivery charge if total > 50
			double deliveryCharge = 7;
			if(result < 50) {
				result = result + deliveryCharge;
				System.out.println("Delivery charge (£7.00) has applied.");
			} else { System.out.println("Free delivery, Yay!");}

			System.out.println("Total amount is "+result);
			System.out.println("--------------------------------------------");
			System.out.println("Press 1 to exit, 0 to start a new order");
			option = sc.nextInt();
		}
		System.out.println("Thank you for using!");

	}

}
