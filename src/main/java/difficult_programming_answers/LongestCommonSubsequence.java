package difficult_programming_answers;

public class LongestCommonSubsequence {

    public static String findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        int[][] lcsLength = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    lcsLength[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    lcsLength[i][j] = lcsLength[i - 1][j - 1] + 1;
                } else {
                    lcsLength[i][j] = Math.max(lcsLength[i - 1][j], lcsLength[i][j - 1]);
                }
            }
        }

        StringBuilder lcs = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            } else if (lcsLength[i - 1][j] > lcsLength[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }

    public static void main(String[] args) {
        String str1 = "ABCDAB";
        String str2 = "BDCAB";

        String lcs = findLCS(str1, str2);

        System.out.println("Longest Common Subsequence: " + lcs);
    }
}
