import java.awt.Color;

/**
 * This is a Tester class for shape. It tests methods and instance variables that are
 * present in the shape class.
 * 
 * @author Masood Ahmed
 * @version 1.0
 *
 */

public class ShapeTester {

	/**
	 * Creates an instance of the Shape class and calls different methods
	 * that are present in Shape class.
	 * 
	 * @param args not being used in this application.
	 */
	
	public static void main(String[] args) {
		
		
		/** 
		 * This creates a shape object that uses methods and instance variables from Shape class
		 */
		
		Shape shape = new Shape();

		
		// Creates a shape
		System.out.println("Print each variable in Shape class without setting it previously (default value):");
		System.out.println("The color of the shape is: " + shape.getColor());
		System.out.println("The shape is filled: " + shape.getFilled());
		System.out.println("The center x-coordinate represented by xc: " + shape.getXc());
		System.out.println("The center y-coordinate represented by yc: " + shape.getYc());
		System.out.println("Things in the xLocal array: " + shape.getXLocal());
		System.out.println("Things in the yLocal array: " + shape.getYLocal());
		
		System.out.println();  // Adding a blank line
		System.out.println();  // Adding a blank line
		
		System.out.println("Print each variable in Shape class after setting it.");
		
		shape.setColor(new Color(255,0,0)); // Giving color to shape
		shape.setFilled(true);   // Setting filled as true
		shape.setTheta(Math.PI);   // To store the value of orientation. Current value of angle stored is 180 degree
		shape.setXc(2.0);   // To store the x-coordinate value of center
		shape.setYc(2.0);  // To store the y-coordinate value of center
		
		// Putting values in the arrays
		double[] xLocal = { 3.0, 5.0, 6.0, 7.0 };
		shape.setXLocal(xLocal);  // Putting values in the arrays
		double[] yLocal = { 2.0, -5.0, 4.0, 8.0 };
		shape.setYLocal(yLocal);
		

		// Printing
		
		System.out.println("The color of the shape should be red:");
		System.out.println(shape.getColor());
		System.out.println("The shape is filled so it should be true: ");
		System.out.println(shape.getFilled());
		System.out.println("The orientation is 180 degrees and pi in radians: ");
		System.out.println(shape.getTheta());
		System.out.println("The center is (2.0, 2.0): ");
		System.out.println("The value of x at center and y at center respectively is: " + shape.getXc() + " "  + shape.getYc());
		System.out.println("The vertices in xLocal are:");
		for (int i =0; i < shape.getXLocal().length ; i++) {
			System.out.print(shape.getXLocal()[i] + " ");
		}
		System.out.println();  // Adding a blank line
		System.out.println("The vertices in yLocal are:");
		for (int i =0; i < shape.getYLocal().length ; i++) {
			System.out.print(shape.getYLocal()[i] + " ");
		}
		System.out.println();  // Adding a blank line
		
		System.out.println();  // Adding a blank line
		System.out.println();  // Adding a blank line

		//*******************************************************

		// *************Testing translate() method**********************
		
		
		System.out.println("Translate (xc, yc) by (2,2) using translate method");
		shape.translate(2, 2);
		System.out.println("xc after translating: " + shape.getXc()); // xc should become 4.0
		System.out.println("yc after translating: " + shape.getYc()); // yc should become 4.0
		
		System.out.println();  // Adding a blank line
		
		//************************************************
		
		// *************Testing rotate() method**********************
		System.out.println("Rotate theta by 90 degrees in radians");
		shape.rotate(Math.PI/2);
		System.out.println("theta after rotation: " + shape.getTheta());  // Theta should 3pi/2
		
		
		System.out.println();  // Adding a blank line
		
		
		//*******************************************************
		
	
		// *************Testing getX() method**********************
		
		// It should give the screen x-coordinates
		int[] xValues = shape.getX();
		System.out.println("Values of the new x-coordinates after getX method is called.");
		for (int i = 0; i < xValues.length; i++) {
			System.out.println(xValues[i] + " ");
		}
		
		System.out.println();  // Adding a blank line
		
		//****************************************************
		
		// *************Testing getX() method**********************
		
		// It should give the screen y-coordinates
		
		int[] yValues = shape.getY();
		System.out.println("Values of the new y-coordinates after getX method is called.");
		for (int i = 0; i < yValues.length; i++) {
			System.out.println(yValues[i] + " ");
		}
		
		System.out.println();  // Adding a blank line
		//****************************************************
	}

}
