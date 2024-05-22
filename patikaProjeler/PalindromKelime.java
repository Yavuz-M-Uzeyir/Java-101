package patikaProjeler;

public class PalindromKelime {

    static boolean isPalindrome(String str) {
        if (str.length() % 2 == 0) {
            for (int i = str.length() / 2 - 1, j = str.length() / 2; i >= 0 && j < str.length(); i--, j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        } else {
            for (int i = str.length() / 2 - 1, j = str.length() / 2 + 1; i >= 0 && j < str.length(); i--, j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abs"));
    }

}
