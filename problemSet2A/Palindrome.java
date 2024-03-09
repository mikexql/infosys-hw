public class Palindrome {
    public static void main(String[] args) {
        char[] abba={};
        System.out.println(isPalindrome(abba));
    }
    public static boolean isPalindrome (char[] S) {
        if (S.length==0){
            return true;
        }
        if (S.length<2){
            if (S[0]==S[S.length-1]) {
                return true;
            }
            else {
                return false;
            }
        } else{
            if (S[0]==S[S.length-1]){
                char[] temp=new char[S.length-2];
                for (int i=1;i<S.length-1;i++){
                    temp[i-1]=S[i];
                }
                return isPalindrome(temp);
            }else {
                return false;
            }
        }
    }
}



/* ATTENTION
The method isPalindrome() returns true if the input string is a palindrome, and false otherwise.
It is NOT NECESSARY to do any System.out.println() of "abba is a palindrome" etc.
*/


