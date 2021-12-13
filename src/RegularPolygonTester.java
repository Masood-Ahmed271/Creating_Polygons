import java.awt.Color;

/**
 * This is a Tester class for RegularPolygon. It tests methods and instance variables that are
 * present in the RegularPolygon class.
 * 
 * @author Masood Ahmed
 * @version 1.0
 *
 */


public class RegularPolygonTester {
	
	/**
	 * Creates an instance of the RegularPolygon class and calls different methods
	 * that are present in RegularPolygon class.
	 * 
	 * @param args not being used in this application.
	 */

	public static void main(String[] args) {
		
		
		// ****************** Testing constructors ****************************
		
		/**
		 * For testing constructor using two arguments
		 */
		
		RegularPolygon polygon1 = new RegularPolygon(4, 5);
		
		/**
		 * For testing constructor using one arguments
		 */
		
		RegularPolygon polygon2 = new RegularPolygon(2);
		
		/**
		 * For testing constructor using zero arguments
		 */
		
		RegularPolygon polygon3 = new RegularPolygon();
		
		
		/**
		 * For testing constructor using two arguments with sides less than three
		 */
		
		RegularPolygon polygon4 = new RegularPolygon(2,5);
		
		/**
		 * For testing constructor using two arguments with radius less than zero
		 */
		
		RegularPolygon polygon5 = new RegularPolygon(4,-1);
		
		/**
		 * For testing constructor using one arguments with sides less than three
		 */
		
		RegularPolygon polygon6 = new RegularPolygon(2);
		
		/**
		 * For testing constructor using two arguments with sides less than three and radius less than 0
		 */
		
		RegularPolygon polygon7 = new RegularPolygon(2,-1);
		
		
		
		System.out.println("Test for constructor 1 by creating object polygon1: ");
		System.out.println("numOfSides: " + polygon1.getNumOfSides());
		System.out.println("radius: " + polygon1.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 2 by creating object polygon2: ");
		System.out.println("numOfSides: " + polygon2.getNumOfSides());
		System.out.println("radius: " + polygon2.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 3 by creating object polygon3: ");
		System.out.println("numOfSides: " + polygon3.getNumOfSides());
		System.out.println("radius: " + polygon3.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 1 by creating object polygon4 with sides less than 3: ");
		System.out.println("numOfSides: " + polygon4.getNumOfSides());
		System.out.println("radius: " + polygon4.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 1 by creating object polygon4 with radius less than 0: ");
		System.out.println("numOfSides: " + polygon5.getNumOfSides());
		System.out.println("radius: " + polygon5.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 1 by creating object polygon4 with radius less than 0 and sides less than 3: ");
		System.out.println("numOfSides: " + polygon7.getNumOfSides());
		System.out.println("radius: " + polygon7.getRadius());
		
		System.out.println();
		
		System.out.println("Test for constructor 2 by creating object polygon4 with sides less than 3: ");
		System.out.println("numOfSides: " + polygon6.getNumOfSides());
		System.out.println("radius: " + polygon6.getRadius());
		
		System.out.println();
		
		
		// *********************************************************************
		
		// Using Polygon3 for further testing
		
		System.out.println("For further testing, we are using Polygon3");
		
		System.out.println("Print variables from RegularPolygon class and those inherited from Shape class without setting them previously:");
		System.out.println("The color of the shape is: " + polygon3.getColor());
		System.out.println("The shape is filled: " + polygon3.getFilled());
		System.out.println("The center x-coordinate represented by xc: " + polygon3.getXc());
		System.out.println("The center y-coordinate represented by yc: " + polygon3.getYc());
		System.out.println("The numOfSides is: " + polygon3.getNumOfSides());
		System.out.println("The radius is: " + polygon3.getRadius());
		
		System.out.println("xLocal: ");
		for (int i =0; i < polygon3.getXLocal().length ; i++) {
			System.out.print(polygon3.getXLocal()[i] + " ");
		}
		System.out.println();  // Adding a blank line
		
		System.out.println("yLocal: ");
		for (int i =0; i < polygon3.getYLocal().length ; i++) {
			System.out.print(polygon3.getYLocal()[i] + " ");
		}
		System.out.println();  // Adding a blank line
		System.out.println(); // Adding a blank line
		System.out.println(); // Adding a blank line
		
		System.out.println("Print each variable in Shape class after setting it.");
		
		polygon3.setColor(new Color(255,0,0)); // Giving color to shape
		polygon3.setFilled(true);   // Setting filled as true
		polygon3.setTheta(Math.PI);   // To store the value of orientation. Current value of angle stored is 180 degree
		polygon3.setXc(2.0);   // To store the x-coordinate value of center
		polygon3.setYc(2.0);  // To store the y-coordinate value of center
		
		// Printing
		System.out.println("The color of the shape should be red:");
		System.out.println(polygon3.getColor());
		System.out.println("The shape is filled so it should be true: ");
		System.out.println(polygon3.getFilled());
		System.out.println("The orientation is 180 degrees and pi in radians: ");
		System.out.println(polygon3.getTheta());
		System.out.println("The center is (2.0, 2.0): ");
		System.out.println("The value of x at center and y at center respectively is: " + polygon3.getXc() + " "  + polygon3.getYc());
		
		System.out.println(); // Adding a blank line
		
		
		//*******************************************************

		// *************Testing translate() method**********************
				
				
		System.out.println("Translate (xc, yc) by (2,2) using translate method");
		polygon3.translate(2, 2);
		System.out.println("xc after translating: " + polygon3.getXc()); // xc should become 4.0
		System.out.println("yc after translating: " + polygon3.getYc()); // yc should become 4.0
				
		System.out.println();  // Adding a blank line
				
		//************************************************
				
		// *************Testing rotate() method**********************
		System.out.println("Rotate theta by 90 degrees in radians");
		polygon3.rotate(Math.PI/2);
		System.out.println("theta after rotation: " + polygon3.getTheta());  // Theta should 3pi/2
				
				
		System.out.println();  // Adding a blank line
				
				
		//*******************************************************
		
		
		// ************** checking getx and gety *****************
		
		System.out.println("Retrieve x and y coordinates of the vertices in screen coordinate system using getX and getY method");
		int [] xScreen = polygon3.getX();
		System.out.println("getX:");
		for(int i = 0; i < xScreen.length; i ++) {
				System.out.print(xScreen[i] + " ");
		}
		
		System.out.println(); // Adding a blank line
		
		int [] yScreen = polygon3.getY();
		System.out.println("getY:");
		for(int i = 0; i < yScreen.length; i ++) {
				System.out.print(yScreen[i] + " ");
		}
		System.out.println(); // Adding a blank line
		System.out.println(); // Adding a blank line
		
		// **************************************************
		
		// ******************** checking implementation of setvertices() *******************
		System.out.println("Changing number of sides to 5");
		polygon3.setNumOfSides(5);
		System.out.println("The numOfSides is : " + polygon3.getNumOfSides());
		System.out.println(); // Adding a blank line
		System.out.println("Call getX and getY method to see if the vertices is reset using setVertices");
		xScreen = polygon3.getX();
		System.out.println("getX:");
		for(int i = 0; i < xScreen.length; i ++) {
				System.out.print(xScreen[i] + " ");
		}
		System.out.println(); // Adding a blank line
		
		yScreen = polygon3.getY();
		System.out.println("getY: ");
		for(int i = 0; i < yScreen.length; i ++) {
				System.out.print(yScreen[i] + " ");
		}
		System.out.println(); // Adding a blank line
		System.out.println(); // Adding a blank line
		
		System.out.println("Change radius to 9");
		polygon3.setRadius(9);
		System.out.println("The radius is : " + polygon3.getRadius());
		System.out.println("Call getX and getY method to see if the vertices is reset using setVertices");
		xScreen = polygon3.getX();
		System.out.println("getX:");
		for(int i = 0; i < xScreen.length; i ++) {
				System.out.print(xScreen[i] + " ");
		}
		System.out.println(); // Adding a blank line
		
		yScreen = polygon3.getY();
		System.out.println("getY: ");
		for(int i = 0; i < yScreen.length; i ++) {
				System.out.print(yScreen[i] + " ");
		}
		
		// **************************************************
		
		System.out.println(); // Adding a blank line
		System.out.println(); // Adding a blank line
		
		
		// ************ Checking Contains *******************
		System.out.println("Check to see if point (15, 0) is inside the polygon");
		System.out.println("It shouldn't be in the the polygon as checked through desmos");
		System.out.println("contains: " + polygon3.contains(15, 0));
		System.out.println("Check to see if point (5, 5) is inside the polygon");
		System.out.println("It should be in the the polygon as checked through desmos");
		System.out.println("contains: " + polygon3.contains(5, 5));
		
		// **************************************************
	}
	
}
