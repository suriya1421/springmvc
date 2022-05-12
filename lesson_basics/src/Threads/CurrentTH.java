package Threads;

public class CurrentTH {
	public static void main(String args[])
	{
	 try{
		 Thread t1=Thread.currentThread();
		 System.out.println("Th ID: " +t1.getId() );
		 System.out.println("Th State: " +t1.getState() );
		 System.out.println("Th Priority: " +t1.getPriority());// Default value is 5
		 System.out.println("Th ISAlive: " +t1.isAlive());
		 System.out.println("Th Max Priority: " +Thread.MAX_PRIORITY);// default is 10
		 System.out.println("Th Min priority: " +Thread.MIN_PRIORITY);// default value is 1
	 }
catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
	}
}//A THREAD THAT IS STOPPED CAN NOT BE RESTARTED .IS ALIVE WILL BE FALSE.
// threads are created ,managed ,executed and stopped by the Os.