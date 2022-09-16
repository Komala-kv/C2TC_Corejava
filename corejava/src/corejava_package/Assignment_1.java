package corejava_package;
import java.util.Scanner;
public class Assignment_1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int hrs=sc.nextInt();
			if(hrs<18)
			{
			    System.out.println("lights on");
			}
			else if(hrs<=24&&hrs>18){
			System.out.println("lights off");    
			}
		}

	}

}
