package state;
/**
 * 
 * @author 608890942
 *	The benefits of using State pattern to implement polymorphic behavior is clearly visible. 
 *	The chances of error are less and it’s very easy to add more states for additional behavior. 
 *	Thus making our code more robust, easily maintainable and flexible. 
 *	Also State pattern helped in avoiding if-else or switch-case conditional logic in this scenario.
 *
 */
public class TVRemote {
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		
		context.setState(tvStartState);
		context.doAction();
		
		
		context.setState(tvStopState);
		context.doAction();
		
	}

}
