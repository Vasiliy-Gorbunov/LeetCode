public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123321));

    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String num = String.valueOf(x);
        String reverse = new StringBuilder(num).reverse().toString();
        return num.equals(reverse);
    }
}