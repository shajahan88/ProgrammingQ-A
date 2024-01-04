package easy_programming_answers;

import java.util.Random;

public class Generate_random_num {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int randomNumber = random.nextInt(100)+1;
		System.out.println("random Number between 1 and 100:" + randomNumber);

	}

}
