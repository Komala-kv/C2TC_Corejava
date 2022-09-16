package corejava_package;
import java.util.Scanner;
public class Assignment_2 {

	public static void main(String[] args) {
		try(Scanner inpt=new Scanner(System.in)){
			System.out.println("enter the number");
			
			int n=inpt.nextInt();
			if(n%3==0) {
				System.out.println(n+ " multiple of 3 ");
			}
				
		else {
				System.out.println(n+ " not multiple of 3 ");
			}

	}	

	}

}
