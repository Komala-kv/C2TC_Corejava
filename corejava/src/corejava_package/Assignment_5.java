package corejava_package;
import java.util.Scanner;
public class Assignment_5 {

	public static void main(String[] args) {
		try (Scanner inpt = new Scanner(System.in)) {
        	System.out.println("enter number");
			int num =inpt.nextInt();
			  if(num>0) {
				  System.out.println("Number is positive" );
			  }
			  if(num<0) {
				  System.out.println("Number is negative");
			  }
			  else if(num==0){
				 System.out.println("Number is zero" );
				 }
		}

	}

}
