package interpreter;
/**
 * 
 * @author 608890942
 *	Interpreter pattern can be used when we can create a syntax tree for the grammar we have.
	Interpreter pattern requires a lot of error checking and a lot of expressions and code to evaluate them, it gets complicated when the grammar becomes more complicated and hence hard to maintain and provide efficiency.
	java.util.Pattern and subclasses of java.text.Format are some of the examples of interpreter pattern used in JDK.
 */
public class InterpreterClient {
	 public InterpreterContext ic;
     
	    public InterpreterClient(InterpreterContext i){
	        this.ic=i;
	    }
	     
	    public String interpret(String str){
	        Expression exp=null;
	        //create rules for expressions
	        if(str.contains("Hexadecimal")){
	            exp=new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
	        }else if(str.contains("Binary")){
	            exp=new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
	        }else return str;
	         
	        return exp.interpret(ic);
	    }
	     
	    public static void main(String args[]){
	        String str1 = "28 in Binary";
	        String str2 = "28 in Hexadecimal";
	         
	        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
	        System.out.println(str1+"= "+ec.interpret(str1));
	        System.out.println(str2+"= "+ec.interpret(str2));
	 
	    }

}
