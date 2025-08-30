package Encapsulation;

public class Car 
{
	private String make;
	private String model;
	private int year;
	
	//constructor
	Car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	//getters
	public String getMake()
	{
		return make;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	
	//setters
	public void setMake(String make)
	{
		this.make = make;
		return;
	}
	public void setModel(String model)
	{
		this.model = model;
		return;
	}
	public void setYear(int year)
	{
		this.year = year;
		return;
	}
	
	public String getCarDetails()
	{
		return "These are your car's specifics:\n\n"
		  	 + "Make: " + make + "\n"
			 + "Model: " + model + "\n"
			 + "Year: " + year + "\n\n"
			 + "Sweet ride bro!";
	}
	
}
