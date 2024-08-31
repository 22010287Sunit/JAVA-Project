import java.util.Scanner;

class AreaDisplay{// Polymorphism
	public void areaDisplay(Shape ref) {
		ref.acceptInput();
		ref.compute();
		ref.disp();
	}
}

abstract class Shape{
	
	public abstract void acceptInput();//Abstraction
	public abstract void compute();
	public abstract void disp();
	
	public Shape() {
	}
	
	
}
class Square extends Shape{//Inheritance
	private float length; // Encapsulation
	private float squareArea;
	
	public void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lenght of Square: ");
		length = sc.nextFloat();
	}

	@Override
	public void compute() {
		squareArea = length*length;
	}

	@Override
	public void disp() {
		System.out.println("Area of Square is: "+squareArea+"unit²");
		
	}	
}

class Rectangle extends Shape{
	private float length;
	private float breadth;
	private float rectArea;

	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght and breadth of Rectangle: ");
		length = sc.nextFloat();
		breadth = sc.nextFloat();		
	}

	@Override
	public void compute() {
		rectArea = length*breadth;
	}

	@Override
	public void disp() {
		System.out.println("Area of Rectangle is: "+rectArea+"unit²");
	}
}

class Circle extends Shape{
	private float radius;
	private float circleArea;

	@Override
	public void acceptInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Radius of Circle: ");
		radius = sc.nextFloat();
	}

	@Override
	public void compute() {
		circleArea = (radius*radius)*3.142f;
	}

	@Override
	public void disp() {
		System.out.println("Area of Circle is: "+circleArea+"unit²");
		
	}
	
	
		
}


public class ComputeArea  {
	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
//		s.acceptInput();
//		s.compute();
//		s.disp();
		Scanner sc = new Scanner(System.in);
		System.out.println("For Circle write Circle, for Square, write Square and For Rectangle write Rectangle");
		System.out.print("Enter the name of required Shape: ");
		String shape = sc.nextLine();
		AreaDisplay AD = new AreaDisplay();
				
		switch(shape) {
		case "Circle":
			AD.areaDisplay(c);
			break;
		case "Square":
			AD.areaDisplay(s);
			break;
		case "Rectangle":
			AD.areaDisplay(r);
		default:
			System.out.println("Invalid Shape");
			break;
		}

		

}
		
		
}				
