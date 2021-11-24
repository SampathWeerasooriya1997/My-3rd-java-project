public class Q6 
{
    
    public static void main(String [] args)
		{
        	try{
            	int n = 15;
            	System.out.println("Fibonacci of " + n + " is " +fibonacci(n));
        	}	
		catch(Exception e)
			{
            		System.out.println("Error FOund");
        		}
    		}
    
    public static int fibonacci(int n){ 
        if(n<=1){
            return n;
        }else
            return fibonacci(n-1) + fibonacci(n-2);
    }
}