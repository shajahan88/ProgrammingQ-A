package easy_programming_answers;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int ans=0;
			while(true) {// take the operator as input
				System.out.println("Enter The Operator");
				char op = in.next().trim().charAt(0);
				if(op =='+'|| op=='-'|| op=='*'|| op=='/') {
					
					// input 2 numbers
					System.out.println("Enter Two Numbers");
					 int num1= in.nextInt();
					 int num2= in.nextInt();
					 
					 if(op=='+') {
						 ans=num1+num2;
					 }
					 if(op=='-') {
						 ans= num1-num2;
					 }
					 if(op=='*'){
						ans=num1*num2;	 
				}
					 if(op =='/') {
							if(num2 !=0) {
								ans = num1/num2;
				
							}
			}
				
			}else if(op =='x'||op =='X') { 
			  break;
     }else {
			  System.out.println("Invalid Operation");
     }
     System.out.println(ans);
}
		}
}

}

