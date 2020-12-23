import java.util.Scanner;
import java.text.DecimalFormat;

class details{
	static Scanner scan = new Scanner(System.in);
	String UserName, PickUpPoint, Destination;
	int t;
	float d;
	char i;
    public details() {
		System.out.println("Enter your name:");
		UserName = scan.next();
		System.out.println("Hello "+ UserName+"!");
		System.out.println("Enter your Pick up location:");
		PickUpPoint = scan.next();
		System.out.println("What's your destination:");
		Destination = scan.next();
    }
    public void traveltime(){
    	d=(float) ((Math.random()*((50.0-10.0)+1.0))+10.0);
    	if(d<20) {
    		t = (int)((Math.random()*((35.0-20.0)+1.0))+20.0);
    	}
    	else if(d>=20 && d<30) {
    		t = (int)((Math.random()*((55.0-35.0)+1.0))+35.0);
    	}
    	else if(d>=30 && d<40) {
    		t = (int)((Math.random()*((75.0-55.0)+1.0))+55.0);
    	}
    	else {
    		t = (int)((Math.random()*((90.0-75.0)+1.0))+75.0);
    	}
    }
    
    public void getdistance() {
    	DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("You are "+ df.format(d) +" km away from your destination.");
    }
    
    public void cabtype(){
    	System.out.println("Which cab do you prefer:");
		System.out.println("1.Mini   2.Prime   3.SUV");
		int a=scan.nextInt();
		DecimalFormat df = new DecimalFormat("0.00");
		if(a==1){
			System.out.println("You have chosen a Mini cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time:" + t +" min");
			System.out.println("Estimated Price:Rs."+df.format((float)(50.0+(d-2.0)*13.0))+"/-");
		}
		else if(a==2) {
			System.out.println("You have chosen a Prime cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time:" + t +" min");
			System.out.println("Estimated price: Rs."+df.format((float)(55.0+(d-2.0)*15.0))+"/-");
		}
		else if(a==3) {
			System.out.println("You have chosen an SUV cab\nThere are "+(int)((Math.random()*((6.0-2.0)+1))+2.0)+" cabs around you\nEstimated travel time" + t + "min");
			System.out.println("Estimated Price: Rs." + df.format((float)(60.0+(d-2.0)*17.0))+"/-");
		}
		else {
			System.out.println("Invalid!");
			System.exit(1);
		}

		}
    public void paymentmethod() {
    	int a;
    	System.out.println("Select a payment method:  \n1.Cash \n2.Credit card \n3.Debit card  \n4.E-wallet");
    	a=scan.nextInt();
    	switch(a) {
    	case 1:System.out.println("You have chosen to pay by Cash"); break;
    	case 2:System.out.println("You have chosen to pay by Credit Card"); break;
    	case 3:System.out.println("You have chosen to pay by Debit Card"); break;
    	case 4:System.out.println("You have chosen to pay by E-Wallet"); break;
    	default:System.out.println("Invalid!!");

    	
    	}
    }
    public void ticketconfirmation() {
    	System.out.println("Would you like to confirm the booking? (y/n):");
		i=scan.next().charAt(0);
		if(i=='Y'||i=='y') {
			System.out.println("Your booking has been confirmed!");
			System.out.println("Please wait for "+(int)((Math.random()*((5.0-1.0)+1.0))+1.0)+"mins for the cab to arrive at your location");
			System.out.println("Thank you for riding with us!!");
		}
		else if(i=='N'||i=='n') {
			System.out.println("Your booking has been cancelled!");
		}
		else {
			System.exit(1);
		}
    }
}
    

public class BaseCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		details obj1 = new details();
		obj1.traveltime();
		obj1.getdistance();
		obj1.cabtype();
		obj1.paymentmethod();
		obj1.ticketconfirmation();
		
	}
	
}