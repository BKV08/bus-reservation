package Bus;
import java.util.*;

public class Bus {
	 protected int busno;
	 private boolean ac;
	 protected int capacity;
	Bus(int no,boolean ac,int cap)
	{
		this.busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap ) 
	{
		capacity=cap; 
	}
	public boolean getAc()
	{
		return ac;
	}
	public void setAc(boolean val ) 
	{
		ac=val; 
	}
	public int getBusNo()
	{
		return busno;
	}
	public void setAc(int no ) 
	{
		busno=no;
	}
	public void  displayBusInfo()
	{
		System.out.println("Bus No:" +busno+ " Ac :"+ac+" Total seats: "+capacity);
	}
	
	

}
