package Assign1;

class Cylinder {
	double radius;
	double height;
	
	
	public Cylinder() 
	{
		this.radius = 2;
		this.height = 3; 
	}
	
	public Cylinder (double radius , double height) {
	 this.radius = radius;
	 this.height = height; 
}
	public double getRadius() {
		return radius;
		
	}
	public void setRadius() {
		this.radius = radius;
		
	}
	public double getHeight() {
		return height;
		
	}
	public void setHeight() {
		this.height = height;
	}
	 public double getVolume()
	{
		return 3.14 *radius*radius*height;
	}
	void printVolume()
	{
		System.out.println("Volume of Cylinder" + getVolume());
		
	}
}
	
public class Assign3
{
	public static void main(String args[]) {
	Cylinder c = new Cylinder();
	c.printVolume();
	}
}

