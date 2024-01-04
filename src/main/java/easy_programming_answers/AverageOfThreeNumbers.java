package easy_programming_answers;

public class AverageOfThreeNumbers {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
	int average = calculateAverage(num1, num2, num3);
	System.out.println("Given numbers:"+ num1+ ","+ num2 +"," +num3);
	System.out.println("The average of the three numbers is :"+ average);
	

	}

	private static int calculateAverage(int num1, int num2, int num3) {
		
		return (num1+num2+num3)/3;
	}

}
