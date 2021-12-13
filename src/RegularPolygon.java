/**
 * This RegularPolygon class is inherited from the Shape class .i.e it is a subclass
 * of the Shape class. The purpose of this RegularPolygon class is to model a n-sided
 * polygon. Apart from all the inherited properties from the Shape class, it has its own
 * private instance variables to store number of sides of the polygon and its radius as well.
 * It has public setters and getters to access private instance variables. It also has a private class
 * to set vertices of the shape according to number of sides of the polygon. It also public constructors
 * to set up the polygon shape and size. Lastly, it contains a public method called contains to
 * determine that whether a point is within a polygon or not in screen coordinate system.
 * 
 * @author Masood Ahmed
 * @version 1.0
 */


public class RegularPolygon extends Shape{
	
	// Private instance variables
	
	private int numOfSides; // A int variable to store the number of sides of a polygon
	private double radius;  // A double variable to store the radius of the polygon
	
	
	// constructors
	
	/**
	 * A public constructor for building a regular n-sided polygon with a radius of r and n number
	 * of sides. If the n is less than 3, the number of sides will be set to 3.
	 * If the r is less than 0, the radius will be set to 0.0. It is called when two arguments,
	 * one related to number of sides is passed and other related to radius.
	 * 
	 * @param n number of sides
	 * @param r radius of the polygon 
	 */
	
	public RegularPolygon( int n, double r) {
		
		
		// If number of sides is less than three then the number of sides
		// of the polygon would be 3
		if (n < 3){
			numOfSides = 3;
		}
		else {
			numOfSides = n;
		}
		
		
		// If radius is less than zero then the radius
		// of the polygon would be 0.0
		if (r < 0){
			radius = 0.0;
		}
		else {
			radius = r;
		}
		
		setVertices();  // To reset the local coordinates of the vertices of the regular n-sided polygon
		
	}

	/**
	 * A public constructor for building a regular n-sided polygon with n number of sides and a 
	 * radius of 1.0. If the n is less than 3, the number of sides will be set to 3. It is called when
	 * only one argument determining the number of sides is passed.
	 * 
	 * @param n number of sides
	 */
	
	public RegularPolygon( int n ) {
		
		radius = 1.0;
		
		// If number of sides is less than three then the number of sides
		// of the polygon would be 3
		if (n < 3){
			numOfSides = 3;
		}
		else {
			numOfSides = n;
		}
		
		
		setVertices(); // To reset the local coordinates of the vertices of the regular n-sided polygon
	}
	
	/**
	 * A public default constructor for building a regular 3-sided polygon with a radius 
	 * of 1.0. It is called when no argument is passed.
	 * 
	 */
	public RegularPolygon() {
		
		// Default constructor
		numOfSides = 3;
		radius = 1.0;
		
		setVertices();  // To reset the local coordinates of the vertices of the regular n-sided polygon
	}
	
	
	
	// 	Public getters
	
	/**
	 * A public method to retrieve the number of sides of the regular 
	 * polygon from the private instance variable.
	 * 
	 * @return numOfSides An integer type to return number of sides of polygon
	 */
	
	public int getNumOfSides() {
		
		// returning number of sides
		return numOfSides;
	}
	
	/**
	 * A public method to retrieve the radius of the regular polygon
	 * from the private instance variables.
	 * 
	 * @return radius A boolean type to return radius of the shape
	 */
	
	public double getRadius() {
		
		// returning radius
		return radius;
	}
	
	
	// Public Setters 
	
	/**
	 * A public method to set the number of sides of the regular n-sided polygon. 
	 * This method should also reset the local coordinates of the vertices of 
	 * the regular n-sided polygon.
	 * 
	 * @param n number of sides
	 */
	
	public void setNumOfSides( int n ) {
		
		// If number of sides is less than three then the number of sides
		// of the polygon would be 3
		if (n < 3){
			numOfSides = 3;
		}
		else {
			numOfSides = n;
		}
		
		// To reset the local coordinates of the vertices of the regular n-sided polygon
		setVertices();
		
	}
	
	/**
	 * A public method to set the radius of the regular n-sided 
	 * polygon. This method should also reset the local coordinates of the vertices of the 
	 * regular n-sided polygon.
	 * 
	 * @param r radius of the shape
	 */
	
	public void setRadius( double r) {
		
		// If radius is less than zero then the radius
		// of the polygon would be 0.0
		if (r < 0){
			radius = 0;
		}
		else {
			radius = r;
		}
		
		// To reset the local coordinates of the vertices of the regular n-sided polygon
		setVertices();
	}
	
	
	// A private method depicting encapsulation.
	// This method is declared as private because it is not being called 
	// from any other class and is only being used here.
	// As it is a private method, that's why it does not have any java doc
	
	private void setVertices() {
		 
//		A method for setting the local coordinates of the vertices of the 
//		regular n-sided polygon based on its number of sides and radius. If the 
//		number of sides is an odd number, the first vertex should lie on the positive x-axis and 
//		its distance from the origin is given by the radius of the regular n-sided polygon. The 
//		rest of the vertices can be obtained by rotating this vertex about the origin by a multiple 
//		of 2p/n, where n is the number of sides, in a counter clock-wise manner.
		
		
	//  creating an array to store local coordinates of n-sided polygon
		
		double[] xLocalCoordinates = new double[numOfSides]; 
		double[] yLocalCoordinates = new double[numOfSides]; 
		
		// Setting up local coordinates of the vertices using the given formulas and
		// whether sides given are odd or even
		
		if (numOfSides % 2 != 0) {
			// for odd sided polygon
			for (int i = 0; i < numOfSides; i++) {
				xLocalCoordinates[i] = radius*Math.cos( 0 -i*((2*Math.PI)/numOfSides )); 
				yLocalCoordinates[i] = radius*Math.sin( 0 -i*((2*Math.PI)/numOfSides ));  				
			}
			
		}
		else {
			// for even sided polygon
			for (int i = 0; i < numOfSides; i++) {
				xLocalCoordinates[i] = radius*Math.cos( (Math.PI/numOfSides) -i*((2*Math.PI)/numOfSides) ); 
				yLocalCoordinates[i] = radius*Math.sin((Math.PI/numOfSides) -i*((2*Math.PI)/numOfSides) );  				
			}
		
		}
		
		// Putting these coordinates now in in their xLocal and yLocal arrays respectively
		super.setXLocal(xLocalCoordinates);
		super.setYLocal(yLocalCoordinates);	
		
	}
	
	
	/**
	 * A public method to determine if a point (x, y) in the screen coordinate system 
	 * is contained by the regular n-sided polygon. A point is considered to be contained
	 * by a polygon if it lies either completely inside the polygon, 
	 * or on any of the sides or vertices of the polygon.
	 * 
	 * @param x x-coordinate of the point that need to figured out whether it is contained or not
	 * @param y y-coordinate of the point that need to figured out whether it is contained or not
	 * @return contain  A boolean type that determines if the point is inside the shape or not
	 */
	
	public boolean contains( double x, double y) {
		
		
		double xCoordinateLocal;  // To store points in the local coordinate system
		
		double yCoordinateLocal;  // To store points in the local coordinate system
		
		boolean contain = true;  // To determine whether point is contained or not
		
		
		// x and y given are given in screen coordinate system so converting them into local coordinate system
		
		xCoordinateLocal = (x - super.getXc())*Math.cos(-super.getTheta()) - (y - super.getYc())*Math.sin(-super.getTheta());
		yCoordinateLocal = (x - super.getXc()) * Math.sin(-super.getTheta()) + (y - super.getYc()) * Math.cos(-super.getTheta());

		// Getting the array of local x-coordinate of the set-up polygon
		double[] valuesInXLocal = super.getXLocal();
		double leftMostValue = valuesInXLocal[0];  // To determine what is the most left side of the polygon
		
		
		// Logic to determine the most left most point of the 
		// polygon
		for (int j = 0; j < numOfSides; j++) {
			if (valuesInXLocal[j] < leftMostValue) {
				leftMostValue = valuesInXLocal[j];
			}
		}
		
		
		// Checking if the point that we are trying determine is on the left side or not
		// if yes then make contain false and return contain otherwise loop around until 
		// all the points are checked and then return contains
		for (int i = 0; i < (numOfSides); i++ ) {
			if (xCoordinateLocal < leftMostValue) {
				contain = false;
				return contain;
			}
			else {
				
				double xCoordinateTemp = xCoordinateLocal;
				double yCoordinateTemp = yCoordinateLocal;
				// Rotating the point
				xCoordinateLocal = xCoordinateTemp * Math.cos(2 * Math.PI/numOfSides) - yCoordinateTemp * Math.sin(2 * Math.PI/numOfSides);
				yCoordinateLocal = xCoordinateTemp * Math.sin(2 * Math.PI/numOfSides) + yCoordinateTemp * Math.cos(2 * Math.PI/numOfSides);
				

			}
		}
		
		
		return contain;  
		
	}
}
