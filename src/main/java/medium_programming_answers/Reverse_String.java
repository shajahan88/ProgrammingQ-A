package medium_programming_answers;

public class Reverse_String {

	
		public static void main(String[] args) {
			String str = "Shajahan";
			String newStr = "";
			for(int i =0; i < str.length(); i++) {
				
				char ch = str.charAt(i);
				newStr = ch+newStr;
			}
			System.out.println(newStr);
			
				
			
		}

	}
