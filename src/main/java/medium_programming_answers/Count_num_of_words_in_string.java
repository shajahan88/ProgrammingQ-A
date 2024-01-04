package medium_programming_answers;

import java.util.StringTokenizer;

public class Count_num_of_words_in_string {

	public static void main(String[] args) {
		
		String str = "Word counting with Tokenizer";
		
		int wordCount = countWords(str);
		System.out.println("number of words in the string:"+" "+ wordCount);
		

	}

	 public static int countWords(String str) {
		 StringTokenizer tokenizer = new StringTokenizer(str);
		
		return tokenizer.countTokens();
	}

}
