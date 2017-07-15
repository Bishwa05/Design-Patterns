package command;

/**
 * 
 * @author 608890942
 * Command is the core of command design pattern that defines the contract for implementation.
	Receiver implementation is separate from command implementation.
	Command implementation classes chose the method to invoke on receiver object, for every method in receiver there will be a command implementation. It works as a bridge between receiver and action methods.
	Invoker class just forward the request from client to the command object.
	Client is responsible to instantiate appropriate command and receiver implementation and then associate them together.
	Client is also responsible for instantiating invoker object and associating command object with it and execute the action method.
	Command design pattern is easily extendible, we can add new action methods in receivers and create new Command implementations without changing the client code.
	The drawback with Command design pattern is that the code gets huge and confusing with high number of action methods and because of so many associations.
 * Runnable interface (java.lang.Runnable) and Swing Action (javax.swing.Action) uses command pattern.
 */
public class FileSystemClient {
	public static void main(String[] args) {
		//Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
		
		//creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);
		
		//Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);
		
		//perform action on invoker object
		file.execute();
		
		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();
		
		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();
	}
}
