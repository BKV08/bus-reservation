package Bus;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int np;
	int Age;
	String sex;
	int busNo;
	Date date;
	int booked=0;
	int capacity=2;
	
	int x;
	
	Booking()
	{
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Bus No:");
		busNo=scanner.nextInt();
		System.out.println("Enter the journey date dd-mm-yyyy");
		String dateInput=scanner.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try
		{
		//DateFormat dateFormat;
		//DateFormat dateFormat;
		date=dateFormat.parse(dateInput);
		
	}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		
		
		
		System.out.println("Enter the Number of Passenger");
		np=scanner.nextInt();
		for(int i=1;i<=np;i++)
		{
			booked=booked+i;
			
			
			
		    
			if(capacity<np && booked<capacity)
			{
			
				System.out.println("Ooops!,sorry please try other dates or other Buses");
				break;
			
			}
			if(capacity>=np && booked<=capacity)
			{
			
	    System.out.println();
		System.out.println("Enter Passenger Name:");
		passengerName=scanner.next();
		System.out.println("Enter yor Age");
		
		
		Age=scanner.nextInt();
		char gender;
 
	    System.out.printf("Enter gender (M/m or F/f 0r Others/others)");
	    gender = scanner.next().charAt(0);

	    switch (gender) {
	    case 'M':
	    case 'm':
	      System.out.printf("Male.");
	      break;

	    case 'F':
	    case 'f':
	      System.out.printf("Female.");
	      break;
	   // case"others";
	    case'o':
	    case'O':
	    System.out.println("Others");
	    break;

	    default:
	      System.out.printf("Unspecified Gender.");
	     
	 
			
	    
	   
	    }
	    
	   // System.out.println("Your Seat Number is: "+booked);
	    for(int j=1;j<=np;j++)
	    {   System.out.println();
	    	System.out.println("Your Seat numbers are: "+j);
	    }
	    System.out.println();
	   
			}
		}
		
		
	    System.out.println();
		if(np<=capacity)
		{
		if(busNo==1)
		{
			System.out.println("Now you are Booking from Mayiladuthurai to Chennai");
		}
		if(busNo==2)
		{
			System.out.println("Now you are Booking from Chennai to Mayiladuthurai");
		}
		if(busNo==3)
		{
			System.out.println("Now you are Booking from Bengaluru to Mayiladuthurai");
		}
		if(busNo==4)
		{
			System.out.println("Mayiladuthurai to bengaluru");
		}
		if(busNo<=0 || busNo>4)
		{
			System.out.println("Inavalid Bus No please check one again");
		}
		
		System.out.print("Total Fare:");
		if(busNo==1)
		{
			System.out.println("Rs."+350.00*np);
		}
		if(busNo==2)
		{
			System.out.println("Rs."+np*350.00);
		}
		if(busNo==3)
		{
			System.out.println("Rs."+np*600.00);
		}
		if(busNo==4)
		{
			System.out.println("Rs."+600.00*np);
		}
		
		System.out.println("Including GST & Tax");
		
		}
	}
		
		
	
	
	
	//if(capacity>=np && booked<=capacity) {
		 
	  
		public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
		{
			booked+=np;
			int booking=0;
			
			for(Bus bus:buses)
			{
				if(bus.getBusNo()==busNo)
				{
					capacity=bus.getCapacity();
				}
				
			}
			
			
			for(Booking b:bookings)
			{
				if(b.busNo==busNo &&b.date.equals(date))
				{
					 booking++;
				}
				 
			}
			
			if(booking<=capacity)
			{
				if(booked<=capacity)
			
			{
				return true;
			}
			}
			
		return false;
			
		
		
			
		} 
}

