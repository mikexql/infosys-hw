package problemSet1AB;
import java.util.*;
public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn) {
        Arrays.sort(sIn.toCharArray());
        for (int i = 0; i < sIn.length()-1; i++) {
            if (sIn.charAt(i) == sIn.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPermutation(String sIn1, String sIn2) {
        char[] s1=sIn1.toCharArray();
        char[] s2=sIn2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
}

