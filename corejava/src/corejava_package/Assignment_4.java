package corejava_package;
import java.util.Scanner;
public class Assignment_4 {

	public static void main(String[] args) {
		try (Scanner inpt = new Scanner(System.in)) {
			System.out.println("enter value a = ");
			int a=inpt.nextInt();
			System.out.println("enter value b =");
			int b=inpt.nextInt();
			System.out.println("enter value c =");
			int c1=inpt.nextInt();
			if(a>b) {
				System.out.println("A is greater");
			}else if(b>c1){
				System.out.println("b is greater");
			}
			else if(c1>a){
				System.out.println("c is greater");
			}
			else
			{
				System.out.println("All are equal");
			}
		}
	

	}

}
