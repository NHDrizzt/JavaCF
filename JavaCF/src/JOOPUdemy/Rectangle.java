package JOOPUdemy;

public class Rectangle {

	public double h;
	public double w;
	
	
	public double area() {
		return h*w;
	}
	public double perimeter() {
		return 2*(w+h);
	}
	public double diagonal() {
		return Math.sqrt(h*h + w*w);
	}
	public String toString() {
		return "AREA  = " +
				String.format("%.2f", area())+
				"\nPERIMETER = "+
				String.format("%.2f", perimeter())+
				"\nDIAGONAL = "+
				String.format("%.2f", diagonal());
				
	}
}
