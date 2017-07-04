import java.util.Scanner;

public class Traffic_Lights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Enter a Selection");
		System.out.println("Start - S");
		System.out.println("Quit - Q");
		boolean x = false;

		while (x == false) {
			String menu = keyboard.next();
			switch (menu.toLowerCase()) {
				case "s": 
					//selection = "S";
					System.out.println("q");
					Traffic_Lights.startLights();
					break;
				case "q":
					System.exit(1);
					break;
				default:
					System.out.println("Please Enter a Valid Selection");
					System.out.println("Start - S");
					System.out.println("Quit - Q");
					break;
					
			}
		}	
	}
	public static void startLights() {
		try {
			System.out.println("Red - Off");
			System.out.println("Orange - Off");
			System.out.println("Green - On");
			Thread.sleep(5000);
			System.out.println("Red - Off");
			System.out.println("Orange - On");
			System.out.println("Green - Off");
			Thread.sleep(1500);
			System.out.println("Red - On");
			System.out.println("Orange - Off");
			System.out.println("Green - Off");
			Thread.sleep(4000);
			System.out.println("Red - Off");
			System.out.println("Orange - Off");
			System.out.println("Green - On");
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
