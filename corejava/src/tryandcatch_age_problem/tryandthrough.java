package tryandcatch_age_problem;

import java.util.*;

public class tryandthrough {
	
	static void validate()throws invalid_age_exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your  age please!!");
		int age =sc.nextInt();
		if(age<18) {
		throw new invalid_age_exception("invalid age  you are not eligeble vote");	
			
		}
		else {
			System.out.println("you are eligeble to vote ");
		}
		}
	

	public static void main(String[] args) {
		try {
			validate();
		}catch(Exception e) {
			System.out.println("caught an Exception\n"+e);
		}

	}

}
