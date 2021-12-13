import java.awt.Color;

/**
 * This shape class is a template for creating shapes. This is inherited by a regular polygon
 * class so that a n-sided polygon is drawn on the GUI. The private instance variables that
 * this class has include color to store color of the shape, filled to tell whether the shape
 * is filled or not, theta to determine the orientation of the shape , xc to store center of
 * the shape(x-coordinate), yc to store center of the shape (y-coordinate), xLocal to store
 * local x coordinates of vertices of the shape, and yLocal to store local y-coordinate of 
 * vertices of the shape. As the instance variables are private, this class provides public setters 
 * and getters to give values to those private instance variables. Lastly, it has public methods to
 * get screen coordinates of the vertices and also for translating and rotating the shape as well.
 * 
 * @author Masood Ahmed
 * @version 1.0
 *
 */


public class Shape {
	
	// Private Instance Variables
	
	private Color color;   // A color object to specify and store color of the shape
	
	private boolean filled;  // a boolean type which tells whether the shape is filled or not
	
	private double theta;  // A double type which determines the orientation of the shape in radians in screen 
	                       // coordinate system
	
	private double xc;     // A double type which determines the x-coordinate of the center of the shape in 
	                       // radians in screen coordinate system
	
	private double yc;     // A double type which determines the y-coordinate of the center of the shape in 
                           // radians in screen coordinate system
	
	private double[] xLocal; // A double array which stores the local x-coordinates of the vertices of 
	                         // of the shape in local coordinate system in counter clockwise direction
	
	private double[] yLocal; // A double array which stores the local x-coordinates of the vertices of 
                             // of the shape in local coordinate system in counter clockwise direction
	
	
	// Public getters
	
	/**
	 * A Public method to retrieve color of the shape from the private color instance variable
	 * 
	 * @return color A color object storing the color of the shape
	 */
	
	public Color getColor() {
		
		// Returns the color
		return color;
	}
	
	/**
	 * A Public method to retrieve fill type of the shape
	 * 
	 * @return filled A boolean type determining the shape is filled or not
	 */
	
	public boolean getFilled() {
		
		// Returns the fill-type
		return filled;
		
	}
	
	/**
	 * A Public method to retrieve orientation of the shape in 
	 * screen coordinate system in radians
	 * 
	 * @return theta A double type value giving the angle of rotation
	 */
	
	public double getTheta() {
		
		// returns the angle
		return theta;
		
	}
	
	/**
	 * A Public method to retrieve x-coordinate of the center of the shape 
	 * in screen coordinate system
	 * 
	 * @return xc A double type returning the x-coordinate of the center of the shape
	 */
	
	public double getXc() {
		
		// returns the x-coordinate of the center
		return xc;
	}
	
	/**
	 * A Public method to retrieve y-coordinate of the center of the shape 
	 * in screen coordinate system
	 * 
	 * @return yc A double type returning the y-coordinate of the center of the shape
	 */
	
	public double getYc() {
		
		// Returns the y-coordinate of the center
		return yc;
	}
	
	/**
	 * A Public method to retrieve x-coordinates of the vertices of the shape 
	 * in counter-clockwise direction in local coordinate system
	 * 
	 * @return xLocal An array containing x-coordinate of the vertices of the shape
	 */
	
	public double[] getXLocal() {

		// Returns an array of vertices of x-coordinates
		return xLocal;
	}
	
	/**
	 * A Public method to retrieve y-coordinates of the vertices of the shape 
	 * in counter-clockwise direction in local coordinate system
	 * 
	 * @return yLocal An array containing y-coordinate of the vertices of the shape
	 */
	
	public double[] getYLocal() {

		// Returns an array of vertices of y-coordinates
		return yLocal;
	}
	
	
	
	
	
	// Public setters 
	
	/**
	 * A public method to set the color of the shape.
	 * 
	 * @param color Color object that represents color of the shape
	 */
	
	public void setColor( Color color ) {
		
		this.color = color;
	}
	
	/**
	 * A public method to set the fill-type of the shape.
	 * 
	 * @param filled boolean type that represents the fill-type of the shape
	 */
	
	public void setFilled( boolean filled ) {
		
		this.filled = filled;
	}
	
	/**
	 * A public method to set theta value for the orientation of the shape.
	 * 
	 * @param theta boolean type that represents the orientation of the shape in radians
	 */
	
	public void setTheta( double theta ) {
		
		this.theta = theta;
	}
	
	/**
	 * A public method to set the center x-coordinate of the shape in screen coordinate system
	 * 
	 * @param xc boolean type that represents x-coordinate of the center of the shape
	 */
	
	public void setXc( double xc ) {
		
		this.xc = xc;
	}
	
	/**
	 * A public method to set the center y-coordinate of the shape in screen coordinate system
	 * 
	 * @param yc boolean type that represents y-coordinate of the center of the shape
	 */
	
	public void setYc( double yc ) {
		
		this.yc = yc;
	}
	
	/**
	 * A public method to set the x-coordinates of the vertices in counter
	 * clock-wise order) of the shape in its local coordinate system.
	 * 
	 * @param xLocal x-coordinates double array
	 */
	
	public void setXLocal( double[] xLocal ) {

		this.xLocal = xLocal;
	}
	
	/**
	 * A public method to set the y-coordinates of the vertices in counter
	 * clock-wise order) of the shape in its local coordinate system.
	 * 
	 * @param xLocal y-coordinates double array
	 */
	
	public void setYLocal( double[] yLocal ) {

		this.yLocal = yLocal;
	}
	
	
	// Public Methods apart from setters and getters
	
	
	
	/**
	 * A public method to translate the center of the shape by dx and dy,
	 * respectively, along the x and y directions of the screen coordinate 
	 * system.
	 * 
	 * @param dx change in xc
	 * @param dy change in yc
	 */
	
	public void translate( double dx, double dy ) {
		xc = xc + dx;
		yc = yc + dy;
	}
	
	/**
	 * A public method to rotate the shape about its center by an angle 
	 * of dt in radians.
	 * 
	 * @param dt change in theta
	 */
	
	public void rotate( double dt ) {
		theta = theta + dt;
	}
	
	/**
	 * A public method to give the x-coordinates of the vertices of the shape in terms of screen coordinate 
	 * system. The coordinates are provided in a counter-clockwise order. Lastly, coordinates are rounded to their
	 * nearest integer.
	 * 
	 * @return screenXCoordinates  an array of x-coordinates for vertices in screen coordinates system in counterclockwise order
	 */
	
	public int[] getX() {
		
		int lengthOfArrayContainingXCordinates = xLocal.length;  // This gives the length of the array containing local x-coordinates
		int[] screenXCoordinates = new int[lengthOfArrayContainingXCordinates];  // Creating a new array to store x-coordinates in the screen coordinate system
		
		
		// Goes through each x-coordinate of the local vertices of the shape and 
		// computes the respective x-coordinate for the screen coordinate system 
		// and stores those screen coordinates in the screenXCoordinates array 
		// in the same order as in the array containing x-coordinates for the local system.
		for (int i = 0; i < lengthOfArrayContainingXCordinates; i++) {
			
			// Computing respective Screen x-coordinates 
			screenXCoordinates[i] = (int) Math.round((xLocal[i] * Math.cos(theta)) - (yLocal[i] * Math.sin(theta)) + xc);
			
		}
		
		
		// Returning the x-coordinates in the screen coordinate system
		return screenXCoordinates;
	}
	
	/**
	 * A method to give the y-coordinates of the vertices of the shape in terms of screen coordinate 
	 * system. The coordinates are provided in a counter-clockwise order. Lastly, coordinates are rounded to their
	 * nearest integer.
	 * 
	 * @return screenYCoordinates  an array of y-coordinates for vertices in screen coordinates system in counterclockwise order
	 */
	
	public int[] getY() {
		
		int lengthOfArrayContainingYCordinates = yLocal.length;  // This gives the length of the array containing local y-coordinates
		int[] screenYCoordinates = new int[lengthOfArrayContainingYCordinates]; // Creating a new array to store y-coordinates in the screen coordinate system
		
		// Goes through each x-coordinate of the local vertices of the shape and 
		// computes the respective x-coordinate for the screen coordinate system 
		// and stores those screen coordinates in the screenXCoordinates array 
		// in the same order as in the array containing x-coordinates for the local system.
		for (int i = 0; i < lengthOfArrayContainingYCordinates; i++) {
			
			// Computing respective Screen y-coordinates 
			screenYCoordinates[i] = (int) Math.round((xLocal[i] * Math.sin(theta)) + (yLocal[i] * Math.cos(theta)) + yc);
			
		}
		
		// Returning the y-coordinates in the screen coordinate system
		return screenYCoordinates;
	}
}
