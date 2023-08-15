package heCalculatorDilemma;
import java.util.Scanner;
public class ThecalculatorDilemma {

	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to do the operations below\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		
		int z=scan.nextInt();
		System.out.println("Enter two numbers:");
		int x=scan.nextInt();
	    int y=scan.nextInt();
	    arith(x,y,z);
	}
	    public static void arith(int x,int y,int z)
	    {
		switch(z)
		{
		case 1:
			   z=x+y;
			   System.out.println("Addition result="+z);
		       break;
		case 2:
			   z=x-y;
			   System.out.println("Subtractionresult="+z);
		       break;   
		case 3:
			   z=x*y;
			   System.out.println("Multiplication result="+z);
		       break;
		case 4:
			   z=x/y;
			   System.out.println("Division result="+z);
		       break;
		       default:
		    	   System.out.println("Invalid input");
		}
	}
}
