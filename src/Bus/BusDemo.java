package Bus;
import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to ABC Travels");
		System.out.println();
		System.out.println("No.1-Mayiladuthurai to Chennai");
		System.out.println("No.2- Chennai to Mayiladuthurai");
		System.out.println("No.3- Bengaluru to Mayiladuthurai");
		System.out.println("No.4- Mayiladuthurai to bengaluru");
		System.out.println();
		System.out.println("Please Select the Bus Accoring to the above list");
		
		
		ArrayList<Bus> buses=new ArrayList<Bus>(); 
		buses.add(new Bus(1,true,45));
		buses.add(new Bus(2,false,45));
		buses.add(new Bus(3,true,45));
		buses.add(new Bus(4,true,45));
		
		ArrayList<Booking>bookings=new ArrayList<Booking>();
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		
		for(Bus b:buses)
		{
			b.displayBusInfo();
		}
		while(userOpt==1)
		{
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt=scanner.nextInt();
			if(userOpt==1)
			{
				
		         Booking booking =new Booking();
		         if(booking.isAvailable(bookings,buses))
		         {
		        	 bookings.add(booking);
		        	 System.out.println("yup!,Your Booking is confrimed");
		        	 System.out.println("HAPPY JOURNY ):");
		        	 
		        	 
		         }
		        /* else
		         {
		        	// System.out.println("Ooops!,sorry please try other dates or other Buses");
		         }*/
			}
		}
		
		

	}

}
