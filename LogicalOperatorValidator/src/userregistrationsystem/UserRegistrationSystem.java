package userregistrationsystem;
import java.util.Scanner;
public class UserRegistrationSystem {
	
	    public static void main(String[] args) {
	       Scanner scan=new Scanner(System.in);
	       

	      
	        System.out.println("Is input valid (true/false): ");
	        boolean valid=scan.nextBoolean();
	        System.out.println("Does input meet a certain condition (true/false): ");
	        boolean condition=scan.nextBoolean();
	        boolean res = isValidInput(valid, condition);
	        System.out.println(res);
	        if (res==true) {
	            System.out.println("Input is valid.");
	        } else {
	            System.out.println("Input is not valid.");
	        }
	    }
	
public static boolean isValidInput(boolean valid, boolean condition) {
	{
		return valid&&condition;
	}
}}



