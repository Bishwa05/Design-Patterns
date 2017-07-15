package bridge;

/**
 * 
 * @author 608890942
 * Bridge design pattern can be used when both abstraction and implementation can have different hierarchies 
 * independently and we want to hide the implementation from the client application.
 * 
 * The Bridge pattern is going to allow you to possibly have alternative implementations 
 * of an algorithm or system.
 * 
 * The Bridge pattern is something you implement up front - if you know you have two orthogonal hierarchies, 
 * it provides a way to decouple the interface and the implementation in such a way that you don't get an 
 * insane number of classes.
 * 
 */
public class BridgePatternTest {
	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
