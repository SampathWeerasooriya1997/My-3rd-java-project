import java.util.Scanner;

public class Q4 
	{

   	public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();
        
        System.out.println("Enter the value of b:");
        double b = input.nextDouble();
        
        System.out.println("Enter the value of c:");
        double c = input.nextDouble();
        
        double root1,root2;
        
        double discriminant = b*b-4*a*c;
        
        if (discriminant==0){
            root1 =-b/(2.0*a);
            String str = "The equation has single repeated root";
            root2 = Double.parseDouble(str);
            }
            else if (discriminant>0)
		{
           	 root1 = (-b + Math.sqrt(discriminant))/(2.0*a);
            	root2 = (-b - Math.sqrt(discriminant))/(2.0*a);
            	}
            else
		{ // discriminant<0
            	String str1 = "Roots are not real";
            	root1 = Double.parseDouble(str1);            
            	root2 = Double.parseDouble(str1);
            	}
       
        	Q4 findrObj = new Q4();
        	findrObj.findRoots(root1,root2);
   		}
     
    	public void findRoots(double r1, double r2)
	{
        
        System.out.println("Root 1 is "+r1);
        System.out.println("Root 2 is "+r2);
        
    	}
}
