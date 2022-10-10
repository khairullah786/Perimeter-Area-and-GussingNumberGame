import java.util.Scanner;
public class MainPerimeter {
	
	
	
	
	public static void main(String[] args) {
	 
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter a Value");
		
			double radius = in.nextDouble();
			
			Double Perimter = 2 * Math.PI * radius;
			double area = Math.PI * radius * radius;
			
			System.out.println("Perimeter is = " + Perimter);
			System.out.println("Area is = " + area);
			
		
		
	}

	
	
}

