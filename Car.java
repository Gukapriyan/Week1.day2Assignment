package week1.day2assignment;

public class Car {
	
	public void applyBreak() {
		
		int noOfBreak = 2;
		boolean breakApplay = true;
		System.out.println("breakApplay:"+breakApplay);
		System.out.println("noOfBreak:"+noOfBreak);	
	
	}
	
	public void applyGear() {
		
		int gear = 5;
		System.out.println("Total Number of Gear:"+gear);	
	
	}
	
	public void swithonAc() {
		
		String turnOnAc = "Already on";
		
		System.out.println("hey Turn on the AC:"+turnOnAc);
		
	}
	
	 public void applyAccelerate(){
		 
		 int increasedSpeed = 40;
		 
		 System.out.println("Current Speed:"+increasedSpeed);
		
	}
	

	public static void main(String[] args) {
		
		Car object = new Car();
		object.applyBreak();
		
		
		
	}

}