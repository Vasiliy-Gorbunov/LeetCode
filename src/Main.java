import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"giant", "giacint", "gigachad", "giliatina"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else break;
        }
        return s1.substring(0, idx);
    }
}