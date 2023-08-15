package countbit;
import java.util.Scanner;
public class Countbit {

	public static void  main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		int c=countSetBits(n);
		System.out.println("Number of bits " +c);
	}

public static int countSetBits(int n)
{
int count = 0;
while (n > 0) {
    count += n & 1;
    n >>= 1;
}
return count;
}


	
}
