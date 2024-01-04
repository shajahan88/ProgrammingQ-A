package easy_programming_answers;

public class Given_oddOrEven_Number {

	public static void main(String[] args) {
		int[] numbers = {10, 6, 9, 11};
		
		for(int number : numbers) {
			if(isEven(number)) {
				System.out.println(number + " "+"is even!");
			}else{
				System.out.println(number +  " "+"is odd!");
			}
			
		}

	}

	private static boolean isEven(int number) {
		
		return number % 2==0;
	}

}
